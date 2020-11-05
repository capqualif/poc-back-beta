package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.out.api;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.ports.out.GetSailorBasicDataPort;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorCivicData;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorEducationData;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorIdentityMarkersData;
import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetSailorBasicDataAPIAdapter implements GetSailorBasicDataPort {

    @Autowired
    private SailorCivicDataAPIMock sailorCivicDataAPIMock;

    @Autowired
    private SailorEducationDataAPIMock sailorEducationDataAPIMock;

    @Autowired
    private SailorIdentityMarkersDataApiMock sailorIdentityMarkersDataApiMock;

    @Override
    public Sailor getSailorBasicData(String sailorNumber) {
        getSailorCivicData(sailorNumber);
        getSailorEducationData(sailorNumber);
        Sailor sailor = new Sailor(
                "123",
                getSailorCivicData(sailorNumber),
                getSailorIdentityMarkersData(sailorNumber),
                getSailorEducationData(sailorNumber)
        );
        return sailor;
    }

    private SailorCivicData getSailorCivicData(String sailorNumber) {
        // TO DO : replace by the actual
        String sailorId = sailorNumber;
        // TO DO : replace by an API call : [URL_BASE_ADM]/api/v1/marins?numIdentification= {numIdentification}
        return sailorCivicDataAPIMock.findSailorCivicDataBySailorId(sailorId);
    }

    private SailorEducationData getSailorEducationData(String sailorNumber) {
        String sailorId = sailorNumber;
        // TO DO : replace by an API call : [URL_BASE_ITEM]/api/v1/titres/{idAdmIntervenant}
        return sailorEducationDataAPIMock.findSailorEducationDataBySailorId(sailorId);
    }

    private SailorIdentityMarkersData getSailorIdentityMarkersData(String sailorNumber) {
        String sailorId = sailorNumber;
        // TO DO : replace by an API call : [URL_BASE_ITEM]/api/v1/titres/{idAdmIntervenant}
        return sailorIdentityMarkersDataApiMock.findSailorIdentityMarkersBySailorId(sailorNumber);
    }

}

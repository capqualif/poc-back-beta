package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapter.out.api;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.out.GetSailorCivilDataPort;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetSailorCivilDataAPIAdapter implements GetSailorCivilDataPort {

    @Autowired
    private SailorCivilDataAPIMock sailorCivilDataAPIMock;

    @Override
    public Sailor getSailorCivilData(String sailorNumber) {

        // TO DO : replace by an API call : [URL_BASE_ITEM]/api/v1/marins?numIdentification= {numIdentification}

        return sailorCivilDataAPIMock.findSailorCivilDataBySailorNumber();

    }
}

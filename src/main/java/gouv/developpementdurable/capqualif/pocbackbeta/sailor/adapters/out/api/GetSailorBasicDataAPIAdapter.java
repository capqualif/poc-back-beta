package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.out.api;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.ports.out.GetSailorBasicDataPort;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetSailorBasicDataAPIAdapter implements GetSailorBasicDataPort {

    @Autowired
    private SailorBasicDataAPIMock sailorBasicDataAPIMock;

    @Override
    public Sailor getSailorBasicData(String sailorNumber) {

        // TO DO : replace by an API call : [URL_BASE_ITEM]/api/v1/marins?numIdentification= {numIdentification}

        return sailorBasicDataAPIMock.findSailorBasicDataBySailorNumber();

    }
}

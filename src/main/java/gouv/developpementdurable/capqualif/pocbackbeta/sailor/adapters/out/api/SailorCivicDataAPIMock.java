package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.out.api;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorCivicData;
import org.springframework.stereotype.Component;

@Component
public class SailorCivicDataAPIMock {

    public SailorCivicData findSailorCivicDataBySailorId(String sailorId) {
        SailorCivicData sailorCivicData = new SailorCivicData(
                "123",
                "Virginia",
                "Wolf",
                "25/05/1985",
                "London",
                "5, Baker Street",
                "virginia@gmail.fr"
        );
        return sailorCivicData;
    }
}

package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.out.api.mocks;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorCivilData;
import org.springframework.stereotype.Component;

@Component
public class SailorCivilDataApiMock {

    public SailorCivilData findSailorCivilDataBySailorId(String sailorId) {
        SailorCivilData sailorCivilData = new SailorCivilData(
                "123",
                "Virginia",
                "Wolf",
                "25/05/1985",
                "London",
                "5, Baker Street",
                "virginia@gmail.fr"
        );
        return sailorCivilData;
    }
}
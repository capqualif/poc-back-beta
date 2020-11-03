package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapter.out.api;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.stereotype.Component;

@Component
public class SailorCivilDataAPIMock {

    public Sailor findSailorCivilDataBySailorNumber() {
        Sailor sailor = new Sailor(
                123,
                "Virginia",
                "Wolf",
                "25/05/1985",
                "London",
                "5, Baker Street",
                "virginia@gmail.fr",
                "06 20 93 50 50",
                "virginia.jpeg",
                "virginia-signature.jpeg"
        );
        return sailor;
    }
}

package gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.service;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.in.GetSailorCivilDataUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;

public class GetSailorCivilDataService implements GetSailorCivilDataUseCase {

    @Override
    public Sailor getSailorCivilData(String id) {
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

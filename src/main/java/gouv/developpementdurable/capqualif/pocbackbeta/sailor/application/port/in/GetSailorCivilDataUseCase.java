package gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.in;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;

public interface GetSailorCivilDataUseCase {

    Sailor getSailorCivilData(String id);

}

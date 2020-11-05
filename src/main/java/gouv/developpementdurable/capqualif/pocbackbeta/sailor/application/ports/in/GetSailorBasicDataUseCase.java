package gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.ports.in;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;

public interface GetSailorBasicDataUseCase {

    Sailor getSailorBasicData(String id);

}

package gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.ports.out;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;

public interface GetSailorBasicDataPort {

    Sailor getSailorBasicData(String sailorNumber);

}

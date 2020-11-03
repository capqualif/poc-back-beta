package gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.out;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;

public interface GetSailorCivilDataPort {

    Sailor getSailorCivilData(String sailorNumber);

}

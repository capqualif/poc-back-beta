package gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.service;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.in.GetSailorCivilDataUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.out.GetSailorCivilDataPort;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetSailorCivilDataService implements GetSailorCivilDataUseCase {

    @Autowired
    private GetSailorCivilDataPort getSailorCivilDataPort;

    @Override
    public Sailor getSailorCivilData(String id) {
        return getSailorCivilDataPort.getSailorCivilData(id);
    }
}

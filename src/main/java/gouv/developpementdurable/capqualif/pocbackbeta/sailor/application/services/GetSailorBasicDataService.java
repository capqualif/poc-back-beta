package gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.services;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.ports.in.GetSailorBasicDataUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.ports.out.GetSailorBasicDataPort;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetSailorBasicDataService implements GetSailorBasicDataUseCase {

    @Autowired
    private GetSailorBasicDataPort getSailorBasicDataPort;

    @Override
    public Sailor getSailorBasicData(String id) {
        return getSailorBasicDataPort.getSailorBasicData(id);
    }
}

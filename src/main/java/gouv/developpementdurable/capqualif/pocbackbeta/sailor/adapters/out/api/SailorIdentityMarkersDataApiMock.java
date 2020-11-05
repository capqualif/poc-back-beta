package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.out.api;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorIdentityMarkersData;
import org.springframework.stereotype.Component;

@Component
public class SailorIdentityMarkersDataApiMock {
    public SailorIdentityMarkersData findSailorIdentityMarkersBySailorId(String sailorId) {
        SailorIdentityMarkersData sailorIdentityMarkersData = new SailorIdentityMarkersData(
                "123",
                "Virginia"
        );
        return sailorIdentityMarkersData;
    }
}

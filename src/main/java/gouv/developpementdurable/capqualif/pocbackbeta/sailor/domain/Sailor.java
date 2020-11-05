package gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain;

import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;

import java.util.List;

public class Sailor {

    // [Numéro de marin] The official number
    private String sailorNumber;                                  // numeroIdentification dans Objet IndividuDto (numIdentification dans doc API ADM)

    // Civic data : birth date, address, phone number, email...
    private SailorCivicData sailorCivicData;

    // Identity markers : photo, signature...
    private SailorIdentityMarkersData sailorIdentityMarkersData;

    // Education : titles, visas...
    private SailorEducationData sailorEducationData;

    public Sailor(String sailorNumber, SailorCivicData sailorCivicData, SailorIdentityMarkersData sailorIdentityMarkersData, SailorEducationData sailorEducationData) {
        this.sailorNumber = sailorNumber;
        this.sailorCivicData = sailorCivicData;
        this.sailorIdentityMarkersData = sailorIdentityMarkersData;
        this.sailorEducationData = sailorEducationData;
    }

    public String getSailorNumber() {
        return sailorNumber;
    }

    public SailorCivicData getSailorCivicData() {
        return sailorCivicData;
    }

    public SailorIdentityMarkersData getSailorIdentityMarkersData() {
        return sailorIdentityMarkersData;
    }

    public SailorEducationData getSailorEducationData() {
        return sailorEducationData;
    }
}

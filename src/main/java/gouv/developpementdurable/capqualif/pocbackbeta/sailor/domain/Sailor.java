package gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain;

public class Sailor {

    private int id;                // idAdmIntervenant dans Objet IndividuDto
    private Long sailorNumber;      // numeroIdentification dans Objet IndividuDto (numIdentification dans doc API ADM)
    private String firstName;       // prénom dans Objet IndividuDto
    private String lastName;        // nom dans Objet IndividuDto
    private String dateOfBirth;       // date de naissance dans Objet IndividuDto
    private String placeOfBirth;    // lieu de naissance dans Objet IndividuDto
    private String address;         // adresse (AdresseDTO) dans Objet IndividuDto
    private String email;           // email dans ADM
    private String phoneNumber;     // cette info n'est pas récupérable par API ADM
    private String photo;           // cette info n'est pas récupérable par API ADM
    private String signature;       // cette info n'est pas récupérable par API ADM
    // aptitude médicale
    // attestations possédées


    public Sailor(int id,
                  String firstName,
                  String lastName,
                  String dateOfBirth,
                  String placeOfBirth,
                  String address,
                  String email,
                  String phoneNumber,
                  String photo,
                  String signature) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.photo = photo;
        this.signature = signature;
    }

    // TO DO : remove non-necessary getters/setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getSailorNumber() {
        return sailorNumber;
    }

    public void setSailorNumber(Long sailorNumber) {
        this.sailorNumber = sailorNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}

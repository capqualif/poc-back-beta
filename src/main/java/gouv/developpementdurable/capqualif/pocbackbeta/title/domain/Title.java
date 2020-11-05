package gouv.developpementdurable.capqualif.pocbackbeta.title.domain;

public class Title {

    // To do : change String to Date where needed
    // Add fields from API St-Malo doc if needed

    private String id;
    private String titleNumber;
    private String deliveryDate;
    private String revalidationDate;
    private String effectDate;
    private String expirationDate;

    public Title(String id, String titleNumber, String deliveryDate, String revalidationDate, String effectDate, String expirationDate) {
        this.id = id;
        this.titleNumber = titleNumber;
        this.deliveryDate = deliveryDate;
        this.revalidationDate = revalidationDate;
        this.effectDate = effectDate;
        this.expirationDate = expirationDate;
    }

    public String getId() {
        return id;
    }

    public String getTitleNumber() {
        return titleNumber;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getRevalidationDate() {
        return revalidationDate;
    }

    public String getEffectDate() {
        return effectDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}

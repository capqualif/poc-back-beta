package gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorTitle;

import java.util.List;

public class SailorEducationData {
    private List<SailorTitle> titles;
    //    TO DO : add private List<String> visas;

    public SailorEducationData(List<SailorTitle> titles) {
        this.titles = titles;
    }

    public List<SailorTitle> getTitles() {
        return titles;
    }
}
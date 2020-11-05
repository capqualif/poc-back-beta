package gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain;

import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;

import java.util.List;

public class SailorEducationData {
    private List<Title> titles;
    //    TO DO : add private List<String> visas;


    public SailorEducationData(List<Title> titles) {
        this.titles = titles;
    }

    public List<Title> getTitles() {
        return titles;
    }
}
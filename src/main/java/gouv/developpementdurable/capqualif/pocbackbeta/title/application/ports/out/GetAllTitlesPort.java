package gouv.developpementdurable.capqualif.pocbackbeta.title.application.ports.out;

import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;

import java.util.List;

public interface GetAllTitlesPort {

    List<Title> getAllTitles();

}
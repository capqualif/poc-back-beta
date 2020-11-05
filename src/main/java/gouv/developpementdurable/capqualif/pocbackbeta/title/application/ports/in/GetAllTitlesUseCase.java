package gouv.developpementdurable.capqualif.pocbackbeta.title.application.ports.in;

import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;

import java.util.List;

public interface GetAllTitlesUseCase {

    List<Title> getSuggestedTitles();

}

package gouv.developpementdurable.capqualif.pocbackbeta.title.application.services;

import gouv.developpementdurable.capqualif.pocbackbeta.title.application.ports.in.GetAllTitlesUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.title.application.ports.out.GetAllTitlesPort;
import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GetAllTitlesService implements GetAllTitlesUseCase {

    @Autowired
    GetAllTitlesPort getAllTitlesPort;

    @Override
    public List<Title> getSuggestedTitles() {
        return getAllTitlesPort.getAllTitles();
    }

}

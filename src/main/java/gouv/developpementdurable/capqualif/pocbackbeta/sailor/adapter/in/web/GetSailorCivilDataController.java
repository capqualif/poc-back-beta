package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapter.in.web;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.in.GetSailorCivilDataUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sailors")
public class GetSailorCivilDataController {

    @Autowired
    private GetSailorCivilDataUseCase getSailorCivilDataUseCase;

    @GetMapping("/{sailorNumber}")
    public Sailor getSailorCivilData (@PathVariable("sailorNumber") String id) {
        return getSailorCivilDataUseCase.getSailorCivilData(id);
    }
}

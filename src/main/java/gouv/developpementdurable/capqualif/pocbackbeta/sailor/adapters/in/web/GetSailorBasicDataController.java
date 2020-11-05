package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.in.web;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.ports.in.GetSailorBasicDataUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sailors")
@CrossOrigin(origins = "http://localhost:3000")
public class GetSailorBasicDataController {

    @Autowired
    private GetSailorBasicDataUseCase getSailorBasicDataUseCase;

    @GetMapping("/{sailorNumber}")
//    public String getSailorCivilData () {
//        return "Hi ";
//    }
    public Sailor getSailorCivilData (@PathVariable("sailorNumber") String id) {
        return getSailorBasicDataUseCase.getSailorBasicData(id);
    }
}

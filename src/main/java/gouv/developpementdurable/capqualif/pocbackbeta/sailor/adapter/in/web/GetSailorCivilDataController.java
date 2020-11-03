package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapter.in.web;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.in.GetSailorCivilDataUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sailors")
@CrossOrigin(origins = "http://localhost:3000")
public class GetSailorCivilDataController {

    @Autowired
    private GetSailorCivilDataUseCase getSailorCivilDataUseCase;

    @GetMapping("/{sailorNumber}")
//    public String getSailorCivilData () {
//        return "Hi ";
//    }
    public Sailor getSailorCivilData (@PathVariable("sailorNumber") String id) {
        return getSailorCivilDataUseCase.getSailorCivilData(id);
    }
}

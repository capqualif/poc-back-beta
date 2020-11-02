package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapter.in.web;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.application.port.in.GetSailorCivilDataUseCase;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.Sailor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.sql.Date;

@RestController
public class GetSailorCivilDataController {

    private GetSailorCivilDataUseCase getSailorCivilDataUseCase;

    @GetMapping("/users/{sailorNumber}")
    public Sailor getSailorCivilData (@PathVariable String id) {
        return getSailorCivilDataUseCase.getSailorCivilData(id);
    }

}

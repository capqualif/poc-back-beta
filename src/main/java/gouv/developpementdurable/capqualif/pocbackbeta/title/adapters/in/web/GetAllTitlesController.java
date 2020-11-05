package gouv.developpementdurable.capqualif.pocbackbeta.title.adapters.in.web;

import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titles")
@CrossOrigin(origins = "http://localhost:3000")
public class GetAllTitlesController {

    @GetMapping("/titles")
    public List<Title> getAllTitles() {
        return null;
    }

}




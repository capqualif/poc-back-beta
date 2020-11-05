package gouv.developpementdurable.capqualif.pocbackbeta.title.adapters.in.web;

import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/titles")
@CrossOrigin(origins = "http://localhost:3000")
public class GetSuggestedTitlesController {

    @GetMapping("/suggested-titles")
    public List<Title> getSuggestedTitles() {
        return null;
    }

}

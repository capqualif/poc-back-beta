package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.out.api;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorEducationData;
import gouv.developpementdurable.capqualif.pocbackbeta.title.domain.Title;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SailorEducationDataAPIMock {
    public SailorEducationData findSailorEducationDataBySailorId(String sailorId) {
        List<Title> titlesList = new ArrayList<>();
        titlesList.add(new Title("1", "123456", "29/01/1988", "01/01/2004", "02/02/2002", "28/02/2025"));
        titlesList.add(new Title("2", "7785", "20/03/1978", "01/01/1994", "02/01/1994", "28/02/2000"));
        SailorEducationData sailorEducationData = new SailorEducationData(titlesList);
        return sailorEducationData;
    }
}

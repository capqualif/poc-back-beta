package gouv.developpementdurable.capqualif.pocbackbeta.sailor.adapters.out.api.mocks;

import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorEducationData;
import gouv.developpementdurable.capqualif.pocbackbeta.sailor.domain.SailorTitle;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SailorEducationDataApiMock {
    public SailorEducationData findSailorEducationDataBySailorId(String sailorId) {
        List<SailorTitle> titlesList = new ArrayList<>();
        List<String> restrictions1 = new ArrayList<String>(Arrays.asList("pas de bras", "pas de chocolat"));
        titlesList.add(new SailorTitle(
                "1",
                "123456",
                "29/01/1988",
                "01/01/2004",
                "02/02/2002",
                "02/02/2002",
                "28/02/2025",
                restrictions1));
        List<String> restrictions2 = new ArrayList<String>(Arrays.asList("pas de bras", "pas de chocolat"));
        titlesList.add(new SailorTitle(
                "2",
                "7785",
                "20/03/1978",
                "01/01/1994",
                "02/01/1994",
                "28/02/2000",
                "28/02/2025",
                restrictions2)
        );

        SailorEducationData sailorEducationData = new SailorEducationData(titlesList);
        return sailorEducationData;
    }

}
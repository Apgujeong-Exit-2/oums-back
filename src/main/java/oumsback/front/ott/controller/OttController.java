package oumsback.front.ott.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/ott")
@Api(value = "/api/ott", tags = {"Ott Api"})
public class OttController {

    @GetMapping(value = "list")
    @ApiOperation(
            value = "OTT 리스트 조회"
    )
    public List<Map<String, Object>> getOttList() {
        List<Map<String, Object>> ottList = new ArrayList<>();
        ottList.add(Map.of(
                "id", 1,
                "title", "넷플릭스",
                "imageUrl", "https://asset.pickle.plus/ott_logo/icon_netflix_x2.png",
                "originPrice", 17000,
                "salePrice", 4250,
                "partyHallFee", 490,
                "partyMemberFee", 990
        ));

        ottList.add(Map.of(
                "id", 2,
                "title", "웨이브",
                "imageUrl", "https://asset.pickle.plus/ott_logo/icon_wavve_x2.png",
                "originPrice", 13900,
                "salePrice", 3475,
                "partyHallFee", 490,
                "partyMemberFee", 990
        ));

        ottList.add(Map.of(
                "id", 3,
                "title", "왓챠",
                "imageUrl", "https://asset.pickle.plus/ott_logo/icon_watcha_x2.png",
                "originPrice", 12900,
                "salePrice", 3225,
                "partyHallFee", 490,
                "partyMemberFee", 990
        ));

        ottList.add(Map.of(
                "id", 4,
                "title", "라프텔",
                "imageUrl", "https://asset.pickle.plus/ott_logo/icon_laftel_x2.png",
                "originPrice", 14900,
                "salePrice", 3725,
                "partyHallFee", 490,
                "partyMemberFee", 990
        ));

        ottList.add(Map.of(
                "id", 5,
                "title", "티빙",
                "imageUrl", "https://asset.pickle.plus/ott_logo/icon_tving_x2.png",
                "originPrice", 13900,
                "salePrice", 3475,
                "partyHallFee", 490,
                "partyMemberFee", 990
        ));

        ottList.add(Map.of(
                "id", 6,
                "title", "디즈니+",
                "imageUrl", "https://asset.pickle.plus/ott_logo/icon_disney_x2.png",
                "originPrice", 9900,
                "salePrice", 2475,
                "partyHallFee", 490,
                "partyMemberFee", 990
        ));

        return ottList;
    }
}

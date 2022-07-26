package oumsback.front.slide;

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
@RequestMapping("/api/slide")
@Api(value = "/api/slide", tags = {"Menu Api"})
public class SlideController {

    @GetMapping(value = "list", params = "type=addParty")
    @ApiOperation(
            value = "파티 만들기 슬라이드 리스트 조회"
    )
    public List<Map<String, Object>> getAddPartySlideList() {
        List<Map<String, Object>> addPartySlideList = new ArrayList<>();
        addPartySlideList.add(Map.of(
                "id", 1,
                "imgPath", "img/addPartyMaster1.png",
                "detailText", "4명이서 같이보면 4배 더 저렴하니깐!\n파티장으로 시작하고 파티원을 모집해보세요.",
                "roleType", 0));
        addPartySlideList.add(Map.of(
                "id", 2,
                "imgPath", "img/addPartyMaster2.png",
                "detailText", "이용권 구독중인 계정을 준비하고,\n파티에 계정을 등록하면 끝!",
                "roleType", 0));
        addPartySlideList.add(Map.of(
                "id", 3,
                "imgPath", "img/addPartyMaster3.png",
                "detailText", "파티생성 후 파티원을 자동매칭 받아요.\n혹은 파티원을 직접초대해서 서로할인 받을 수 있어요.",
                "roleType", 0));
        addPartySlideList.add(Map.of(
                "id", 4,
                "imgPath", "img/addPartyMember1.png",
                "detailText", "4명이서 같이보면 4배 더 저렴하니깐!\n파티원으로 파티를 매칭받아보세요.",
                "roleType", 1));
        addPartySlideList.add(Map.of(
                "id", 5,
                "imgPath", "img/addPartyMember2.png",
                "detailText", "결제카드를 등록하면 매칭준비 끝!\n결제는 매칭이 완료되면 자동으로 진행돼요.",
                "roleType", 1));
        addPartySlideList.add(Map.of(
                "id", 6,
                "imgPath", "img/addPartyMember3.png",
                "detailText", "파티 매칭이 완료되면 즉시 넷플릭스 ID/PW를 확인할 수 있어요.",
                "roleType", 1));
        return addPartySlideList;
    }
}

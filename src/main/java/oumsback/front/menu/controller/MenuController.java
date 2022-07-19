package oumsback.front.menu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/menu")
@Api(value = "/api/menu", tags = {"Menu Api"})
public class MenuController {

    @GetMapping(value = "list")
    @ApiOperation(
            value = "상단 메뉴 리스트 조회"
    )
    public List<Map<String, String>> getMenuList() {
        List<Map<String, String>> menuList = new ArrayList<>();
        menuList.add(Map.of("title", "파티 만들기", "path", "/addParty"));
        menuList.add(Map.of("title", "MY 파티", "path", "/myParty"));
        menuList.add(Map.of("title", "콘텐츠 검색", "path", ""));
        menuList.add(Map.of("title", "이벤트", "path", ""));
        menuList.add(Map.of("title", "가이드", "path", "/guide"));
        menuList.add(Map.of("title", "개발 테스트", "path", "/test"));
        return menuList;
    }
}

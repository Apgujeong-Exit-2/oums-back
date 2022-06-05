package oumsback.common.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @ApiOperation(value = "API 연결 테스트", notes = "API 연결 테스트")
    @GetMapping("/getApi")
    public String getApi() {
        return "hello";
    }
}

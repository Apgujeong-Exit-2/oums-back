package oumsback.front.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Api(value = "/api", tags = {"DemoApi"})
public class DemoController {

	@ApiOperation(value = "API 연결 테스트", notes = "API 연결 테스트")
	@GetMapping(value = "/demo")
	public String getApi() {
		return "hello";
	}
}

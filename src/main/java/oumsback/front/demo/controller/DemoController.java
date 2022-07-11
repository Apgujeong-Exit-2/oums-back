package oumsback.front.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import oumsback.front.demo.dto.request.DemoRequestDTO;

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

	@ApiOperation(value = "API 연결 테스트 (POST)", notes = "API 연결 테스트 (POST)")
	@PostMapping(value = "/demo/post", produces = "application/json; charset=utf8")
	public ResponseEntity<DemoRequestDTO> postDemoApi(@RequestBody DemoRequestDTO demoRequestDTO) {
		return ResponseEntity.ok().body(demoRequestDTO);
	}
}

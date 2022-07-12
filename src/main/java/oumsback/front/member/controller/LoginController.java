package oumsback.front.member.controller;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import oumsback.front.member.aggregator.LoginAggregator;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
@Api(value = "/api", tags = {"Login Api"})
public class LoginController {

	private final LoginAggregator loginAggregator;

	@GetMapping(value = "/kakao/login/redirect")
	public void getKakaoCallback(String code) {
		System.out.println("code : " + code);

		String accessToken = loginAggregator.getKakaoLogin(code);
		System.out.println("accessToken : " + accessToken);

		loginAggregator.getUserInfo(accessToken);
	}
}

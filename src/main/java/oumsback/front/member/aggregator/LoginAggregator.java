package oumsback.front.member.aggregator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import oumsback.core.member.service.LoginService;

@RequiredArgsConstructor
@Service
public class LoginAggregator {
	private final LoginService loginService;

	public String getKakaoLogin(String code) {
		String accessToken = loginService.getKakaoAccessToken(code);
		return accessToken;
	}

	public void getUserInfo(String token) {
		loginService.getUserInfo(token);
	}
}

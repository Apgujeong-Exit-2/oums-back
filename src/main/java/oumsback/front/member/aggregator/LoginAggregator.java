package oumsback.front.member.aggregator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import oumsback.core.member.service.LoginService;

@Service
@RequiredArgsConstructor
public class LoginAggregator {
	private LoginService loginService;

}

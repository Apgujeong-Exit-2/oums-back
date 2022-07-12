package oumsback.front.member.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class KakaoLoginRequestDTO {
	private Long id;
	private String nickname;
	private String email;
}

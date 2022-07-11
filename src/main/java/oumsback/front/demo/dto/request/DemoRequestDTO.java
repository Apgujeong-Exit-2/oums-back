package oumsback.front.demo.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel
@Data
public class DemoRequestDTO {
	@ApiModelProperty(notes = "제목", example = "제목을 입력하세요.")
	public String title;

	@ApiModelProperty(notes = "내용", example = "내용을 입력하세요.")
	public String content;
}

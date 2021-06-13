package asynctest.dto;

import java.util.List;

import asynctest.model.MtUserModel;
import lombok.Data;

@Data
public class DbSelectResponse {
	private List<MtUserModel> result;

}

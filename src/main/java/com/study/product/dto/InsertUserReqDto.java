package com.study.product.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InsertUserReqDto {
	private String username;
	private String password;
	private String name;
	private String email;
}

package com.study.product.dto;

import com.study.product.vo.ProductVo.ProductVoBuilder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SearchProductRespDto { // product랑 똑같은데 또 만드는 이유 : 
	private int productId;
	private String productName;
	private int productPrice;
	private String productSize;
}

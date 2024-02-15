package com.study.product.vo;

import com.study.product.dto.SearchProductRespDto;
import com.study.product.dto.insertProductRespDto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductVo {
	private int productId;
	private String productName;
	private int productPrice;
	private String productSize;
	
	public insertProductRespDto toInsertDto(int successCount) {
		return insertProductRespDto.builder()
				.successCount(successCount)
				.productId(productId)
				.productName(productName)
				.productPrice(productPrice)
				.productSize(productSize)
				.build();
	}
	
	public SearchProductRespDto toSearchDto() {
		return SearchProductRespDto.builder()
				.productId(productId)
				.productName(productName)
				.productPrice(productPrice)
				.productSize(productSize)
				.build();
	}
}

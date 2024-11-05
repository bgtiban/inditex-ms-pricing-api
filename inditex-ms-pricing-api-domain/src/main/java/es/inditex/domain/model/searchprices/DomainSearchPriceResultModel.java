package es.inditex.domain.model.searchprices;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DomainSearchPriceResultModel {

	private Long productId;
	private Long brandId;
	private Long rateId;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private BigDecimal price;
	private Integer priority;
}

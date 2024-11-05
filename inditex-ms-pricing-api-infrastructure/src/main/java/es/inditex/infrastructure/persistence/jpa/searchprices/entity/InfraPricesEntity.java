package es.inditex.infrastructure.persistence.jpa.searchprices.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Entity
@Table(name="PRICES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfraPricesEntity {
	
	@Id
	Long id;
	
	@Column(name="BRAND_ID")
	Long brandId;
	
	@Column(name="START_DATE")
	LocalDateTime startDate;
	
	@Column(name="END_DATE")
	LocalDateTime endDate;
	
	@Column(name="PRICE_LIST")
	Long priceList;
	
	@Column(name="PRODUCT_ID")
	Long productId;

	Integer priority;
	BigDecimal price;
	String curr;
}

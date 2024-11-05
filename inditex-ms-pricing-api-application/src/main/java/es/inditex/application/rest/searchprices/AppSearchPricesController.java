package es.inditex.application.rest.searchprices;

import es.inditex.api.rest.api.ApiPricingApi;
import es.inditex.api.rest.model.ApiResponseSearchPriceDto;
import es.inditex.domain.api.searchprices.IDomainSearchPricesService;
import es.inditex.domain.cross.DomainCrossRegex;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@AllArgsConstructor
public class AppSearchPricesController implements ApiPricingApi {

	private IDomainSearchPricesService service;
	private IAppSearchPricesMapper mapper;
	
	@Override
	public ResponseEntity<List<ApiResponseSearchPriceDto>> searchPrices(String applicationDate, String productId, String brandId) {
		LocalDateTime dateTime = LocalDateTime.parse(
				applicationDate, 
				DateTimeFormatter.ofPattern(DomainCrossRegex.INDITEX_DATE_TIME_FORMAT.getRegex()));
		
		List<ApiResponseSearchPriceDto> dto =mapper.toDtoList(
				service.searchPrices(dateTime, Long.parseLong(productId), Long.parseLong(brandId)));
		
		return ResponseEntity.ok(dto);
	}

}
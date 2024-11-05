package es.inditex.domain.api.searchprices;

import es.inditex.domain.model.searchprices.DomainSearchPriceResultModel;

import java.time.LocalDateTime;
import java.util.List;

public interface IDomainSearchPricesService {

	public List<DomainSearchPriceResultModel> searchPrices(LocalDateTime applicationDate, Long productId, Long brandID);
}

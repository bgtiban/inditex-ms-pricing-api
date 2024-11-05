package es.inditex.domain.spi.searchprices;

import es.inditex.domain.model.searchprices.DomainSearchPriceResultModel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface IDomainSearchPricesRepositoryPort {

	Optional<List<DomainSearchPriceResultModel>> searchPrices(LocalDateTime applicationDate, Long productId, Long brandID);
}

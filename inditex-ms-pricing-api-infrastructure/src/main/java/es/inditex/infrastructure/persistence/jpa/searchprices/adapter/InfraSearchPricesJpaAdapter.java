package es.inditex.infrastructure.persistence.jpa.searchprices.adapter;

import es.inditex.domain.model.searchprices.DomainSearchPriceResultModel;
import es.inditex.domain.spi.searchprices.IDomainSearchPricesRepositoryPort;
import es.inditex.infrastructure.persistence.jpa.searchprices.mapper.InfraSearchPricesMapper;
import es.inditex.infrastructure.persistence.jpa.searchprices.repository.InfraPricesRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class InfraSearchPricesJpaAdapter implements IDomainSearchPricesRepositoryPort {

	private InfraPricesRepository repo;
	private InfraSearchPricesMapper mapper;
	
	@Override
	public Optional<List<DomainSearchPriceResultModel>> searchPrices(LocalDateTime applicationDate, Long productId, Long brandID) {
		List<DomainSearchPriceResultModel> domainList = mapper.toModelList(
				repo.findByStartDateLessThanEqualAndEndDateGreaterThanEqualAndBrandIdAndProductId(
						applicationDate, applicationDate,
						brandID,
						productId));

		return 	Optional.ofNullable(domainList);
	}

}

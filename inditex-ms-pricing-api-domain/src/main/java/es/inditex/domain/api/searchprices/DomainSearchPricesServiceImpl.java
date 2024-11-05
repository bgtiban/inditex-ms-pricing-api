package es.inditex.domain.api.searchprices;

import es.inditex.domain.model.searchprices.DomainSearchPriceResultModel;
import es.inditex.domain.spi.searchprices.IDomainSearchPricesRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class DomainSearchPricesServiceImpl implements IDomainSearchPricesService {

	private IDomainSearchPricesRepositoryPort repo;


    @Override
    public List<DomainSearchPriceResultModel> searchPrices(LocalDateTime applicationDate, Long productId, Long brandID) {
        return repo.searchPrices(applicationDate, productId, brandID)
                .stream()
                .flatMap(List::stream)
                .max(Comparator.comparingInt(DomainSearchPriceResultModel::getPriority))
                .map(Collections::singletonList)
                .orElse(Collections.emptyList());
    }




}

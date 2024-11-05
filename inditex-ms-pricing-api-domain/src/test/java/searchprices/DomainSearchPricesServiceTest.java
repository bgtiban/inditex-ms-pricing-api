package searchprices;

import es.inditex.domain.api.searchprices.DomainSearchPricesServiceImpl;
import es.inditex.domain.model.searchprices.DomainSearchPriceResultModel;
import es.inditex.domain.spi.searchprices.IDomainSearchPricesRepositoryPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class DomainSearchPricesServiceTest {

	@Mock
	private IDomainSearchPricesRepositoryPort repo;

	@InjectMocks
	private DomainSearchPricesServiceImpl service;


	@Test
	void searchPricesReturnFilledList() {
		DomainSearchPriceResultModel zaraProduct = DomainSearchPriceResultModel.builder()
				.productId(1L)
				.build();
        when(repo.searchPrices(any(), any(), any()))
                .thenReturn(Optional.of(List.of(zaraProduct)));

		List<DomainSearchPriceResultModel> result = service.searchPrices(any(), any(), any());

		assertEquals(1, result.size());
	}

    @Test
    void searchPricesReturnEmptyListWhenThereAreNotResultsInRepository() {
		when(repo.searchPrices(any(), any(), any()))
				.thenReturn(Optional.of(Collections.emptyList()));
		List<DomainSearchPriceResultModel> result = service.searchPrices(any(), any(), any());

		assertTrue(result.isEmpty());
    }
    
    
	
	

}

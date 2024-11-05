package es.inditex.searchprices;

import es.inditex.api.rest.model.ApiResponseSearchPriceDto;
import es.inditex.application.rest.searchprices.AppSearchPricesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringBootApplicationTests {


	@Autowired
	private AppSearchPricesController controller;
	
	@Test
	void test1() { // petición a las 10:00 del día 14 del producto 35455  para la brand 1 (ZARA)
		ApiResponseSearchPriceDto priorityPrice = new ApiResponseSearchPriceDto();
		priorityPrice.setProductId("35455");
		priorityPrice.setBrandId("1");
		priorityPrice.setStartDate("2020-06-14-00.00.00");
		priorityPrice.setPrice(new BigDecimal("35.50"));
		priorityPrice.setRateId("1");
		priorityPrice.setEndDate("2020-12-31-23.59.59");

		List<ApiResponseSearchPriceDto> expected = List.of(priorityPrice);
		
		List<ApiResponseSearchPriceDto> actual = controller.searchPrices("2020-06-14-10.00.00", "35455", "1").getBody();

        assert actual != null;
        assertThat(actual.toString()).isEqualTo(expected.toString());
		
	}
	
	@Test
	void test2() { // Petición a las 16:00 del día 14 del producto 35455   para la brand 1 (ZARA)
		ApiResponseSearchPriceDto priorityPrice = new ApiResponseSearchPriceDto();
		priorityPrice.setProductId("35455");
		priorityPrice.setBrandId("1");
		priorityPrice.setStartDate("2020-06-14-15.00.00");
		priorityPrice.setPrice(new BigDecimal("25.45"));
		priorityPrice.setRateId("2");
		priorityPrice.setEndDate("2020-06-14-18.30.00");

		List<ApiResponseSearchPriceDto> expected = List.of(priorityPrice);
		
		List<ApiResponseSearchPriceDto> actual = controller.searchPrices("2020-06-14-16.00.00", "35455", "1").getBody();

        assert actual != null;
        assertThat(actual.toString()).isEqualTo(expected.toString());
		
	}
	
	@Test
	void test3() { // Petición a las 21:00 del día 14 del producto 35455   para la brand 1 (ZARA)
		ApiResponseSearchPriceDto priorityPrice = new ApiResponseSearchPriceDto();
		priorityPrice.setProductId("35455");
		priorityPrice.setBrandId("1");
		priorityPrice.setStartDate("2020-06-14-00.00.00");
		priorityPrice.setPrice(new BigDecimal("35.50"));
		priorityPrice.setRateId("1");
		priorityPrice.setEndDate("2020-12-31-23.59.59");

		List<ApiResponseSearchPriceDto> expected = List.of(priorityPrice);
		
		List<ApiResponseSearchPriceDto> actual = controller.searchPrices("2020-06-14-21.00.00", "35455", "1").getBody();

        assert actual != null;
        assertThat(actual.toString()).isEqualTo(expected.toString());
		
	}
	
	@Test
	void test4() { // Petición a las 10:00 del día 15 del producto 35455   para la brand 1 (ZARA)
		ApiResponseSearchPriceDto priorityPrice = new ApiResponseSearchPriceDto();
		priorityPrice.setProductId("35455");
		priorityPrice.setBrandId("1");
		priorityPrice.setStartDate("2020-06-15-00.00.00");
		priorityPrice.setPrice(new BigDecimal("30.50"));
		priorityPrice.setRateId("3");
		priorityPrice.setEndDate("2020-06-15-11.00.00");

		List<ApiResponseSearchPriceDto> expected = List.of(priorityPrice);
		
		List<ApiResponseSearchPriceDto> actual = controller.searchPrices("2020-06-15-10.00.00", "35455", "1").getBody();

        assert actual != null;
        assertThat(actual.toString()).isEqualTo(expected.toString());
		
	}
	
	@Test
	void test5() { // Petición a las 21:00 del día 16 del producto 35455   para la brand 1 (ZARA)
		ApiResponseSearchPriceDto priorityPrice = new ApiResponseSearchPriceDto();
		priorityPrice.setProductId("35455");
		priorityPrice.setBrandId("1");
		priorityPrice.setStartDate("2020-06-15-16.00.00");
		priorityPrice.setPrice(new BigDecimal("38.95"));
		priorityPrice.setRateId("4");
		priorityPrice.setEndDate("2020-12-31-23.59.59");

		List<ApiResponseSearchPriceDto> expected = List.of(priorityPrice);
		
		List<ApiResponseSearchPriceDto> actual = controller.searchPrices("2020-06-16-21.00.00", "35455", "1").getBody();

        assert actual != null;
        assertThat(actual.toString()).isEqualTo(expected.toString());
		
	}

}

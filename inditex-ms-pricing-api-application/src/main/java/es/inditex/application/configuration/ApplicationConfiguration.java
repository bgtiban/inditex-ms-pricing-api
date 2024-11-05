package es.inditex.application.configuration;

import es.inditex.domain.api.searchprices.DomainSearchPricesServiceImpl;
import es.inditex.domain.api.searchprices.IDomainSearchPricesService;
import es.inditex.domain.spi.searchprices.IDomainSearchPricesRepositoryPort;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI().addServersItem(new Server().url("/").description("Application Server URL"));
  }  
  
  @Bean
  public IDomainSearchPricesService getSearchPricesService(final IDomainSearchPricesRepositoryPort repo) {
	  return new DomainSearchPricesServiceImpl(repo);
  }
}


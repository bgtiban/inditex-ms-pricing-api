package es.inditex.infrastructure.persistence.config;

import es.inditex.domain.spi.searchprices.IDomainSearchPricesRepositoryPort;
import es.inditex.infrastructure.persistence.jpa.searchprices.adapter.InfraSearchPricesJpaAdapter;
import es.inditex.infrastructure.persistence.jpa.searchprices.mapper.InfraSearchPricesMapper;
import es.inditex.infrastructure.persistence.jpa.searchprices.repository.InfraPricesRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersitenceConfiguration {

    @Bean
    IDomainSearchPricesRepositoryPort getSearchPricesJpaAdapter(InfraPricesRepository repo, InfraSearchPricesMapper mapper) {
        return new InfraSearchPricesJpaAdapter(repo, mapper);
    }
}

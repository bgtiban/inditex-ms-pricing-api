package es.inditex.infrastructure.persistence.jpa.searchprices.repository;

import es.inditex.infrastructure.persistence.jpa.searchprices.entity.InfraPricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface InfraPricesRepository extends JpaRepository<InfraPricesEntity, Long> {

    List<InfraPricesEntity> findByStartDateLessThanEqualAndEndDateGreaterThanEqualAndBrandIdAndProductId
            (LocalDateTime applicationDateFrom, LocalDateTime applicationDateTo, long productId, long brandId);
}

package es.inditex.infrastructure.persistence.jpa.searchprices.mapper;

import es.inditex.domain.model.searchprices.DomainSearchPriceResultModel;
import es.inditex.infrastructure.persistence.jpa.searchprices.entity.InfraPricesEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring")
public interface InfraSearchPricesMapper {
	
	@Mapping(target = "rateId", source = "priceList")
	public DomainSearchPriceResultModel toModel(InfraPricesEntity entity);
	
	
	public List<DomainSearchPriceResultModel> toModelList(List<InfraPricesEntity> entities);
}

package es.inditex.application.rest.searchprices;

import es.inditex.api.rest.model.ApiResponseSearchPriceDto;
import es.inditex.domain.model.searchprices.DomainSearchPriceResultModel;
import org.mapstruct.*;

import java.util.List;



@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
componentModel = "spring", uses = {AppLocalDateTimeToStringMapper.class})
public interface IAppSearchPricesMapper {

	public ApiResponseSearchPriceDto toDto(DomainSearchPriceResultModel model);
	
	public List<ApiResponseSearchPriceDto> toDtoList(List<DomainSearchPriceResultModel> models);
}

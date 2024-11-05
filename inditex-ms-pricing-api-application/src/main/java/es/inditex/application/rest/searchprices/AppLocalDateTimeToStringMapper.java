package es.inditex.application.rest.searchprices;

import es.inditex.domain.cross.DomainCrossRegex;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Mapper(componentModel = "spring")
public class AppLocalDateTimeToStringMapper {

	public String toString(LocalDateTime ldt) {
		return ldt.format(DateTimeFormatter.ofPattern(DomainCrossRegex.INDITEX_DATE_TIME_FORMAT.getRegex()));
	}
	
}

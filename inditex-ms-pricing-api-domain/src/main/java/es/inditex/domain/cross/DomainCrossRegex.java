package es.inditex.domain.cross;

import lombok.Getter;

@Getter
public enum DomainCrossRegex {

	INDITEX_DATE_TIME_FORMAT("uuuu-MM-dd-HH.mm.ss");

	private final String regex;

	private DomainCrossRegex(String regex) {
		this.regex = regex;
	}
}

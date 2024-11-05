DROP TABLE IF EXISTS PRICES;
CREATE TABLE PRICES(
	ID BIGINT auto_increment,
	BRAND_ID BIGINT,
	START_DATE TIMESTAMP COMMENT 'date range in which the indicated rate applies',
	END_DATE TIMESTAMP COMMENT 'date range in which the indicated rate applies',
	PRICE_LIST BIGINT COMMENT 'Applicable price tariff identifier',
	PRODUCT_ID BIGINT,
	PRIORITY NUMERIC COMMENT 'Price application disambiguator. If two fares coincide in a range of dates, the one with the higher priority (higher numerical value) is applied.',
	PRICE NUMERIC COMMENT 'final selling price',
	CURR VARCHAR(3) COMMENT 'iso currency'
);
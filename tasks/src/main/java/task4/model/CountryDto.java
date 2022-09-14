package task4.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryDto implements Serializable {

	@JsonProperty
	private String region;
	@JsonProperty
	private BigDecimal population;
	@JsonProperty
	private Map<String, String> languages;

	public CountryDto() {
	}

	public CountryDto(String region, BigDecimal population, Map<String, String> languages) {
		this.region = region;
		this.population = population;
		this.languages = languages;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public BigDecimal getPopulation() {
		return population;
	}

	public void setPopulation(BigDecimal population) {
		this.population = population;
	}

	public Map<String, String> getLanguages() {
		return languages;
	}

	public void setLanguages(Map<String, String> languages) {
		this.languages = languages;
	}

	@Override public String toString() {
		return "Country{" +
				"region='" + region + '\'' +
				", population=" + population +
				", languages=" + languages +
				'}';
	}
}

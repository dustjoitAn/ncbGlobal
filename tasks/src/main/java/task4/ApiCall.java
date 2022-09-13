package task4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;
import task4.model.CountryDto;
import util.Enums;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class ApiCall {

	public static void main(String[] args) {
		try {
			getCountries();
		} catch (Exception e) {
			System.out.println(Enums.ERROR_MESSAGE.getMessage() + e.getMessage());
		}
	}

	private static void getCountries() throws JsonProcessingException {
		List<CountryDto> countries = readFromApi();
		Map<String, List<CountryDto>> countriesByContinent = groupByContinent(countries);
		sortByPopulation(countriesByContinent);
		printResult(getFirstTenCountriesWhichHaveMoreThanOneLanguage(countriesByContinent));
	}

	private static List<CountryDto> readFromApi() throws JsonProcessingException {
		String result = new RestTemplate().getForObject(Enums.URL.getMessage(), String.class);
		return new ObjectMapper().readValue(result, new TypeReference<>() {
		});
	}

	private static Map<String, List<CountryDto>> groupByContinent(List<CountryDto> countries) {
		return countries.stream().collect(groupingBy(CountryDto::getRegion));
	}

	private static void sortByPopulation(Map<String, List<CountryDto>> countries) {
		countries.forEach((region, countryDtos) -> countryDtos.sort(Comparator.comparing(CountryDto::getPopulation).reversed()));
	}

	private static List<CountryDto> getFirstTenCountriesWhichHaveMoreThanOneLanguage(Map<String, List<CountryDto>> countries) {

		return countries.values()
				.stream()
				.map(countryDtos -> countryDtos
						.stream()
						.limit(10)
						.filter(countryDto -> (countryDto.getLanguages() != null))
						.filter(countryDto -> (countryDto.getLanguages().size() > 1))
						.collect(Collectors.toList()))
				.collect(Collectors.toList()).stream().flatMap(List::stream).collect(Collectors.toList());
	}

	private static void printResult(List<CountryDto> countryDtos) {
		countryDtos.forEach(System.out::println);
	}

}

import java.util.HashSet;
import java.util.Iterator;

class Country {
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> itr = H1.iterator();
		
		while (itr.hasNext()) {
			if (itr.next().equals(CountryName))
				return CountryName;
		}
		return null;
	}
}
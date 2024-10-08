package royal.model;

import java.util.Calendar;

public class Country {

	private String name;
	private Calendar created;
	private Calendar ended;
	private List<Region> regions = new ArrayList<>();

	public Country(String name, Calendar created, Calendar ended) {
		super();
		this.name = name;
		this.created = created;
		this.ended = ended;
	}

}

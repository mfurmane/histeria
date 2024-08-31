package royal.model;

import java.util.Calendar;

public class Event {

	private String name;
	private Calendar created;
	private Calendar ended;
	private List<Region> regions = new ArrayList<>();

	public Event(String name, Calendar created, Calendar ended) {
		super();
		this.name = name;
		this.created = created;
		this.ended = ended;
	}

}

package royal.model;

import java.util.Calendar;

public class Resource {

	private long id;
	private int quantity;
	private double quality;
	private ResourceType type; //actual price here
	private double yearlyExtractionPerWorker;
	private double yearlyRegeneration;

	public Resource() {
		super();

	}

}

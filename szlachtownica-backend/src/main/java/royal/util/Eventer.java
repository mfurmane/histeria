package royal.model;

import java.util.Calendar;

public class Eventer {

  private List<EventType> types = new ArrayList<>();

	public void prepare() {
        types.add(new EventType("Wojna domowa"));
        types.add(new EventType("Rewolucja"));
        types.add(new EventType("Wojna o ziemię"));
        types.add(new EventType("Wojna na wyniszczenie"));
        types.add(new EventType("Separacja rejonu"));
        types.add(new EventType("Przepięcie rejonu"));
        types.add(new EventType("Zmiana ustroju"));
        types.add(new EventType("Zmiana władzy"));
        types.add(new EventType("Przewrót"));
        types.add(new EventType("Rozpad kraju"));
        types.add(new EventType("Rozbiór kraju"));
        types.add(new EventType("Unia"));
        types.add(new EventType("Wcielenie"));
        types.add(new EventType("Hołd"));
        types.add(new EventType("Zaraza"));
        types.add(new EventType("Epidemia"));
        types.add(new EventType("Pandemia"));
    }
  
	public Eventer() {
		super();
    
	}

}

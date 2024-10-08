package royal.model;

import java.util.Calendar;

public class Region {

  private long id;
  private String name;
  private int population;
  private int area;

  private double royalPopulation;
  private double farmingPopulation;
  private double workersPopulation;
  private double craftingPopulation;
  private double educatedPopulation;
  private double technicalPopulation;
  private double citiesPopulation;
  private double magicalPopulation;
  //reszta to społeczności plemienne, koczownicy, hobo itp

  private double humans;
  private double elves;
  private double dwarfs;
  private double halflings;
  private double gnomes;
  private double peura;
  private double blossomits;
  private double torakka;
  private double kals;
  private double cyclops;
  private double ogres;
  private double minotaurs;
  private double centaurs;
  private double nagas;
  private double other;

  private List<Resource> resources = new ArrayList<>();

  public Region() {
    super();
  }

}

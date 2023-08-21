package tacos;

import lombok.Data;

@Data
public class Ingredient {

	private String id;
  private String name;
  private Type type;
  
  public Ingredient() { // Default constructor
  }

  public Ingredient(String id, String name, Type type) { // Custom constructor
      this.id = id;
	  this.name = name;
      this.type = type;
  }
  
  public static enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
  }
  
}

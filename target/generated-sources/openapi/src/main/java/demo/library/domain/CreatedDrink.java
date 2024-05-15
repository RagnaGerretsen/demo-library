package demo.library.domain;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import demo.library.domain.DrinkType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreatedDrink
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.5.0")
public class CreatedDrink {

  private String drink;

  private String colour;

  private DrinkType drinkType;

  public CreatedDrink drink(String drink) {
    this.drink = drink;
    return this;
  }

  /**
   * Name of the drink
   * @return drink
  */
  
  @Schema(name = "drink", description = "Name of the drink", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drink")
  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public CreatedDrink colour(String colour) {
    this.colour = colour;
    return this;
  }

  /**
   * The colour of the drink
   * @return colour
  */
  
  @Schema(name = "colour", description = "The colour of the drink", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colour")
  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public CreatedDrink drinkType(DrinkType drinkType) {
    this.drinkType = drinkType;
    return this;
  }

  /**
   * Get drinkType
   * @return drinkType
  */
  @Valid 
  @Schema(name = "drinkType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drinkType")
  public DrinkType getDrinkType() {
    return drinkType;
  }

  public void setDrinkType(DrinkType drinkType) {
    this.drinkType = drinkType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedDrink createdDrink = (CreatedDrink) o;
    return Objects.equals(this.drink, createdDrink.drink) &&
        Objects.equals(this.colour, createdDrink.colour) &&
        Objects.equals(this.drinkType, createdDrink.drinkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drink, colour, drinkType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedDrink {\n");
    sb.append("    drink: ").append(toIndentedString(drink)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
    sb.append("    drinkType: ").append(toIndentedString(drinkType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


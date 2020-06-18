/** Abstract class that models a kind of food.
 *  @author Koffman & Wolfgang
 * */

public abstract class Food {
  // Data Field
  private double calories;

  // Abstract Methods
  /** Calculates the percent of protein in a Food object. */
  public abstract double percentProtein();

  /** Calculates the percent of fat in a Food object. */
  public abstract double percentFat();

  /** Calculates the percent of carbohydrates in a Food object. */
  public abstract double percentCarbohydrates();

  // Methods
  public double getCalories() {
    return calories;
  }

  public void setCalories(double cal) {
    calories = cal;
  }
}

/**  A class to test the DirectoryEntry class.
 *   @author Koffman & Wolfgang
 */


public class TestDirectoryEntry {

  public static void main(String[] args) {
    // Create some directory entries.
    DirectoryEntry tom =
        new DirectoryEntry("Tom", "123-555-4567");
    DirectoryEntry dick =
        new DirectoryEntry("Dick", "321-555-9876");

    // Display the entries.
    System.out.println("tom -- name:" + tom.getName()
                       + " number: " + tom.getNumber());
    System.out.println("dick -- name:" + dick.getName()
                       + " number: " + dick.getNumber());
    /*Next we test the equals method.Because the two objects have different name
        fields, we expect that they are not equal.*/
// See whether they are equal.
    if (tom.equals(dick))
      System.out.println
          ("FAILURE -- Tom and Dick are equal");
    else
      System.out.println
          ("SUCCESS -- Tom and Dick are not equal");

    if (dick.equals(tom))
      System.out.println
          ("FAILURE -- Tom and Dick are equal");
    else
      System.out.println
          ("SUCCESS -- Tom and Dick are not equal");
      /*  Then we create a third DirectoryEntry object with the same name as one of
       the others.We expect this to be equal to the one with the same name.*/
    DirectoryEntry tom2 =
        new DirectoryEntry("Tom", "888-555-9999");
    System.out.println("tom2 -- name:" + tom2.getName()
                       + " number: " + tom2.getNumber());
// See whether the two toms are equal.
    if (tom.equals(tom2))
      System.out.println
          ("SUCCESS -- tom and tom2 are equal");
    else
      System.out.println
          ("FAILURE -- tom and tom2 are not equal");

    if (tom2.equals(tom))
      System.out.println
          ("SUCCESS -- tom2 and tom are equal");
    else
      System.out.println
          ("FAILURE -- tom2 and tom are not equal");
      /* Finally we test the setNumber method by changing the number of one of the
           objects and displaying it.*/
    dick.setNumber(tom.getNumber());
// Dick and Tom should have the same number.
    System.out.println("dick -- name:" + dick.getName()
                       + " number: " + dick.getNumber());
  }
}

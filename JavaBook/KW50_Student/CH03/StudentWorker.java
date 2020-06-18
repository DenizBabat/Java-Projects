/** Class to represent a student worker using delegation.
 *  @author Koffman & Wolfgang
 * */

public class StudentWorker
    implements StudentInt, EmployeeInt {
  private Student student;
  private Employee employee;

  public StudentWorker(String nam, double grade, String maj,
                       double hour, double rat, Address addr) {
    student = new Student(nam, grade, maj, addr);
    employee = new Employee(nam, hour, rat, addr);
  }

  public String getName() {
    return student.getName();
  }

  public double getGPA() {
    return student.getGPA();
  }

  public String getMajor() {
    return student.getMajor();
  }

  public Address getAddress() {
    return student.getAddress();
  }

  public double getHours() {
    return employee.getHours();
  }

  public double getRate() {
    return employee.getRate();
  }
}

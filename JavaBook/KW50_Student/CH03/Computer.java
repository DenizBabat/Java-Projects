/** Class that represents a computer.
 *  @author Koffman & Wolfgang
 * */

public class Computer {
  // Data Fields
  private String manufacturer;
  private String processor;
  private int ramSize;
  private int diskSize;

  // Methods
  /** Initializes a Computer object with all properties specified.
      @param man The computer manufacturer
      @param processor The processor type
      @param ram The RAM size
      @param disk The disk size
   */
  public Computer(String man, String processor, int ram, int disk) {
    manufacturer = man;
    this.processor = processor;
    ramSize = ram;
    diskSize = disk;
  }

  public int getRamSize() {
    return ramSize;
  }

  public int getDiskSize() {
    return diskSize;
  }



  // Insert other accessor and modifier methods here.
/**** EXERCISE ****/

  public String toString() {
    String result = "Manufacturer: " + manufacturer +
        "\nCPU: " + processor +
        "\nRAM: " + ramSize + " megabytes" +
        "\nDisk: " + diskSize + " gigabytes";
    return result;
  }
}

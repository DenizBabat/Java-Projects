package Part1;

/**
 * Created by babatman on 24.03.2018.
 */

/**
 * Course Class
 */
public class Course {
    /**
     * semester
     */
    private int semester;
    /**
     * course code
     */
    private String c_code = new String();
    /**
     * course
     */
    private String course = new String();
    /**
     * ECTS
     */
    private int ECTS;
    /**
     * GTU Credits
     */
    private int gtu_Credits;
    /**
     * STL
     */
    private String STL = new String();

    /**
     * Default constructor
     */
    public  Course(){}

    /**
     * Constructor
     * @param sem
     * @param code
     * @param course
     * @param ects
     * @param cred
     * @param stl
     */
    public Course(int sem, String code, String course, int ects, int cred, String stl){
        semester = sem; c_code = code; this.course = course; ECTS = ects; gtu_Credits = cred; STL = stl;
    }

    /**
     * get semester
     * @return
     */
    public int getSemester() {
        return semester;
    }



    public String getC_code() {
        return c_code;
    }

    /**
     * To string
     * @return string
     */
    @Override
    public String toString() {
        return String.valueOf("Semester: "+semester+"\n"+"Course code: "+c_code+"\n"+"Course: "+course+"\n"+"ECTS: "+ECTS+"\n"+"GTU Credits: "+gtu_Credits+"\n"+"STL: "+STL);
    }

    /**
     * Equals
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        Course course = (Course) obj;

        if (this.semester == course.semester){
            return true;
        }
        return false;

    }

    /**
     * Compare function
     * @param obj1
     * @param obj2
     * @return
     */
    public boolean compare(Object obj1,Object obj2) {

        Course crs = (Course) obj2;
        Course c = (Course) obj1;

        if (c.semester == (crs.semester) &&
                crs.c_code.equals(c.c_code) &&
                c.course.equals(crs.course) == true &&
                c.ECTS == crs.ECTS &&
                c.gtu_Credits == crs.gtu_Credits &&
                c.STL.equals(crs.STL) == true){
            return true;
        }
        return false;
    }

}

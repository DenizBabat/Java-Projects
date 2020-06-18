package Test;

import Part1.Course;
import Part1.GTU_Computer;
import com.babatman.LinkedList;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by babatman on 27.03.2018.
 */
public class GTU_ComputerTest {
    @org.junit.Test
    public void getByCode() throws Exception {
        GTU_Computer course = new GTU_Computer();
        course.readFile("Courses.csv");

        LinkedList<Course> list = course.getByCode("MATH 101");

        Iterator<Course> it  = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next().toString());
        }

    }

    @org.junit.Test
    public void listSemesterCourses() throws Exception {
        GTU_Computer course = new GTU_Computer();
        course.readFile("Courses.csv");
        LinkedList<Course> list = course.listSemesterCourses(1);

        Iterator<Course> it  = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next().toString());
            System.out.println();
        }

    }

    @org.junit.Test
    public void getByRange() throws Exception {
        GTU_Computer course = new GTU_Computer();
        course.readFile("Courses.csv");

        LinkedList<Course> list = course.getByRange(1,3);

        Iterator<Course> it  = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next().toString());
            System.out.println();
        }

    }

    @org.junit.Test
    public void readFile() throws Exception {
        GTU_Computer course = new GTU_Computer();

        course.readFile("Courses.csv");

        course.displayCourse();

    }

}
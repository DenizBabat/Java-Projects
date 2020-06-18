package Test;

import Part1.Course;
import Part2.MyLinkedList;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static org.junit.Assert.*;

/**
 * Created by babatman on 27.03.2018.
 */
public class MyLinkedListTest {

    MyLinkedList<Course> courseList = new MyLinkedList<>();

    @Test
    public void disable() throws Exception {


        System.out.println("=====================================================================================");
        readFile("Courses.csv");

        courseList.disable();
        courseList.disable();
        courseList.disable();

        System.out.println("--------AFter Disable Function, Disabled Nodes--------");
        courseList.showDisabled();
        System.out.println("=====================================================================================");
    }

    @Test
    public void enabled() throws Exception {

        System.out.println("=====================================================================================");
        readFile("Courses.csv");

        courseList.disable();
        courseList.disable();
        courseList.disable();

        System.out.println("--------Disabled Nodes--------");
        courseList.showDisabled();

        courseList.enabled();

        System.out.println("--------After Enable function, Disabled Nodes--------");
        courseList.showDisabled();

        System.out.println("=====================================================================================");
    }

    @Test
    public void showDisabled() throws Exception {

        System.out.println("=====================================================================================");
        readFile("Courses.csv");

        courseList.disable();
        courseList.disable();
        courseList.disable();

        courseList.showDisabled();

        System.out.println("=====================================================================================");
    }

    public void readFile(String filename) throws IOException {
        // Open the file

        FileInputStream fstream = new FileInputStream(filename);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String line;
        line = br.readLine();
        while ((line = br.readLine()) != null){

            StringTokenizer token = new StringTokenizer(line, ";");

            int sem = Integer.parseInt(token.nextToken());
            String code = token.nextToken();
            String course = token.nextToken();
            int ects = Integer.parseInt(token.nextToken());
            int cred = Integer.parseInt(token.nextToken());
            String stl = token.nextToken();

            courseList.addLast(new Course(sem, code, course, ects, cred, stl));
        }
        br.close();
    }


}
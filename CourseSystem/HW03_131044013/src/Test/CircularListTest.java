package Test;

import Part1.Course;
import Part3.CircularList;
import org.junit.Test;
import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

import static org.junit.Assert.*;

/**
 * Created by babatman on 27.03.2018.
 */
public class CircularListTest {

    CircularList<Course> courseList = new CircularList<>();

    @Test
    public void add() throws Exception {

        FileInputStream fstream = new FileInputStream("temp.csv");
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

            Course c = new Course(sem, code, course, ects, cred, stl);

            courseList.add(c);
        }
        br.close();

        courseList.display();

    }

    @Test
    public void next() throws Exception {
        FileInputStream fstream = new FileInputStream("temp.csv");
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

            Course c = new Course(sem, code, course, ects, cred, stl);

            courseList.add(c);
        }
        br.close();

        System.out.println("===============Liste=================");
        courseList.display();


        System.out.println("===============Circular Next Node===============");
        Course course = new Course(1,"TUR 101","Turkish I",2,2,"2+0+0");
        System.out.println(courseList.next(new CircularList.Node<Course>(course,null)).toString());
    }

    @Test
    public void nextInSemester() throws Exception {


        FileInputStream fstream = new FileInputStream("temp.csv");
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

            Course c = new Course(sem, code, course, ects, cred, stl);

            courseList.add(c);
        }
        br.close();

        System.out.println("===============Liste=================");
        courseList.display();


        System.out.println("===============Circular Next Node===============");
        Course course = new Course(5,"CSE 341","Programming Languages",6,3,"3+0+0");
        System.out.println(courseList.nextInSemester(new CircularList.Node<Course>(course,null)).toString());


    }
    @Test
    public void remove() throws Exception {

        System.out.println("===========LIST===========");
        add();

        System.out.println("SIZE LIST: "+courseList.size());
        Course course = new Course(5,"CSE 341","Programming Languages",6,3,"3+0+0");

        System.out.println("===========After REMOVE 5,'CSE 341,Programming Languages,6,3,3+0+0' ===========");
        System.out.println("===========LIST===========");
        courseList.remove(new CircularList.Node<Course>(course,null));
        System.out.println("SIZE LIST: "+courseList.size());
        courseList.display();


    }

    @Test
    public void size() throws Exception {
        add();
        System.out.println("SIZE LIST: "+courseList.size());
    }

    /**
     * Read CSV file.
     * @param filename
     * @throws IOException
     */
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
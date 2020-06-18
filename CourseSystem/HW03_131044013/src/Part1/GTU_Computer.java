package Part1;

/**
 * Created by babatman on 24.03.2018.
 */

import com.babatman.LinkedList;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * GTU computer
 */
public class GTU_Computer {
    /**
     * All courses saved.
     */
    private LinkedList<Course> courseList = new LinkedList<>();

    /**
     * Returns all courses which have given course code.
     * @param code
     * @return linkedlist course
     */
    public LinkedList<Course> getByCode(String code){
        LinkedList<Course> courses = new LinkedList<>();
        Iterator<Course> it = courseList.iterator();

        while (it.hasNext()){
            if (code.equals(it.next().getC_code()))
                courses.addLast(it.next());
        }
        return courses;
    }

    /**
     * Returns all courses on given semester.
     * @param semester
     * @return linkedlist course
     */
    public LinkedList<Course> listSemesterCourses (int semester){
        LinkedList<Course> courses = new LinkedList<>();
        Iterator<Course> it = courseList.iterator();

        while (it.hasNext()){
            if (semester == it.next().getSemester()){
                courses.addLast(it.next());            }
        }
        return courses;
    }

    /**
     * Returns all courses from given start index to last index.
     * @param start_index
     * @param last_index
     * @return linkedlist course
     */
    public LinkedList<Course>getByRange(int start_index, int last_index){
        LinkedList<Course> courses = new LinkedList<>();

        for (int i = start_index; i < last_index; i++) {
            courses.addLast(courseList.get(i));
        }
        return courses;
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

    /**
     * Display all Course
     */
    public void displayCourse(){
        Iterator<Course> it = courseList.iterator();

        while (it.hasNext()){
            System.out.println(it.next().toString());
            System.out.println();
        }

    }

}

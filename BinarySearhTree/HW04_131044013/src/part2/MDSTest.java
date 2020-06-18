package part2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MDSTest {
    @Test
    public void add() throws Exception {
        ArrayList<Integer> points = new ArrayList<>();
        MDS mds = new MDS();

        points.add(2);
        points.add(5);
        points.add(4);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(0);
        points.add(5);
        points.add(4);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(3);
        points.add(1);
        points.add(0);
        mds.add(points,3);
        points = new ArrayList<>();


        points.add(8);
        points.add(4);
        points.add(41);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(7);
        points.add(56);
        points.add(24);
        mds.add(points,3);
        points = new ArrayList<>();


        points.add(1);
        points.add(56);
        points.add(24);
        mds.add(points,3);
        points = new ArrayList<>();

        points.add(30);
        points.add(0);
        points.add(20);
        mds.add(points,3);
        points = new ArrayList<>();

        mds.displayTree();
    }

}
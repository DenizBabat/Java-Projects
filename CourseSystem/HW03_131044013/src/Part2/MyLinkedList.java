package Part2;

import Part3.CircularList;
import com.babatman.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


/**
 * Created by babatman on 25.03.2018.
 */

/**
 * MY linked list
 * Disabled Nodes do not appear with get, set, size, remove and listIterator methods.
 * @param <E>
 */
public class MyLinkedList<E> extends LinkedList<E> {

    /**
     * Disabled Nodes index arraylist.
     */
    private ArrayList<Integer> disabledIndex = new ArrayList<>();

    /**
     * disable function
     * @return
     */
    public boolean disable(){

        int count=0;
        if (disabledIndex.size() == this.size())
            return false;

        Random random = new Random();
        int index=-1;
        while (index==-1){

            index = ((int)(Math.random()* 17))%this.size();

            if (index>0)
            {
                if (!disabledIndex.contains(index)){
                    try{
                        disabledIndex.add(index);
                        //  System.out.printf(String.valueOf(index));
                    }catch (IndexOutOfBoundsException e)
                    {
                        System.out.println("Index out of bounds: " + e.getMessage());
                    }
                    return true;
                }
                ++count;
                if (count==this.size())
                    return false;

            }
            index = -1;
        }
        return true;
    }
    /*
    enabled funciton
     */
    public boolean enabled(){
        if (disabledIndex.size()==0)
            return false;

        Random random = new Random();
        int index = -1;

        while (index == -1){
            random = new Random();
            index = ((int)(Math.random()* 17))%this.size();
            if (index>0)
            {
                if (disabledIndex.contains(new Integer(index))){
                    try{
                        disabledIndex.remove(index);
                        //  System.out.printf(String.valueOf(index));
                    }catch (IndexOutOfBoundsException e)
                    {
                        System.out.println("Index out of bounds: " + e.getMessage());
                    }
                    return true;
                }


            }
            index = -1;
        }

        return false;
    }

    /**
     * Display disable nodes.
     */
    public void showDisabled(){
        for (int i = 0; i < disabledIndex.size(); i++) {
            System.out.println(this.get(disabledIndex.get(i)).toString());
            System.out.println();
        }


    }

    /**
     * REmove from limkedlist
     * @param o
     * @return
     */
    @Override
    public boolean remove(Object o) {

        if (disabledIndex.contains(this.indexOf(o))){
            return false;
        }
        return this.remove(o);
    }

    /**
     * set element
     * @param index
     * @param element
     * @return
     */
    @Override
    public E set(int index, E element) {
        if (disabledIndex.contains(index)){
            return null;
        }
        return  set(index, element);
    }

}

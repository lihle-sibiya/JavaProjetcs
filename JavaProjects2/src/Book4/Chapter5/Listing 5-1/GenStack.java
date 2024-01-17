import java.util.*;

public class GenStack<E>	//formal type parameter <E>
{
    private LinkedList<E> list = new LinkedList<E>();	//private LinkedList object list : keep items stored in stack

    public void push(E item) //parameter of type E	
    {
        list.addFirst(item); //addFirst method to add the item to the beginning of the list
    }

    public E pop()	//returns a value of type E
    {
        return list.poll(); //removes and returns the first element in the linked list
    }

    public E peek()	//returns a value of type E
    {
        return list.peek(); // returns result of the linked list’s peek method
    }

    public boolean hasItems()	
    {
        return !list.isEmpty(); //returns the opposite of the linked list’s isEmpty
    }

    public int size()	
    {
        return list.size(); // returns the result of the linked list’s size method
    }
}

import java.util.*;

public class GenStack<E>	//formal type parameter <E>
{
    private LinkedList<E> list = new LinkedList<E>();	//private LinkedList object list : keep items stored in stack

    public void push(E item)	
    {
        list.addFirst(item); //addFirst method to add the item to the beginning of the list
    }

    public E pop()	
    {
        return list.poll();
    }

    public E peek()	
    {
        return list.peek();
    }

    public boolean hasItems()	
    {
        return !list.isEmpty();
    }

    public int size()	
    {
        return list.size();
    }
}

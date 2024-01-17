import java.util.*;

public class GenQueue<E>	
{
    private LinkedList<E> list = new LinkedList<E>();	//private LinkedList object list to keep its items

    public void enqueue(E item)	
    {
        list.addLast(item); //add the item to the end of the queue
    }

    public E dequeue()	
    {
        return list.poll(); //return the first item in the list
    }

    public boolean hasItems()	
    {
        return !list.isEmpty(); //returns the opposite of the linked list’s isEmpty method
    }

    public int size()	
    {
        return list.size(); //returns the result of the linked list’s size
    }
        //GenQueue object whose element type is either the same type or a subtype of this GenQueue object’s
    public void addItems(GenQueue<? extends E> q)	//element type.
    {
        while (q.hasItems()) //uses While loop to remove all the items from the q parameter
            list.addLast(q.dequeue()); //and add them to this queue
    }
}

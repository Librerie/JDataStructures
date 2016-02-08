/**
 * 
 */
package it.reexon.jdatastructures.objects;

import java.util.Collection;

import it.reexon.jdatastructures.objects.interfaces.SortInteface;


/**
 * @author marco.velluto
 *
 */
public class SortArrayList<T extends Comparable<T>> extends SortCollection<T> implements SortInteface<T>
{

    public SortArrayList(Collection<T> collectionSort)
    {
        super(collectionSort);
    }

}

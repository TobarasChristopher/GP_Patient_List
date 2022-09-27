/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gppatientlist;

/**
 *
 * @author x20324573
 */
public interface PQMethods {
    public void enqueue(int key, Object element);
    public Object dequeue();
    public Object getNext();
    public int size();
    public boolean isEmpty();
    public String printPQueue();
    public String printPDetails();
    
}

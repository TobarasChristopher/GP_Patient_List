/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gppatientlist;

import java.util.ArrayList;

/**
 *
 * @author x20324573
 */
public class MyPriorityQueue implements PQMethods { //grab methods from pqmethods
    
    private final ArrayList<PQElement> thePriorityQueue;    //create arraylist
    
    public MyPriorityQueue(){       //constructor
        thePriorityQueue = new ArrayList<>();
    }
    
    private int findInsertPosition(int newkey){     //find where a specific index is
        boolean found;  //boolean for finding
        PQElement element;
        int position;   //int for index
        
        found = false;
        position = 0;
        while (position < thePriorityQueue.size()&& !(found)){  //search entire arraylist
            element = thePriorityQueue.get(position);           //grab index value
            if (element.getKey()>newkey){                       //if doesnt match
                position = position + 1;                        //continue
            }
            else{
                found = true;                                   //return if found
            }
        }
        return position;                                        //bring back position
    }
    
    @Override
    public int size(){
        return thePriorityQueue.size();
    }
    
    @Override
    public boolean isEmpty() {
        return thePriorityQueue.isEmpty();
    }
    
    public void enqueue(int priority, Object item){       //add value to priority queue
        int index;
        PQElement element = new PQElement(priority, (Patient) item);
        index = findInsertPosition(priority);
        
        if (index == size()){
            thePriorityQueue.add(element);
        }
        else{
            thePriorityQueue.add(index, element);
        }
    }
    
    @Override
    public Object dequeue() {       //grab and delete current index
        return thePriorityQueue.remove(0);
    }
    
    @Override
    public Object getNext() {       //grab current index
        return thePriorityQueue.get(0);
    }
    
    @Override
    public String printPDetails() {       //print the patient details of the index
        String printD = new String();
        PQElement element;
        for (int i = 0; i < thePriorityQueue.size(); i++) {
            element = thePriorityQueue.get(i);
            printD = printD.concat(element.printPatientDetails() + "\n");
        }
        return printD;
    }

    @Override 
    public String printPQueue()       //print the whole queue USED FOR TESTING
    {
        String printStr = new String();
        PQElement element;
        for (int i = 0; i<thePriorityQueue.size();i++)
        {
            element = thePriorityQueue.get(i);
            printStr = printStr.concat (element.printPatientDetails()+" "+"Priority ="+element.getKey()+"\n");
        }
        return printStr;
    }
    
}

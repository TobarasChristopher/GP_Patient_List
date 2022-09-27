/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gppatientlist;
import java.util.ArrayList;


/**
 *
 * @author x20324573
 */
public class Stack implements StackMethods {
    private ArrayList<Patient> stackList;
    
    public Stack(){
        stackList = new ArrayList<Patient>();
    }
    
    public boolean isEmpty(){       //return boolean if empty
        return stackList.isEmpty();
    }
    
    public boolean isFull(){        //return boolean if full
        return false;               // METHOD DEPRECIATED
    }
    
    public void push(Object item){  //Push method for stacklist
        stackList.add(0,(Patient)item); //add patient as item
    }
    
    public Object pop(){
        if(!(stackList.isEmpty())){
            return stackList.remove(0); //return and remove topmost value
        }
        else{
            return null;        //error message in GUI
        }
    }
    
    public int size(){
        return stackList.size();
    }
    
    public void emptyStack(){
        while(!(stackList.isEmpty())){      //Flush stack
            pop();                          //NOT USED
        }
    }
    
    public String displayStack(){
        Patient p;
        String string = new String();
        if(stackList.isEmpty()){    //check if empty
            string = ("There are no added patients in the queue");
        }
        else{
            for(int i = 0; i<stackList.size();i++){
                p = stackList.get(i);
                string = string.concat("Name = "+p.getName()+"\nAge = "+p.getAge()+"\nMedical Condition = "+p.getMedicalCondition()+"\n");
            }
        }
        return string;

    }
    
    
}

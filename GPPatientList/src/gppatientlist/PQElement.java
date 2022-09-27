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
public class PQElement {
    private int key;
    private Patient element;
    
    public PQElement(int priority, Patient elem){
        key = priority;
        element = elem;
    }
    public void setKey(int value){
        key = value;
    }
    
    public int getKey(){
        return key;
    }
    
    public void setElement(Patient elem){
        element = elem;
    }
    
    public Patient getElement(){
        return element;
    }
    
    public String printPatientDetails(){    //for GUI
        String msg;
        msg = "Name: "+element.getName()+" Age: "+element.getAge()+" Medical Condition? "+element.getMedicalCondition();
        return msg;
    }
}

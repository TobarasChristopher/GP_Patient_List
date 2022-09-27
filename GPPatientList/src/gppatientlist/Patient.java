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
public class Patient {
    private String name,age;
    private boolean medicalCondition;
    
    public Patient(){
        name = new String();
        age = new String();
        medicalCondition = false;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(String age){
        this.age = age;
    }
    
    public void setMedicalCondition(boolean medicalCondition){
        this.medicalCondition = medicalCondition;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAge(){
        return age;
    }
    
    public boolean getMedicalCondition(){
        return medicalCondition;
    }
    
}

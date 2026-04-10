/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayofobjectse2;

/**
 *
 * @author sedie
 */
public class Student {
    //Data member
    private String stName;
    private String stSurname;
    private int stAge;
    private String stCourse;
    
    //Overload Constructor
    public Student(String stName, String stSurname, int stAge, String stCourse) {
        this.stName = stName;
        this.stSurname = stSurname;
        this.stAge = stAge;
        this.stCourse = stCourse;
    }
    
    //Method to display
    public void display(){
        System.out.println(stName);
        System.out.println(stSurname);
        System.out.println(stAge);
        System.out.println(stCourse);
    }
}

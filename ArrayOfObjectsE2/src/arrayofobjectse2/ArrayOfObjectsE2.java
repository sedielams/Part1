/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayofobjectse2;

import java.util.Scanner;

/**
 *
 * @author sedie
 */
public class ArrayOfObjectsE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare array of objects
        Student[] students = new Student[2];
        
        students = theInput();
        
        for(int i = 0; i < students.length; i++){
            students[i].display();
        }
        
        for(Student st : students){
            st.display();
        }
    }
    
    public static Student[] theInput(){
        //Declare array of objects
        Student[] students = new Student[2];
        
        Scanner input = new Scanner(System.in);
        String name, surname, course;
        int age;
        
        for(int i = 0; i < students.length; i++){            
            System.out.print("Name: ");
            name = input.nextLine();
            System.out.print("Surname: ");
            surname = input.nextLine();
            System.out.print("Age ");
            age = Integer.parseInt(input.nextLine());
            System.out.print("Course: ");
            course = input.nextLine();
            
            students[i] = new Student(name, surname, age, course);
            
        }
        
        return students;
    }
    
}

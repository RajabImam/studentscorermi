/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ng.pencode.server;

/**
 *
 * @author rajabimam
 */
public class Test {
    public static void main(String[] args) {
        Student raj = new Student("62198", "Rajab", 30);
        //raj.add_exam(new Exam("Architecture", 80, 0.3));
        //raj.add_exam(new Exam("Security", 70, 0.2));
        
        System.out.println(raj.print_exams());
        System.out.println("Average" + raj.calculate_average());
        
    }
}

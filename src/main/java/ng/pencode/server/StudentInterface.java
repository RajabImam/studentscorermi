/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ng.pencode.server;


/**
 *
 * @author rajabimam
 */
public interface StudentInterface {
    int add_exam(Exam exam);
    
    String print_exams();
    
    double calculate_average();
}

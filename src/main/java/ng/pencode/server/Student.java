/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ng.pencode.server;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rajabimam
 */
public class Student implements StudentInterface{
    private String id;
    private String name;
    private int age;
    private List<Exam> exams = new ArrayList<>();

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        //this.exams = null;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

   
    

    @Override
    public int add_exam(Exam exam) {
        if (exam != null) {
            exams.add(exam);
            return 1;
        }
        return 0;
    }

    @Override
    public String print_exams() {
        if (exams.isEmpty()) {
            return "Student has no record";
        }
        
        String name;
        String coeficient;
        String score;
        int count = 0;
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("s/n\tname\t\tcoeficient\tscore\n");
        
        for (Exam exam : exams) {
            name = exam.getName();
            coeficient = String.valueOf(exam.getCoefficient());
            score = String.valueOf(exam.getScore());
            
            stringBuilder.append(++count+"\t"+name+"\t"+coeficient+"\t\t"+score+"\n");
        }
        
        return stringBuilder.toString();
    }

    @Override
    public double calculate_average() {
       if (exams.isEmpty()) {
            return 0;
        }
       double coefSum = 0;
       double coefScoreTotal = 0;
       double avg;
       
        for (Exam exam : exams) {
            coefSum += exam.getCoefficient();
            coefScoreTotal += exam.getCoefficient() * exam.getScore();
        }
        avg = coefScoreTotal/coefSum;
       return avg;
    }
    
}

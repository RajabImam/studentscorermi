/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ng.pencode.server;

/**
 *
 * @author rajabimam
 */
public class Exam {
    private String name;
    private double score;
    private double coefficient;

    public Exam(String name, double score, double coefficient) {
        this.name = name;
        this.score = score;
        this.coefficient = coefficient;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidatechecker;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CandidateChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean approved = true;
        System.out.print("Candidate name: ");
        String name = scn.nextLine();
   
        System.out.print("Grade in Portuguese:");
        double porGrade = scn.nextDouble();
        if (porGrade < 6)
            approved = false;
        System.out.print("Grade in Math:");
        double mathGrade = scn.nextDouble();
        if (mathGrade < 6)
            approved = false;
        System.out.print("Grade in General Knowledge:");
        double genGrade = scn.nextDouble();
        if (genGrade < 6)
            approved = false;
                
    }
    
    
}

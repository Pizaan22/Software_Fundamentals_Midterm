/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */


public class StausUser {
        enum statuses{
                ZERO("Rejected"),
                ONE("Pending"),
                TWO("Processing"),
                THREE("Approved");

                String value;
                statuses(String value){
                        this.value = value;
                }
        }
        
        public void printStatuses(){
                System.out.println("The available statuses are: ");
                for(statuses i : statuses.values()) {
                        System.out.println(i + ": " + i.value);
                }
                
        }
        
}

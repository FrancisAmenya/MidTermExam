package midtermexam;

/*
 * A project to test BMI functionality...still under development 
 * initially edited on 27/06/2018
 * last edited on 27/06/2018
 */

/**
 * @author Francis Amenya
 */
public class ExamTest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name     =      "Francis";
        
        double height   = 1.0,
               weight   = 60.5,      
               x ;
        
        
        for(x=0.0;x<3.0;x++){
            // getBMI(height, weight);
            /* System.err.println(bmi + " x is " + Integer.valueOf(x)); */
            
            height++;
            weight++;
            
            System.out.println(name + "' BMI is " + getBMI(height, weight) + " .");
                       
            if (getBMI(height, weight)<18.0){
                System.out.println(name + " is underweight" + " . \n");
            }
            else{
                if (getBMI(height, weight)<25.0){
                    System.out.println(name + " is healthy" + " . \n");
            }
                else{
                    System.out.println(name + " is overweight" + " . \n");
                }
            };
        }
    }
    
    public static double getBMI (double height, double weight){
        double bmi;
        
        bmi    = weight / (height);
        
        return bmi;
        
        } 
}

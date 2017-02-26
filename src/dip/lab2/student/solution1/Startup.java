package dip.lab2.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class Startup {
    public static void main(String[] args) {
        //always perform initialization of worker objects first
        FoodServiceTipCalculator calc1 = 
                new FoodServiceTipCalculator(100.00, ServiceQuality.GOOD);
        
        TipCalculator calc2 = 
            new BartenderServiceTipCalculator(1,5);        

        TipCalculatorService service = new TipCalculatorService(calc1);

        //never talk directly to low level object
        
        double tip = service.getTip();
       
        System.out.println("Restaurant Tip: " + tip);
        

    }
}

package dip.lab2.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class TipCalculatorService {
    private TipCalculator tipCalculator;

    public TipCalculatorService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    //this method name does not HAVE to match the tipCalculator version of getTip();
    public double getTip(){
        return tipCalculator.getTip();
    }
    
    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public final void setTipCalculator(TipCalculator tipCalculator) {
        //validate
        if(tipCalculator == null){
            throw new IllegalArgumentException("Tip Calculator is mandatory.");
        }
        this.tipCalculator = tipCalculator;
    }
    
    
}

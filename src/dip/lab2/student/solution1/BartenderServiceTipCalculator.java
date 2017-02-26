/*
All concrete methods need Final
need validation
constructor should be calling getters instead of using this.___
*/
package dip.lab2.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class BartenderServiceTipCalculator implements TipCalculator {
    private double amountPerDrink;
    private double goodTip = 0.20;
    private double fairTip = 0.15;
    private double poorTip = 0.10;
    private ServiceQuality serviceQuality;
    private int drinkCount;


    //mandatory information is passed into the constructor so it will be guaranteed to be 
    public BartenderServiceTipCalculator(double amountPerDrink, int drinkCount) {
        this.amountPerDrink = amountPerDrink;
        this.serviceQuality = serviceQuality;
        this.drinkCount = drinkCount;
    }
    
    @Override
    public final double getTip() {
        double tip = amountPerDrink*drinkCount;

        return tip;
    }

    public double getAmountPerDrink() {
        return amountPerDrink;
    }

    public void setAmountPerDrink(double amountPerDrink) {
        this.amountPerDrink = amountPerDrink;
    }

    @Override
    public double getGoodTip() {
        return goodTip;
    }

    @Override
    public void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public double getFairTip() {
        return fairTip;
    }

    @Override
    public void setFairTip(double fairTip) {
        
    }

    @Override
    public double getPoorTip() {
        return 0;
    }

    @Override
    public void setPoorTip(double poorTip) {

    }
    
    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }  

    public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }
    
    
    
}

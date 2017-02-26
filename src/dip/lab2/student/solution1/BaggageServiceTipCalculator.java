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
public class BaggageServiceTipCalculator implements TipCalculator {
    private double baseRate;
    private double goodTip = 0.20;
    private double fairTip = 0.15;
    private double poorTip = 0.10;
    private ServiceQuality serviceQuality;
    private int bagCount;


    //mandatory information is passed into the constructor so it will be guaranteed to be 
    public BaggageServiceTipCalculator(double baseRate, int bagCount, ServiceQuality serviceQuality) {
        this.baseRate = baseRate;
        this.serviceQuality = serviceQuality;
        this.bagCount = bagCount;
    }
    
    @Override
    public final double getTip() {
        double tip = 0.0;
        switch(serviceQuality){
            case GOOD:
                tip = baseRate*bagCount*goodTip;
                break;
            case FAIR:
                tip = baseRate*bagCount*fairTip;
                break;
            case POOR:
                tip = baseRate*bagCount*poorTip;
                break;    
        }
        return tip;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
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
        this.fairTip = fairTip;
    }

    @Override
    public double getPoorTip() {
        return poorTip;
    }

    @Override
    public void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }
    
    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }  

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }
    
    
    
}

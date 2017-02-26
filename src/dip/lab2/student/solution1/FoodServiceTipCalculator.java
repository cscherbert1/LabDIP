package dip.lab2.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private double billAmt;
    private double goodTip = 0.20;
    private double fairTip = 0.15;
    private double poorTip = 0.10;
    private ServiceQuality serviceQuality;


    //mandatory information is passed into the constructor so it will be guaranteed to be 
    public FoodServiceTipCalculator(double billAmt, ServiceQuality serviceQuality) {
        this.billAmt = billAmt;
        this.serviceQuality = serviceQuality;
    }
    
    @Override
    public final double getTip() {
        double tip = 0.0;
        switch(serviceQuality){
            case GOOD:
                tip = billAmt*goodTip;
                break;
            case FAIR:
                tip = billAmt*fairTip;
                break;
            case POOR:
                tip = billAmt*poorTip;
                break;    
        }
        return tip;
    }

    public double getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(double billAmt) {
        this.billAmt = billAmt;
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
    
}

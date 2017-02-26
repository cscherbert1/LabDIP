package dip.lab2.student.solution1;

/**
 *
 * @author cscherbert1
 */
public interface TipCalculator {

    double getFairTip();

    double getGoodTip();

    double getPoorTip();

    ServiceQuality getServiceQuality();

    double getTip();

    void setFairTip(double fairTip);

    void setGoodTip(double goodTip);

    void setPoorTip(double poorTip);

    void setServiceQuality(ServiceQuality serviceQuality);
    
}

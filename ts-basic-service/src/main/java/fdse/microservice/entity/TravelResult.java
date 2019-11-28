package fdse.microservice.entity;

import java.util.HashMap;

/**
 * @author fdse
 */
public class TravelResult {
    private boolean status;
    private double percent;
    private TrainType trainType;

    private HashMap<String,String> prices;

    public TravelResult(){}

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent){
        this.percent = percent;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public HashMap<String, String> getPrices() {
        return prices;
    }

    public void setPrices(HashMap<String, String> prices) {
        this.prices = prices;
    }
}

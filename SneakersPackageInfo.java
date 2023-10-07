
public class SneakersPackageInfo {

    private long daysForDeliver;
    private long cost;

    public SneakersPackageInfo(int daysForDeliver, int cost){
        this.daysForDeliver = daysForDeliver;
        this.cost = cost;
    }


    public long getDaysForDeliver() {
        return daysForDeliver;
    }

    public long getCost() {
        return cost;
    }


}



public class Staff {
    private long salesAmount;

    private SneakersInfo nikeSneakersInfo;
    private boolean havingNikeSneakersInStore;

    public Staff(){};

    public void setNikeSneakersInfo(SneakersInfo nikeSneakersInfo) {
        this.nikeSneakersInfo = nikeSneakersInfo;
    }


    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }

    public void setHavingNikeSneakersInStore(boolean havingNikeSneakersInStore) {
        this.havingNikeSneakersInStore = havingNikeSneakersInStore;
    }

    public boolean checkHavingNikeSneakersInStore(){
        if(this.havingNikeSneakersInStore){
            System.out.println("현재 매장 재고가 있습니다. 주문 가능합니다");
        }
        else{
            System.out.println("현재 매장 재고가 없어서 주문 불가입니다.");
        }
        return havingNikeSneakersInStore;
    }

    public void answerNikeSneakersInfo() {
        System.out.printf("직원: 이 Nike 운동화는 %s 특징과 %d 가격을 가지고 있습니다.\\n", nikeSneakersInfo.getFeature(), nikeSneakersInfo.getPrice());
    }

    public long answerNikeSneakersPrice(){
        return this.nikeSneakersInfo.getPrice();
    }

    public void sayPayment(long payment){
        System.out.printf("직원: 고객님 신발 주문 도와드리겠습니다. %d 입니다.\\n", payment);
    }

    public void addSalesAmount(long cash){
        this.salesAmount += cash;
    }

    public Sneakers offerNikeSneakers(){
        return new Sneakers(this.nikeSneakersInfo);
    }

    public SneakersPackageInfo orderNikeSneakersToDeliverManager(DeliveryManager deliveryManager){

        return deliveryManager.getSneakersPackageInfo();

    }

    public void sayNikePackageInfo(SneakersPackageInfo nikesneakersPackageInfo){
        System.out.printf("직원 : 고객님 배송일은 %d 일 걸릴 예정이고, 배송금액은 %d 원 입니다. \\n",
                nikesneakersPackageInfo.getDaysForDeliver(), nikesneakersPackageInfo.getCost());
    }

    public long caculateDeliveryCost(SneakersPackageInfo nikeSneakersPackageInfo){
        return nikeSneakersPackageInfo.getCost();
    }
    public long returnRefund(long cash){
        this.salesAmount -= cash;
        return cash;
    }

}

/*
1. 고객은 매장 직원에게 Nike 운동화에 알려주세요 라고 한다.
2. 고객은 주문 진행
3. 고객은 결제 진행
4. 고객의 배송 여부 t f
5. 배송 t일 경우
6. 결제
7. 배송료+ 신발가격이 고객의 잔고 보다 많을 경우 환불 요청
8. 배송이 될 경우 배송 담당자에게 배송료 지불
9. 운동화의 특징을 설명하며 자신의 상태를 말하고 종료
 */


public class Customer {

    //속성

    private long cash;
    private boolean likeDelivery;
    private String myFeeling;

    public Customer(){
        this.myFeeling = "보통";
    }


    public boolean isAffordable(long cacheRequired){
        return this.cash >= cacheRequired;
    }
    public boolean isLikeDelivery(){
        return likeDelivery;
    }

    public void sayBye(){
        System.out.printf("손님 : 다음에 올게욥! 기분이 %s 이고 잔액이 %d 남았습니다", this.myFeeling, this.cash);
    }

    public void sayOrder(){
        System.out.println("직원 : 손님 주문 진행 계속 하겠습니다!");
    }

    public void askNikeSneakersToStaff(Staff staff) {
        System.out.println("손님: Nike 운동화에 대해서 알려주세요");
        staff.answerNikeSneakersInfo();
    }

    public long askAndGetSneakerPriceFromStaff(Staff staff){
        return staff.answerNikeSneakersPrice();
    }

    public long askNikeSneakerPriceFromStaff(Staff staff){
        return staff.answerNikeSneakersPrice();
    }

    public long askDeliveryCostFromDeliveryManger(DeliveryManager deliveryManager){
        return deliveryManager.answerDeliveryCost();
    }

    public long makePayment(long nikePrice){
        this.cash -= nikePrice;
        return nikePrice;
    }

    public void setLikeDelivery(boolean likeDelivery) {
        this.likeDelivery = likeDelivery;
    }

    public void setCache(long cash) {
        this.cash = cash;
    }

    public void wearSneakers(Sneakers sneakers){
        this.myFeeling = "좋음";
        System.out.printf("손님: 이 신발은 %s의 특징이 느껴지네요, 기분이 %s이고, 잔약%d 남았습니다 \\n",
                sneakers.getSneakersInfo().getFeature(), this.myFeeling, this.cash);
    }
    public void requireRefund(){
        System.out.println("손님 : 배송료가 너무 비싸네요 환불해 주세요!");
    }

    public void getRefund(long cash){
        this.cash += cash;
    }





}

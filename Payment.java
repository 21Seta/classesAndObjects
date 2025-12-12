public class Payment {

    String fullName ;
    String CardNumber;
    int amount ;
    boolean verify ;
    boolean recipe ;
    boolean sale ;
    String paymenType;
    String paymentMethodCard() {
        return
                "თუ გადახდა ხდება ბარათით + 100 შენაძენზე ზემოთ გეკუთვნით 20 % ფასდაკლება ";
    }

    String paymentMethodCash() {
        return
                "თუ გადახდა ხდება ქეშით + 100 შენაძენზე ზემოთ გეკუთვნით 10 % ფასდაკლება ";
    }

}

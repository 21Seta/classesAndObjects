public class PaymentMethod {

    String fullName ;
    String CardNumber;
    int amount ;
    double verify ;
    double recipe ;
    String paymentMethod() {
        return "გადახდა ხდება ქეშით + 100 ზემოთ შენაძენზე გეკუთვნით 10 % ფასდაკლება" +
                "თუ ხდება ბარათით + 100 შენაძენზე ზემოთ გეკუთვნით 20 % ფასდაკლება";
    }

}

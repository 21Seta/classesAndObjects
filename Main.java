package PACKAGE_NAME;

public class Main {

    public static void main(String[] args) {
        Payment cardpayment = new Payment();
        cardpayment.fullName = "გიორგი სეთურიძე";

        cardpayment.amount = 99;
        cardpayment.CardNumber = "123456789";
        cardpayment.verify = true ;
        cardpayment.recipe = true ;
        cardpayment.sale = false ;


        System.out.println("გადახის ტიპი: " +  cardpayment.paymentMethodCash());
        System.out.println("გადამხდელი: " +  cardpayment.fullName);

        System.out.println("ბარათის ნომერი: " +  cardpayment.CardNumber);
        System.out.println("თანხა: " +  cardpayment.amount + " ₾");
        System.out.println("გადახდა დადასტურებულია: " + ( cardpayment.verify ? "დიახ" : "არა"));
        System.out.println("ქვითარი გაცემულია: " + ( cardpayment.recipe ? "დიახ" : "არა"));
        System.out.println("ფასდაკლება: " + ( cardpayment.sale ? "დიახ" : "არა"));

        System.out.println();

        Payment cashpayment = new Payment();
        cashpayment.fullName = "გიორგი სეთურიძე";
        cashpayment.amount = 101;
        cashpayment.verify = true ;
        cashpayment.recipe = true ;
        cashpayment.sale = true ;

        System.out.println("გადახის ტიპი: " +  cardpayment.paymentMethodCard());
        System.out.println("გადამხდელი: " +  cashpayment.fullName);
        System.out.println("თანხა: " +  cashpayment.amount + " ₾");
        System.out.println("გადახდა დადასტურებულია: " + ( cashpayment.verify ? "დიახ" : "არა"));
        System.out.println("ფასდაკლება: " + ( cashpayment.sale ? "დიახ" : "არა"));

    }
}

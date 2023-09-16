package oop2;

import java.sql.SQLOutput;

public class BeveragesMain {
    public static void main(String[] args) {
        Beverages beverages = new Beverages() {

            @Override
            public int sugarLevel() {

                return 23;
            }
        };

        System.out.println(beverages.sugarLevel());
        System.out.println(beverages.influence());

        Beverages beveragesInnerClass = new Beverages() {
            int amount;

            public int getAmount() {
                return amount;
            }

            public void setAmount(int amount) {
                this.amount = amount;
            }

            public double publicSatisfaction(){//not override - not possible to see this method
                return 56.5;
            }

            @Override
            public int sugarLevel() {
                System.out.println(publicSatisfaction());
                return 23;
            }
        };

        System.out.println(beveragesInnerClass.sugarLevel());

        Beverages beverages1 = new Beverages(){
            @Override
            public int sugarLevel() {
                return 0;
            }

            @Override
            public String influence() {
                return Beverages.super.influence();
            }
        };




        AbstractBeveragesExtension abstractBeveragesExtension = new AbstractBeveragesExtension();
        System.out.println(abstractBeveragesExtension.bottleAge());
        System.out.println(abstractBeveragesExtension.getClass());
       // System.out.println(abstractBeveragesExtension.distributionType());

    }
}

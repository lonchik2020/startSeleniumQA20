package oop;

public class FirstMain {

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
//        System.out.println(kitty.jumpHigh());//1
//        System.out.println(kitty.voice());//piii
//        System.out.println(kitty.legsQuantity());//6

        CatParent catParent = new CatParent();
//        System.out.println(catParent.jumpHigh());//3
//        System.out.println(catParent.voice());//myaumuya
//        System.out.println(catParent.legsQuantity());//6

        Animals animals = new Animals() {//skrityi class with no name

            @Override
            public int legsQuantity() {
                return 8;
            }
        };

        System.out.println(animals.legsQuantity());
        System.out.println(animals.voice());

        Animals animalsClass = new Animals() {//skrityi class with no name - not possible to make constructor
            //exempliar objecta clasa
            int quantity;

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public int someNumber(){
                return 99;
            }

            @Override
            public int legsQuantity() {
                System.out.println(someNumber());
                return 8;
            }
        };

        System.out.println(animalsClass.getClass());//to get name of the class - // FirstMain$2
       // animalsClass.someNumber
        System.out.println(animalsClass.legsQuantity());// 99  8

//        Animals animals1 = new Animals() {
//        };






    }
}

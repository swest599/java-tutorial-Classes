package org.pursuit;

public class Main {
    public static void main(String[] args) {
        printReverseChars("Outstanding");
    }


    public static void printReverseChars(String monster) {
        for (int i = monster.length() - 1; i >= 0; i--) {
            System.out.println(monster.charAt(i));
        }
}




        //    public static void main(String[] args) {
//        System.out.println(reverseMe("animals"));
//    }
//    public static String reverseMe(String winner){
//        String those1s = "";
//        for (int i = winner.length()-1; i >=0; i-- ){
//            those1s += winner.charAt(i);
//        }
//        return those1s;
//
//    }


        //    public static void main(String[] args) {
//        System.out.println(repeatMyself("RADA"));
//                }
//    public static String repeatMyself(String random){
//        String blank = "";
//        for(int i = 0; i < random.length(); i++){
//            blank += random;
//        }
//        return blank;
//    }

//    public static void main(String[] args){
//        System.out.print(repeatMe("Hello", 5));
//    }
//    public static String repeatMe(String example0, int example1){
//        String blank = "";
//        for (int i = 0; i < example1 ; i++){
//            blank += example0;
//        }
//        return blank;
//    }

//    //question 1
//    public static void main(String[] args) {
//        System.out.println(countMe("GucciMayne"));
//    }
//    public static int countMe(String input){
//        int exp = input.length();
//        return exp;
//    }

        {
            Pie pizzaPie = new Pie("Garlic", "Red Sauce", 20);   //  constructor that creates an object of type Pie in this classnow allows you to call this instantiation and create new pie recipes
            System.out.println("The pie crust is " + pizzaPie.getCrust());
            System.out.println("The filling is " + pizzaPie.getPieFilling());
            System.out.println("The diameter is " + pizzaPie.getDiameter());
            Pie.pieFilling = "blackberry"; // changes the pie recipe from  the Pie class directly

            pizzaPie.getPieFilling() = "Red Sauce"; //changes the pie recipe from this instantiation only in this class because this is a static variable
            pizzaPie.getDiameter() = 18;
            pizzaPie.getCrust() = "Garlic";
            Pie rhubarbPie = new Pie("Graham Cracker", "Rhubarb", 18);
            System.out.println(rhubarbPie.getPieFilling());
            System.out.println(rhubarbPie.getDiameter());
            System.out.println(rhubarbPie.getCrust());
            // write your code here
            System.out.println(Pie.crust);
            System.out.println(Pie.pieFilling);
            Pie.pieFilling = "Blueberry"; //initializing the pie class and the pie filling part of the class to change the string
            System.out.println(Pie.pieFilling);
            System.out.println(Pie.diameter);


        }
    }
}

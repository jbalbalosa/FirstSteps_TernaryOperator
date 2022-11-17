public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Ternary Operator"); //iIf condition in Visual Basic

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        //isCar = true;
        boolean wasCar = isCar ? true : false; //This is iiF in Visual Basic
        if (wasCar){
            System.out.println("wasCar is " + wasCar);
        }

    }
}
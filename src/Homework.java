import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock-Paper-Scissors Game");

        int computerPoint=0,pointOfUser=0,pointOfComputer=0,userPoint=0;


        System.out.print("Press '1' for Rock\n");
        System.out.print("Press '2' for Paper\n");
        System.out.print("Press '3' for Scissors");
        System.out.println("Collect 5 point to win ;)");
        while(true)
        {
            System.out.println("Enter a number ");
            computerPoint= (int)((Math.random())*3)+1;
            userPoint = sc.nextInt();

            switch(computerPoint) {

                case 1:                                                     // Eğer program 1i seçtiyse, oyun ona göre devam edecek.
                    if(userPoint==1){                                       // Eğer kullanıcı da 1i seçtiyse, berabere olacak.
                        System.out.print("My answer is : Rock  ");
                        System.out.print("Your answer is : Rock  ");
                        System.out.println("Same");
                    }
                    else if(userPoint == 2) {                           // Eğer kullanıcı 2yi seçtiyse, kazanan belirlenecek.
                        pointOfUser++;
                        System.out.print("My answer is : Rock  ");
                        System.out.print("Your answer is : Paper  ");
                        System.out.println("You have +1 point");
                        System.out.println("Your point is :  "+pointOfUser);
                        System.out.println("My point is :  "+pointOfComputer);
                    }
                    else if(userPoint == 3){                                                // Eğer 2 durum da gerçekleşmesse, kullanıcının cevabı 3 varsayılacak.

                        pointOfComputer++;
                        System.out.print("My answer is : Rock  ");
                        System.out.print("Your answer is : Scissors  ");
                        System.out.println("I have +1 point");
                        System.out.println("Your point is :  "+pointOfUser);
                        System.out.println("My point is :  "+pointOfComputer);
                    }
                    else{
                        System.out.println("PLEASE ENTER AN AVAILABLE NUMBER...");
                        continue;
                    }
                    break;

                case 2:
                    if(userPoint==2) {
                        System.out.print("My answer is : Paper  ");
                        System.out.print("Your answer is : Paper  ");
                        System.out.println("Same");}


                    else if(userPoint == 1) {
                        pointOfComputer++;
                        System.out.print("My answer is : Paper  ");
                        System.out.print("Your answer is : Rock  ");
                        System.out.println("I have +1 point");
                        System.out.println("Your point is :  "+pointOfUser);
                        System.out.println("My point is :  "+pointOfComputer);
                    }
                    else if(userPoint == 3) {
                        pointOfUser++;
                        System.out.print("My answer is : Paper  ");
                        System.out.print("Your answer is : Scissors  ");
                        System.out.println("You have +1 point");
                        System.out.println("Your point is :  "+pointOfUser);
                        System.out.println("My point is :  "+pointOfComputer);
                    }
                    else{
                        System.out.println("PLEASE ENTER AN AVAILABLE NUMBER...");
                        continue;
                    }

                    break;

                case 3:
                    if(userPoint==3){
                        System.out.print("My answer is : Scissors  ");
                        System.out.print("Your answer is : Scissors  ");
                        System.out.println("Same");
                    }
                    else if(userPoint == 1) {
                        pointOfUser++;
                        System.out.print("My answer is : Scissors  ");
                        System.out.print("Your answer is : Rock  ");
                        System.out.println("You have +1 point");
                        System.out.println("Your point is :  "+pointOfUser);
                        System.out.println("My point is :  "+pointOfComputer);
                    }
                    else if(userPoint == 2){
                        pointOfComputer++;
                        System.out.print("My answer is : Scissors  ");
                        System.out.print("Your answer is : Paper  ");
                        System.out.println("I have +1 point");
                        System.out.println("Your point is : "+pointOfUser);
                        System.out.println("My point is : "+pointOfComputer);
                    }
                    else{
                        System.out.println("PLEASE ENTER AN AVAILABLE NUMBER...");
                        continue;
                    }

                    break;


            }


            if(pointOfComputer == 5) {

                System.out.println("I won. 'Cause I have 5 points.");
                break;
            }
            else if(pointOfUser == 5) {
                System.out.println("You won. 'Cause You have 5 points");
                break;
            }




        }



    }
}

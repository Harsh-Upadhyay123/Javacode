import java.util.*;
public class CollegeQuestion{
    public static void main(String[] args) {
        System.out.println("Welcome to my showroom");
        System.out.println("Please select your choice");
        System.out.println("Enter : 4(for four wheeler)");
        System.out.println("Enter : 2(for two wheeler)");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==4){
            System.out.println("Here is your 4 wheeler section");
            System.out.println("Please select the company");
            System.out.println("1.BMW ");
            System.out.println("2.MERCEDES");
            System.out.println("3.AUDI");
            Scanner obj=new Scanner(System.in);
            int b=obj.nextInt();
            switch(b){
                case 1:System.out.println("You have choosen BMW");
                if(b==1){
                    System.out.println("BMW have three model : ");
                    System.out.println("1.BMW X5 ");
                    System.out.println("2.BMW X1 ");
                    System.out.println("3.BMW X7 ");
                    System.out.println("Enter the number to choose the model of BMW :");
                    Scanner txt=new Scanner(System.in);
                    int c=txt.nextInt();
                    switch(c){
                        case 1:System.out.println("You have choosen BMW X5");
                        if(c==1){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Black");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price : 93.90 lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int d=rtx.nextInt();
                            switch(d){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                        case 2:System.out.println("You have choosen BMW X1");
                        if(c==2){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Blue");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price : 50.90 lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int e=rtx.nextInt();
                            switch(e){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default : System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                        case 3:System.out.println("You have choosen BMW X7");
                        if(c==3){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : White");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price : 1.25 crore");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int f=rtx.nextInt();
                            switch(f){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                    }
                }
                else{
                    break;
                }
                case 2:System.out.println("You have choosen MERCEDES");
                if(b==2){
                    System.out.println("MERCEDES have three model : ");
                    System.out.println("1.MERCEDES BENZ E-CLASS");
                    System.out.println("2.MERCEDES BENZ G-CLASS");
                    System.out.println("3.MERCEDES BENZ GLA");
                    System.out.println("Enter the number to choose the model of MERCEDES :");
                    Scanner rtr=new Scanner(System.in);
                    int g=rtr.nextInt();
                    switch(g){
                        case 1:System.out.println("You have choosen MERCEDES BENZ E-CLASS");
                        if(g==1){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Black");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price :88 Lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int h=rtx.nextInt();
                            switch(h){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                        case 2:System.out.println("You have choosen MERCEDES BENZ G-CLASS");
                        if(g==2){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Blue");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price : 2.55 Crore");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int i=rtx.nextInt();
                            switch(i){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default : System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                        case 3:System.out.println("You have choosen MERCEDES BENZ GLA");
                        if(g==3){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Grey");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price : 52.70 Lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int j=rtx.nextInt();
                            switch(j){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        } 
                        break;
                    }
                    break;
                }    
                case 3:System.out.println("You have choosen AUDI");
                if(b==3){
                    System.out.println("AUDI have three model : ");
                    System.out.println("1.AUDI R8");
                    System.out.println("2.AUDI A6");
                    System.out.println("3.AUDI A4");
                    System.out.println("Enter the number to choose the model of AUDI :");
                    Scanner gtr=new Scanner(System.in);
                    int k=gtr.nextInt();
                    switch(k){
                        case 1:System.out.println("You have choosen AUDI R8");
                        if(k==1){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Black");
                            System.out.println("Seating Capacity : 2");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price :2.72 Crore");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int l=rtx.nextInt();
                            switch(l){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        
                        }
                        else{
                            break;
                        }
                        break;
                        case 2:System.out.println("You have choosen AUDI A6");
                        if(k==2){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Red");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price : 67.76 Lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int m=rtx.nextInt();
                            switch(m){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default : System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                        case 3:System.out.println("You have choosen AUDI A4");
                        if(k==3){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Grey");
                            System.out.println("Seating Capacity : 5");
                            System.out.println("Fuel Type : Diesel");
                            System.out.println("Price : 51.85 Lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int n=rtx.nextInt();
                            switch(n){
                                case 1:System.out.println("Congartulation for your new car");
                                System.out.println("Here is your car key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        } 
                        break;
                    }
                }
                else{
                    break;
                }
            }
                       
        }
        else{
            if(a==2)
            {
            System.out.println("Here is your 2 wheeler section");
            System.out.println("Please select the company");
            System.out.println("1.Hero");
            System.out.println("2.Yamaha");
            Scanner obj=new Scanner(System.in);
            int b=obj.nextInt();
            switch(b){
                case 1:System.out.println("You have choosen Hero");
                if(b==1){
                    System.out.println("Hero have two model : ");
                    System.out.println("1.Splendor");
                    System.out.println("2.CD Deluxe ");
                    System.out.println("Enter the number to choose the model of hero :");
                    Scanner txt=new Scanner(System.in);
                    int c=txt.nextInt();
                    switch(c){
                        case 1:System.out.println("You have choosen Splendor");
                        if(c==1){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Black");
                            System.out.println("Mileage : 60kmpl");
                            System.out.println("Fuel Type : Petrol");
                            System.out.println("Price : Rupees 73,059 only");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int d=rtx.nextInt();
                            switch(d){
                                case 1:System.out.println("Congartulation for your new bike");
                                System.out.println("Here is your bike key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                        case 2:System.out.println("You have choosen CD DELUXE");
                        if(c==2){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Red");
                            System.out.println("Mileage : 65kmpl");
                            System.out.println("Fuel Type : Petrol");
                            System.out.println("Price : Rupees 56,185");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int e=rtx.nextInt();
                            switch(e){
                                case 1:System.out.println("Congartulation for your new bike");
                                System.out.println("Here is your bike key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default : System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                       
                    }
                    break;
                }
                else{
                    break;
                }
                case 2:System.out.println("You have choosen Yamaha");
                if(b==2){
                    System.out.println("Yamaha have two model : ");
                    System.out.println("1.RX 100");
                    System.out.println("2.R15");
                    System.out.println("Enter the number to choose the model of Yamaha:");
                    Scanner rtr=new Scanner(System.in);
                    int g=rtr.nextInt();
                    switch(g){
                        case 1:System.out.println("You have choosen RX100");
                        if(g==1){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Black");
                            System.out.println("Mileage : 60kmpl");
                            System.out.println("Fuel Type : Petrol");
                            System.out.println("Price :1 Lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int h=rtx.nextInt();
                            switch(h){
                                case 1:System.out.println("Congartulation for your new bike");
                                System.out.println("Here is your bike key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default:System.out.println("INVALID NUMBER");
                            }
                        }
                        else{
                            break;
                        }
                        break;
                        case 2:System.out.println("You have choosen R15 ");
                        if(g==2){
                            System.out.println("Here are the details of the model:");
                            System.out.println("Colour : Blue");
                            System.out.println("Mileage : 55.20kmpl");
                            System.out.println("Fuel Type : Petrol");
                            System.out.println("Price : 1.95 Lakh");
                            System.out.println("Please select 1 for buying or select 2 for not:");
                            Scanner rtx=new Scanner(System.in);
                            int i=rtx.nextInt();
                            switch(i){
                                case 1:System.out.println("Congartulation for your new bike");
                                System.out.println("Here is your bike key");
                                System.out.println("Thank you and have a good day.");
                                break;
                                case 2:System.out.println("THANK YOU");
                                break;
                                default : System.out.println("INVALID NUMBER");
                        }
                        }
                        else{
                            break;
                        }
                        break;
                    }
                }
                else{
                    break;
                }
            }    
        }
        else
        System.out.println("Wrong choice.Please Enter the correct choice.");
    }
    }
}


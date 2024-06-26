import java.util.*;
class Wonder_Tastes
  {
    public static void main()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("$*$*$ WELCOME TO WONDER TASTES RESTAURANT $*$*$");
        System.out.println("***** PRESS 1 FOR VEG FOODS *****");
        System.out.println("^^^^^ PRESS 2 FOR NON-VEG FOODS ^^^^^");
        System.out.println("ENTER YOUR CHOICE");
        int ch = ob.nextInt();
        int ch1=0, ch2=0;
  { 
        if(ch==1)
    {
        System.out.println("##### WELCOME TO VEG FOODS #####");
        System.out.println("@@@@@ PRESS 1 FOR SUB-CONTINENTAL CUISINE");
        System.out.println("&&&&& PRESS 2 FOR INDIAN SUB-STATE CUISINE");
        System.out.println("ENTER YOUR CHOICE");
        ch1 = ob.nextInt();
    }
        else
    {
        System.out.println("##### WELCOME TO NON-VEG FOODS #####");
        System.out.println("@@@@@ PRESS 1 FOR SUB-CONTINENTAL CUISINE");
        System.out.println("&&&&& PRESS 2 FOR INDIAN SUB-STATE CUISINE");
        System.out.println("ENTER YOUR CHOICE");
        ch2 = ob.nextInt();  
    }
  }
       int ch3=0, ch4=0;
  {
       if(ch1==1)
    {
        System.out.println("!!!!! WELCOME TO SUB-CONTINENTAL VEG CUISINE !!!!!");
        System.out.println("PRESS 1 FOR AMERICAN FOODS");
        System.out.println("PRESS 2 FOR EUROPEAN FOODS");
        System.out.println("PRESS 3 FOR ASIAN FOODS");
        System.out.println("PRESS 4 FOR AFRICAN FOODS");
        System.out.println("PRESS 5 FOR AUSTRALIAN FOODS");
        System.out.println("ENTER YOUR CHOICE");
        ch3 = ob.nextInt();
     }
       else if(ch1==2)
     {
        System.out.println("!!!!! WELCOME TO INDIAN SUB-STATE VEG CUISINE !!!!!");
        System.out.println("PRESS 1 FOR NORTH INDIAN FOODS");
        System.out.println("PRESS 2 FOR SOUTH INDAIN FOODS");
        System.out.println("PRESS 3 FOR MANCHURIANS");
        System.out.println("PRESS 4 FOR VADAS");
        System.out.println("PRESS 5 FOR SANDWICHES");
        System.out.println("PRESS 6 FOR CAKES");
        System.out.println("PRESS 7 FOR ICE-CREAMS");
        System.out.println("PRESS 8 FOR JUICES");
        System.out.println("PRESS 9 FOR MILKSHAKES");
        System.out.println("PRESS 10 FOR DESSERTS");
        System.out.println("PRESS 11 FOR PIZZA");
        System.out.println("PRESS 12 FOR BURGERS");
        System.out.println("ENTER YOUR CHOICE");
        ch4 = ob.nextInt();
     }
  }
       int ch5=0, ch6=0;
  {
       if(ch2==1)
    {
        System.out.println("!!!!! WELCOME TO SUB-CONTINENTAL NON-VEG CUISINE !!!!!");
        System.out.println("PRESS 1 FOR AMERICAN FOODS");
        System.out.println("PRESS 2 FOR EUROPEAN OODS");
        System.out.println("PRESS 3 FOR ASIAN FOODS");
        System.out.println("PRESS 4 FOR AFRICAN FOODS");
        System.out.println("PRESS 5 FOR AUSTRALIAN FOODS");
        System.out.println("ENTER YOUR CHOICE");
        ch5 = ob.nextInt();
    }
       else if(ch2==2)
    {
        System.out.println("!!!!! WELCOME TO INDIAN SUB-STATE NON-VEG CUISINE !!!!!");
        System.out.println("PRESS 1 FOR NORTH INDIAN NON-VEG CUISINE");
        System.out.println("PRESS 2 FOR SOUTH INDIAN NON-VEG CUISINE");
        System.out.println("ENTER YOUR CHOICE");
        ch6 = ob.nextInt();
    }
  }
       int ch7=0, ch8=0, ch9=0, ch10=0, ch11=0, ch12=0, ch13=0;
  {
       if(ch3==1)
    {
        System.out.println("$$$$$ WELCOME TO AMERICAN VEG CUISINE $$$$$");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch7 = ob.nextInt();
    }
       if(ch3==2)
    {
        System.out.println("$$$$$ WELCOME TO EUROPEAN VEG CUISINE $$$$$");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch8 = ob.nextInt();
    }
       if(ch3==3)
    {
        System.out.println("$$$$$ WELCOME TO ASIAN VEG CUISINE $$$$$");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch9 = ob.nextInt();
    }
       if(ch3==4)
    {
        System.out.println("$$$$$ WELCOME TO AFRICAN VEG CUISINE $$$$$");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch10 = ob.nextInt();
    }
       if(ch3==5)
    {
        System.out.println("$$$$$ WELCOME TO AUSTRALIAN VEG CUISINE");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch11 = ob.nextInt();
    }
      else if(ch4==1)
    {
        System.out.println("$$$$$ WELCOME TO NORTH INDIAN VEG CUISINE $$$$$");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch12 = ob.nextInt();
    }
       else if(ch4==2)
    {
        System.out.println("$$$$$ WELCOME TO SOUTH INDIAN VEG CUISINE $$$$$");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch13 = ob.nextInt();
    }
  }
       int ch14=0, ch15=0, ch16=0, ch17=0, ch18=0, ch19=0, ch82=0, ch83=0;
  {
   if(ch5==1)
    {
        System.out.println("##### WELCOME TO AMERICAN NON-VEG CUISINE #####");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch14 = ob.nextInt();
    }
   if(ch5==2)
    {
        System.out.println("##### WELCOME TO EUROPEAN NON-VEG CUISINE #####");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch15 = ob.nextInt();
    }
   if(ch5==3)
    {
        System.out.println("##### WELCOME TO ASIAN NON-VEG CUISINE #####");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch16 = ob.nextInt();
    }
   if(ch5==4)
    {
        System.out.println("##### WELCOME TO AFRICAN NON-VEG CUISINE #####");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUCNH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch17 = ob.nextInt();
    }
   if(ch5==5)
    {
        System.out.println("##### WELCOME TO AUSTRALIAN NON-VEG CUISINE #####");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch18 = ob.nextInt();
    }
    else if(ch6==1)
    {
        System.out.println("##### WELCOME TO NORTH INDIAN NON-VEG CUISINE #####");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch82 = ob.nextInt();
    }
    else if(ch6==2)
    {
        System.out.println("##### WELCOME TO SOUTH INDIAN NON-VEG CUISINE #####");
        System.out.println("PRESS 1 FOR BREAKFAST");
        System.out.println("PRESS 2 FOR LUNCH");
        System.out.println("PRESS 3 FOR SNACKS");
        System.out.println("PRESS 4 FOR DINNER");
        System.out.println("ENTER YOUR CHOICE");
        ch83 = ob.nextInt();
    }
}
       int ch20=0, ch21=0, ch22=0, ch23=0, ch24=0, ch25=0, ch26=0, ch27=0;
  {
       if(ch7==1)
    {
        System.out.println("^^^^^ WELCOME TO AMERICAN VEG CUISINE ^^^^^");
        System.out.println("BREAKFAST MENU");
        System.out.println("PRESS 1 FOR BURITO     Rs.45/-");
        System.out.println("PRESS 2 FOR BRUNSWICK STEW     Rs.65/-");
        System.out.println("PRESS 3 FOR CELERY VICTOR     Rs.50/-");
        System.out.println("PRESS 4 FOR CHIMXHANGA     Rs.64/-");
        System.out.println("PRESS 5 FOR CLAM CHOWDER     Rs.55/- ");
        System.out.println("ENETR YOUR CHOICE");
        ch20 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch20==1)
            {
                System.out.println("BILL : Rs.45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch20==2)
            {
                System.out.println("BILL : Rs.65/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch20==3)
            {
                System.out.println("BILL : Rs.50/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch20==4)
            {
                System.out.println("BILL : Rs.64/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch20==5)
            {
                System.out.println("BILL : Rs.55/-");
                System.out.println("THANK YOU..... VISIT AGAIN!!!!!");
            }
        }
    }
    if(ch7==2)
    {
         System.out.println("^^^^^ WELCOME TO AMERICAN VEG CUISINE ^^^^^");
         System.out.println("LUNCH MENU");
         System.out.println("PRESS 1 FOR CORN RELISH     Rs.35/-");
         System.out.println("PRESS 2 FOR GREEK AMERICAN CUISINE     Rs.45/-");
         System.out.println("PRESS 3 FOR GREEN BEAN CASSEROLE     Rs.68/-");
         System.out.println("PRESS 4 FOR HANGTOWN FRY     Rs.54/-");
         System.out.println("PRESS 5 FOR GOULASH     Rs.72/-");
         System.out.println("ENTER YOUR CHOICE");
         ch21 = ob.nextInt();
         System.out.println("ENJOY YOUR DINE!!!!!");
         {
             if(ch21==1)
             {
                System.out.println("BILL : Rs.35/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch21==2)
             {
                System.out.println("BILL : Rs.45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch21==3)
             {
                System.out.println("BILL : Rs.68/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch21==4)
             {
                 System.out.println("BILL : Rs.54/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch21==5)
             {
                 System.out.println("BILL : RS.72/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
         }
    }
        if(ch7==3)
        {
            System.out.println("^^^^^ WELCOME TO AMERICAN VEG CUISINE ^^^^^");
            System.out.println("SNACKS MENU");
            System.out.println("PRESS 1 FOR FORTUNE COOKIES     Rs.38/-");
            System.out.println("PRESS 2 FOR MAPLE     Rs.82/-");
            System.out.println("PRESS 3 FOR BACON DONUT     Rs.76/-");
            System.out.println("PRESS 4 FOR CHICAGO PIZZA     Rs.52/-");
            System.out.println("PRESS 5 FOR MACARONI CHEESE     Rs.80/-");
            System.out.println("ENTER YOUR CHOICE");
            ch22 = ob.nextInt();
            System.out.println("ENJOY YOUR DINE!!!!!");
            {
                if(ch22==1)
                {
                    System.out.println("BILL : Rs.38/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch22==2)
                {
                    System.out.println("BILL : Rs.82/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch22==3)
                {
                    System.out.println("BILL : Rs.76/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch22==4)
                {
                    System.out.println("BILL : Rs.52/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                 }
                if(ch22==5)
                 {
                    System.out.println("BILL : Rs.80/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                 }
            }
        }
       if(ch7==4)
    {
        System.out.println("^^^^^ WELCOME TO AMERICAN VEG CUISINE ^^^^^");
        System.out.println("DINNER MENU");
        System.out.println("PRESS 1 FOR JELLO     Rs.45/-");
        System.out.println("PRESS 2 FOR JERKY     Rs.85/-");
        System.out.println("PRESS 3 FOR JUKA     Rs.60/-");
        System.out.println("PRESS 4 FOR MASHED POTATO     Rs.58/-");
        System.out.println("PRESS 5 FOR MISSSION BURRITO     Rs.46/-");
        System.out.println("ENTER YOUR CHOICE");
        ch23 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!");
        {
            if(ch23==1)
            {
                System.out.println("BILL : Rs.45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch23==2)
            {
                System.out.println("BILL : Rs.85/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch23==3)
            {
                System.out.println("BILL : Rs.60/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch23==4)
            {
                System.out.println("BILL : Rs.58/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch23==5)
            {
                System.out.println("BILL : Rs.46/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
            
    }
     else if(ch14==1)
     {
         System.out.println("^^^^^ WELCOME TO AMERICAN NON-VEG CUISINE ^^^^^");
         System.out.println("^^^^^ BREAKFAST MENU ^^^^^");
         System.out.println("PRESS 1 FOR MEAT CAKE     Rs.85/-");
         System.out.println("PRESS 2 FOR MEAT LOAF     Rs.52/-");
         System.out.println("PRESS 3 FOR PORK AND BEANS     Rs.46/-");
         System.out.println("PRESS 4 FOR STUFFED HAM     Rs.66/-");
         System.out.println("PRESS 5 FOR SWISS STEAK     Rs.59/-");
         System.out.println("ENTER YOUR CHOICE");
         ch24 = ob.nextInt();
         System.out.println("ENJOY YOUR DINE!!!!");
         {
             if(ch24==1)
             {
                 System.out.println("BILL : Rs.85/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch24==2)
             {
                 System.out.println("BILL : Rs.52/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch24==3)
             {
                 System.out.println("BILL : Rs.46/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch24==4)
             {
                 System.out.println("BILL : Rs.66/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch24==5)
             {
                 System.out.println("BILL : Rs.59/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
         }
    }
     else if(ch14==2)
     {
        System.out.println("^^^^^ WELCOME TO AMERICAN NON-VEG CUISINE ^^^^^");
        System.out.println("^^^^^ LUNCH MENU ^^^^^");
        System.out.println("PRESS 1 FOR TOASTER STRUDEL     Rs.45/-");
        System.out.println("PRESS 2 FOR TEX-MEX     Rs.75/-");
        System.out.println("PRESS 3 FOR BROIL     Rs.56/-");
        System.out.println("PRESS 4 FOR KANSAS BARBEQUE     Rs.72/-");
        System.out.println("PRESS 5 FOR CREAMED EGGS     Rs.84/-");
        System.out.println("ENTER YOUR CHOICE");
        ch25 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
          {
          if(ch25==1)
          {
              System.out.println("BILL : Rs.45/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch25==2)
          {
              System.out.println("BILL : Rs.75/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch25==3)
          {
              System.out.println("BILL : Rs.56/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch25==4)
          {
              System.out.println("BILL : Rs.72/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch25==5)
          {
              System.out.println("BILL : Rs.84/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
        }
    }
     else if(ch14==3)
    {
          System.out.println("^^^^^ WELCOME TO AMERICAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ SNACKS MENU ^^^^^");
          System.out.println("PRESS 1 FOR DEVILED CRAB     Rs.55/-");
          System.out.println("PRESS 2 FOR DEVILED EGG     Rs.90/-");
          System.out.println("PRESS 3 FOR DRUNKEN CHICKEN     Rs.78/-");
          System.out.println("PRESS 4 FOR EGGS NEPTUNE     Rs.66/-");
          System.out.println("PRESS 5 FOR CRAB CAKE     Rs.80/-");
          System.out.println("ENTER YOUR CHOICE");
          ch26= ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch26==1)
              {
                  System.out.println("BILL : Rs.55/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch26==2)
              {
                  System.out.println("BILL : Rs.90/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch26==3)
              {
                  System.out.println("BILL : Rs.78/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch26==4)
              {
                  System.out.println("BILL : Rs.66/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch26==5)
              {
                  System.out.println("BILL : Rs.80/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
               }
          }
     }
     else if(ch14==4)
    {
          System.out.println("^^^^^ WELCOME TO AMERICAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ DINNER MENU ^^^^^");
          System.out.println("PRESS 1 FOR HOT CHICKEN     Rs.34/-");
          System.out.println("PRESS 2 FOR LOBSTER ROL     Rs.78/-L");
          System.out.println("PRESS 3 FOR LORNA DOONE     Rs.45/-");
          System.out.println("PRESS 4 FOR MOZZARELLA STICKS     Rs.56/-");
          System.out.println("PRESS 5 FOR OYSTERS ROCKFELLER     Rs.60/-");
          System.out.println("ENTER YOUR CHOICE");
          ch27 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch27==1)
              {
                  System.out.println("BILL : Rs.34/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch27==2)
              {
                  System.out.println("BILL : Rs.78/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch27==3)
              {
                  System.out.println("BILL : Rs.45/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch27==4)
              {
                  System.out.println("BILL : Rs.56/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch27==5)
              {
                  System.out.println("BILL : Rs.60/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
       }
  }
       int ch28=0, ch29=0, ch30=0, ch31=0, ch32=0, ch33=0, ch34=0, ch35=0;
  {
       if(ch8==1)
    {
        System.out.println("^^^^^ WELCOME TO EUROPEAN VEG CUISINE ^^^^^");
        System.out.println("BREAKFAST MENU");
        System.out.println("PRESS 1 FOR LONDON BAKE     Rs.75/-");
        System.out.println("PRESS 2 FOR GOULASH BAKE     Rs.82/-");
        System.out.println("PRESS 3 FOR STRUKLJI IN SLOVENIA     Rs.25/-");
        System.out.println("PRESS 4 FOR CREME CATALAN     Rs.46/-");
        System.out.println("PRESS 5 FOR CREPES     Rs.64/-");
        System.out.println("ENTER YOUR CHOICE");
        ch28 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch28==1)
            {
                System.out.println("BILL : Rs.75/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch28==2)
            {
                System.out.println("BILL : Rs.82/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch28==3)
            {
                System.out.println("BILL : Rs.25/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch28==4)
            {
                System.out.println("BILL : Rs.46/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch28==5)
            {
                System.out.println("BILL : Rs.64/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }    
    }
       if(ch8==2)
    {
        System.out.println("^^^^^ WELCOME TO EUROPEAN VEG CUISINE ^^^^^");
        System.out.println("LUNCH MENU");
        System.out.println("PRESS 1 FOR HAGGIS     Rs.40/-");
        System.out.println("PRESS 2 FOR STREW     Rs.45/-");
        System.out.println("PRESS 3 FOR PIEROGI     Rs.50/-");
        System.out.println("PRESS 4 FOR BANITSA     Rs.55/-");
        System.out.println("PRESS 5 FOR CEVAPI     Rs.60/-");
        System.out.println("ENTER YOUR CHOICE ");
        ch29 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch29==1)
            {
                System.out.println("BILL : Rs.40/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch29==2)
            {
                System.out.println("BILL : Rs45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch29==3)
            {
                System.out.println("BILL : Rs.50/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch29==4)
            {
                System.out.println("BILL : Rs.55/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch29==5)
            {
                System.out.println("BILL : Rs.60/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
    }
       if(ch8==3)
    {
        System.out.println("^^^^^ WELCOME TO EUROPEAN VEG CUISINE ^^^^^");
        System.out.println("SNACKS MENU");
        System.out.println("PRESS 1 FOR PALACINKY     Rs.28/-");
        System.out.println("PRESS 2 FOR PALATSCHINKEN     Rs.56/-");
        System.out.println("PRESS 3 FOR CURRYWURST     Rs.67/-");
        System.out.println("PRESS 4 FOR ITALIN PIZZA     Rs.92/-");
        System.out.println("PRESS 5 FOR HERRING     Rs.86/-");
        System.out.println("ENTRE YOUR CHOICE");
        ch30 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch30==1)
            {
                System.out.println("BILL : Rs.28/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch30==2)
            {
                System.out.println("BILL : Rs.56/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch30==3)
            {
                System.out.println("BILL : Rs.67/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch30==4)
            {
                System.out.println("BILL : Rs.92/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch30==5)
            {
                System.out.println("BILL : Rs.86/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
       }
   }
   if(ch8==4)
    {
        System.out.println("^^^^^ WELCOME TO EUROPEAN VEG CUISINE ^^^^^");
        System.out.println("DINNER MENU");
        System.out.println("PRESS 1 FOR WAFFLES     Rs.38/-");
        System.out.println("PRESS 2 FOR CHEESE FONDUE     Rs.56/-");
        System.out.println("PRESS 3 FOR MANCAKE     Rs.73/-");
        System.out.println("PRESS 4 FOR ARANCHI     Rs.62/-");
        System.out.println("PRESS 5 FOR MAPLE     Rs.75/-");
        System.out.println("ENTER YOUR CHOICE");
        ch31 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch31==1)
            {
                System.out.println("BILL : Rs.38/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch31==2)
            {
                System.out.println("BILL : RS.56/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch31==3)
            {
                System.out.println("BILL : Rs.73/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch31==4)
            {
                System.out.println("BILL : Rs.62/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch31==5)
            {
                System.out.println("BILL : Rs.75/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
    }
        else if(ch15==1)
     {
          System.out.println("^^^^^ WELCOME TO EUROPEAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ BREAKFAST MENU ^^^^^");
          System.out.println("PRESS 1 FOR POTICA     Rs.66/-");
          System.out.println("PRESS 2 FOR MOUSAKKA     Rs.88/-");
          System.out.println("PRESS 3 FOR KOUT BULLAR     Rs.74/-");
          System.out.println("PRESS 4 FOR HAGGUS     Rs.52/-");
          System.out.println("PRESS 5 FOR HALLOUMI     Rs.70/-");
          System.out.println("ENTER YOUR CHOICE");
          ch32 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch32==1)
              {
                  System.out.println("BILL : Rs.66/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch32==2)
              {
                  System.out.println("BILL : Rs.88/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch32==3)
              {
                  System.out.println("BILL : Rs.74/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch32==4)
              {
                  System.out.println("BILL : Rs.52/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch32==5)
              {
                  System.out.println("BILL : Rs.70/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
            }
     }
      else if(ch15==2)
     {
          System.out.println("^^^^^ WELCOME TO EUROPEAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ LUNCH MENU ^^^^^");   
          System.out.println("PRESS 1 FOR BYREK     Rs.45/-");
          System.out.println("PRESS 2 FOR TRINXAT     Rs.66/-");
          System.out.println("PRESS 3 FOR WIENER SCHNITZEL     Rs.74/-");
          System.out.println("PRESS 4 FOR BRANINKI     Rs.88/-");
          System.out.println("PRESS 5 FOR CEVAPI     Rs.72/-");
          System.out.println("ENTER YOUR CHOICE");
          ch33 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch33==1)
              {
                  System.out.println("BILL : Rs.45/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch33==2)
              {
                  System.out.println("BILL : Rs.66/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch33==3)
              {
                  System.out.println("BILL : Rs.74/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch33==4)
              {
                  System.out.println("BILL : Rs.88/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch33==5)
              {
                  System.out.println("BILL : Rs.72/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
          }
     }
        else if(ch15==3)
     {
          System.out.println("^^^^^ WELCOME TO EUROPEAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ SNACKS MENU ^^^^^");
          System.out.println("PRESS 1 FOR BULGARIAN SOUP     Rs.36/-");
          System.out.println("PRESS 2 FOR PRAWN PANCAKE     Rs.42/-");
          System.out.println("PRESS 3 FOR SITROOPWAFL     Rs.58/-");
          System.out.println("PRESS 4 FOR SPAGHETTI     Rs.76/-");
          System.out.println("PRESS 5 FOR SHKEMBE CHORBA     Rs.85/-");
          System.out.println("ENTER YOUR CHOICE");
          ch34 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch34==1)
              {
                  System.out.println("BILL : Rs.36/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch34==2)
              {
                  System.out.println("BILL : Rs.42/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch34==3)
              {
                  System.out.println("BILL : Rs.58/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch34==4)
              {
                  System.out.println("BILL : Rs.76/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch34==5)
              {
                  System.out.println("BILL : Rs.85/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
         }
     }
        else if(ch15==4)
     {
          System.out.println("^^^^^ WELCOME TO EUROPEAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ DINNER MENU ^^^^^");
          System.out.println("PRESS 1 FOR ZAGORSKI     Rs.25/-");
          System.out.println("PRESS 2 FOR TREDELNIK     Rs.45/-");
          System.out.println("PRESS 3 FOR SMORREDBROD     Rs.65/-");
          System.out.println("PRESS 4 FOR KOHUKE     Rs.85/-");
          System.out.println("PRESS 5 FOR PORONKARISTYS     Rs.35/-");
          System.out.println("ENTER YOUR CHOICE");
          ch35 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch35==1)
              {
                  System.out.println("BILL : Rs.25/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch35==2)
              {
                  System.out.println("BILL : Rs.45/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch35==3)
              {
                  System.out.println("BILL : Rs.65/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch35==4)
              {
                  System.out.println("BILL : Rs.85/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch35==5)
              {
                  System.out.println("BILL : Rs.35/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
     }
  }
      int ch36=0, ch37=0, ch38=0, ch39=0, ch40=0, ch41=0, ch42=0, ch43=0;
  {
      if(ch9==1)
    {
       System.out.println("***** WELCOME TO ASIAN VEG CUISINE *****");
       System.out.println("BREAKFAST MENU");
       System.out.println("PRESS 1 FOR CREPLLESE     Rs.65/-");
       System.out.println("PRESS 2 FOR BURYANI     Rs.72/-");
       System.out.println("PRESS 3 FOR MASSAMAN     Rs.84/-");
       System.out.println("PRESS 4 FOR DURIAN     Rs.54/-");
       System.out.println("PRESS 5 FOR BICOL     Rs.48/-");
       System.out.println("ENTER YOUR CHOICE");
       ch36 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch36==1)
           {
               System.out.println("BILL : Rs.65/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch36==2)
           {
               System.out.println("BILL : Rs.72/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch36==3)
           {
               System.out.println("BILL : Rs.84");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch36==4)
           {
               System.out.println("BILL : Rs.54/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch36==5)
           {
               System.out.println("BILL : Rs.48/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch9==2)
    {
       System.out.println("***** WELCOME TO ASIAN VEG CUISINE *****");
       System.out.println("LUNCH MENU");
       System.out.println("PRESS 1 FOR ROTI PRATA     Rs.38/-");
       System.out.println("PRESS 2 FOR AIS KACHANG     Rs.76/-");
       System.out.println("PRESS 3 FOR MANGO STICKY RICE     Rs45/-");
       System.out.println("PRESS 4 FOR DEEM ALBO     Rs.50/-");
       System.out.println("PRESS 5 FOR FRUIT RUJAK     Rs.88/-");
       System.out.println("ENTER YOUR CHOICE");
       ch37 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch37==1)
           {
               System.out.println("BILL : Rs.38/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch37==2)
           {
               System.out.println("BILL : Rs.76/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch37==3)
           {
               System.out.println("BILL : Rs.45/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch37==4)
           {
               System.out.println("BILL : Rs.50/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch37==5)
           {
               System.out.println("BILL : Rs.88/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
       }
    }
      if(ch9==3)
    {
       System.out.println("***** WELCOME TO ASIAN VEG CUISINE *****");
       System.out.println("SNACKS MENU");
       System.out.println("PRESS 1 FOR NOODLES SOUP     Rs.60/-");
       System.out.println("PRESS 2 FOR SHAN NOODLES      Rs.85/-");
       System.out.println("PRESS 3 FOR DIM SUN     Rs.72/-");
       System.out.println("PRESS 4 FOR BUN CHA     Rs.90/-");
       System.out.println("PRESS 5 FOR KHAO SOI     Rs.50/-");
       System.out.println("ENTER YOUR CHOICE");
       ch38 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
     {
    if(ch38==1)
      {
        System.out.println("BILL : Rs.60/-");
        System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
      }
    if(ch38==2)
      {
         System.out.println("BILL : Rs.85/-");
         System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
      }
    if(ch38==3)
      {
         System.out.println("BILL : Rs.72/-");
         System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
      }
    if(ch38==4)
      {
         System.out.println("BILL : Rs.90/-");
         System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
      }
       if(ch38==5)
       {
           System.out.println("BILL : Rs.50/-");
           System.out.println("THANK YOU.....VISIT AGAIN!!!!1");
        }
    }
    }
      if(ch9==4)
    {
       System.out.println("***** WELCOME TO ASIAN VEG CUISINE *****");
       System.out.println("DINNER MENU");
       System.out.println("PRESS 1 FOR SUCKLING     Rs.48/-");
       System.out.println("PRESS 2 FOR LOA BAGUETTES     Rs.58/-");
       System.out.println("PRESS 3 FOR TAKOYAKI     Rs.65/-");
       System.out.println("PRESS 4 FOR THALI PLATES     Rs.84/-");
       System.out.println("PRESS 5 FOR SUCHUAN HOT     Rs.92/-");
       System.out.println("ENTER YOUR CHOICE");
       ch39 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch39==1)
           {
               System.out.println("BILL : Rs.48/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch39==2)
           {
               System.out.println("BILL : Rs.58/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch39==3)
           {
               System.out.println("BILL : Rs.65/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch39==4)
           {
               System.out.println("BILL : Rs.84/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch39==5)
           {
               System.out.println("BILL : Rs.92/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
    else if(ch16==1)
     {
          System.out.println("^^^^^ WELCOME TO ASIAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ BREAKFAST MENU ^^^^^");
          System.out.println("PRESS 1 FOR CURRY FEAST     Rs.35/-");
          System.out.println("PRESS 2 FOR BEIJING DUCK     Rs.55/-");
          System.out.println("PRESS 3 FOR SUMMER ROLLS     Rs.78/-");
          System.out.println("PRESS 4 FOR RAMEN NOODLES     Rs.82/-");
          System.out.println("PRESS 5 FOR CHILLI CRAB     Rs.50/-");
          System.out.println("ENTER YOUR CHOICE");
          ch40 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch40==1)
              {
                  System.out.println("BILL : Rs.35/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch40==2)
              {
                  System.out.println("BILL : Rs.55/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch40==3)
              {
                  System.out.println("BILL : Rs.78/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch40==4)
              {
                  System.out.println("BILL : Rs.82/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch40==5)
              {
                  System.out.println("BILL : Rs.50/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
            }
     }
         else if(ch16==2)
     {
          System.out.println("^^^^^ WELCOME TO ASIAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ LUNCH MENU ^^^^^");
          System.out.println("PRESS 1 FOR CHICKEN RICE     Rs.25/-");
          System.out.println("PRESS 2 FOR MOMOS     Rs.45/-");
          System.out.println("PRESS 3 FOR CANDIED     Rs.65/-");
          System.out.println("PRESS 4 FOR KIMCHI     Rs.85/-");
          System.out.println("PRESS 5 FOR SATAY     Rs.75/-");
          System.out.println("ENTER YOUR CHOICE");
          ch41 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch41==1)
              {
                  System.out.println("BILL : Rs.25/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch41==2)
              {
                  System.out.println("BILL : Rs.45/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch41==3)
              {
                  System.out.println("BILL : Rs.65/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch41==4)
              {
                  System.out.println("BILL : Rs.85/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch41==5)
              {
                  System.out.println("BILL : Rs.75/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
          }
     }
       else if(ch16==3)
     {
          System.out.println("^^^^^ WELCOME TO ASIAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ SNACKS MENU ^^^^^");
          System.out.println("PRESS 1 FOR SUSHI     Rs.56/-");
          System.out.println("PRESS 2 FOR FISH-HEAD CURRY     Rs.65/-");
          System.out.println("PRESS 3 FOR BERLOA     Rs.82/- ");
          System.out.println("PRESS 4 FOR NASI CAMPUR     Rs.70/-");
          System.out.println("PRESS 5 FOR BULGOGI BBQ     Rs.100/-");
          System.out.println("ENTER YOUR CHOICE");
          ch42 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch42==1)
              {
                  System.out.println("BILL : Rs.56/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch42==2)
              {
                  System.out.println("BILL : Rs.65/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch42==3)
              {
                  System.out.println("BILL : Rs.82/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch42==4)
              {
                  System.out.println("BILL : Rs.70/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch42==5)
              {
                  System.out.println("BILL : Rs.70/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
            }
       }
        else if(ch16==4)
     {
          System.out.println("^^^^^ WELCOME TO ASIAN NON-VEG CUISINE ^^^^6");
          System.out.println("^^^^^ DINNER MENU ^^^^^");
          System.out.println("PRESS 1 FOR KHANTOKE     Rs.58/-");
          System.out.println("PRESS 2 FOR BEEF RENDANG     Rs.82/-");
          System.out.println("PRESS 3 FOR EGG TARTS     Rs.64/-");
          System.out.println("PRESS 4 FOR BEEF NOODLES     Rs.98/-");
          System.out.println("PRESS 5 FOR AMOK     Rs.75/-");
          System.out.println("ENTER YOUR CHOICE");
          ch43 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch43==1)
              {
                  System.out.println("BILL : Rs.58/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch43==2)
              {
                  System.out.println("BILL : Rs.82/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch43==3)
              {
                  System.out.println("BILL : Rs.64/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch43==4)
              {
                  System.out.println("BILL : Rs.98/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch43==5)
              {
                  System.out.println("BILL : Rs.75/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
         }
  }
        int ch44=0, ch45=0 ,ch46=0 , ch47=0, ch48=0, ch49=0, ch50=0, ch51=0;
  {
      if(ch10==1)
    {
       System.out.println("***** WELCOME TO AFRICAN VEG CUISINE *****");
       System.out.println("BREAKFAST MENU");
       System.out.println("PRESS 1 FOR PALM BUTTER     Rs.45/-");
       System.out.println("PRESS 2 FOR BOYRNATU     Rs.72/-");
       System.out.println("PRESS 3 FOR PONDU     Rs.88/-");
       System.out.println("PRESS 4 FOR KITFO      Rs.62/-");
       System.out.println("PRESS 5 FOR DORO WAT     Rs.92/-");
       System.out.println("ENTER YOUR CHOICE");
       ch44 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch44==1)
           {
               System.out.println("BILL : Rs.45/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch44==2)
           {
               System.out.println("BILL : Rs.72/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch44==3)
           {
               System.out.println("BILL : Rs.88/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch44==4)
           {
               System.out.println("BILL : Rs.62/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch44==5)
           {
               System.out.println("BILL : Rs.92/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch10==2)
    {
       System.out.println("***** WELCOME TO AFRICAN VEG CUISINE *****");
       System.out.println("LUNCH MENU");
       System.out.println("PRESS 1 FOR PLASAS     Rs.25/-");
       System.out.println("PRESS 2 FOR YASSA GUINAR     Rs.72/-");
       System.out.println("PRESS 3 FOR EFO     Rs65/-");
       System.out.println("PRESS 4 FOR SESWAA     Rs.90/-");
       System.out.println("PRESS 5 FOR EGUSI     Rs.54/-");
       System.out.println("ENTER YOUR CHOICE");
       ch45 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch45==1)
           {
               System.out.println("BILL : Rs.25/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch45==2)
           {
               System.out.println("BILL : Rs.72/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch45==3)
           {
               System.out.println("BILL : Rs.65/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch45==4)
           {
               System.out.println("BILL : Rs.90/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch45==5)
           {
               System.out.println("BILL : Rs.54/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch10==3)
    {
       System.out.println("***** WELCOME TO AFRICAN VEG CUISINE *****");
       System.out.println("SNACKS MENU");
       System.out.println("PRESS 1 FOR SAMOSA     Rs.25/-");
       System.out.println("PRESS 2 FOR CHOMA     Rs.34/-");
       System.out.println("PRESS 3 FOR SHITO     Rs.48/-");
       System.out.println("PRESS 4 FOR ROLEX     Rs.56/-");
       System.out.println("PRESS 5 FOR CACHUPA    Rs.62/-");
       System.out.println("ENTER YOUR CHOICE");
       ch46 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch46==1)
           {
               System.out.println("BILL : Rs.25/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch46==2)
           {
               System.out.println("BILL : Rs.34/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch46==3)
           {
               System.out.println("BILL : Rs.48/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch46==4)
           {
               System.out.println("BILL : Rs.56/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch46==5)
           {
               System.out.println("BILL : Rs.62/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch10==4)
    {
       System.out.println("***** WELCOME TO AFRICAN VEG CUISINE *****");
       System.out.println("DINNER MENU");
       System.out.println("PRESS 1 FOR ISOMBE     Rs.28/-");
       System.out.println("PRESS 2 FOR KAPENTA     Rs.34/-");
       System.out.println("PRESS 3 FOR UKWA     Rs.45/-");
       System.out.println("PRESS 4 FOR MUFETE     Rs.75/-");
       System.out.println("PRESS 5 FOR AGIGE BREAD     Rs.66/-");
       System.out.println("ENTER YOUR CHOICE");
       ch47 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch47==1)
           {
               System.out.println("BILL : Rs.28/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch47==2)
           {
               System.out.println("BILL : Rs.34/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch47==3)
           {
               System.out.println("BILL : Rs.45/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch47==4)
           {
               System.out.println("BILL : Rs.75/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch47==5)
           {
               System.out.println("BILL : Rs.66/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
     else if(ch17==1)
     {
          System.out.println("^^^^^ WELCOME TO AFRICAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ BREAKFAST MENU ^^^^^");
          System.out.println("PRESS 1 FOR PEWEZA WA NAZI     Rs.36/-");
          System.out.println("PRESS 2 FOR COCONUT CRAB CURRY     Rs.72/-");
          System.out.println("PRESS 3 FOR BUNNY CHOW     Rs.87/-");
          System.out.println("PRESS 4 FOR FUFU NUT SOUP     Rs.56/-");
          System.out.println("PRESS 5 FOR MANDAZI     Rs.64/-");
          System.out.println("ENTER YOUR CHOICE");
          ch48 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch48==1)
              {
                  System.out.println("BILL : Rs.36/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch48==2)
              {
                  System.out.println("BILL : Rs.72/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch48==3)
              {
                  System.out.println("BILL : Rs.87/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch48==4)
              {
                  System.out.println("BILL : Rs.56/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch48==5)
              {
                  System.out.println("BILL : Rs.64/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
          }
     }
        else if(ch17==2)
     {
          System.out.println("^^^^^ WELCOME TO AFRICAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ LUNCH MENU ^^^^^");
          System.out.println("PRESS 1 FOR CABRITO     Rs.36/-");
          System.out.println("PRESS 2 FOR JOLLOF RICE     Rs.54/-");
          System.out.println("PRESS 3 FOR PLANTAIN NDOLE     Rs.78/-");
          System.out.println("PRESS 4 FOR NSAKA MADESU     Rs.94/-");
          System.out.println("PRESS 5 FOR TAJNE     Rs.45");
          System.out.println("ENTER YOUR CHOICE");
          ch49 = ob.nextInt();
          {
              if(ch49==1)
              {
                  System.out.println("BILL : Rs.36/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");;
              }
              if(ch49==2)
              {
                  System.out.println("BILL : Rs.54/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch49==3)
              {
                  System.out.println("BILL : Rs.78/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch49==4)
              {
                  System.out.println("BILL : Rs.94/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch49==5)
              {
                  System.out.println("BILL : Rs.45/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
            }
     }
        else if(ch17==3)
     {
          System.out.println("^^^^^ WELCOME TO AFRICAN NON-VEG CUISINE ^^^^6");
          System.out.println("^^^^^ SNACKS MENU ^^^^^");
          System.out.println("PRESS 1 FOR SUYA     Rs.90/-");
          System.out.println("PRESS 2 FOR MATOKE     Rs.74/-");
          System.out.println("PRESS 3 FOR OKRA STREW     Rs.66/-");
          System.out.println("PRESS 4 FOR MOGODU     Rs.48/-");
          System.out.println("PRESS 5 FOR PLANTAIN FUFU     Rs.82/-");
          System.out.println("ENTER YOUR CHOICE");
          ch50 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch50==1)
              {
                  System.out.println("BILL : Rs.90/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch50==2)
              {
                  System.out.println("BILL : Rs.74/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch50==3)
              {
                  System.out.println("BILL : Rs.66/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch50==4)
              {
                  System.out.println("BILL : Rs.48/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch50==5)
              {
                  System.out.println("BILL : Rs.82/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
          }
     }
       else if(ch17==4)
     {
          System.out.println("^^^^^ WELCOME TO AFRICAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ DINNER MENU ^^^^^");
          System.out.println("PRESS 1 FOR OFADA STREW     Rs.75/-");
          System.out.println("PRESS 2 FOR GITHERI     Rs.86/-");
          System.out.println("PRESS 3 FOR WAAKYE     Rs.90/-");
          System.out.println("PRESS 4 FOR FOUTOU     Rs.50/-");
          System.out.println("PRESS 5 FOR THIEBOU DJEN     Rs.68/-");
          System.out.println("ENTER YOUR CHOICE");
          ch51 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch51==1)
              {
                  System.out.println("BILL : Rs.75/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch51==2)
              {
                  System.out.println("BILL : Rs.86/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch51==3)
              {
                  System.out.println("BILL : Rs.90/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch51==4)
              {
                  System.out.println("BILL : Rs.50/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch51==5)
              {
                  System.out.println("BILL : Rs.68/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
     }
    }
      int ch52=0, ch53=0, ch54=0, ch55=0, ch56=0, ch57=0, ch58=0, ch59=0;
  {
      if(ch11==1)
    {
       System.out.println("***** WELCOME TO AUSTRALIAN VEG CUISINE *****");
       System.out.println("BREAKFAST MENU");
       System.out.println("PRESS 1 FOR SARSAGAE ROLLS     Rs.26/-");
       System.out.println("PRESS 2 FOR SAO BUISCUITS     Rs.40/-");
       System.out.println("PRESS 3 FOR CHERRY RIPE     Rs.68/-");
       System.out.println("PRESS 4  FOR FAIRY BREAD     Rs.45/-");
       System.out.println("PRESS 5 FOR CHIKO ROLL     Rs.78/-");
       System.out.println("ENTER YOUR CHOICE");
       ch52 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch52==1)
           {
               System.out.println("BILL : Rs.26/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch52==2)
           {
               System.out.println("BILL : Rs.40/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch52==3)
           {
               System.out.println("BILL : Rs.68/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch52==4)
           {
               System.out.println("BILL : Rs.45/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch52==5)
           {
               System.out.println("BILL : Rs.78/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch11==2)
    {
       System.out.println("***** WELCOME TO AUSTRALIAN VEG CUISINE *****");
       System.out.println("LUNCH MENU");
       System.out.println("PRESS 1 FOR IEED VOVO     Rs.46/-");
       System.out.println("PRESS 2 FOR BALMAIN     Rs.78/-");
       System.out.println("PRESS 3 FOR PAVLOVA     Rs.64/-");
       System.out.println("PRESS 4 FOR TIM TAM     Rs.62/-");
       System.out.println("PRESS 5 FOR DAGWOOD     Rs.80/-");
       System.out.println("ENTER YOUR CHOICE");
       ch53 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch53==1)
           {
               System.out.println("BILL : Rs.46/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch53==2)
           {
               System.out.println("BILL : Rs.78/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch53==3)
           {
               System.out.println("BILL : Rs.64/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch53==4)
           {
               System.out.println("BILL : Rs.62/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch53==5)
           {
               System.out.println("BILL : Rs.80/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch11==3)
    {
       System.out.println("***** WELCOME TO AUSTRALIAN VEG CUISINE *****");
       System.out.println("SNACKS MENU");
       System.out.println("PRESS 1 FOR WITCHETTY GRUBS     Rs.30/-");
       System.out.println("PRESS 2 FOR AZAC BISCUITS     Rs.72/-");
       System.out.println("PRESS 3 FOR MACADAMIA NUTS     Rs.84/-");
       System.out.println("PRESS 4 FOR PEA HAM COUP     Rs.60/-");
       System.out.println("PRESS 5 FOR LAMINGTONS     Rs.77/-");
       System.out.println("ENTER YOUR CHOICE");
       ch54 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch54==1)
           {
               System.out.println("BILL : Rs.30/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch54==2)
           {
               System.out.println("BILL : Rs.72/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch54==3)
           {
               System.out.println("BILL : Rs.84/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch54==4)
           {
               System.out.println("BILL : Rs.60/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch54==5)
           {
               System.out.println("BILL : Rs.77/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch11==4)
    {
       System.out.println("***** WELCOME TO AUSTRALIAN VEG CUISINE *****");
       System.out.println("DINNER MENU");
       System.out.println("PRESS 1 FOR VANILLA SLICE     Rs.48/-");
       System.out.println("PRESS 2 FOR BACON CHASA ROLL     Rs.32/-");
       System.out.println("PRESS 3 FOR BARRAMUNDI     Rs.66/-");
       System.out.println("PRESS 4 FOR FANTATES     Rs.76/-");
       System.out.println("PRESS 5 FOR HAMBURGER     Rs.60");
       System.out.println("ENTER YOUR CHOICE");
       ch55 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch55==1)
           {
               System.out.println("BILL : Rs.48/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch55==2)
           {
               System.out.println("BILL : Rs.32/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch55==3)
           {
               System.out.println("BILL : Rs.66/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch55==4)
           {
               System.out.println("BILL : Rs.76/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch55==5)
           {
               System.out.println("BILL : Rs.60/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
    else if(ch18==1)
     {
          System.out.println("^^^^^ WELCOME TO AUSTRALIAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ BREAKFAST MENU ^^^^^");
          System.out.println("PRESS 1 FOR CHICKEN PARAMIGIANA     Rs.65/-");
          System.out.println("PRESS 2 FOR PORK BLANKET     Rs.54/-");
          System.out.println("PRESS 3 FOR SPAG BOL     48/-");
          System.out.println("PRESS 4 FOR MEAT PIES     Rs.88/-");
          System.out.println("PRESS 5 FOR SEAFOOD PIZZA     80/-");
          System.out.println("ENTER YOUR CHOICE");
          ch56 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch56==1)
              {
                  System.out.println("BILL : Rs.65/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch56==2)
              {
                  System.out.println("BILL : Rs.54/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch56==3)
              {
                  System.out.println("BILL : Rs.48/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch56==4)
              {
                  System.out.println("BILL : Rs.88/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch56==5)
              {
                  System.out.println("BILL : Rs.80/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
            }
     }
        else if(ch18==2)
     {
          System.out.println("^^^^^ WELCOME TO AUSTRALIAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ LUNCH MENU ^^^^^");
          System.out.println("PRESS 1 FOR LAMB LEG ROAST     Rs.67/-");
          System.out.println("PRESS 2 FOR FISH CHIPS     Rs.89/-");
          System.out.println("PRESS 3 FOR JOHN DORY FILLETS     Rs.74/-");
          System.out.println("PRESS 4 FOR BBQ SNAGS     Rs.58/-");
          System.out.println("PRESS 5 FOR PRAWN COCKTAIL     Rs.46/-");
          System.out.println("ENTER YOUR CHOICE");
          ch57 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch57==1)
              {
                  System.out.println("BILL : Rs.67/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch57==2)
              {
                  System.out.println("BILL : Rs.89/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch57==3)
              {
                  System.out.println("BILL : Rs.74/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch57==4)
              {
                  System.out.println("BILL : Rs.58/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch57==5)
              {
                  System.out.println("BILL : Rs.46/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              
              }
            }
     }
        else if(ch18==3)
     {
          System.out.println("^^^^^ WELCOME TO AUSTRALIAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ SNACKS MENU ^^^^^");
          System.out.println("PRESS 1 FOR BIZARRE     Rs.34/-");
          System.out.println("PRESS 2 FOR EMU FRY      Rs.46/-");
          System.out.println("PRESS 3 FOR DAMPER      Rs.52/-");
          System.out.println("PRESS 4 FOR WEAT-BIX     Rs.68/-");
          System.out.println("PRESS 5 FOR SALT PEPPER GLAMARE     Rs.77/-");
          System.out.println("ENTER YOUR CHOICE");
          ch58 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch58==1)
              {
                  System.out.println("BILL : Rs.34/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch58==2)
              {
                  System.out.println("BILL : Rs.46/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch58==3)
              {
                  System.out.println("BILL : Rs.52/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch58==4)
              {
                  System.out.println("BILL : Rs.68/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch58==5)
              {
                  System.out.println("BILL : Rs.77/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
        }
     }
        else if(ch18==4)
     {
          System.out.println("^^^^^ WELCOME TO AUSTRALIAN NON-VEG CUISINE ^^^^^");
          System.out.println("^^^^^ DINNER MENU ^^^^^");
          System.out.println("PRESS 1 FOR VEGEMITE TOAST     Rs.87/-");
          System.out.println("PRESS 2 FOR KANG ROLL      Rs.100/-");
          System.out.println("PRESS 3 FOR CRAB STICKS      Rs.76/-");
          System.out.println("PRESS 4 FOR CHICKEN CORN SOUP     Rs.62/-");
          System.out.println("PRESS 5 FOR GREEN CHICKEN CURRY PIE     Rs.43/-");
          System.out.println("ENTER YOUR CHOICE");
          ch59 = ob.nextInt();
          System.out.println("ENJOY YOUR DINE!!!!!");
          {
              if(ch59==1)
              {
                  System.out.println("BILL : Rs.87/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch59==2)
              {
                  System.out.println("BILL : Rs.100/-");
                  System.out.println("THANK YOU.....VSIT AGAIN!!!!!");
              }
              if(ch59==3)
              {
                  System.out.println("BILL : Rs.76/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch59==4)
              {
                  System.out.println("BILL : Rs.62/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch59==5)
              {
                  System.out.println("BILL : Rs.43/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
            }
  }
         int ch60=0, ch61=0, ch62=0, ch63=0, ch64=0, ch65=0, ch66=0, ch67=0, ch68=0, ch69=0, ch70=0;
         int ch71=0, ch72=0, ch73=0, ch74=0, ch75=0, ch76=0, ch77=0, ch78=0, ch79=0, ch80=0, ch81=0;
         int ch84=0, ch85=0, ch86=0, ch87=0, ch88=0, ch89=0, ch90=0, ch91=0;
  {
      if(ch12==1)
    {
       System.out.println("@@@@@ WELCOME TO NORTH INDIAN VEG CUISINE @@@@@");
       System.out.println("BREAKFAST MENU");
       System.out.println("PRESS 1 FOR PURI CHOLE MASALA     Rs.32/-");
       System.out.println("PRESS 2 FOR BHATURA     Rs.67/-");
       System.out.println("PRESS 3 FOR ALOO PARATHA     Rs.40/-");
       System.out.println("PRESS 4 FOR METHI THEPLA     Rs.45/-");
       System.out.println("PRESS 5 FOR RAVA IDLY     Rs.35/-");
       System.out.println("ENTER YOUR CHOICE");
       ch60 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch60==1)
           {
               System.out.println("BILL : Rs.32/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch60==2)
           {
               System.out.println("BILL : Rs.67/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch60==3)
           {
               System.out.println("BILL : Rs.40/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch60==4)
           {
               System.out.println("BILL : Rs.45/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch60==5)
           {
               System.out.println("BILL : Rs.35/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch12==2)
    {
       System.out.println("@@@@@ WELCOME TO NORTH INDIAN VEG CUISINE @@@@@");
       System.out.println("LUNCH MENU");
       System.out.println("PRESS 1 FOR DAL MAKHANI     Rs.50/-");
       System.out.println("PRESS 2 FOR DAL TADKA     Rs.48/-");
       System.out.println("PRESS 3 FOR METHI MATAR MALAI     Rs.45/-");
       System.out.println("PRESS 4 FOR MALAI KOFTA     Rs.55/-");
       System.out.println("PRESS 5 FOR PUNJABI KADHAI     Rs.60/-");
       System.out.println("ENTER YOUR CHOICE");
       ch61 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch61==1)
           {
               System.out.println("BILL : Rs.50/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch61==2)
           {
               System.out.println("BILL : Rs.48/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch61==3)
           {
               System.out.println("BILL : Rs.45/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch61==4)
           {
               System.out.println("BILL : Rs.55/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch61==5)
           {
               System.out.println("BILL : Rs.60/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch12==3)
    {
       System.out.println("@@@@@ WELCOME TO NORTH INDIAN VEG CUISINE @@@@@");
       System.out.println("SNACKS MENU");
       System.out.println("PRESS 1 FOR KAAJU KALLI      Rs.75/-");
       System.out.println("PRESS 2 FOR BESAN LADOO     Rs.50/-");
       System.out.println("PRESS 3 FOR CHEESE GARLIC BREAD     Rs.40/-");
       System.out.println("PRESS 4 FOR SAMOSA     Rs.25/-");
       System.out.println("PRESS 5 FOR CHOCO CHIP COOKIES     Rs.30/-");
       System.out.println("ENTER YOUR CHOICE");
       ch62 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch62==1)
           {
               System.out.println("BILL : Rs.75/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch62==2)
           {
               System.out.println("BILL : Rs.50/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch62==3)
           {
               System.out.println("BILL : Rs.40/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch62==4)
           {
               System.out.println("BILL : Rs.25/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch62==5)
           {
               System.out.println("BILL : Rs.30/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
    }
      if(ch12==4)
    {
       System.out.println("@@@@@ WELCOME TO NORTH INDIAN VEG CUISINE @@@@@");
       System.out.println("DINNER MENU");
       System.out.println("PRESS 1 FOR ROTI PANEER MASALA     Rs.85/-");
       System.out.println("PRESS 2 FOR NAAN PALAK PANEER     Rs.80/-");
       System.out.println("PRESS 3 FOR MATAR PANEER     Rs.90/-");
       System.out.println("PRESS 4 FOR CHAPATHUI TAWA PANEER     Rs.75/-");
       System.out.println("PRESS 5 FOR KULCHA RAJMA PANEER     Rs.70/-");
       System.out.println("ENTER YOUR CHOICE");
       ch63 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
           if(ch63==1)
           {
               System.out.println("BILL : Rs.85/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch63==2)
           {
               System.out.println("BILL : Rs.80/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch63==3)
           {
               System.out.println("BILL : Rs.90/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch63==4)
           {
               System.out.println("BILL : Rs.75/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
           if(ch63==5)
           {
               System.out.println("BILL : Rs.70/-");
               System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
           }
        }
     }
     else if(ch82==1)
     {
         System.out.println("!!!!! WELCOME TO NORTH INDIAN NON-VEG CUISINE !!!!!");
         System.out.println("BREAKFAST MENU");
         System.out.println("PRESS 1 FOR MUTTON CURRY     Rs.78/-");
         System.out.println("PRESS 2 FOR PRAWN MASALA     Rs.100/-");
         System.out.println("PRESS 3 FOR CHICKEN FRY     Rs.75/-");
         System.out.println("PRESS 4 FOR SHAWARMA     Rs.99/-");
         System.out.println("PRESS 5 FOR BUTTER CHICKEN     Rs.85/-");
         System.out.println("ENTER YOUR CHOICE");
         ch84 = ob.nextInt();
         System.out.println("ENJOY YOUR DINE!!!!!");
         {
             if(ch84==1)
             {
                 System.out.println("BILL : Rs.78/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch84==2)
             {
                 System.out.println("BILL : Rs.100/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch84==3)
             {
                 System.out.println("BILL : Rs.75/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch84==4)
             {
                 System.out.println("BILL : 99/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch84==5)
             {
                 System.out.println("BILL : Rs.85/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
            }
                 
        }
        else if(ch82==2)
        {
            System.out.println("!!!!! WELCOME TO NORTH INDIAN NON-VEG CUISINE !!!!!");
            System.out.println("LUNCH MENU");
            System.out.println("PRESS 1 FOR POT BIRYANI     Rs.70/-");
            System.out.println("PRESS 2 FOR KODI VEPUDU     Rs.80/-");
            System.out.println("PRESS 3 FOR CHICKEN TIKKI     Rs.56/-");
            System.out.println("PRESS 4 FOR CHICKEN MAKHANI     Rs.60/-");
            System.out.println("PRESS 5 FOR CHICKEN GRAVY     Rs.78/-");
            System.out.println("ENTER YOUR CHOICE");
            ch85 =ob.nextInt();
            System.out.println("ENJOY YOUR DINE!!!!!");
            {
                if(ch85==1)
                {
                    System.out.println("BILL : Rs.70/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch85==2)
                {
                    System.out.println("BILL : Rs.80/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch85==3)
                {
                    System.out.println("BILL : Rs.56/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch85==4)
                {
                    System.out.println("BILL : 60/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch85==5)
                {
                    System.out.println("BILL : Rs.78/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
            }
         }
         else if(ch82==3)
         {
             System.out.println("!!!!! WELCOME TO NORTH INDIAN NON-VEG CUISINE !!!!!");
             System.out.println("SNACKS MENU");
             System.out.println("PRESS 1 FOR PRAWN PAKORA     Rs.56/-");
             System.out.println("PRESS 2 FOR TANDOORI CHICKEN     Rs.78/-");
             System.out.println("PRESS 3 FOR EGG CURRY     Rs.50/-");
             System.out.println("PRESS 4 FOR RESHMI KABAB     Rs.60/-");
             System.out.println("PRESS 5 FOR CHICKEN BURGER     Rs.80/-");
             System.out.println("ENTER YOUR CHOICE");
             ch86 = ob.nextInt();
             System.out.println("ENJOY YOUR DINE!!!!!");
             {
                 if(ch86==1)
                 {
                     System.out.println("BILL : Rs.56/-");
                     System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                 }
                 if(ch86==2)
                 {
                     System.out.println("BILL : Rs.78/-");
                     System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                 }
                 if(ch86==3)
                 {
                     System.out.println("BILL : Rs.50/-");
                     System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                 }
                 if(ch86==4)
                 {
                     System.out.println("BILL : Rs.60/-");
                     System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                 }
                 if(ch86==5)
                 {
                     System.out.println("BILL : Rs.80/-");
                     System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                 }
                }
            }
            else if(ch82==4)
            {
                System.out.println("!!!!! WELCOME TO NORTH INDIAN NON-VEG CUISINE !!!!!");
                System.out.println("DINNER MENU");
                System.out.println("PRESS 1 FOR AMRITSARI FISH FRY     Rs.65/-");
                System.out.println("PRESS 2 FOR ANDHRA CHICKEN CURRY     Rs.70/-");
                System.out.println("PRESS 3 FOR THALASSERY CHICKEN     Rs.85/-");
                System.out.println("PRESS 4 FOR CHILLI CHICKEN     Rs.75/-");
                System.out.println("PRESS 5 FOR APPOLO FISH FRY     Rs.80/-");
                System.out.println("ENTER YOUR CHOICE");
                ch87 = ob.nextInt();
                System.out.println("ENJOY YOUR DINE!!!!!");
                {
                    if(ch87==1)
                    {
                        System.out.println("BILL : Rs.65/-");
                        System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                    }
                    if(ch87==2)
                    {
                        System.out.println("BILL : Rs.70/-");
                        System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                    }
                    if(ch87==3)
                    {
                        System.out.println("BILL : Rs.85/-");
                        System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                    }
                    if(ch87==4)
                    {
                        System.out.println("BILL : Rs.75/-");
                        System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                    }
                    if(ch87==5)
                    {
                        System.out.println("BILL : Rs.80/-");
                        System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                    }
                }
            }
        }
  {
    if(ch13==1)
     {
       System.out.println("!!!!! WELCOME TO SOUTH INDIAN VEG CUISINE !!!!!");
       System.out.println("BREAKFAST MENU");
       System.out.println("PRESS 1 FOR IDLY-CHUTNEY     Rs.35/-");
       System.out.println("PRESS 2 FOR MASALA DOSA     Rs.30/-");
       System.out.println("PRESS 3 FOR UPMA     Rs.25/-");
       System.out.println("PRESS 4 FOR RAVA IDLY     Rs.40/-");
       System.out.println("PRESS 5 FOR PONGAL-CHUTNEY     Rs.45/-");
       System.out.println("ENTER YOUR CHOICE");
       ch74 = ob.nextInt();
       System.out.println("ENJOY YOUR DINE!!!!!");
       {
          if(ch74==1)
          {
              System.out.println("BILL : Rs.35/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch74==2)
          {
              System.out.println("BILL : Rs.30/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch74==3)
          {
              System.out.println("BILL : Rs.25/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch74==4)
          {
              System.out.println("BILL : Rs.40/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
          if(ch74==5)
          {
              System.out.println("BILL : Rs.45/-");
              System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
          }
       }   
     }
    if(ch13==2)
     {
        System.out.println("!!!!! WELCOME TO SOUTH INDIAN VEG CUISINE !!!!1");
        System.out.println("LUNCH MENU");
        System.out.println("PRESS 1 FOR FULL MEALS     Rs.80/-");
        System.out.println("PRESS 2 FOR RICE-SAMBAR     Rs.50/-");
        System.out.println("PRESS 3 FOR RASAM-SAMBAR     Rs.50/-");
        System.out.println("PRESS 4 FOR VEGETABLE-BIRYANI     Rs.60/-");
        System.out.println("PRESS 5 FOR CHAPATI + FULL MEALS     Rs.85/-");
        System.out.println("ENTER YOUR CHOICE");
        ch75 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch75==1)
            {
                System.out.println("BILL : Rs.80/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch75==2)
            {
                System.out.println("BILL : Rs.50/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch75==3)
            {
                System.out.println("BILL : Rs.50/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch75==4)
            {
                System.out.println("BILL : Rs.60/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch75==5)
            {
                System.out.println("BILL : Rs.85/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
     }
     if(ch13==3)
     {
        System.out.println("!!!!! WELCOME TO SOUTH INDIAN VEG CUISINE !!!!!");
        System.out.println("SNACKS MENU");
        System.out.println("PRESS 1 FOR MEDU VADA     Rs.15/-");
        System.out.println("PRESS 2 FOR RAVA KESARI     Rs.30/-");
        System.out.println("PRESS 3 FOR SHAKKARPARA     Rs.35/-");
        System.out.println("PRESS 4 FOR PAKODA     Rs.25/-");
        System.out.println("PRESS 5 FOR MOTA SEV     Rs.20/-");
        System.out.println("ENTER YOUR CHOICE");
        ch76 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch76==1)
            {
                System.out.println("BILL : Rs.15/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch76==2)
            {
                System.out.println("BILL : Rs.30/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch76==3)
            {
                System.out.println("BILL : Rs.35/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch76==4)
            {
                System.out.println("BILL : Rs.25/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch76==5)
            {
                System.out.println("BILL : Rs.20/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
    }
     if(ch13==4)
     {
        System.out.println("!!!!! WELCOME TO SOUTH INDIAN VEG CUISINE !!!!!");
        System.out.println("DINNER MENU");
        System.out.println("PRESS 1 FOR CHAPATI-CURRY     Rs.65/-");
        System.out.println("PRESS 2 FOR FRIED-RICE     Rs.60/-");
        System.out.println("PRESS 3 FOR MUSHROOM-RICE     Rs.75/-");
        System.out.println("PRESS 4 FOR VEG-PULAV     Rs.50/-");
        System.out.println("PRESS 5 FOR PANEER-RICE     Rs.80/-");
        System.out.println("ENTER YOUR CHOICE");
        ch77 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch77==1)
            {
                System.out.println("BILL : Rs.65/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch77==2)
            {
                System.out.println("BILL : Rs.60/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch77==3)
            {
                System.out.println("BILL : Rs.75/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch77==4)
            {
                System.out.println("BILL : Rs.50/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch77==5)
            {
                System.out.println("BILL : Rs.80/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
     }
     else if(ch83==1)
     {
         System.out.println("$$$$$ WELCOME TO SOUTH INDIAN NON-VEG CUISINE $$$$$");
         System.out.println("BREAKFAST MENU");
         System.out.println("PRESS 1 FOR HYDERABAD CHICKEN BIRYANI     Rs.90/-");
         System.out.println("PRESS 2 FOR COORY PANDICURRY     Rs.80/-");
         System.out.println("PRESS 3 FOR ROYYALA JAGURU     Rs.65/-");
         System.out.println("PRESS 4 FOR BOMMIDAYILA PULUSU     Rs.70/-");
         System.out.println("PRESS 5 FOR CHICKEN PIZZA     Rs.72/-");
         System.out.println("ENTER YOUR CHOICE");
         ch88 = ob.nextInt();
         System.out.println("ENJOY YOUR DINE!!!!!");
         {
             if(ch88==1)
             {
                 System.out.println("BILL : Rs.90/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch88==2)
             {
                 System.out.println("BILL : Rs.80/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch88==3)
             {
                 System.out.println("BILL : Rs.65/-");
                 System.out.println("THANK YOU.....VIST AGAIN!!!!!");
             }
             if(ch88==4)
             {
                 System.out.println("BILL : Rs.70/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch88==5)
             {
                 System.out.println("BILL : Rs.72/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
          }
      }
        else if(ch83==2)
        {
            System.out.println("$$$$$ WELCOME TO SOUTH INDIAN NON-VEG CUISINE $$$$$");
            System.out.println("LUNCH MENU");
            System.out.println("PRESS 1 FOR FISH MOLEE     Rs.85/-");
            System.out.println("PRESS 2 FOR CHICKEN CHETTINAD     Rs.90/-");
            System.out.println("PRESS 3 FOR KERALA KARIMEEN FRY     Rs.55/-");
            System.out.println("PRESS 4 FOR AILA CURRY     Rs.60/-");
            System.out.println("PRESS 5 FOR CHICKEN ROAST     Rs.75/-");
            System.out.println("ENTER YOUR CHOICE");
            ch89 = ob.nextInt();
            System.out.println("ENJOY YOUR DINE!!!!!");
            {
                if(ch89==1)
                {
                    System.out.println("BILL : Rs.85/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch89==2)
                {
                    System.out.println("BILL : Rs.90/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch89==3)
                {
                    System.out.println("BILL : Rs.55/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch89==4)
                {
                    System.out.println("BILL : Rs.60/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch89==5)
                {
                    System.out.println("BILL : Rs.75/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
            }
        }
        else if(ch83==3)
        {
            System.out.println("$$$$$ WELCOME TO SOUTH INDIAN NON-VEG CUISINE $$$$$");
            System.out.println("SNACKS MENU");
            System.out.println("PRESS 1 FOR SQUID CURRY     Rs.50/-");
            System.out.println("PRESS 2 FOR CRAB MASALA     Rs.70/-");
            System.out.println("PRESS 3 FOR CHICKEN SALNA     Rs.60/-");
            System.out.println("PRESS 4 FOR CHICKEN NIZAMI     Rs.65/-");
            System.out.println("PRESS 5 FOR PRAWN FRY     Rs.75/-");
            System.out.println("ENTER YOUR CHOICE");
            ch90 = ob.nextInt();
            System.out.println("ENJOY YOUR DINE!!!!!");
            {
                if(ch90==1)
                {
                    System.out.println("BILL : Rs.50/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!");
                }
                if(ch90==2)
                {
                    System.out.println("BILL : Rs.70/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch90==3)
                {
                    System.out.println("BILL : Rs.60/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch90==4)
                {
                    System.out.println("BILL : Rs.65/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
                if(ch90==5)
                {
                    System.out.println("BILL : Rs.75/-");
                    System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
            }
            }
       else if(ch83==4)
       {
           System.out.println("$$$$$ WELCOME TO SOUTH INDIAN NON-VEG CUISINE $$$$$");
           System.out.println("DINNER MENU");
           System.out.println("PRESS 1 FOR KHEEMA COCONUT     Rs.65/-");
           System.out.println("PRESS 2 FOR FISH CURRY     Rs.85/-");
           System.out.println("PRESS 3 FOR PAYYOLI CHICKEN FRY     Rs.75/-");
           System.out.println("PRESS 4 FOR SQUID FISH FRY     Rs.90/-");
           System.out.println("PRESS 5 FOR KOSI GASSI     Rs.60/-");
           System.out.println("ENTER YOUR CHOICE");
           ch91 = ob.nextInt();
           System.out.println("ENJOY YOUR DINE!!!!!");
           {
               if(ch91==1)
               {
                   System.out.println("BILL : Rs.65/-");
                   System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
               }
               if(ch91==2)
               {
                   System.out.println("BILL : Rs.85/-");
                   System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
               }
               if(ch91==3)
               {
                   System.out.println("BILL : Rs.75/-");
                   System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
               }
               if(ch91==4)
               {
                   System.out.println("BILL : Rs.90/-");
                   System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
               }
               if(ch91==5)
               {
                   System.out.println("BILL : Rs.60/-");
                   System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
                }
            }
         }
        }
  {
       if(ch4==3)
     {
        System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ MANCHURIAN MENU $$$$$");
        System.out.println("PRESS 1 FOR GOBI MANCHURIAN     Rs.60/-");
        System.out.println("PRESS 2 FOR POTATO MANCHURIAN     Rs.55/-");
        System.out.println("PRESS 3 FOR PANEER MANCHURAIN     Rs.70/-");
        System.out.println("PRESS 4 FOR MUSHROOM MANCHURIAN     Rs.65/-");
        System.out.println("PRESS 5 FOR CAULIFLOWER MANCHURIAN     Rs.55/-");
        System.out.println("ENTER YOUR CHOICE");
        ch64 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch64==1)
            {
                System.out.println("BILL : Rs.60/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch64==2)
            {
                System.out.println("BILL : Rs.55/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch64==3)
            {
                System.out.println("BILL : Rs.70/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch64==4)
            {
                System.out.println("BILL : Rs.65/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch64==5)
            {
                System.out.println("BILL : Rs.55/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
     }
       if(ch4==4)
     {
        System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ VADA MENU $$$$$");
        System.out.println("PRESS 1 FOR MEDU VADA     Rs.15/-");
        System.out.println("PRESS 2 FOR MASALA VADA     Rs.10/-");
        System.out.println("PRESS 3 FOR MADHUR VADA     Rs.25/-");
        System.out.println("PRESS 4 FOR MIRCHI VADA     Rs.10/-");
        System.out.println("PRESS 5 FOR VELLA VADA     Rs.20/-");
        System.out.println("ENTER YOUR CHOICE");
        ch65 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
        if(ch65==1)
        {
            System.out.println("BILL : Rs.15/-");
            System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
        }
        if(ch65==2)
        {
            System.out.println("BILL : Rs.10/-");
            System.out.println("THANK YOU.....VISIT AGAIN!!!!!!");
        }
        if(ch65==3)
        {
            System.out.println("BILL : Rs.25/-");
            System.out.println("THANK YOU.....VISIT AGAIN!!!!!!");
        }
        if(ch65==4)
        {
            System.out.println("BILL : Rs.10/-");
            System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
        }
        if(ch65==5)
        {
            System.out.println("BILL : Rs.20/-");
            System.out.println("THANK YOU.....VISIT AGAIN!!!!!!");
        }
    }
     }
       if(ch4==5)
     {
        System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ SANDWICHES MENU $$$$$");
        System.out.println("PRESS 1 FOR VEG SANDWICH     Rs.40/-");
        System.out.println("PRESS 2 FOR TOASTED SANDWICH     Rs.45/-");
        System.out.println("PRESS 3 FOR CHEESE SANDWICH     Rs.60/-");
        System.out.println("PRESS 4 FOR BUTTER SANDWICH     Rs.55/-");
        System.out.println("PRESS 5 FOR PANEER GRILL     Rs.65/-");
        System.out.println("ENTER YOUR CHOICE");
        ch66 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch66==1)
            {
                System.out.println("BILL : Rs.40/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch66==2)
            {
                System.out.println("BILL : Rs.45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch66==3)
            {
                System.out.println("BILL : Rs.60/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch66==4)
            {
                System.out.println("BILL : Rs.55/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch66==5)
            {
                System.out.println("BILL : Rs.65/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }    
     }
       if(ch4==6)
     {
        System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ CAKES MENU $$$$$");
        System.out.println("PRESS 1 FOR VELVET CAKE     Rs.40/-");
        System.out.println("PRESS 2 FOR CHOCOLATE CHEESE     Rs.45/-");
        System.out.println("PRESS 3 FOR BLACK CURRENT     Rs.37/-");
        System.out.println("PRESS 4 FOR SEVEN WONDERS     Rs.50/-");
        System.out.println("PRESS 5 FOR WHITE FOREST     Rs.35/-");
        System.out.println("ENTER YOUR CHOICE");
        ch67 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch67==1)
            {
                System.out.println("BILL : Rs.40/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch67==2)
            {
                System.out.println("BILL : Rs.45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!!");
            }
            if(ch67==3)
            {
                System.out.println("BILL : Rs.37/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch67==4)
            {
                System.out.println("BILL : Rs.50/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch67==5)
            {
                System.out.println("BILL : Rs.35/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
     }
       if(ch4==7)
     {
        System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ ICE-CREAM MENU $$$$$");
        System.out.println("PRESS 1 FOR BLACK WALNUT ICE-CREAM     Rs.55/-");
        System.out.println("PRESS 2 FOR BLUE MOON ICE-CREAM     Rs.75/-");
        System.out.println("PRESS 3 FOR BUTTER BRICKLE ICE-CREAM    Rs.65/-");
        System.out.println("PRESS 4 FOR CHOCO CHIPS ICE-CREAM     Rs.70/-");
        System.out.println("PRESS 5 FOR RASPBERRY RIPPLE ICE-CREAM     Rs.80/-");
        System.out.println("ENTER YOUR CHOICE");
        ch68 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch68==1)
            {
                System.out.println("BILL : Rs.55/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch68==2)
            {
                System.out.println("BILL : Rs.75/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch68==3)
            {
                System.out.println("BILL : Rs.65/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch68==4)
            {
                System.out.println("BILL : Rs.70/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch68==5)
            {
                System.out.println("BILL : Rs.80/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
     }
       if(ch4==8)
     {
        System.out.println("$$$$$ WELCOME TO INDDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ JUICE MENU $$$$$");
        System.out.println("PRESS 1 FOR MANGO JUICE     Rs.25/-");
        System.out.println("PRESS 2 FOR PINEAPPLE JUICE     Rs.30/-");
        System.out.println("PRESS 3 FOR JACK FRUIT JUICE     Rs.40/-");
        System.out.println("PRESS 4 FOR ORANGE JUICE     Rs.35/-");
        System.out.println("PRESS 5 FOR CHIKKU JUICE     Rs.45/-");
        System.out.println("ENTER YOUR CHOICE");
        ch69 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch69==1)
            {
                System.out.println("BILL : Rs.25/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch69==2)
            {
                System.out.println("BILL : Rs.30/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch69==3)
            {
                System.out.println("BILL : Rs.40/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch69==4)
            {
                System.out.println("BILL : Rs.35/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch69==5)
            {
                System.out.println("BILL : Rs.45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
         }
     }
       if(ch4==9)
     {
        System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ MILKSHAKES MENU $$$$$");
        System.out.println("PRESS 1 FOR DATE SHAKE     Rs.45/-");
        System.out.println("PRESS 2 FOR ROSE SHAKE     Rs.40/-");
        System.out.println("PRESS 3 FOR OREO SHAKE     Rs.50/-");
        System.out.println("PRESS 4 FOR ALMOND SHAKE     Rs.55/-");
        System.out.println("PRESS 5 FOR PISTACHIO SHAKE     Rs.65/-");
        System.out.println("ENTER YOUR CHOICE");
        ch70 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch70==1)
            {
                System.out.println("BILL : Rs.45/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch70==2)
            {
                System.out.println("BILL : Rs.40/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!!");
            }
            if(ch70==3)
            {
                System.out.println("BILL : Rs.50/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch70==4)
            {
                System.out.println("BILL : Rs.55/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch70==5)
            {
                System.out.println("BILL : Rs.65/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }
     }
       if(ch4==10)
     {
        System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
        System.out.println("$$$$$ DESSERTS MENU $$$$$");
        System.out.println("PRESS 1 FOR KAAJU BURFI     Rs.70/-");
        System.out.println("PRESS 2 FOR GAJAR HALWA    Rs.65/-");
        System.out.println("PRESS 3 FOR SHRIKAND     Rs.75/-");
        System.out.println("PRESS 4 FOR MYSORE-PAK     Rs.60/-");
        System.out.println("PRESS 5 FOR RASGULLA     Rs.70/-");
        System.out.println("ENTER YOUR CHOICE");
        ch71 = ob.nextInt();
        System.out.println("ENJOY YOUR DINE!!!!!");
        {
            if(ch71==1)
            {
                System.out.println("BILL : Rs.70/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch71==2)
            {
                System.out.println("BILL : Rs.65/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch71==3)
            {
                System.out.println("BILL : Rs.75/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch71==4)
            {
                System.out.println("BILL : Rs.60/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
            if(ch71==5)
            {
                System.out.println("BILL : Rs.70/-");
                System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
            }
        }     
     }
        if(ch4==11)
     { 
         System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
         System.out.println("$$$$$ PIZZA MENU $$$$$");
         System.out.println("PRESS 1 FOR ONION PIZZA     Rs.48/-");
         System.out.println("PRESS 2 FOR GOLDEN CORN PIZZA     Rs.50/-");
         System.out.println("PRESS 3 FOR CAPSICUM PIZZA     Rs.65/-");
         System.out.println("PRESS 4 FOR PANEER PIZZA     Rs.75/-");
         System.out.println("PRESS 5 FOR CHEESE PIZZA     Rs.80/-");
         System.out.println("ENTER YOUR CHOICE");
         ch72 = ob.nextInt();
         System.out.println("ENJOY YOUR DINE!!!!!");
         {
             if(ch72==1)
             {
                 System.out.println("BILL : Rs.48/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!!");
             }
             if(ch72==2)
             {
                 System.out.println("BILL : Rs.50/-");
                 System.out.println("THANK YOU......VISIT AGAIN!!!!!");
             }
             if(ch72==3)
             {
                 System.out.println("BILL : Rs.65/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch72==4)
             {
                 System.out.println("BILL : 75/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch72==5)
             {
                 System.out.println("BILL : Rs.80/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
            }
     }
        if(ch4==12)
     {
         System.out.println("$$$$$ WELCOME TO INDIAN SUB-STATE CUISINE $$$$$");
         System.out.println("$$$$$ BURGER MENU $$$$$");
         System.out.println("PRESS 1 FOR VEG MC PUFF     Rs.60/-");
         System.out.println("PRESS 2 FOR MASALA GRILL VEG     Rs.55/-");
         System.out.println("PRESS 3 FOR ALOO TIKKI GRILL     Rs.65/-");
         System.out.println("PRESS 4 FOR SPICY PANEER PUFF     Rs.70/-");
         System.out.println("PRESS 5 FOR SPICY CHEESE PUFF     Rs.75/-");
         System.out.println("ENTER YOUR CHOICE");
         ch73 = ob.nextInt();
         System.out.println("ENJOY YOUR DINE!!!!!");
         {
             if(ch73==1)
             {
                 System.out.println("BILL : Rs.60/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch73==2)
             {
                 System.out.println("BILL : Rs.55/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
             }
             if(ch73==3)
             {
                 System.out.println("BILL : Rs.65/-");
                 System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
              }
              if(ch73==4)
              {
                  System.out.println("BILL : Rs.70/-");
                  System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
               }
               if(ch73==5)
               {
                   System.out.println("BILL : Rs.75/-");
                   System.out.println("THANK YOU.....VISIT AGAIN!!!!!");
               }
         }
     }
  }
}
}
}
}
}
}
}

    
          
                
            
          
          
          
             
               
            

            
            
            
        
               
                
                
            
        
            
            
             
             
     
            
        
        
            
            
            

    
  
            
            
            
            
            
    
        

        
    

    
            
            
            
            
            
    
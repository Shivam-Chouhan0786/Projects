import java.util.Scanner;
class restroApp
{
    public static void main(String args[])
    {
        String reset = "\u001b[0m";    
        String Red ="\u001b[31m";
        String Green = "\u001b[32m";
        String Yellow = "\u001b[33m";
        String Blue = "\u001b[34m";
        Scanner sc = new Scanner(System.in);
        System.out.println(Green+"\n *** WELL-COME TO OUR RESTAURENT *** \n"+reset+" *** HERE YOU FIND MANY DISHESH***\n");
        System.out.println("** List of dishesh what you want press ***\n 1-> for VEGETARIAN MENU \n 2-> for BREAKFAST MENU \n 3-> for ONLY FOR LADIES ");
        int menu = sc.nextInt();
        switch(menu)
        {
            case 1 : {
                     System.out.println(Blue+"Enter your budget \n 1 -> for 310/- \n 2 -> 360/- \n 3 -> for 410/- \n 4 -> for 470/- \n 5 -> for 600/- \n 6 -> for 700/-");
                     int budget = sc.nextInt();
               
                     System.out.println(reset+"there is first 5 typ of budget and some item is same in all typ of budget\n so you select first those items");
                    
                    System.out.println(Green+"*** you choose rice *** \n Enter \n 1-> for Simple rice    2 -> for veg pulao \n 3 -> for Jeera Rice     4 -> veg Fried Rice \n 5 -> Green peas pulao   6 -> veg biryani");
                    int rice = sc.nextInt();
                    switch(rice)
                    {
                    case 1 : System.out.println("you choose simple rice ");break;
                    case 2 : System.out.println("you choose veg pulao ");break;
                    case 3 : System.out.println("you choose Jeera rice ");break;
                    case 4 : System.out.println("you choose veg fried rice ");break;
                    case 5 : System.out.println("you choose Green peas pulao ");break;
                    case 6 : System.out.println("you choose veg biryani ");break;
                    default : System.out.println(" Not available !");break;
                    }

                    System.out.println(Blue+"*** you choose Dal ***\n enter 1 -> for Dal fry   2 -> for Dal Makhani \n 3 -> Dal Tadka        4 -> Dal  pachrangi");
                    int dal = sc.nextInt();
                    switch(dal)
                    {
                    case 1 : System.out.println("You choose Dal fry ");break;
                    case 2 : System.out.println("you choose Dal Makhani ");break;
                    case 3 : System.out.println("you choose Dal Tadka ");break;
                    case 4 : System.out.println("you choose Dal panchrangi");break;
                    default : System.out.println(" Not available !");break;
                    }

                    System.out.println(reset+" *** You choose vegetable Dish *** \n 1 -> Navratan Korma          2 -> Methi Mutter          3 -> Lahori aloo with mutter \n 4 -> Haryali Kofta          5 -> Mix veg          6 -> Chana Masala \n 7 -> Green chana(Seasonal)          8 -> Bhindi Masala          9 -> Corn palak \n 10 -> Jeera Aloo          11 -> Aloo 65           12 -> Dum Aloo \n 13 -> Aloo Mutter          14 -> Gujrati Aloo          15 -> Aloo capsicum \n 16 -> Tinda Masala          17 -> Aloo Do Pyaza          18 -> Aloo palak \n 19 -> Aloo Gobhi/Tomato          20 -> Seasonal veg          21 -> Gobhi mutter \n 22 -> Bhindi Do pyaza          23 -> Kadi punjabi          24 -> Veg.Kolhapuri          25 -> Veg.Kofta(GOI) \n 26 -> Corn capsicum ");
                    System.out.println("Enter firt vegetable ");
                    String s1 = sc.nextLine();  s1 = sc.nextLine();
                    System.out.println("Enter second vegetable ");
                    String s2 = sc.nextLine();
                    System.out.println("you choose "+s1+" ,"+s2);

                    System.out.println("\n and you have pickle , salad , papad in all budget");

                    if(budget == 1 || budget == 2 || budget == 3 || budget == 4 || budget == 5)             
                    {System.out.println(Blue+"What you want\n 1 -> for soup or 2 -> welcome drink");
                    int want = sc.nextInt();
                    switch(want)
                    {
                    case 1 : {System.out.println(Yellow+"Enter what typ of soup you want \n 1 -> Tomato Soup    2 -> Veg Mancho \n 3 -> Hot & Sour veg    4 -> Lemon Coriander ");
                                int soup = sc.nextInt();
                                switch(soup)
                                {
                                case 1 : System.out.println("you choose Tomato soup for drink");break;
                                case 2 : System.out.println("you choose veg soup for drink");break;
                                case 3 : System.out.println("you choose Hot & Sour veg soup for drink");break;
                                case 4 : System.out.println("you choose Lemon soup for drink");break;
                                default: System.out.println("Not available");break;
                                }}break;
                    case 2 : {System.out.println(Red+"Enter what typ of welcome drink you want \n 1-> Blue Lagoon   2 -> Orange Pink City    3 -> Blowgun Kesher Pista \n 4 -> Strawberry Delight   5 -> Fresh Lime Water   6 -> Jal Jeera \n 7 -> Butter Milk   8 -> Rasna Water");
                                int drink = sc.nextInt();
                                switch(drink)
                                {
                                case 1 : System.out.println("you choose Blue Lagoon for drink");break;
                                case 2 : System.out.println("you choose Orange pink city for drink");break;
                                case 3 : System.out.println("you choose Blowgun kesher pista for drink");break;
                                case 4 : System.out.println("you choose Straberry Delight for drink");break;
                                case 5 : System.out.println("you choose Fresh Lime Water for drink");break;
                                case 6 : System.out.println("you choose Jal Jeera for drink");break;
                                case 7 : System.out.println("you choose Butter Milk for drink");break;
                                case 8 : System.out.println("you choose Rasna Water for drink");break;
                                default : System.out.println("Not available !");break;
                                }}break;
                    default : System.out.println(Blue+"Not available");break;
                    }}
                     switch(budget)
                     {
                        case 1 : {System.out.println(Green+"***You choose 310/- \n  In 310/- budget you have extra*** \n  Sweet dish      Roti,Naan       butter paratha     ");
                                 
                                 System.out.println(reset+"*** you choose Roti Naan *** \n");
                                 System.out.println("*** you choose Butter paratha");
                                 System.out.println("*** you choose sweet *** \n Enter 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                                 int sweet = sc.nextInt();
                                 switch(sweet)
                                    {
                                    case 1 : System.out.println("you choose Gulab jamun ");break;
                                    case 2 : System.out.println("you choose Aam khand ");break;
                                    case 3 : System.out.println("you choose Gajar ka halwa ");break;
                                    case 4 : System.out.println("you choose vanila ");break;
                                    case 5 : System.out.println("you choose moong ka Halwa ");break;
                                    case 6 : System.out.println("you choose Butter Scotch ");break;
                                    case 7 : System.out.println("you choose shree khand ");break;
                                    case 8 : System.out.println("you choose sitaphal basundi");break;
                                    case 9 : System.out.println("you choose Aam ras ");break;
                                    case 10 : System.out.println("you choose Rasgulla ");break;
                                    default : System.out.println(" Not available !");break;
                                    }
                                             
                                 System.out.println(Blue+"*** Enter time how long your party will last *** \n Note :- if your party is under 3 hour or less so you dont have to pay more \n but if your party time is more then 3 hour you pay extra charge rupee 1500/- per hour");
                                 int time = sc.nextInt();
                                 if(time > 3)
                                 {
                                    time = (time - 3)*1500 ;
                                    System.out.println(Yellow+" You must pay extra charge "+time);}
                                 else {
                                     time = 0;
                                 }
                                 System.out.println(Blue+" you must pay 9 % gst on total charge");
                                 System.out.println(reset+" ***Enter the number of members in your party ***");
                                 int member = sc.nextInt();
                                 if(sweet == 8 || sweet == 9)
                                 {
                                 int pay = 310 + 20 ;
                                 if(member<=110 && member >0)
                                 {
                                    int charge = (100 * pay) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      310/-\n Total member are present :- "+member+" \n Gst you pay :-              "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is:-       "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * pay)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+"\n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      310/- \n Extra members are :-        "+(member-100)+" \n Total member are present :-  "+member+" \n Gst you pay :-              "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is :-      "+total);
                                    }}

                                 if(member<=110 || member>0)
                                 {
                                    int charge = (100 * 310) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      310/- \n Total member are present:- "+member+" \n Gst you pay :-           "+gst+" \n your total charge is:-      "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * 310)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      310/- \n Extra members are :-         "+(member-100)+" \n Total member are present :-  "+member+" \n Gst you pay :-             "+gst+"\n your total charge is        "+total);
                                 }
                                 }break;                                             

                     case 2 : { System.out.println(Blue+" *** in 360/- budget you have *** \n "+reset+"1 -> Roti,Butter Naan \n 2 -> Paneer Dish   3 -> Butter Paratha \n   4 -> Pickle , salad , papad \n    5 -> Sweet Dish or Ice - cream \n");
                                                                 
                                 System.out.println(Yellow+"\n*** you choose Roti , Butter Naan");
                                 System.out.println(reset+"\n *** you choose paneer Dish *** ");
                                 System.out.println(Red+" What typ of paneer dish you want \n 1 -> for paneer Butter Masala      2 -> for paneer kadai      3 -> for paneer punjabi \n 4 -> Methi paneer      5 -> paneer palak      6 -> Corn paneer\n 7 -> Paneer Mutter      8 -> Paneer Kolhapuri      9 -> Paneer Do Pyazza \n 10 -> Paneer chatpatta      11 -> Paneer Tikka Masala");
                                 int dish = sc.nextInt();
                                 switch(dish)
                                 {
                                    case 1 : System.out.println("you choose Blue paneer Butter Masala");break;
                                    case 2 : System.out.println("you choose paneer kadai");break;
                                    case 3 : System.out.println("you choose paneer punjabi");break;
                                    case 4 : System.out.println("you choose Methi paneer ");break;
                                    case 5 : System.out.println("you choose Paneer palak");break;
                                    case 6 : System.out.println("you choose Corn paneer");break;
                                    case 7 : System.out.println("you choose paneer mutter");break;
                                    case 8 : System.out.println("you choose paneer kolhapuri");break;
                                    case 9 : System.out.println("you choose paneer do pyaza ");break;
                                    case 10 : System.out.println("you choose paneer chatpatta");break;
                                    case 11 : System.out.println("you choose paneer tikka masala");break;
                                    default : System.out.println("Not available !");break;
                                    }
                                    
                                    System.out.println(Green+"*** you choose Butter paratha ***");
                                    System.out.println(reset+"*** you choose sweet or Ice - cream*** \n Enter \n 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                                    int sweet = sc.nextInt();
                                    switch(sweet)
                                    {
                                    case 1 : System.out.println("you choose Gulab jamun ");break;
                                    case 2 : System.out.println("you choose Aam khand ");break;
                                    case 3 : System.out.println("you choose Gajar ka halwa ");break;
                                    case 4 : System.out.println("you choose vanila ");break;
                                    case 5 : System.out.println("you choose moong ka Halwa ");break;
                                    case 6 : System.out.println("you choose Butter Scotch ");break;
                                    case 7 : System.out.println("you choose shree khand ");break;
                                    case 8 : System.out.println("you choose sitaphal basundi");break;
                                    case 9 : System.out.println("you choose Aam ras ");break;
                                    case 10 : System.out.println("you choose Rasgulla ");break;
                                    default : System.out.println(" Not available !");break;
                                    }

                                 System.out.println(Red+"*** Enter time how long your party will last *** \n Note :- if your party is under 3 hour or less so you dont have to pay more \n but if your party time is more then 3 hour you pay extra charge rupee 1500/- per hour");
                                 int time = sc.nextInt();
                                 if(time > 3)
                                 {
                                    time = (time - 3)*1500 ;
                                    System.out.println(Blue+" You must pay extra charge "+time);}
                                 else {
                                     time = 0;
                                 }
                                 System.out.println(reset+" you must pay 9 % gst on total charge");
                                 System.out.println(Yellow+" ***Enter the number of members in your party ***");
                                 int member = sc.nextInt();
                                 if(sweet == 8 || sweet == 9)
                                 {
                                 int pay = 360 + 20 ;
                                 if(member<=110 && member >0)
                                 {
                                    int charge = (100 * pay) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      360/- \n Total member are present :-         "+member+" \n Gst you pay :-                "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is :-          "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * pay)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      360/- \n Extra members are :-         "+(member-100)+" \n Total member are present :-:-"+member+" \n Gst you pay :- "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is         "+total);
                                    }}

                                 if(member<=110 || member>0)
                                 {
                                    int charge = (100 * 360) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+"\n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      360/- \n Total member are present :-         "+member+" \n Gst you pay :-                "+gst+"\n your total charge is :-          "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * 360)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      360/- \n Extra members are :-         "+(member-100)+" \n Total member are present :-  "+member+" \n Gst you pay :- "+gst+"\n your total charge is :-      "+total);
                                 }
                                    }break;

                     case 3 : {System.out.println(Blue+"*** In 410/- budget you have *** \n  1 -> Starter \n 2 -> Roti , Butter Naan               3 -> Paneer Dish              4 -> butter paratha  \n 5 -> Curd Dish \n 6 -> Sweet Dish or Ice - cream \n");
                                 
                                 System.out.println(reset+"*** you choose Starter *** \n  1 -> for Mix veg pakoda          2 -> veg cutlet          3 -> veg finger \n 4 -> veg kothey          5 -> Bread pakoda          6 -> Hara Bhara kabab \n 7 -> Methi kabab          8 -> Corn chat           9 -> Moong pakoda \n 10 -> Aloo chat          11 -> Dragon Pakoda          12 -> saboo dana vada \n 13 -> saboo dana          14 -> veg Manchurian dry         15 -> Finger chips \n 16 -> Tandoori Manchurian          17 -> Aloo Corn kabab          18 -> Chinese Corn kabab  ");
                                 int starter = sc.nextInt();
                                 switch(starter)
                                 {
                                   case 1 : System.out.println("you choose mix veg pakoda ");break;
                                   case 2 : System.out.println("you choose veg cutlet ");break;
                                   case 3 : System.out.println("you choose veg Finger ");break;
                                   case 4 : System.out.println("you choose veg kothey ");break;
                                   case 5 : System.out.println("you choose Bread Pakoda ");break;
                                   case 6 : System.out.println("you choose Hara Bhara Kabab ");break;
                                   case 7 : System.out.println("you choose Methi Kabab ");break;
                                   case 8 : System.out.println("you choose Corn chat ");break;
                                   case 10: System.out.println("you choose Moong pakoda ");break;
                                   case 11: System.out.println("you choose Aloo chat ");break;
                                   case 12: System.out.println("you choose Dragon Aloo ");break;
                                   case 13: System.out.println("you choose saboo Dana vada ");break;
                                   case 14: System.out.println("you choose saboo dana ");break;
                                   case 15: System.out.println("you choose veg Manchurian dry");break;
                                   case 16: System.out.println("you choose Finger chips ");break;
                                   case 17: System.out.println("you choose Tandoori Manchurian ");break;
                                   case 18: System.out.println("you choose Aloo corn kabab ");break;
                                   case 19: System.out.println("you choose chinese corn kabab ");break;     
                                 }

                                 System.out.println(Green+"*** you choose Roti , Butter Naan\n");

                                 System.out.println(reset+"\n *** you choose paneer Dish *** ");
                                 System.out.println(Blue+" What typ of paneer dish you want \n 1 -> for paneer Butter Masala      2 -> for paneer kadai      3 -> for paneer punjabi \n 4 -> Methi paneer      5 -> paneer palak      6 -> Corn paneer\n 7 -> Paneer Mutter      8 -> Paneer Kolhapuri      9 -> Paneer Do Pyazza \n 10 -> Paneer chatpatta      11 -> Paneer Tikka Masala");
                                 int dish = sc.nextInt();
                                 switch(dish)
                                 {
                                    case 1 : System.out.println("you choose Blue paneer Butter Masala");break;
                                    case 2 : System.out.println("you choose paneer kadai");break;
                                    case 3 : System.out.println("you choose paneer punjabi");break;
                                    case 4 : System.out.println("you choose Methi paneer ");break;
                                    case 5 : System.out.println("you choose Paneer palak");break;
                                    case 6 : System.out.println("you choose Corn paneer");break;
                                    case 7 : System.out.println("you choose paneer mutter");break;
                                    case 8 : System.out.println("you choose paneer kolhapuri");break;
                                    case 9 : System.out.println("you choose paneer do pyaza ");break;
                                    case 10 : System.out.println("you choose paneer chatpatta");break;
                                    case 11 : System.out.println("you choose paneer tikka masala");break;
                                    default : System.out.println("Not available !");break;
                                 }

                                 System.out.println(Yellow+"you choose Butter paratha ");

                                 System.out.println(reset+"*** you choose Curd Dish *** \n 1 -> for veg Raita          2 -> Boondi Raita \n 3 -> Loki Raita          4 -> Fruit Raita \n 5 -> Aloo Raita          6 -> Dahi vada \n 7 -> Dahi papdi");
                                 int curd = sc.nextInt();
                                 switch(curd)
                                 {
                                    case 1 : System.out.println("you choose veg Raita");break;
                                    case 2 : System.out.println("you choose Boondi Raita");break;
                                    case 3 : System.out.println("you choose Loki Raita");break;
                                    case 4 : System.out.println("you choose Fruit Raita ");break;
                                    case 5 : System.out.println("you choose Aloo Raita");break;
                                    case 6 : System.out.println("you choose Dahi vada");break;
                                    case 7 : System.out.println("you choose dahi papadi");break;
                                    default : System.out.println("Not available !");break;
                                 }

                                 System.out.println(Green+"*** you choose sweet or Ice - cream*** \n "+reset+"Enter \n 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                                 int sweet = sc.nextInt();
                                    switch(sweet)
                                    {
                                    case 1 : System.out.println("you choose Gulab jamun ");break;
                                    case 2 : System.out.println("you choose Aam khand ");break;
                                    case 3 : System.out.println("you choose Gajar ka halwa ");break;
                                    case 4 : System.out.println("you choose vanila ");break;
                                    case 5 : System.out.println("you choose moong ka Halwa ");break;
                                    case 6 : System.out.println("you choose Butter Scotch ");break;
                                    case 7 : System.out.println("you choose shree khand ");break;
                                    case 8 : System.out.println("you choose sitaphal basundi");break;
                                    case 9 : System.out.println("you choose Aam ras ");break;
                                    case 10 : System.out.println("you choose Rasgulla ");break;
                                    default : System.out.println(" Not available !");break;
                                    }

                                 System.out.println(Blue+"*** Enter time how long your party will last *** \n Note :- if your party is under 3 hour or less so you dont have to pay more \n but if your party time is more then 3 hour you pay extra charge rupee 1500/- per hour");
                                 int time = sc.nextInt();
                                 if(time > 3)
                                 {
                                    time = (time - 3)*1500 ;
                                    System.out.println(reset+" You must pay extra charge "+time);}
                                 else {
                                     time = 0;
                                 }
                                 System.out.println(Red+" you must pay 9 % gst on total charge");
                                 System.out.println(reset+" ***Enter the number of members in your party ***");
                                 int member = sc.nextInt();
                                 if(sweet == 8 || sweet == 9)
                                 {
                                 int pay = 410 + 20 ;
                                 if(member<=110 && member >0)
                                 {
                                    int charge = (100 * pay) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n Total member are present :-   "+member+" \n Gst you pay :-                "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is :-      "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * pay)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+"\n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n Extra members are           "+(member-100)+" \n Total member are present     "+member+" \n Gst you pay :               "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n  your total charge is              "+total);
                                    }}

                                 if(member<=110 || member>0)
                                 {
                                    int charge = (100 * 410) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n Total member are present :-   "+member+" \n Gst you pay :-                "+gst+"\n your total charge is :-      "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * 410)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n Extra members are           "+(member-100)+" \n Total member are present     "+member+" \n Gst you pay :               "+gst+"\n your total charge is               "+total); 
                                 }
                        }break;

                     case 4 : {System.out.println(Blue+" *** In 470/- budget you have Extra *** \n  1 -> starter            2 -> Roti ,Butter,Naan           3 -> Paneeer Dish \n 4 -> paratha           5 -> curd Dish            6 -> Sweet Dish , Ice-cream or cofee \n ");
                               System.out.println(reset+"*** you choose Starter *** \n  1 -> for Mix veg pakoda          2 -> veg cutlet          3 -> veg finger \n 4 -> veg kothey          5 -> Bread pakoda          6 -> Hara Bhara kabab \n 7 -> Methi kabab          8 -> Corn chat           9 -> Moong pakoda \n 10 -> Aloo chat          11 -> Dragon Pakoda          12 -> saboo dana vada \n 13 -> saboo dana          14 -> veg Manchurian dry         15 -> Finger chips \n 16 -> Tandoori Manchurian          17 -> Aloo Corn kabab          18 -> Chinese Corn kabab  ");
                               System.out.println(Yellow+"Enter your first starter");
                               String starter_1 = sc.nextLine();starter_1 = sc.nextLine();
                               System.out.println(Yellow+"Enter your second starter");
                               String starter_2 = sc.nextLine();
                               System.out.println(reset+"You choose starter "+starter_1+","+starter_2);

                               System.out.println(Green+"*** You choose Roti , Butter ,Naan ***");

                              System.out.println(reset+"\n *** you choose paneer Dish *** ");
                              System.out.println(Blue+" What typ of paneer dish you want \n"+reset+" 1 -> for paneer Butter Masala      2 -> for paneer kadai      3 -> for paneer punjabi \n 4 -> Methi paneer      5 -> paneer palak      6 -> Corn paneer\n 7 -> Paneer Mutter      8 -> Paneer Kolhapuri      9 -> Paneer Do Pyazza \n 10 -> Paneer chatpatta      11 -> Paneer Tikka Masala");
                              int dish = sc.nextInt();
                              switch(dish)
                              {
                                 case 1 : System.out.println("you choose Blue paneer Butter Masala");break;
                                 case 2 : System.out.println("you choose paneer kadai");break;
                                 case 3 : System.out.println("you choose paneer punjabi");break;
                                 case 4 : System.out.println("you choose Methi paneer ");break;
                                 case 5 : System.out.println("you choose Paneer palak");break;
                                 case 6 : System.out.println("you choose Corn paneer");break;
                                 case 7 : System.out.println("you choose paneer mutter");break;
                                 case 8 : System.out.println("you choose paneer kolhapuri");break;
                                 case 9 : System.out.println("you choose paneer do pyaza ");break;
                                 case 10 : System.out.println("you choose paneer chatpatta");break;
                                 case 11 : System.out.println("you choose paneer tikka masala");break;
                                 default : System.out.println("Not available !");break;
                              }

                              System.out.println("*** You choose Paratha ***");
                              System.out.println(Yellow+"*** you choose Curd Dish *** \n "+reset+"1 -> for veg Raita          2 -> Boondi Raita \n 3 -> Loki Raita          4 -> Fruit Raita \n 5 -> Aloo Raita          6 -> Dahi vada \n 7 -> Dahi papdi");
                              int curd = sc.nextInt();
                              switch(curd)
                              {
                                 case 1 : System.out.println("you choose veg Raita");break;
                                 case 2 : System.out.println("you choose Boondi Raita");break;
                                 case 3 : System.out.println("you choose Loki Raita");break;
                                 case 4 : System.out.println("you choose Fruit Raita ");break;
                                 case 5 : System.out.println("you choose Aloo Raita");break;
                                 case 6 : System.out.println("you choose Dahi vada");break;
                                 case 7 : System.out.println("you choose dahi papadi");break;
                                 default : System.out.println("Not available !");break;
                              }

                              System.out.println(Green+"*** you choose sweet or Ice - cream*** \n Enter "+reset+"\n 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                              int sweet = sc.nextInt();
                              switch(sweet){
                                             case 1 : System.out.println("you choose Gulab jamun ");break;
                                             case 2 : System.out.println("you choose Aam khand ");break;
                                             case 3 : System.out.println("you choose Gajar ka halwa ");break;
                                             case 4 : System.out.println("you choose vanila ");break;
                                             case 5 : System.out.println("you choose moong ka Halwa ");break;
                                             case 6 : System.out.println("you choose Butter Scotch ");break;
                                             case 7 : System.out.println("you choose shree khand ");break;
                                             case 8 : System.out.println("you choose sitaphal basundi");break;
                                             case 9 : System.out.println("you choose Aam ras ");break;
                                             case 10 : System.out.println("you choose Rasgulla ");break;
                                             default : System.out.println(" Not available !");break;
                              }
                              System.out.println(Blue+"*** you choose cofee ***");

                                 System.out.println(reset+"*** Enter time how long your party will last *** \n Note :- if your party is under 3 hour or less so you dont have to pay more \n but if your party time is more then 3 hour you pay extra charge rupee 1500/- per hour");
                                 int time = sc.nextInt();
                                 if(time > 3)
                                 {
                                    time = (time - 3)*1500 ;
                                    System.out.println(Red+" You must pay extra charge "+time);}
                                 else {
                                     time = 0;
                                 }
                                 System.out.println(reset+" you must pay 9 % gst on total charge\n");
                                 System.out.println(" ***Enter the number of members in your party ***");
                                 int member = sc.nextInt();
                                 if(sweet == 8 || sweet == 9)
                                 {
                                 int pay = 470 + 20 ;
                                 if(member<=110 && member >0)
                                 {
                                    int charge = (100 * pay) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n Total member are present :-   "+member+" \n Gst you pay :-                 "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is :-       "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * pay)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n  Extra members are :-          "+(member-100)+" \n Total member are present :-     "+member+" \n Gst you pay :-                "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is  :-         "+total);
                                    }}

                                 if(member<=110 || member>0)
                                 {
                                    int charge = (100 * 470) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n Total member are present :-   "+member+" \n Gst you pay :-                 "+gst+"\n your total charge is :-      "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * 470)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+"\n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      410/- \n  Extra members are :-          "+(member-100)+" \n Total member are present :-     "+member+" \n Gst you pay :-                "+gst+"\n  your total charge is :-          "+total);
                                 }
                     }break;
                     case 5 : {System.out.println(Blue+"*** In budget 600/- you have Extra ***\n 1 -> Curd Dish          2 -> Starter           3 -> Paneer starter \n 4 -> Pasta (1 type)           5 -> Roti , Naan , Paratha           6 -> Paneer Dish \n 7 -> sweet Dish , Ice-cream or coffee");
                              System.out.println(reset+"*** you choose Curd Dish *** \n 1 -> for veg Raita          2 -> Boondi Raita \n 3 -> Loki Raita          4 -> Fruit Raita \n 5 -> Aloo Raita          6 -> Dahi vada \n 7 -> Dahi papdi");
                              int curd = sc.nextInt();
                              switch(curd)
                              {
                                 case 1 : System.out.println("you choose veg Raita");break;
                                 case 2 : System.out.println("you choose Boondi Raita");break;
                                 case 3 : System.out.println("you choose Loki Raita");break;
                                 case 4 : System.out.println("you choose Fruit Raita ");break;
                                 case 5 : System.out.println("you choose Aloo Raita");break;
                                 case 6 : System.out.println("you choose Dahi vada");break;
                                 case 7 : System.out.println("you choose dahi papadi");break;
                                 default : System.out.println("Not available !");break;
                              }

                              System.out.println(Green+"*** you choose Starter *** \n "+reset+" 1 -> for Mix veg pakoda          2 -> veg cutlet          3 -> veg finger \n 4 -> veg kothey          5 -> Bread pakoda          6 -> Hara Bhara kabab \n 7 -> Methi kabab          8 -> Corn chat           9 -> Moong pakoda \n 10 -> Aloo chat          11 -> Dragon Pakoda          12 -> saboo dana vada \n 13 -> saboo dana          14 -> veg Manchurian dry         15 -> Finger chips \n 16 -> Tandoori Manchurian          17 -> Aloo Corn kabab          18 -> Chinese Corn kabab  ");
                              System.out.println(Blue+"Enter your first starter");
                              String starter_1 = sc.nextLine();starter_1 = sc.nextLine();
                              System.out.println("Enter your second starter");
                              String starter_2 = sc.nextLine();
                              System.out.println(Blue+"You choose starter "+starter_1+","+starter_2);

                              System.out.println(Yellow+"*** you choose Paneer starter *** \n Enter \n 1 -> paneer chilli           2 -> Paneer pudina Tikka          3 -> Paneer Tikka \n 4 -> Paneer Achari Tikka           5 -> Dragon Paneer          6 -> paneer 65 \n");
                              int paneer = sc.nextInt();
                              switch(paneer)
                              {
                                 case 1 : {System.out.println(" you choose paneer chilli ");}break;
                                 case 2 : System.out.println(" you choose paneer chilli ");break;
                                 case 3 : System.out.println(" you choose paneer chilli ");break;
                                 case 4 : System.out.println(" you choose paneer chilli ");break;
                                 case 5 : System.out.println(" you choose paneer chilli ");break;
                                 case 6 : System.out.println(" you choose paneer chilli ");break;
                                 default:System.out.println("Not available !");break;
                              }

                              System.out.println(Red+"*** You choose pasta (1 Type) ***");
                              System.out.println(reset+"*** you Choose Roti , Naan , Paratha");

                              System.out.println(Green+"\n *** you choose paneer Dish ***\n "+reset+"What typ of paneer dish you want \n 1 -> for paneer Butter Masala      2 -> for paneer kadai      3 -> for paneer punjabi \n 4 -> Methi paneer      5 -> paneer palak      6 -> Corn paneer\n 7 -> Paneer Mutter      8 -> Paneer Kolhapuri      9 -> Paneer Do Pyazza \n 10 -> Paneer chatpatta      11 -> Paneer Tikka Masala");
                              int dish = sc.nextInt();
                              switch(dish)
                              {
                                 case 1 : System.out.println("you choose Blue paneer Butter Masala");break;
                                 case 2 : System.out.println("you choose paneer kadai");break;
                                 case 3 : System.out.println("you choose paneer punjabi");break;
                                 case 4 : System.out.println("you choose Methi paneer ");break;
                                 case 5 : System.out.println("you choose Paneer palak");break;
                                 case 6 : System.out.println("you choose Corn paneer");break;
                                 case 7 : System.out.println("you choose paneer mutter");break;
                                 case 8 : System.out.println("you choose paneer kolhapuri");break;
                                 case 9 : System.out.println("you choose paneer do pyaza ");break;
                                 case 10 : System.out.println("you choose paneer chatpatta");break;
                                 case 11 : System.out.println("you choose paneer tikka masala");break;
                                 default : System.out.println("Not available !");break;
                              }
                              System.out.println(Blue+"*** you choose sweet or Ice - cream*** \n Enter \n 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                              int sweet = sc.nextInt();
                              switch(sweet){
                                             case 1 : System.out.println("you choose Gulab jamun ");break;
                                             case 2 : System.out.println("you choose Aam khand ");break;
                                             case 3 : System.out.println("you choose Gajar ka halwa ");break;
                                             case 4 : System.out.println("you choose vanila ");break;
                                             case 5 : System.out.println("you choose moong ka Halwa ");break;
                                             case 6 : System.out.println("you choose Butter Scotch ");break;
                                             case 7 : System.out.println("you choose shree khand ");break;
                                             case 8 : System.out.println("you choose sitaphal basundi");break;
                                             case 9 : System.out.println("you choose Aam ras ");break;
                                             case 10 : System.out.println("you choose Rasgulla ");break;
                                             default : System.out.println(" Not available !");break;
                              }
                              System.out.println(reset+"*** you choose cofee ***");

                                 System.out.println(Green+"*** Enter time how long your party will last *** \n "+reset+"Note :- if your party is under 3 hour or less so you dont have to pay more \n but if your party time is more then 3 hour you pay extra charge rupee 1500/- per hour");
                                 int time = sc.nextInt();
                                 if(time > 3)
                                 {
                                    time = (time - 3)*1500 ;
                                    System.out.println(Red+" You must pay extra charge "+time);}
                                 else {
                                     time = 0;
                                 }
                                 System.out.println(reset+" you must pay 9 % gst on total charge");
                                 System.out.println(" ***Enter the number of members in your party ***");
                                 int member = sc.nextInt();
                                 if(sweet == 8 || sweet == 9)
                                 {
                                 int pay = 600 + 20 ;
                                 if(member<=110 && member >0)
                                 {
                                    int charge = (100 * pay) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      600/- \n Total member are present :-     "+member+" \n Gst you pay :-                  "+gst+ "\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total amount is :-                "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * pay)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      600/- \n Extra members are :-         "+(member-100)+" \n Total member are present     "+member+" \n Gst you pay :-                  "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is          "+total);
                                    }}

                                 if(member<=110 || member>0)
                                 {
                                    int charge = (100 * 600) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      600/- \n Total member are present :-    "+member+" \n Gst you pay :-                  "+gst+"\n your total charge is :-               "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * 600)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      600/- \n Extra members are :-         "+(member-100)+" \n Total member are present     "+member+" \n Gst you pay :-                  "+gst+"\n your total charge is          "+total);
                                 }
                     }break;

                     case 6 : { System.out.println(Blue+"IN budget 700/- you have Extra \n "+reset+" 1 -> soup           2 -> curd Dish           3 -> Welcome drink \n 4 -> Starter             5 -> Paneer Starter           6 -> Roti , Naan , Paratha \n 7 -> chinese item            8 -> Paneer Dish           9 -> Sweet Dish \n 10 -> ice -cream ");
                                System.out.println(Yellow+" *** You choose soup *** \n "+reset+" Enter what typ of soup you want \n 1 -> Tomato Soup    2 -> Veg Mancho \n 3 -> Hot & Sour veg    4 -> Lemon Coriander ");
                                System.out.println(Green+"Enter your First soup ");
                                String soup_1 = sc.nextLine(); soup_1 = sc.nextLine();
                                System.out.println(Green+"Enter your Second soup");
                                String soup_2 = sc.nextLine();
                                System.out.println(reset+"\n ** your 2 soup is "+soup_1+""+soup_2);

                              System.out.println(Blue+"*** you choose Curd Dish *** \n 1 -> for veg Raita          2 -> Boondi Raita \n 3 -> Loki Raita          4 -> Fruit Raita \n 5 -> Aloo Raita          6 -> Dahi vada \n 7 -> Dahi papdi");
                              int curd = sc.nextInt();
                              switch(curd)
                              {
                                 case 1 : System.out.println("you choose veg Raita");break;
                                 case 2 : System.out.println("you choose Boondi Raita");break;
                                 case 3 : System.out.println("you choose Loki Raita");break;
                                 case 4 : System.out.println("you choose Fruit Raita ");break;
                                 case 5 : System.out.println("you choose Aloo Raita");break;
                                 case 6 : System.out.println("you choose Dahi vada");break;
                                 case 7 : System.out.println("you choose dahi papadi");break;
                                 default : System.out.println("Not available !");break;
                              }

                              System.out.println(Yellow+"\n *** you choose wellcome drink *** \n "+reset+" Enter what typ of welcome drink you want \n 1-> Blue Lagoon   2 -> Orange Pink City    3 -> Blowgun Kesher Pista \n 4 -> Strawberry Delight   5 -> Fresh Lime Water   6 -> Jal Jeera \n 7 -> Butter Milk   8 -> Rasna Water");
                                int drink = sc.nextInt();
                                switch(drink)
                                {
                                case 1 : System.out.println("you choose Blue Lagoon for drink");break;
                                case 2 : System.out.println("you choose Orange pink city for drink");break;
                                case 3 : System.out.println("you choose Blowgun kesher pista for drink");break;
                                case 4 : System.out.println("you choose Straberry Delight for drink");break;
                                case 5 : System.out.println("you choose Fresh Lime Water for drink");break;
                                case 6 : System.out.println("you choose Jal Jeera for drink");break;
                                case 7 : System.out.println("you choose Butter Milk for drink");break;
                                case 8 : System.out.println("you choose Rasna Water for drink");break;
                                default : System.out.println("Not available !");break;}

                              System.out.println(Red+"*** you choose Starter *** \n  "+reset+"1 -> for Mix veg pakoda          2 -> veg cutlet          3 -> veg finger \n 4 -> veg kothey          5 -> Bread pakoda          6 -> Hara Bhara kabab \n 7 -> Methi kabab          8 -> Corn chat           9 -> Moong pakoda \n 10 -> Aloo chat          11 -> Dragon Pakoda          12 -> saboo dana vada \n 13 -> saboo dana          14 -> veg Manchurian dry         15 -> Finger chips \n 16 -> Tandoori Manchurian          17 -> Aloo Corn kabab          18 -> Chinese Corn kabab  ");
                              System.out.println(Green+"Enter your first starter");
                              String starter_1 = sc.nextLine();starter_1 = sc.nextLine();
                              System.out.println(Green+"Enter your second starter");
                              String starter_2 = sc.nextLine();starter_2 = sc.nextLine();
                              System.out.println(Green+"Enter your third Starter");
                              String starter_3 = sc.nextLine();
                              System.out.println(reset+"*** your three starter are "+starter_1+""+starter_2+""+starter_3);

                              System.out.println(Yellow+"*** you choose Paneer starter *** \n Enter "+reset+"\n 1 -> paneer chilli           2 -> Paneer pudina Tikka          3 -> Paneer Tikka \n 4 -> Paneer Achari Tikka           5 -> Dragon Paneer          6 -> paneer 65 \n");
                              int paneer = sc.nextInt();
                              switch(paneer)
                              {
                                 case 1 : {System.out.println(" you choose paneer chilli ");}break;
                                 case 2 : System.out.println(" you choose paneer chilli ");break;
                                 case 3 : System.out.println(" you choose paneer chilli ");break;
                                 case 4 : System.out.println(" you choose paneer chilli ");break;
                                 case 5 : System.out.println(" you choose paneer chilli ");break;
                                 case 6 : System.out.println(" you choose paneer chilli ");break;
                                 default:System.out.println("Not available !");break;
                              }

                              System.out.println(Blue+"*** you choose Roti ,Naan,Paratha ");
                              System.out.println(Red+"*** you choose Chinese item ***\n Enter What typ of chinese item \n "+reset+" 1 -> Backed veg           2 -> Backed palak          3 -> veg Manchurian \n 4 -> veg singapoori Noodles           5 -> veg Noodles           6 -> veg Fried Rice ");
                              int chinese = sc.nextInt();
                              switch(chinese)
                              {
                                 case 1 : System.out.println(" you choose Backed veg ");break;
                                 case 2 : System.out.println(" you choose Backed palak ");break;
                                 case 3 : System.out.println(" you choose veg Manchurian ");break;
                                 case 4 : System.out.println(" you choose veg singapoori noodles ");break;
                                 case 5 : System.out.println(" you choose veg noodles ");break;
                                 case 6 : System.out.println(" you choose veg fried Rice ");break;
                                 default: System.out.println(" Not Available !");break;
                              }

                              System.out.println(Green+"\n *** you choose paneer Dish ***\n "+reset+" What typ of paneer dish you want \n 1 -> for paneer Butter Masala      2 -> for paneer kadai      3 -> for paneer punjabi \n 4 -> Methi paneer      5 -> paneer palak      6 -> Corn paneer\n 7 -> Paneer Mutter      8 -> Paneer Kolhapuri      9 -> Paneer Do Pyazza \n 10 -> Paneer chatpatta      11 -> Paneer Tikka Masala");
                              int dish = sc.nextInt();
                              switch(dish)
                              {
                                 case 1 : System.out.println("you choose Blue paneer Butter Masala");break;
                                 case 2 : System.out.println("you choose paneer kadai");break;
                                 case 3 : System.out.println("you choose paneer punjabi");break;
                                 case 4 : System.out.println("you choose Methi paneer ");break;
                                 case 5 : System.out.println("you choose Paneer palak");break;
                                 case 6 : System.out.println("you choose Corn paneer");break;
                                 case 7 : System.out.println("you choose paneer mutter");break;
                                 case 8 : System.out.println("you choose paneer kolhapuri");break;
                                 case 9 : System.out.println("you choose paneer do pyaza ");break;
                                 case 10 : System.out.println("you choose paneer chatpatta");break;
                                 case 11 : System.out.println("you choose paneer tikka masala");break;
                                 default : System.out.println("Not available !");break;
                              }
                              System.out.println(Blue+"*** you choose sweet *** \n Enter \n "+reset+" 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                              System.out.println(Green+"Enter your firt Sweet dish ");
                              String sweet_1 = sc.nextLine(); sweet_1 = sc.nextLine();
                              System.out.println(Green+"Enter you second sweet dish");
                              String sweet_2 = sc.nextLine();
                              System.out.println(reset+" Your 2 sweets are "+sweet_1+","+sweet_2);

                              System.out.println(Yellow+"*** you choose sweet or Ice - cream*** \n "+reset+"Enter \n 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                              int sweet = sc.nextInt();
                              switch(sweet)
                              {
                              case 1 : System.out.println("you choose Gulab jamun ");break;
                              case 2 : System.out.println("you choose Aam khand ");break;
                              case 3 : System.out.println("you choose Gajar ka halwa ");break;
                              case 4 : System.out.println("you choose vanila ");break;
                              case 5 : System.out.println("you choose moong ka Halwa ");break;
                              case 6 : System.out.println("you choose Butter Scotch ");break;
                              case 7 : System.out.println("you choose shree khand ");break;
                              case 8 : System.out.println("you choose sitaphal basundi");break;
                              case 9 : System.out.println("you choose Aam ras ");break;
                              case 10 : System.out.println("you choose Rasgulla ");break;
                              default : System.out.println(" Not available !");break;
                              }

                              System.out.println(Blue+"*** Enter time how long your party will last *** \n Note :- if your party is under 3 hour or less so you dont have to pay more \n but if your party time is more then 3 hour you pay extra charge rupee 1500/- per hour");
                              int time = sc.nextInt();
                              if(time > 3)
                                 {
                                    time = (time - 3)*1500 ;
                                    System.out.println(Red+" You must pay extra charge "+time);}
                                 else {
                                     time = 0;
                                 }
                                 System.out.println(reset+" you must pay 9 % gst on total charge");
                                 System.out.println(" ***Enter the number of members in your party ***");
                                 int member = sc.nextInt();
                                 if(sweet == 8 || sweet == 9)
                                 {
                                 int pay = 700 + 20 ;
                                 if(member<=110 && member >0)
                                 {
                                    int charge = (100 * pay) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      700/- \n Total member are present :-   "+member+" \n Gst you pay :-                   "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is :-         "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * pay)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      700/- \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n Gst you pay :-                "+gst+"\n And your extra charge is :-  "+time+" \n you choose ragulla or Aam khand extra charge is :- "+charge+" \n your total charge is  :-        "+total);
                                    }}

                                 if(member<=110 || member>0)
                                 {
                                    int charge = (100 * 700) + time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      700/- \n Total member are present :-   "+member+" \n Gst you pay :-                   "+gst+"\n your total charge is :-         "+total);
                                 }
                                 else if(member>110)
                                 {
                                    int charge = (member * 700)+ time ;
                                    int gst = (charge * 9) /100;
                                    int total = gst + charge ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      700/- \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n Gst you pay :-                "+gst+"\n your total charge is  :-        "+total);
                                 }   
                              }break;                     
                  }
            }break;

            case 2 :{ System.out.println(Green+" *** YOU CHOOSE BREAKFAST MENU *** \n");
                      System.out.println(Red+" Enter how many members will come in your party ");
                      int member = sc.nextInt();

                       System.out.println(Blue+" Enter your budget \n 1 -> 200/-      2 -> for 230/-      3 -> for 250/-");
                       int budget =  sc.nextInt();
                       System.out.println(reset+"*** You have 1 poha *** \n *** you have 1 jalebi *** \n *** you have 1 bread *** ");
                       System.out.println(Yellow+"What you want press 1 -> for Tea \n 2 -> for coffee ");
                       int press = sc.nextInt();
                       switch(press)
                       {
                        case 1 : System.out.println(reset+"*** you choose Tea ***");break;
                        case 2 : System.out.println(reset+"*** you choose coffee ***");break;
                        default: System.out.println(reset+" Not Available !"); 
                       }
                       
                       switch(budget)
                       {
                        case 1 :{
                           if(member <= 110 && member>0)
                           {int charge = 100 * 200;
                           System.out.println(" you must pay 9% gst on you total \n");
                           int gst = (charge * 9) /100 ;
                           int total = gst + charge ;
                           System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      200/- \n you must pay 9% gst on you total   \n Total member are present :-    "+member+" \n Gst you pay :-               "+gst+" \n your total ammount :-       "+total);}
                           else if(member >=110 )
                           { int charge = member * 200;
                           System.out.println(" you must pay 9% gst on you total \n");
                           int gst = (charge * 9) /100 ;
                           int total = gst + charge ;
                           System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      200/- Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount :-       "+total);}
                           }break;
                             
                        case 2 : { System.out.println(Green+" In budget 230/- you have Extra \n *** You choose heavy Snaks ***  \n What typ of heavy snaks You want \n Enter \n 1 -> idli/vada shambhar           2 -> Noodles          3 -> Pav Bhaji \n 4 -> Chhole Bhatura          5 -> Chhola Kulcha           6 -> Chhola Poori \n 7 -> Methi Paratha           8 -> Paratha with Dahi           9 -> Stuffed paratha \n 10 -> Aloo Paratha           11 -> Muli Paratha             12 -> Gobhi Paratha");
                                  int snaks = sc.nextInt();
                                  switch(snaks)
                                  {
                                    case 1 : System.out.println("you choose idli/vada shambhar ");break;
                                    case 2 : System.out.println("you choose Noodles ");break;
                                    case 3 : System.out.println("you choose Pav Bhaji ");break;
                                    case 4 : System.out.println("you choose Chhola Bhatura ");break;
                                    case 5 : System.out.println("you choose Chhola Kulcha ");break;
                                    case 6 : System.out.println("you choose Chhola poori ");break;
                                    case 7 : System.out.println("you choose Methi paratha ");break;
                                    case 8 : System.out.println("you choose Paratha with Dahi ");break;
                                    case 9 : System.out.println("you choose Stuffed Paratha ");break;
                                    case 10: System.out.println("you choose Aloo Paratha ");break;
                                    case 11: System.out.println("you choose Muli Paratha ");break;
                                    case 12: System.out.println("you choose Gobhi Paratha ");break;
                                    default: System.out.println(" Not Available !");
                                  }
                                  if(member <= 110 && member>0)
                                  {int charge = 100 * 230;
                                  System.out.println(Red+" you must pay 9% gst on you total \n");
                                  int gst = (charge * 9) /100 ;
                                  int total = gst + charge ;
                                  System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      230/- \n you must pay 9% gst on you total   \n Total member are present :-    "+member+" \n Gst you pay :-               "+gst+" \n your total ammount :- "+total);
                                  }
                                  else if(member >=100 )
                                  { int charge = member * 230;
                                  System.out.println(" you must pay 9% gst on you total \n");
                                  int gst = (charge * 9) /100 ;
                                  int total = gst + charge ;
                                  System.out.println(Green+"\n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      230/- Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount :- "+total);
                                  }
                                  }break;
                        case 3 : 
                                 {
                                   System.out.println(Blue+" In budget 250/- you have Extra \n *** You choose heavy Snaks ***  \n What typ of heavy snaks You want \n Enter \n 1 -> idli/vada shambhar           2 -> Noodles          3 -> Pav Bhaji \n 4 -> Chhole Bhatura          5 -> Chhola Kulcha           6 -> Chhola Poori \n 7 -> Methi Paratha           8 -> Paratha with Dahi           9 -> Stuffed paratha \n 10 -> Aloo Paratha           11 -> Muli Paratha             12 -> Gobhi Paratha");
                                   System.out.println(Green+"Enter first snak");
                                   String snak_1 = sc.nextLine();
                                   System.out.println(Green+"Enter second Snak");
                                   String snak_2 = sc.nextLine();
                                   System.out.println(reset+" your 2 snaks are "+snak_1+","+snak_2);

                                  if(member <= 110 && member>0)
                                  {
                                    int charge = 100 * 250;
                                    System.out.println(Red+" you must pay 9% gst on you total \n");
                                  int gst = (charge * 9) /100 ;
                                  int total = gst + charge ;
                                  System.out.println(Green+" \n____________*** BILL ***_____________ \n You choose manu of :-      250/- \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount :-    "+total);}                                  
                                  else if(member >=100 )
                                  {
                                  int charge = member * 250;
                                  System.out.println(Red+" you must pay 9% gst on you total \n");
                                  int gst = (charge * 9) /100 ;
                                  int total = gst + charge ;
                                  System.out.println(Green+"\n____________*** BILL ***_____________ \n You choose manu of :-      250/- Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount :-     "+total);}
                                  }break;                                
                       }
                     }break;
            case 3 :{ 
                     System.out.println(Green+"*** YOU CHOOSE ONLY FOR LADIES MANU ***\n");
                     System.out.println(reset+" Enter how many member are come to in your part \n");
                     int member = sc.nextInt();
                     System.out.println(Blue+"Enter the time how long did your party last \n");
                     int time = sc.nextInt(); 

                     System.out.println(Yellow+" Enter your budget \n 1 -> 250/-    2 -> 300/-    3 -> 350/-");
                     int budget = sc.nextInt();
                     System.out.println(Blue+"What you want\n 1 -> for soup or 2 -> welcome drink");
                    int want = sc.nextInt();
                    switch(want)
                    {
                    case 1 : {System.out.println(Green+"Enter what typ of soup you want \n "+reset+" 1 -> Tomato Soup    2 -> Veg Mancho \n 3 -> Hot & Sour veg    4 -> Lemon Coriander ");
                                int soup = sc.nextInt();
                                switch(soup)
                                {
                                case 1 : System.out.println("you choose Tomato soup for drink");break;
                                case 2 : System.out.println("you choose veg soup for drink");break;
                                case 3 : System.out.println("you choose Hot & Sour veg soup for drink");break;
                                case 4 : System.out.println("you choose Lemon soup for drink");break;
                                default: System.out.println("Not available");break;
                                }}break;
                    case 2 : {System.out.println(Green+"Enter what typ of welcome drink you want \n 1-> Blue Lagoon   2 -> Orange Pink City    3 -> Blowgun Kesher Pista \n 4 -> Strawberry Delight   5 -> Fresh Lime Water   6 -> Jal Jeera \n 7 -> Butter Milk   8 -> Rasna Water");
                                int drink = sc.nextInt();
                                switch(drink)
                                {
                                case 1 : System.out.println("you choose Blue Lagoon for drink");break;
                                case 2 : System.out.println("you choose Orange pink city for drink");break;
                                case 3 : System.out.println("you choose Blowgun kesher pista for drink");break;
                                case 4 : System.out.println("you choose Straberry Delight for drink");break;
                                case 5 : System.out.println("you choose Fresh Lime Water for drink");break;
                                case 6 : System.out.println("you choose Jal Jeera for drink");break;
                                case 7 : System.out.println("you choose Butter Milk for drink");break;
                                case 8 : System.out.println("you choose Rasna Water for drink");break;
                                default : System.out.println("Not available !");break;
                                }}break;
                     default : System.out.println(reset+"Not available");break;}
                     System.out.println(Blue+"*** you choose Starter *** \n  1 -> for Mix veg pakoda          2 -> veg cutlet          3 -> veg finger \n 4 -> veg kothey          5 -> Bread pakoda          6 -> Hara Bhara kabab \n 7 -> Methi kabab          8 -> Corn chat           9 -> Moong pakoda \n 10 -> Aloo chat          11 -> Dragon Pakoda          12 -> saboo dana vada \n 13 -> saboo dana          14 -> veg Manchurian dry         15 -> Finger chips \n 16 -> Tandoori Manchurian          17 -> Aloo Corn kabab          18 -> Chinese Corn kabab  ");
                                 int starter = sc.nextInt();
                                 switch(starter)
                                 {
                                   case 1 : System.out.println("you choose mix veg pakoda ");break;
                                   case 2 : System.out.println("you choose veg cutlet ");break;
                                   case 3 : System.out.println("you choose veg Finger ");break;
                                   case 4 : System.out.println("you choose veg kothey ");break;
                                   case 5 : System.out.println("you choose Bread Pakoda ");break;
                                   case 6 : System.out.println("you choose Hara Bhara Kabab ");break;
                                   case 7 : System.out.println("you choose Methi Kabab ");break;
                                   case 8 : System.out.println("you choose Corn chat ");break;
                                   case 10: System.out.println("you choose Moong pakoda ");break;
                                   case 11: System.out.println("you choose Aloo chat ");break;
                                   case 12: System.out.println("you choose Dragon Aloo ");break;
                                   case 13: System.out.println("you choose saboo Dana vada ");break;
                                   case 14: System.out.println("you choose saboo dana ");break;
                                   case 15: System.out.println("you choose veg Manchurian dry");break;
                                   case 16: System.out.println("you choose Finger chips ");break;
                                   case 17: System.out.println("you choose Tandoori Manchurian ");break;
                                   case 18: System.out.println("you choose Aloo corn kabab ");break;
                                   case 19: System.out.println("you choose chinese corn kabab ");break;     
                                 }
                        System.out.println(Yellow+"*** you choose sweet dish*** \n Enter \n "+reset+" 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                                 int sweet = sc.nextInt();
                                    switch(sweet)
                                    {
                                    case 1 : System.out.println("you choose Gulab jamun ");break;
                                    case 2 : System.out.println("you choose Aam khand ");break;
                                    case 3 : System.out.println("you choose Gajar ka halwa ");break;
                                    case 4 : System.out.println("you choose vanila ");break;
                                    case 5 : System.out.println("you choose moong ka Halwa ");break;
                                    case 6 : System.out.println("you choose Butter Scotch ");break;
                                    case 7 : System.out.println("you choose shree khand ");break;
                                    case 8 : System.out.println("you choose sitaphal basundi");break;
                                    case 9 : System.out.println("you choose Aam ras ");break;
                                    case 10 : System.out.println("you choose Rasgulla ");break;
                                    default : System.out.println(" Not available !");break;
                                    }
                  
                        switch(budget)
                        {
                           case 1 : {
                                  System.out.println(Green+ " In budget 250/- you have extra \n 1 -> snacks     2 -> Tea or coffee");
                                  System.out.println(Blue+"\n *** You choose heavy Snaks ***  \n What typ of heavy snaks You want \n "+reset+" Enter \n 1 -> idli/vada shambhar           2 -> Noodles          3 -> Pav Bhaji \n 4 -> Chhole Bhatura          5 -> Chhola Kulcha           6 -> Chhola Poori \n 7 -> Methi Paratha           8 -> Paratha with Dahi           9 -> Stuffed paratha \n 10 -> Aloo Paratha           11 -> Muli Paratha             12 -> Gobhi Paratha");
                                  int snaks = sc.nextInt();
                                  switch(snaks)
                                  {
                                    case 1 : System.out.println("you choose idli/vada shambhar ");break;
                                    case 2 : System.out.println("you choose Noodles ");break;
                                    case 3 : System.out.println("you choose Pav Bhaji ");break;
                                    case 4 : System.out.println("you choose Chhola Bhatura ");break;
                                    case 5 : System.out.println("you choose Chhola Kulcha ");break;
                                    case 6 : System.out.println("you choose Chhola poori ");break;
                                    case 7 : System.out.println("you choose Methi paratha ");break;
                                    case 8 : System.out.println("you choose Paratha with Dahi ");break;
                                    case 9 : System.out.println("you choose Stuffed Paratha ");break;
                                    case 10: System.out.println("you choose Aloo Paratha ");break;
                                    case 11: System.out.println("you choose Muli Paratha ");break;
                                    case 12: System.out.println("you choose Gobhi Paratha ");break;
                                    default: System.out.println(" Not Available !");
                                  }
                                  
                                  System.out.println(Yellow+"What you want\n Enter \n 1 -> for Tea   & 2 -> Coffee ");
                                  int tea = sc.nextInt();
                                  switch(tea)
                                  {
                                    case 1 : System.out.println(reset+"you choose tea");break;
                                    case 2 : System.out.println(reset+"you choose coffee");break;
                                  }
                                 System.out.println(Red+"You must pay 9% GST on your total");
                                 if(time>2 && time>0)
                                 {
                                    if(member <= 110 && member > 0)
                                    {
                                       int charge = 100 * (250 +20 );
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      250/-  \n your extra time is :-        "+(time-2)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \nyour total ammount is :-        "+total);
                                    }
                                    else if(member > 110 && member > 0)
                                    {
                                       int charge = member *(250 + 20);
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      250/- \n your extra time is :-        "+(time-2)+" \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-       "+total);

                                    }
                                 }
                                 else if(time <= 2 && time>0)
                                 {
                                   if(member <= 110 && member > 0)
                                    {
                                       int charge = 100 * 250 ;
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+"\n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      250/-  \n  your time is :-               "+time+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                    }
                                    else if(member > 110 && member > 0)
                                    {
                                       int charge = member * 250;
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      250/-  \n your time is :-               "+time+" \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                    }}                                 
                                 }break;

                           case 2 :{
                              System.out.println(Green+" *** In budget 300/- you have extra \n 1 -> snacks      2 -> Tea or coffee");
                              System.out.println(Yellow+"\n *** You choose heavy Snaks ***  \n "+reset+" What typ of heavy snaks You want \n Enter \n 1 -> idli/vada shambhar           2 -> Noodles          3 -> Pav Bhaji \n 4 -> Chhole Bhatura          5 -> Chhola Kulcha           6 -> Chhola Poori \n 7 -> Methi Paratha           8 -> Paratha with Dahi           9 -> Stuffed paratha \n 10 -> Aloo Paratha           11 -> Muli Paratha             12 -> Gobhi Paratha");
                              System.out.println(Blue+"Enter first snak");
                              String snak_1 = sc.nextLine(); snak_1 = sc.nextLine();
                              System.out.println(Blue+"Enter second snak");
                              String snak_2 = sc.nextLine();
                              System.out.println(reset+"your 2 snaks are "+snak_1+","+snak_2);

                              System.out.println(Red+"What you want Enter \n "+reset+" 1 -> for Tea   & 2 -> Coffee ");
                              int tea = sc.nextInt();
                              switch(tea)
                              {
                              case 1 : System.out.println(Green+"you choose tea");break;
                              case 2 : System.out.println(Green+"you choose coffee");break;
                              }
                              System.out.println("You must pay 9% GST on your total");
                              if(time>2 && time>0)
                                 {
                                    if(member <= 110 && member > 0)
                                    {
                                       int charge = 100 * (300 +20 );
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      300/-  \n your extra time is :-        "+(time-2)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                    }
                                    else if(member > 110 && member > 0)
                                    {
                                       int charge = member *(300 + 20);
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      300/- \n your extra time is :-        "+(time-2)+" \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                    }
                                 }
                                 else if(time <= 2 && time>0)
                                 {
                                   if(member <= 110 && member > 0)
                                    {
                                       int charge = 100 * 300 ;
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      300/-  \n your time is :-               "+time+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                    }
                                    else if(member > 110 && member > 0)
                                    {
                                       int charge = member * 300;
                                       int gst = (charge * 9) /100 ;
                                       int total = charge + gst ;
                                       System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      300/- \n your time is :-               "+time+" \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                    }}
                             }break;

                           case 3 : {
                              System.out.println(Green+"In budget 350/- you have extra \n "+reset+" paneer Starter        snacks         Tea or Ice - cream ");
                              System.out.println(Blue+"*** you choose Paneer starter *** \n Enter \n "+reset+"1 -> paneer chilli           2 -> Paneer pudina Tikka          3 -> Paneer Tikka \n 4 -> Paneer Achari Tikka           5 -> Dragon Paneer          6 -> paneer 65 \n");
                              int paneer = sc.nextInt();
                              switch(paneer)
                              {
                                 case 1 : {System.out.println(" you choose paneer chilli ");}break;
                                 case 2 : System.out.println(" you choose paneer chilli ");break;
                                 case 3 : System.out.println(" you choose paneer chilli ");break;
                                 case 4 : System.out.println(" you choose paneer chilli ");break;
                                 case 5 : System.out.println(" you choose paneer chilli ");break;
                                 case 6 : System.out.println(" you choose paneer chilli ");break;
                                 default:System.out.println("Not available !");break;
                              }

                              System.out.println(Yellow+"\n *** You choose heavy Snaks ***  \n "+reset+" What typ of heavy snaks You want \n Enter \n 1 -> idli/vada shambhar           2 -> Noodles          3 -> Pav Bhaji \n 4 -> Chhole Bhatura          5 -> Chhola Kulcha           6 -> Chhola Poori \n 7 -> Methi Paratha           8 -> Paratha with Dahi           9 -> Stuffed paratha \n 10 -> Aloo Paratha           11 -> Muli Paratha             12 -> Gobhi Paratha");
                              System.out.println(reset+"Enter first snak");
                              String snak_1 = sc.nextLine(); snak_1 = sc.nextLine();
                              System.out.println(reset+"Enter second snak");
                              String snak_2 = sc.nextLine();
                              System.out.println(Green+"your 2 snaks are "+snak_1+","+snak_2);

                              System.out.println(Blue+"what you want \n 1 -> for Tea & 2 -> for Ice - cream");
                              int Tea = sc.nextInt();
                              switch(Tea)
                              {
                                 case 1 : System.out.println(Red+" you choose Tea");break;
                                 case 2 : System.out.println(Yellow+" *** you choose Ice - cream *** \n "+reset+" Enter what typ of Ice - cream you want \n 1 -> for Gulab jamun   2 -> for Aam khand   3 -> Gajar ka halwa \n 4 -> vanila   5 -> Moog ka halwa   6 -> Butter Scotch \n 7 -> Shree khand   8 -> Sitaphal Basundi \n\n if you want Aam Ras & Rasgulla so you pay 20/- rupees Extra on per plate \n Enter 9 -> for Aam ras  10 -> for Rasgulla ");
                                          int ice = sc.nextInt();
                                          switch(ice)
                                          {
                                              case 1 : System.out.println("you choose Gulab jamun ");break;
                                              case 2 : System.out.println("you choose Aam khand ");break;
                                              case 3 : System.out.println("you choose Gajar ka halwa ");break;
                                              case 4 : System.out.println("you choose vanila ");break;
                                              case 5 : System.out.println("you choose moong ka Halwa ");break;
                                              case 6 : System.out.println("you choose Butter Scotch ");break;
                                              case 7 : System.out.println("you choose shree khand ");break;
                                              case 8 : System.out.println("you choose sitaphal basundi");break;
                                              case 9 : System.out.println("you choose Aam ras ");break;
                                              case 10 : System.out.println("you choose Rasgulla ");break;
                                              default : System.out.println(" Not available !");break;
                                          }                                          
                              }
                              System.out.println(Red+"You must pay 9% GST on your total");
                              if(time>2 && time>0)
                              {
                                 if(member <= 110 && member > 0)
                                 {
                                    int charge = 100 * (350 +20 );
                                    int gst = (charge * 9) /100 ;
                                    int total = charge + gst ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      350/- \n your extra time is :-        "+(time-2)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is "+total);
                                 }
                                 else if(member > 110 && member > 0)
                                 {
                                    int charge = member *(350 + 20);
                                    int gst = (charge * 9) /100 ;
                                    int total = charge + gst ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      350/- \n your extra time is :-        "+(time-2)+" \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                 }
                              }
                              else if(time <= 2 && time>0)
                              {
                                 if(member <= 110 && member > 0)
                                 {
                                    int charge = 100 * 350 ;
                                    int gst = (charge * 9) /100 ;
                                    int total = charge + gst ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+" You choose manu of :-      350/- \n your time is :-               "+time+"  \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is "+total);
                                 }
                                 else if(member > 110 && member > 0)
                                 {
                                    int charge = member * 350;
                                    int gst = (charge * 9) /100 ;
                                    int total = charge + gst ;
                                    System.out.println(Green+" \n____________*** BILL ***_____________ \n "+reset+"You choose manu of :-      350/- \n your time is :-               "+time+" \n Extra members are :-         "+(member-100)+" \n Total member are present :-    "+member+" \n you must pay 9% gst on you total   \n Gst you pay :-               "+gst+" \n your total ammount is :-      "+total);
                                 } 
                              }
                              }break;

                     }}break;}
   }
}
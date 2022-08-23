import java.util.*;

abstract class snacks
{
    String chips;
    String drinks;
    String popcorn;

    public void break_time()
    {
        System.out.println("Don't forget to get some snacks for the movies at our canteen!");
    }

}

class snacks_movies extends snacks
{

    public  void chips_brands()
    {
        System.out.println("AVAILABLE CHIPS BRANDS:   Lays, Bingo, Yumitos, Kurkure");
    }

    public  void drinks_brands()
    {
        System.out.println("AVAILABLE DRINKS BRANDS:  Coke, Pepsi, 7UP, Maaza");
    }

    public  void popcorn_brands()
    {
        System.out.println("AVAILABLE POPCORN BRANDS:  Act II, Black Jewell, Jolly Time, Pop Secret");
    }

    public static void main(String args[])
    {
        snacks_movies a=new snacks_movies();
        a.chips_brands();
        a.popcorn_brands();
        a.drinks_brands();
        a.break_time();
    }
}

class TI {

    public static class ticket {

        screen s = new screen();

        void print_ticket(String movie,String showtime,int screen,String cat, String rowch, int colch)
        {
            Date date = new Date();
            int cost = s.getcost(cat);
            System.out.println("##############REV Cinemas################");
            System.out.println("\t\t      MOVIE BOOKING");
            System.out.println("\tMovie: "+movie+"\t");
            System.out.print("\tTime: "+showtime);
            System.out.println("\t\t\tSeat: "+rowch+colch);
            System.out.print("\tCategory: "+cat);
            System.out.println("\t\t\tScreen: "+screen);
            System.out.println("\tDate: "+date);
            System.out.println("\tPrice: ₹"+cost);
            System.out.println("\tThank You! Hope to see you again soon!\n\n");
        }
    }



    public static class show {

        static String seats[][][] = new String[5][6][12];

        void display_show_timings()
        {
            System.out.println("\tMovies Now Playing                    \t\t\t\t  Timings");
            System.out.print("1.	Zack Snyder`s Justice League -  \t\t\t 10:20     11:30    17:30  ");
            System.out.println();
            System.out.print("2.	Godzilla vs. Kong -             \t\t\t 10:45     12:30    16:30   ");
            System.out.println();
            System.out.print("3.	Parasite -                      \t\t\t 10:00     11:45    15:30  ");
            System.out.println();
            System.out.print("4.	Joker –                       \t\t\t\t 12:00     13:30    17:30  ");
            System.out.println();
            System.out.print("5.	Knives Out -                  \t\t\t\t 09:20     11:30    17:30  ");
            System.out.println();
        }

        String check_time(int x,String t)
        {
            switch(x)
            {
                case 1: if(t.equals("10:20")||t.equals("11:30")||t.equals("17:30")){
                    return "true";
                }
                else
                { System.out.println("Time not available");
                    return "false";
                }

                case 2: if(t.equals("10:45")||t.equals("12:30")||t.equals("16:30")){return "true";}
                else
                {
                    System.out.println("Time not available");
                    return "false";
                }

                case 3: if(t.equals("10:00")||t.equals("11:45")||t.equals("15:30")){return "true";}
                else
                { 	System.out.println("Time not available");
                    return "false";
                }

                case 4: if(t.equals("12:00")||t.equals("13:30")||t.equals("17:30")){return "true";}
                else
                {
                    System.out.println("Time not available");
                    return "false";
                }

                case 5: if(t.equals("9:20")||t.equals("11:30")||t.equals("17:30")){return "true";}
                else
                { 	System.out.println("Time not available");
                    return "false";
                }

                default: return "false";
            }
        }

        void show_empty_seats(String x,int i)
        {
            for(int j=0;j<12;j++)
                if(seats[i-1][x.charAt(0)-'A'][j]!="Full")
                {
                    System.out.print(" "+(j+1));
                }
        }
        boolean check_seats(String a,int x,int i)
        {
            if(seats[i-1][a.charAt(0)-'A'][x-1]!="Full")
                return false;
            else
                return true;
        }

        void fill_seat(String a,int b,int i)
        {
            seats[i-1][a.charAt(0)-'A'][b-1]="Full";
        }
        String getmovie(int x)
        {
            switch(x)
            {
                case 1: return "Zack Snyder`s Justice League";
                case 2: return "Godzilla vs. Kong";
                case 3: return "Parasite";
                case 4: return "Joker";
                case 5: return "Knives Out";
                default: return "";
            }
        }
        public static void main()
        {
            for(int k =0; k<5;k++)
                for(int i=0;i<6;i++)
                    for(int j=0;j<12;j++)
                        seats[k][i][j]="Empty";
        }
    }

}

class screen {

    void display_seats()
    {
        System.out.println("                         Screen this side");
        System.out.println(" \t\t     ╔══════════════════════╗");
        System.out.println(" \t\t     ╚══════════════════════╝");
        System.out.println("\t   ┌─────────────────────────────────────────────┐");
        System.out.println("\t      A □ □ □ □ □ □ □ □ □ □ □ □ Bronze –  ₹ 150");
        System.out.println("\t      B □ □ □ □ □ □ □ □ □ □ □ □ Bronze –  ₹ 150");
        System.out.println("\t   ┌─────────────────────────────────────────────┐");
        System.out.println("\t      C □ □ □ □ □ □ □ □ □ □ □ □ Silver –  ₹ 225");
        System.out.println("\t      D □ □ □ □ □ □ □ □ □ □ □ □ Silver –  ₹ 225");
        System.out.println("\t   ┌─────────────────────────────────────────────┐");
        System.out.println("\t     E □ □ □ □ □ □ □ □ □ □ □ □ Platinum –  ₹ 300");
        System.out.println("\t     F □ □ □ □ □ □ □ □ □ □ □ □ Platinum –  ₹ 300");
        System.out.println("\n\n  Please Enter Preferred Row. Seat will be booked as per availability.\n");
    }

    String getcat(String a)
    {
        String cat;
        if(a.compareToIgnoreCase("A")==0||a.compareToIgnoreCase("B")==0)
            cat="Bronze";
        else if(a.compareToIgnoreCase("C")==0||a.compareToIgnoreCase("D")==0)
            cat="Silver";
        else if(a.compareToIgnoreCase("E")==0||a.compareToIgnoreCase("F")==0)
            cat="Platinum";
        else
            cat="N/A";
        return cat;
    }

    int getcost(String cat)
    {
        int cost = 0;
        if(cat.compareToIgnoreCase("Bronze")==0)
            cost=150;
        else if(cat.compareToIgnoreCase("Silver")==0)
            cost=225;
        else if(cat.compareToIgnoreCase("Platinum")==0)
            cost=300;
        else
            return 0;
        return cost;
    }
}




class run {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int ch,i,n,movch; String rowch[]=new String[12];
        int colch[]=new int[12];
        String time = new String();
        String timecheck = new String();
        TI.show objshow = new TI.show();
        screen objscreen = new screen();
        TI.ticket objticket = new TI.ticket();

        snacks_movies d=new snacks_movies();
        d.chips_brands();


        while(true){
            System.out.println("\n\t\t   Movie Ticket Booking System\n");
            System.out.println("1.Book Movie Tickets");
            System.out.println("2.See Movies/Show Timings");
            System.out.println("3.Snacks");
            System.out.println("4.Exit");
            System.out.println("\nAdvanced Bookings are closed as of now.");
            System.out.println("\nEnter Choice");
            ch = in.nextInt();
            switch(ch)
            {
                case 1:	objshow.display_show_timings();
                    System.out.println("Choose the Movie");
                    movch=in.nextInt();
                    do{
                        System.out.println("Enter Show timings (hh:mm)");
                        time=in.next();
                        timecheck=objshow.check_time(movch,time);
                    }while(timecheck.equals("false"));
                    System.out.println("Enter Number of seats");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        objscreen.display_seats();
                        rowch[i]=in.next().toUpperCase();
                        objshow.show_empty_seats(rowch[i],movch);
                        colch[i]=in.nextInt();
                        if(objshow.check_seats(rowch[i],colch[i],movch))
                        {
                            System.out.println("Seat is not available");
                        }
                        objshow.fill_seat(rowch[i],colch[i],movch);
                    }
                    for(i=0;i<n;i++)
                    {
                        objticket.print_ticket(objshow.getmovie(movch), time, 3, objscreen.getcat(rowch[i]), rowch[i], colch[i]);
                    }

                    break;

                case 2: objshow.display_show_timings();
                    break;

                case 3:n=1;

                        for (i = 0; i < n; i++) {
                            d.break_time();
                            d.popcorn_brands();
                            d.drinks_brands();
                            d.chips_brands();
                        }
                    


                case 4: System.exit(0);
            }
        }
    }
}

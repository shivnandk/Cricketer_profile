import java.util.*;
 class Baller{
    public String ba_name;
    public int ba_runs,ba_age,ba_innings,ba_wicket,ba_balls;
    public double ba_economy,ba_wicket_average,ba_overs;
    //this function takes the name of the baller
    public String ball_name(String name_ip)
    {
        ba_name=name_ip;
        return ba_name;
    }
    //This function takes the number of balls baller balled
    public int baller_balls(int ball_ip)
    {
        ba_balls=ball_ip;
        return ba_balls;
    }
    //This function counts th number of the over baller balled
    public double ball_over(int ball_ip)
    {
        ba_overs=ball_ip/6.0;
        return ba_overs;
    }
    //This function calculate the economy of the baller
    public double economy(int runs_ip){
        ba_economy=(runs_ip/ba_balls)*6;
        return ba_economy;
    }
    //this function track the number of the innings of the baller
    public int ball_innings(int innings_ip){
        ba_innings=innings_ip;
        return ba_innings;
    }
    //this function store the age of th e baller
    public int ball_age(int age_ip){
        ba_age=age_ip;
        return ba_age;
    }
    //this function store the wickets taken by tyhe baller
    public int ball_wicket(int wic_ip){
        ba_wicket=wic_ip;
        return ba_wicket;
    }
    //this function calculate the averge runs per wicket
    public double ball_wicket_average(int wic_ip,int ip_runs){
        ba_wicket_average=ip_runs/wic_ip;
        return ba_wicket_average;
    }
    //this function tracks the nuber of runs given by the baller
    public int ball_run(int runs_ip){
        ba_runs=runs_ip;
        return ba_runs;
    }
}
//class batsmen tracks the record of the baller
class Batsmen extends Baller{
    public String bt_name;
    public double bt_strike_rate,bt_average;
    public int bt_runs,bt_age,bt_innings,bt_balls_faced;
    //this function stores the name of the baller
    public String bat_name(String name_ip){
        bt_name =name_ip;
        return bt_name;
    }
    //this function calculate the strike rate of the batsmen
    public double bat_strike_rate(int ball_faced_ip,int runs_ip){
         bt_strike_rate=((runs_ip/ball_faced_ip)*100.0);
         return bt_strike_rate;
    }
    //this function calculate the average of the batsmen
    public double bat_average(int innings_ip,int runs_ip){
        bt_average=runs_ip/innings_ip;
        return bt_average;
    }
    //this function store the runs of the batsmen
    public int bat_runs(int runs_ip){
        bt_runs=runs_ip;
        return bt_runs;
    }
    //this function stores the age of the batsmen
    public int bat_age(int age_ip){
        bt_age=age_ip;
        return bt_age;
    }
    //this function stores the number of innings batsmen played
    public int bat_innings(int innings_ip){
        bt_innings=innings_ip;
        return bt_innings;
    }
    //this function stores the balls faced by the batsmen
    public int bat_balls_faced(int ball_faced_ip){
        bt_balls_faced=ball_faced_ip;
        return bt_balls_faced;
    }
}
//class team keeps the tracks of the team records
class Team extends Batsmen{
    public String team_name;
    //this function stores the name of the teamof the player
    public String team_names(String team_name_ip){
        team_name=team_name_ip;
        return team_name;
    }
}
class Profile{
    Team player[]= new Team[100];
    String name;
    int inputs;
    String type;
    Scanner sc = new Scanner(System.in);
    void profile(int Player_no){
    player[Player_no]=new Team();
    System.out.println("Enter the type of the player\n1.batsmen\n2.baller\n3.All-rounder");
    type=sc.nextLine();
    System.out.println(type);
    {
    if(type=="batsmen")
        {
        System.out.println("Enter the name of the batsmen");
        name=sc.nextLine();
        player[Player_no].bat_name(name);
        System.out.println("Enter team Name");
        name=sc.nextLine();
        player[Player_no].team_names(name);
        System.out.println("Enter runs scored by the batsmen");
        inputs=sc.nextInt();
        player[Player_no].bat_runs(inputs);
        System.out.println("Enter the age of the batsmen");
        inputs=sc.nextInt();
        player[Player_no].bat_age(inputs);
        System.out.println("Enter the innings played by the batsmen");
        inputs=sc.nextInt();
        player[Player_no].bat_innings(inputs); 
        System.out.println("Enter the number of balls faced by the batsmen");
        inputs=sc.nextInt();
        player[Player_no].bat_balls_faced(inputs);
        }
    else if(type=="baller")
        {
        System.out.println("Enter the name of the baller");
        name=sc.nextLine();
        player[Player_no].ball_name(name); 
        System.out.println("Enter team Name");
        name=sc.nextLine();
        player[Player_no].team_names(name);
        System.out.println("Enter the innings played by the baller"); 
        inputs=sc.nextInt();
        player[Player_no].ball_innings(inputs);
        System.out.println("Enter the age of the baller");
        inputs=sc.nextInt();
        player[Player_no].ball_age(inputs);
        System.out.println("Enter the number of  wickets taken by the baller");
        inputs=sc.nextInt();
        player[Player_no].ball_wicket(inputs);
        System.out.println("Enter number of runs given by the baller" );
        inputs=sc.nextInt();
        player[Player_no].ball_run(inputs);
        System.out.println("Enter the number of balls balled by the baller");
        inputs=sc.nextInt();
        player[Player_no].baller_balls(inputs);
        }
    else if(type=="All-rounder")
    {
    System.out.println("Enter the name of the All-rounder");
    name=sc.nextLine();
    player[Player_no].bat_name(name); 
    System.out.println("Enter team Name of the All-rounder");
    name=sc.nextLine();
    player[Player_no].team_names(name);
    System.out.println("Enter runs scored by the All-rounder");
    inputs=sc.nextInt();
    player[Player_no].bat_runs(inputs);
    System.out.println("Enter the age of the batsmen");
    inputs=sc.nextInt();
        player[Player_no].bat_age(inputs);
    System.out.println("Enter the innings played by the All-rounder as batsmen");
    inputs=sc.nextInt();
    player[Player_no].bat_innings(inputs);
     System.out.println("Enter the number of balls faced by the All-rounder");
    inputs=sc.nextInt();
    player[Player_no].bat_balls_faced(inputs);
    System.out.println("Enter the innings played by the All-rounder as baller");
    inputs=sc.nextInt();
    player[Player_no].ball_innings(inputs);
    System.out.println("Enter the number of  wickets taken by the All-rounder");
    inputs=sc.nextInt();
    player[Player_no].ball_wicket(inputs);
    System.out.println("Enter number of runs given by the All-rounder");
    inputs=sc.nextInt();
    player[Player_no].ball_run(inputs);
    System.out.println("Enter the number of balls balled by the All-rounder");
    inputs=sc.nextInt();
    player[Player_no].baller_balls(inputs);
    }
    }
        
    }
    void profile_disp(int Player_no){
        if(type=="baller"){
        System.out.println("Baller Name : "+player[Player_no].ba_name);
        System.out.println("Team : "+player[Player_no].team_name);
        System.out.println("Innings : "+player[Player_no].ba_innings);
        System.out.println("Age : "+player[Player_no].ba_age);
        System.out.println("Wickets : "+player[Player_no].ba_wicket);
        player[Player_no].ball_wicket_average(player[Player_no].ba_wicket,player[Player_no].ba_runs);
        System.out.println("Wicket Average : "+player[Player_no].ba_wicket_average);
        player[Player_no].economy(player[Player_no].ba_runs);
        System.out.println("Economy : "+player[Player_no].ba_economy);
        }
        else if(type=="All-rounder")
        {
        System.out.println("All-rounder Name : "+player[Player_no].bt_name);
        System.out.println("Team : "+player[Player_no].team_name);
        System.out.println("Runs : "+player[Player_no].bt_runs);
        System.out.println("Innings as Batsmen : "+player[Player_no].bt_innings);
        System.out.println("Age : "+player[Player_no].bt_age);
        System.out.print("Strike Rate : ");
        System.out.println(player[Player_no].bat_strike_rate(player[Player_no].bt_balls_faced,player[Player_no].bt_runs));
        System.out.print("Batting average : ");
        System.out.println(player[Player_no].bat_average(player[Player_no].bt_innings,player[Player_no].bt_runs));
        System.out.println("Innings as Baller : "+player[Player_no].ba_innings);
        player[Player_no].ball_wicket_average(player[Player_no].ba_wicket,player[Player_no].ba_runs);
        System.out.println("Wickets : "+player[Player_no].ba_wicket);
         player[Player_no].economy(player[Player_no].ba_runs);
        System.out.println("Economy : "+player[Player_no].ba_economy);
        }
        else if(type=="batsmen")
        {
        System.out.println("Batsmen Name : "+player[Player_no].bt_name);
        System.out.println("Team : "+player[Player_no].team_name);
        System.out.println("Runs : "+player[Player_no].bt_runs);
        System.out.println("Innings : "+player[Player_no].bt_innings);
        System.out.println("Age : "+player[Player_no].bt_age);
        System.out.print("Strike Rate : ");
        System.out.println(player[Player_no].bat_strike_rate(player[Player_no].bt_balls_faced,player[Player_no].bt_runs));
        System.out.print("Batting average : ");
        System.out.println(player[Player_no].bat_average(player[Player_no].bt_innings,player[Player_no].bt_runs));
        }
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Profile p = new Profile();
        int total_player;
        System.out.println("Enter the number of players of whom you want to create a profile");
        total_player=sc.nextInt();
        for(int Player=0;Player<total_player;Player++){
         p.profile(Player);
         p.profile_disp(Player);
        }
    }
}
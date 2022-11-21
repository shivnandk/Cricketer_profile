#include <iostream>
using namespace std;
//Baller class helps in tracking record of the baller
class baller{
    public:
    string ba_name;
    int ba_runs,ba_age,ba_innings,ba_wicket,ba_balls;
    double ba_economy,ba_wicket_average,ba_overs;
    //this function takes the name of the baller
    string ball_name(string name_ip)
    {
        ba_name=name_ip;
        return ba_name;
    }
    //This function takes the number of balls baller balled
    int baller_balls(int ball_ip)
    {
        ba_balls=ball_ip;
        return ba_balls;
    }
    //This function counts th number of the over baller balled
    int ball_over(int ball_ip)
    {
        ba_overs=ball_ip/6.0;
        return ba_overs;
    }
    //This function calculate the economy of the baller
    double economy(int runs_ip){
        ba_economy=(runs_ip/ba_balls)*6;
        return ba_economy;
    }
    //this function track the number of the innings of the baller
    int ball_innings(int innings_ip){
        ba_innings=innings_ip;
        return ba_innings;
    }
    //this function store the age of th e baller
    int ball_age(int age_ip){
        ba_age=age_ip;
        return ba_age;
    }
    //this function store the wickets taken by tyhe baller
    int ball_wicket(int wic_ip){
        ba_wicket=wic_ip;
        return ba_wicket;
    }
    //this function calculate the averge runs per wicket
    double ball_wicket_average(int wic_ip,int ip_runs){
        ba_wicket_average=ip_runs/wic_ip;
        return ba_wicket_average;
    }
    //this function tracks the nuber of runs given by the baller
    int ball_run(int runs_ip){
        ba_runs=runs_ip;
        return ba_runs;
    }
};
//class batsmen tracks the record of the baller
class batsmen{
    public:
    string bt_name;
    double bt_strike_rate,bt_average;
    int bt_runs,bt_age,bt_innings,bt_balls_faced;
    //this function stores the name of the baller
    string bat_name(string name_ip){
        bt_name =name_ip;
        return bt_name;
    }
    //this function calculate the strike rate of the batsmen
    double bat_strike_rate(int ball_faced_ip,int runs_ip){
         bt_strike_rate=((runs_ip/ball_faced_ip)*100.0);
         return bt_strike_rate;
    }
    //this function calculate the average of the batsmen
    double bat_average(int innings_ip,int runs_ip){
        bt_average=runs_ip/innings_ip;
        return bt_average;
    }
    //this function store the runs of the batsmen
    int bat_runs(int runs_ip){
        bt_runs=runs_ip;
        return bt_runs;
    }
    //this function stores the age of the batsmen
    int bat_age(int age_ip){
        bt_age=age_ip;
        return bt_age;
    }
    //this function stores the number of innings batsmen played
    int bat_innings(int innings_ip){
        bt_innings=innings_ip;
        return bt_innings;
    }
    //this function stores the balls faced by the batsmen
    int bat_balls_faced(int ball_faced_ip){
        bt_balls_faced=ball_faced_ip;
        return bt_balls_faced;
    }
};
//class team keeps the tracks of the team records
class team:public baller,public batsmen{
    public:
    string team_name;
    //this function stores the name of the teamof the player
    string team_names(string team_name_ip){
        team_name=team_name_ip;
        return team_name;
    }
};
//most imp class whole function are here called
class profile{
    public:
    team player[20];
    string name;
    int inputs;
    string type;
    //in this function the profile of the batsmen is made
    void Profile(int Player_no){
    cout<<"Enter the type of the player \n1.batsmen\n2.baller\n3.All-rounder\n";
    cin>>type;
        {
    if(type=="batsmen"){
        cout<<"Enter the name of the batsmen"<<endl;
        std::cin >>name;
        player[Player_no].bat_name(name);
        cout<<"Enter team Name"<<endl;
        std::cin >>name;
        player[Player_no].team_names(name);
        cout<<"Enter batsmen runs scored by the batsmen"<<endl;
        cin>>inputs;
        player[Player_no].bat_runs(inputs);
        cout<<"Enter the age of the batsmen"<<endl;
        cin>>inputs;
        player[Player_no].bat_age(inputs);
        cout<<"Enter the innings played by the batsmen"<<endl;
        cin>>inputs;
        player[Player_no].bat_innings(inputs);
        cout<<"Enter the number of balls faced by the batsmen"<<endl;
        cin>>inputs;
        player[Player_no].bat_balls_faced(inputs);
        }
    if(type=="baller"){
        cout<<"Enter the name of the baller"<<endl;
        std::cin >>name;
        player[Player_no].ball_name(name);
        cout<<"Enter team Name"<<endl;
        std::cin >>name;
        player[Player_no].team_names(name);
        cout<<"Enter the innings played by the baller"<<endl;
        cin>>inputs;
        player[Player_no].ball_innings(inputs);
        cout<<"Enter the age of the baller"<<endl;
        cin>>inputs;
        player[Player_no].ball_age(inputs);
        cout<<"Enter the number of  wickets taken by the baller"<<endl;
        cin>>inputs;
        player[Player_no].ball_wicket(inputs);
        cout<<"Enter number of runs given by the baller"<<endl;
        cin>>inputs;
        player[Player_no].ball_run(inputs);
        cout<<"Enter the number of balls balled by the batsmen"<<endl;
        cin>>inputs;
        player[Player_no].baller_balls(inputs);
    }
    if(type=="All-rounder"){
        cout<<"Enter the name of the All-rounder"<<endl;
        std::cin >>name;
        player[Player_no].bat_name(name);
        cout<<"Enter team Name of the All-rounder"<<endl;
        std::cin >>name;
        player[Player_no].team_names(name);
        cout<<"Enter runs scored by the All-rounder"<<endl;
        cin>>inputs;
        player[Player_no].bat_runs(inputs);
        cout<<"Enter the age of the All-rounder"<<endl;
        cin>>inputs;
        player[Player_no].bat_age(inputs);
        cout<<"Enter the innings played by the All-rounder as batsmen"<<endl;
        cin>>inputs;
        player[Player_no].bat_innings(inputs);
        cout<<"Enter the number of balls faced by the All-rounder"<<endl;
        cin>>inputs;
        player[Player_no].bat_balls_faced(inputs);
        cout<<"Enter the innings played by the All-rounder as baller"<<endl;
        cin>>inputs;
        player[Player_no].ball_innings(inputs);
        cout<<"Enter the number of  wickets taken by the All-rounder"<<endl;
        cin>>inputs;
        player[Player_no].ball_wicket(inputs);
        cout<<"Enter number of runs given by the All-rounder"<<endl;
        cin>>inputs;
        player[Player_no].ball_run(inputs);
        cout<<"Enter the number of balls balled by the All-rounder"<<endl;
        cin>>inputs;
        player[Player_no].baller_balls(inputs);
       }
    }
  }
  //this function display the details of the player
  void profile_disp(int Player_no){
if(type=="batsmen"){
    cout<<"Batsmen Name : "<<player[Player_no].bt_name<<endl;
    cout<<"Team : "<<player[Player_no].team_name<<endl;
    cout<<"Runs : "<<player[Player_no].bt_runs<<endl;
    cout<<"Innings : "<<player[Player_no].bt_innings<<endl;
    cout<<"Age : "<<player[Player_no].bt_age<<endl;
    cout<<"Strike Rate : ";
    cout<<player[Player_no].bat_strike_rate(player[Player_no].bt_balls_faced,player[Player_no].bt_runs)<<endl;
          cout<<"Batting average : ";
          cout<<player[Player_no].bat_average(player[Player_no].bt_innings,player[Player_no].bt_runs)<<endl;
      }
      else if(type=="baller"){
          cout<<"Baller Name : "<<player[Player_no].ba_name<<endl;
          cout<<"Team : "<<player[Player_no].team_name<<endl;
          cout<<"Innings : "<<player[Player_no].ba_innings<<endl;
          cout<<"Age : "<<player[Player_no].ba_age<<endl;
          cout<<"Wickets : "<<player[Player_no].ba_wicket<<endl;
          player[Player_no].ball_wicket_average(player[Player_no].ba_wicket,player[Player_no].ba_runs);
          cout<<"Wicket Average : "<<player[Player_no].ba_wicket_average;
          player[Player_no].economy(player[Player_no].ba_runs);
          cout<<"Economy : "<<player[Player_no].ba_economy;
      }
      else if(type=="All-rounder"){
           cout<<"Batsmen Name : "<<player[Player_no].bt_name<<endl;
          cout<<"Team : "<<player[Player_no].team_name<<endl;
          cout<<"Runs : "<<player[Player_no].bt_runs<<endl;
          cout<<"Innings as Batsmen : "<<player[Player_no].bt_innings<<endl;
          cout<<"Age : "<<player[Player_no].bt_age<<endl;
          cout<<"Strike Rate : ";
          cout<<player[Player_no].bat_strike_rate(player[Player_no].bt_balls_faced,player[Player_no].bt_runs)<<endl;
          cout<<"Batting average : ";
          cout<<player[Player_no].bat_average(player[Player_no].bt_innings,player[Player_no].bt_runs)<<endl;
          cout<<"Innings as Baller : "<<player[Player_no].ba_innings<<endl;
          cout<<"Wickets : "<<player[Player_no].ba_wicket;
           player[Player_no].economy(player[Player_no].ba_runs);
          cout<<"Economy : "<<player[Player_no].ba_economy;
      }
  }
};  
int main()
{
    profile p;
    int total_player;
    cout<< "Enter the number of players of whom you want to create a profile"<<endl;
    cin>>total_player;
    for(int Player=0;Player<total_player;Player++){
    p.Profile(Player);
    p.profile_disp(Player);
    }
    return 0;
}
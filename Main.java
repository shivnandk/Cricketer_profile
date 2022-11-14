import java.util.*;
class Batsmen{
    int runs,ballsfaced;
    String batsmenName;
    public int runs(int run){
        this.runs=runs+run;
        return runs;
    }
    public String Name(String Name){
        this.batsmenName=Name;
        return batsmenName;
    }
    public int ballsfaced(){
        ballsfaced=ballsfaced+1;
        return ballsfaced;
    }
}
class Baller{
    int balls,overs,runs,wickets;
    String ballerName;
    public int runsANDball(int run){
        this.runs=runs+run;
        balls=balls+1;
        return runs;
    }
    public double Economy(int runs){
        double economy=runs/6.0;
        return economy;
    }
    public int wicket(){
        wickets= wickets+1;
        return wickets;
    }
    public double Overs(int balls)
    {
        int overs=balls/6;
        int ball=balls%6;
        String Over=overs+"."+ball;
        double d=Double.parseDouble(Over);
        return d;
    }
    public String BallerName(String name){
        this.ballerName=name;
        return ballerName;
    }
}
class Team{
    String Name;
    int Runs,Twicket,balls;
    public String teamName(String name){
        this.Name=name;
        return Name;
    }
    public int runs(int runs){
        this.Runs=runs+Runs;
        balls=balls+1;
        return Runs;
    }
    public int Twicket()
    {
        Twicket=Twicket+1;
        return Twicket;
    }
    public double Tover(int balls)
    {
        int overs=balls/6;
        int ball=balls%6;
        String Over=overs+"."+ball;
        double d=Double.parseDouble(Over);
        return d;
    }
}
class GamePlay{
    GamePlay(){
        Scanner scan = new Scanner(System.in);
        Team t1 = new Team();
        Team t2 = new Team();
        Batsmen player[] = new Batsmen[22];
        Baller baller[] = new Baller[11];
        int batsmenNo1=0;
        int batsmenNo2=1;
        int ballerNo=0;
        player[batsmenNo1]=new Batsmen();
        player[batsmenNo2]=new Batsmen();
        System.out.println("Enter the team names");
        t1.teamName(t1.Name=scan.nextLine());
        t2.teamName(t2.Name=scan.nextLine());
        System.out.println(t1.Name+" VS "+t2.Name);
        System.out.println("Enter the name of the Batsmen whose going to take the strike");
        player[batsmenNo1].Name(player[batsmenNo1].batsmenName=scan.nextLine());
        System.out.println("Enter the name of the Batsmen who  is at non striker end");
        player[batsmenNo2].Name(player[batsmenNo2].batsmenName=scan.nextLine());
        System.out.println("Enter the 6 baller name");
        for(ballerNo=0;ballerNo<6;ballerNo++){
            baller[ballerNo]= new Baller();
            System.out.println("Enter baller no"+(ballerNo+1));
            baller[ballerNo].BallerName(baller[ballerNo].ballerName=scan.nextLine());
        }
        ballerNo=0;
        int Flag=1;

        for(int ball=1;ball<=30;ball++)
        {   System.out.println("Enter what happened on the next ball");
            String hit =scan.nextLine();
            switch(hit)
            {   case "0":if(Flag==1)
            {
                System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs(Integer.parseInt(hit))+"("+player[batsmenNo1].ballsfaced()+")");
                System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced+")");
                System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                System.out.println("Overs-"+t1.Tover(t1.balls));
                System.out.println("Batsmen hit the ball for 0");
                if(ball%6==0)
                {
                    Flag=2;
                }
                break;
            }
                if(Flag==2)
                {
                    System.out.println(t1.Name+" VS "+t2.Name);
                    System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                    System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced+")");
                    System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs(Integer.parseInt(hit))+"("+player[batsmenNo2].ballsfaced()+")");
                    System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                    System.out.println("Overs-"+t1.Tover(t1.balls));
                    System.out.println("Batsmen hit the ball for 2");
                    if(ball%6==0)
                    {
                        Flag=1;
                    }
                    break;
                }
                case "1":
                    if(Flag==1)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs(Integer.parseInt(hit))+"("+player[batsmenNo1].ballsfaced()+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for a single");

                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=2;
                        }
                        System.out.println(Flag);
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name);
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs(Integer.parseInt(hit))+"("+player[batsmenNo2].ballsfaced()+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for a single");
                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=1;
                        }
                        if(ball%6==0)
                        {
                            System.out.println(ball);
                            if(Flag==1){
                                Flag=2;
                            }
                            else
                            {
                                Flag=1;
                            }

                            System.out.println(Flag);
                        }
                    }
                    System.out.println(Flag);
                    break;
                case "2":
                    if(Flag==1)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs(Integer.parseInt(hit))+"("+player[batsmenNo1].ballsfaced()+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 2");
                        if(ball%6==0)
                        {
                            Flag=2;
                        }
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name);
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs(Integer.parseInt(hit))+"("+player[batsmenNo2].ballsfaced()+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 2");
                        if(ball%6==0)
                        {
                            Flag=1;
                        }
                        break;
                    }
                case "3":
                    if(Flag==1)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs(Integer.parseInt(hit))+"("+player[batsmenNo1].ballsfaced()+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 3");

                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=2;
                        }
                        System.out.println(Flag);
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name);
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs(Integer.parseInt(hit))+"("+player[batsmenNo2].ballsfaced()+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 3");
                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=1;
                        }
                        if(ball%6==0)
                        {
                            System.out.println(ball);
                            if(Flag==1){
                                Flag=2;
                            }
                            else
                            {
                                Flag=1;
                            }
                            System.out.println(Flag);
                        }
                    }
                    System.out.println(Flag);
                    break;
                case "4":
                    if(Flag==1)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs(Integer.parseInt(hit))+"("+player[batsmenNo1].ballsfaced()+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 4");
                        if(ball%6==0)
                        {
                            Flag=2;
                        }
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name);
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs(Integer.parseInt(hit))+"("+player[batsmenNo2].ballsfaced()+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 4");
                        if(ball%6==0)
                        {
                            Flag=1;
                        }
                        break;
                    }

                case "6":if(Flag==1)
                {
                    System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                    System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs(Integer.parseInt(hit))+"("+player[batsmenNo1].ballsfaced()+")");
                    System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced+")");
                    System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                    System.out.println("Overs-"+t1.Tover(t1.balls));
                    System.out.println("Batsmen hit the ball for 6");
                    if(ball%6==0)
                    {
                        Flag=2;
                    }
                    break;
                }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name);
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs(Integer.parseInt(hit))+"("+player[batsmenNo2].ballsfaced()+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wickets+"-"+baller[ballerNo].runsANDball(Integer.parseInt(hit))+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 6");
                        if(ball%6==0)
                        {
                            Flag=1;
                        }
                        break;
                    }
                case "W":
                    if(Flag==1)
                    {
                        System.out.println("Enter the name of the new Batsmen");
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.Runs+"-"+t1.Twicket()+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced()+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wicket()+"-"+baller[ballerNo].runsANDball(0)+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for w");
                        batsmenNo1=batsmenNo1+2;
                        player[batsmenNo1]= new Batsmen();
                        System.out.println("Enter the new batsmen name:");
                        player[batsmenNo1].Name(player[batsmenNo1].batsmenName=scan.nextLine());
                        if(ball%6==0)
                        {
                            Flag=2;
                        }
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name);
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.Runs+"-"+t1.Twicket()+"]");
                        System.out.println(player[batsmenNo1].batsmenName+" "+player[batsmenNo1].runs+"("+player[batsmenNo1].ballsfaced+")");
                        System.out.println(player[batsmenNo2].batsmenName+" "+player[batsmenNo2].runs+"("+player[batsmenNo2].ballsfaced()+")");
                        System.out.println(baller[ballerNo].ballerName+" "+baller[ballerNo].wicket()+"-"+baller[ballerNo].runsANDball(0)+" "+baller[ballerNo].Overs(baller[ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for w");
                        batsmenNo2=batsmenNo2+2;
                        player[batsmenNo2]=new Batsmen();
                        System.out.println("Enter the new batsmen ghhh name:");
                        player[batsmenNo2].Name(player[batsmenNo2].batsmenName=scan.nextLine());
                        if(ball%6==0)
                        {
                            Flag=1;
                        }
                        break;
                    }

            }
            if(ball%6==0)
            {
                if(ball==30)
                {
                    break;
                }
                System.out.print("Available ballers\nPress:\n");
                for(int balling=0;balling<6;balling++)
                {
                    System.out.println(balling+1+" "+baller[balling].ballerName);
                }
                ballerNo=scan.nextInt();
                scan.nextLine();
                ballerNo=ballerNo-1;
            }
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        GamePlay g = new GamePlay();
    }
}
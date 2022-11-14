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
    int Runs,Twicket,balls,Target;
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
        Batsmen t1player[] = new Batsmen[22];
        Baller t2baller[] = new Baller[11];
        int t1BatsmenNo1=0;
        int t1BatsmenNo2=1;
        int t2ballerNo=0;
        t1player[t1BatsmenNo1]=new Batsmen();
        t1player[t1BatsmenNo2]=new Batsmen();
        System.out.println("Enter the team names");
        t1.teamName(t1.Name=scan.nextLine());
        t2.teamName(t2.Name=scan.nextLine());
        
        System.out.println("Enter the name of the Batsmen whose going to take the strike");
        t1player[t1BatsmenNo1].Name(t1player[t1BatsmenNo1].batsmenName=scan.nextLine());
        System.out.println("Enter the name of the Batsmen who  is at non striker end");
        t1player[t1BatsmenNo2].Name(t1player[t1BatsmenNo2].batsmenName=scan.nextLine());
        System.out.println("Enter the 6 baller name");
        for(t2ballerNo=0;t2ballerNo<6;t2ballerNo++){
            t2baller[t2ballerNo]= new Baller();
            System.out.println("Enter baller no"+(t2ballerNo+1));
            t2baller[t2ballerNo].BallerName(t2baller[t2ballerNo].ballerName=scan.nextLine());
        }
        t2ballerNo=0;
        int Flag=1;
        
        for(int ball=1;ball<=30;ball++)
        {   System.out.println("Enter what happened on the next ball");
            String hit =scan.nextLine();
            switch(hit)
            {   case "0":if(Flag==1)
            {
                System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                System.out.println("Overs-"+t1.Tover(t1.balls));
                System.out.println("Ohhh its a dot ball");
                if(ball%6==0)
                {
                    Flag=2;
                }
                break;
            }
                if(Flag==2)
                {
                    System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                    System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced+")");
                    System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                    System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                    System.out.println("Overs-"+t1.Tover(t1.balls));
                    System.out.println("Ohhh its a dot ball");
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
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for a single");

                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=2;
                        }
                        
                        break;
                    }
                    if(Flag==2)
                    {
                        
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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

                            
                        }
                    }
                    break;
                case "2":
                    if(Flag==1)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 3");

                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=2;
                        }
                        
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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
                            
                        }
                    }
                    
                    break;
                case "4":
                    if(Flag==1)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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
                    System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                    System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                    System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(0)+"-"+t1.Twicket()+"]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+" "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wicket()+"-"+t2baller[t2ballerNo].runsANDball(0)+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for w");
                        t1BatsmenNo1=t1BatsmenNo1+2;
                        t1player[t1BatsmenNo1]= new Batsmen();
                        System.out.println("Enter the new batsmen name:");
                        t1player[t1BatsmenNo1].Name(t1player[t1BatsmenNo1].batsmenName=scan.nextLine());
                        if(ball%6==0)
                        {
                            Flag=2;
                        }
                        break;
                    }
                    if(Flag==2) {
                        System.out.println(t1.Name + " VS " + t2.Name);
                        System.out.println(t1.Name + " VS " + t2.Name + " " + "[" + t1.runs(0) + "-" + t1.Twicket() + "]");
                        System.out.println(t1player[t1BatsmenNo1].batsmenName + " " + t1player[t1BatsmenNo1].runs + "(" + t1player[t1BatsmenNo1].ballsfaced + ")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName + " " + t1player[t1BatsmenNo2].runs + "(" + t1player[t1BatsmenNo2].ballsfaced() + ")");
                        System.out.println(t2baller[t2ballerNo].ballerName + " " + t2baller[t2ballerNo].wicket() + "-" + t2baller[t2ballerNo].runsANDball(0) + " " + t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-" + t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for w");
                        t1BatsmenNo2 = t1BatsmenNo2 + 2;
                        t1player[t1BatsmenNo2] = new Batsmen();
                        System.out.println("Enter the new batsmen ghhh name:");
                        t1player[t1BatsmenNo2].Name(t1player[t1BatsmenNo2].batsmenName = scan.nextLine());
                        if (ball % 6 == 0) {
                            Flag = 1;
                        }
                        break;
                    }
            }
            if(ball%6==0)
            {
                if(ball==30)
                {
                    t2.Target=t1.Runs+1;
                    System.out.println("So the target is: "+t2.Target);
                    break;
                }
                System.out.print("Available ballers\nPress:\n");
                for(int balling=0;balling<6;balling++)
                {
                    System.out.println(balling+1+" "+t2baller[balling].ballerName);
                }
                t2ballerNo=scan.nextInt();
                scan.nextLine();
                t2ballerNo=t2ballerNo-1;
            }
        }
        System.out.println("II innings start");
        
    }

}

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        GamePlay g1 = new GamePlay();
    }
}
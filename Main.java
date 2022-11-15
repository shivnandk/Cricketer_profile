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
                System.out.println(t1player[t1BatsmenNo1].batsmenName+"* "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
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
                    System.out.println(t1player[t1BatsmenNo2].batsmenName+"* "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
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
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+"* "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
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
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+"* "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for a single");
                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=1;
                        }
                        if(ball%6==0)
                        {
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
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+"* "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Batsmen hit the ball for 2 through covers");
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
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+"* "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Nicely driven for 2");
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
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+"* "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println(" A beauiful on drive for 3 runs");

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
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+"* "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Its a scoop shot over wicket keepers head for 3 runs");
                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=1;
                        }
                        if(ball%6==0)
                        {
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
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+"* "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("A beautiful covers drive for 4 runs");
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
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+"* "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("It's a straight drive for 4 runs");
                        if(ball%6==0)
                        {
                            Flag=1;
                        }
                        break;
                    }

                case "6":if(Flag==1)
                {
                    System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t1.runs(Integer.parseInt(hit))+"-"+t1.Twicket+"]");
                    System.out.println(t1player[t1BatsmenNo1].batsmenName+"* "+t1player[t1BatsmenNo1].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                    System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                    System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                    System.out.println("Overs-"+t1.Tover(t1.balls));
                    System.out.println("Nicely pulled away for 6 runs over fielders head");
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
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+"* "+t1player[t1BatsmenNo2].runs(Integer.parseInt(hit))+"("+t1player[t1BatsmenNo2].ballsfaced()+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wickets+"-"+t2baller[t2ballerNo].runsANDball(Integer.parseInt(hit))+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("OHHHHHH its a cover drive for 6!");
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
                        System.out.println(t1player[t1BatsmenNo1].batsmenName+"W "+t1player[t1BatsmenNo1].runs+"("+t1player[t1BatsmenNo1].ballsfaced()+")");
                        System.out.println(t1player[t1BatsmenNo2].batsmenName+" "+t1player[t1BatsmenNo2].runs+"("+t1player[t1BatsmenNo2].ballsfaced+")");
                        System.out.println(t2baller[t2ballerNo].ballerName+" "+t2baller[t2ballerNo].wicket()+"-"+t2baller[t2ballerNo].runsANDball(0)+" "+t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-"+t1.Tover(t1.balls));
                        System.out.println("Beautiful in swinger for a W!");
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
                        System.out.println(t1player[t1BatsmenNo2].batsmenName + "W " + t1player[t1BatsmenNo2].runs + "(" + t1player[t1BatsmenNo2].ballsfaced() + ")");
                        System.out.println(t2baller[t2ballerNo].ballerName + " " + t2baller[t2ballerNo].wicket() + "-" + t2baller[t2ballerNo].runsANDball(0) + " " + t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls));
                        System.out.println("Overs-" + t1.Tover(t1.balls));
                        System.out.println("Its a toe Crusher yorker");
                        t1BatsmenNo2 = t1BatsmenNo2 + 2;
                        t1player[t1BatsmenNo2] = new Batsmen();
                        System.out.println("Enter the new batsmen ghhh name:");
                        t1player[t1BatsmenNo2].Name(t1player[t1BatsmenNo2].batsmenName = scan.nextLine());
                        if (ball % 6 == 0) {
                            Flag = 1;
                        }
                        break;
                    }
                default: {
                    System.out.println("invalid input");
                    ball--;
                }
            }
            if(t1.Twicket==10)
            {
                t2.Target=t1.Runs+1;
                System.out.println("So the target is: "+t2.Target);
                break;
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
        Batsmen t2player[] = new Batsmen[22];
        Baller t1baller[] = new Baller[11];
        int t2BatsmenNo1=0;
        int t2BatsmenNo2=1;
        int t1ballerNo=0;
        t2player[t2BatsmenNo1]=new Batsmen();
        t2player[t2BatsmenNo2]=new Batsmen();
        System.out.println(t1.Name+" VS "+t2.Name);
        System.out.println("Enter the name of the Batsmen whose going to take the strike");
        t2player[t2BatsmenNo1].Name(t2player[t2BatsmenNo1].batsmenName=scan.nextLine());
        System.out.println("Enter the name of the Batsmen who  is at non striker end");
        t2player[t2BatsmenNo2].Name(t2player[t2BatsmenNo2].batsmenName=scan.nextLine());
        System.out.println("Enter the 6 baller name");
        for(t1ballerNo=0;t1ballerNo<6;t1ballerNo++){
            t1baller[t1ballerNo]= new Baller();
            System.out.println("Enter baller no"+(t1ballerNo+1));
            t1baller[t1ballerNo].BallerName(t1baller[t1ballerNo].ballerName=scan.nextLine());
        }
        t1ballerNo=0;
        Flag=1;

        for(int ball=1;ball<=30;ball++)
        {   System.out.println("Enter what happened on the next ball");
            String hit =scan.nextLine();
            System.out.println("Target-"+t2.Target);
            switch(hit)
            {   case "0":if(Flag==1)
            {
                System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                System.out.println(t2player[t2BatsmenNo1].batsmenName+"* "+t2player[t2BatsmenNo1].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo1].ballsfaced()+")");
                System.out.println(t2player[t2BatsmenNo2].batsmenName+" "+t2player[t2BatsmenNo2].runs+"("+t2player[t2BatsmenNo2].ballsfaced+")");
                System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                System.out.println("Overs-"+t2.Tover(t2.balls));
                System.out.println("Ohhh its a dot ball");
                if(ball%6==0)
                {
                    Flag=2;
                }
                break;
            }
                if(Flag==2)
                {
                    System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                    System.out.println(t2player[t2BatsmenNo1].batsmenName+" "+t2player[t2BatsmenNo1].runs+"("+t2player[t2BatsmenNo1].ballsfaced+")");
                    System.out.println(t2player[t2BatsmenNo2].batsmenName+"* "+t2player[t2BatsmenNo2].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo2].ballsfaced()+")");
                    System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                    System.out.println("Overs-"+t2.Tover(t2.balls));
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+"* "+t2player[t2BatsmenNo1].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo1].ballsfaced()+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+" "+t2player[t2BatsmenNo2].runs+"("+t2player[t2BatsmenNo2].ballsfaced+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("Batsmen hit the ball for a single");

                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=2;
                        }

                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+" "+t2player[t2BatsmenNo1].runs+"("+t2player[t2BatsmenNo1].ballsfaced+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+"* "+t2player[t2BatsmenNo2].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo2].ballsfaced()+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("Batsmen hit the ball for a single");
                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=1;
                        }
                        if(ball%6==0)
                        {
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+"* "+t2player[t2BatsmenNo1].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo1].ballsfaced()+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+" "+t2player[t2BatsmenNo2].runs+"("+t2player[t2BatsmenNo2].ballsfaced+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("it's a cut shot");
                        if(ball%6==0)
                        {
                            Flag=2;
                        }
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+" "+t2player[t2BatsmenNo1].runs+"("+t2player[t2BatsmenNo1].ballsfaced+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+"* "+t2player[t2BatsmenNo2].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo2].ballsfaced()+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("2 more runs through mid on");
                        if(ball%6==0)
                        {
                            Flag=1;
                        }
                        break;
                    }
                case "3":
                    if(Flag==1)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+"* "+t2player[t2BatsmenNo1].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo1].ballsfaced()+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+" "+t2player[t2BatsmenNo2].runs+"("+t2player[t2BatsmenNo2].ballsfaced+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("Nicely cut away for 3 runs");

                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=2;
                        }

                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+" "+t2player[t2BatsmenNo1].runs+"("+t2player[t2BatsmenNo1].ballsfaced+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+"* "+t2player[t2BatsmenNo2].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo2].ballsfaced()+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("Nicely driven for 3 between 2 fielders");
                        if(Integer.parseInt(hit)%2!=0)
                        {
                            Flag=1;
                        }
                        if(ball%6==0)
                        {
                            
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+"* "+t2player[t2BatsmenNo1].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo1].ballsfaced()+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+" "+t2player[t2BatsmenNo2].runs+"("+t2player[t2BatsmenNo2].ballsfaced+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("It's a square drive for 4 runs");
                        if(ball%6==0)
                        {
                            Flag=2;
                        }
                        break;
                    }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+" "+t2player[t2BatsmenNo1].runs+"("+t2player[t2BatsmenNo1].ballsfaced+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+"* "+t2player[t2BatsmenNo2].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo2].ballsfaced()+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("A fabulous scoop shot  for 4 runs");
                        if(ball%6==0)
                        {
                            Flag=1;
                        }
                        break;
                    }

                case "6":if(Flag==1)
                {
                    System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                    System.out.println(t2player[t2BatsmenNo1].batsmenName+"* "+t2player[t2BatsmenNo1].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo1].ballsfaced()+")");
                    System.out.println(t2player[t2BatsmenNo2].batsmenName+" "+t2player[t2BatsmenNo2].runs+"("+t2player[t2BatsmenNo2].ballsfaced+")");
                    System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                    System.out.println("Overs-"+t2.Tover(t2.balls));
                    System.out.println("Hammered away for 6 runs");
                    if(ball%6==0)
                    {
                        Flag=2;
                    }
                    break;
                }
                    if(Flag==2)
                    {
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(Integer.parseInt(hit))+"-"+t2.Twicket+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+" "+t2player[t2BatsmenNo1].runs+"("+t2player[t2BatsmenNo1].ballsfaced+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+"* "+t2player[t2BatsmenNo2].runs(Integer.parseInt(hit))+"("+t2player[t2BatsmenNo2].ballsfaced()+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wickets+"-"+t1baller[t1ballerNo].runsANDball(Integer.parseInt(hit))+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("What a cheeky shot for 6 runs");
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
                        System.out.println(t1.Name+" VS "+t2.Name+" "+"["+t2.runs(0)+"-"+t2.Twicket()+"]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName+"W "+t2player[t2BatsmenNo1].runs+"("+t2player[t2BatsmenNo1].ballsfaced()+")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName+" "+t2player[t2BatsmenNo2].runs+"("+t2player[t2BatsmenNo2].ballsfaced+")");
                        System.out.println(t1baller[t1ballerNo].ballerName+" "+t1baller[t1ballerNo].wicket()+"-"+t1baller[t1ballerNo].runsANDball(0)+" "+t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-"+t2.Tover(t2.balls));
                        System.out.println("Its a bouncer and fielder manage to catch it W!");
                        t2BatsmenNo1=t2BatsmenNo1+2;
                        t2player[t2BatsmenNo1]= new Batsmen();
                        System.out.println("Enter the new batsmen name:");
                        t2player[t2BatsmenNo1].Name(t2player[t2BatsmenNo1].batsmenName=scan.nextLine());
                        if(ball%6==0)
                        {
                            Flag=2;
                        }
                        break;
                    }
                    if(Flag==2) {
                        System.out.println(t1.Name + " VS " + t2.Name + " " + "[" + t2.runs(0) + "-" + t2.Twicket() + "]");
                        System.out.println(t2player[t2BatsmenNo1].batsmenName + " " + t2player[t2BatsmenNo1].runs + "(" + t2player[t2BatsmenNo1].ballsfaced + ")");
                        System.out.println(t2player[t2BatsmenNo2].batsmenName + "W " + t2player[t2BatsmenNo2].runs + "(" + t2player[t2BatsmenNo2].ballsfaced() + ")");
                        System.out.println(t1baller[t1ballerNo].ballerName + " " + t1baller[t1ballerNo].wicket() + "-" + t1baller[t1ballerNo].runsANDball(0) + " " + t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls));
                        System.out.println("Overs-" + t2.Tover(t2.balls));
                        System.out.println("Its a Lose shot by batsman he Loses his W!");
                        t2BatsmenNo2 = t2BatsmenNo2 + 2;
                        t2player[t2BatsmenNo2] = new Batsmen();
                        System.out.println("Enter the new batsmen name:");
                        t2player[t2BatsmenNo2].Name(t2player[t2BatsmenNo2].batsmenName = scan.nextLine());
                        if (ball % 6 == 0) {
                            Flag = 1;
                        }
                        break;
                    }
                default:{
                        System.out.println("Invalid input");
                        ball--;
                }
            }
            if(t2.Twicket==10)
            {
                System.out.println(t2.Name+" lose by "+(t2.Target-t2.Runs-1));
                break;
            }
            if(t2.Target<t2.Runs)
            {
                System.out.println(t2.Name+" won by "+(10-t2.Twicket));
                break;
            }
            if(ball%6==0)
            {
                if(ball==30&&t2.Target<t2.Runs)
                {
                    System.out.println(t2.Name+" won by "+(10-t2.Twicket));
                    break;
                }
                System.out.print("Available ballers\nPress:\n");
                for(int balling=0;balling<6;balling++)
                {
                    System.out.println(balling+1+" "+t1baller[balling].ballerName);
                }
                t1ballerNo=scan.nextInt();
                scan.nextLine();
                t1ballerNo=t1ballerNo-1;
            }
        }
    }

}

public class Main
{
    public static void main(String[] args) {

        GamePlay g1 = new GamePlay();
    }
}
class Batsmen :
    runs = 0
    ballsfaced = 0
    batsmenName = None
    def  runs(self, run) :
        self.runs = self.runs + run
        return self.runs
    def  Name(self, Name) :
        self.batsmenName = Name
        return self.batsmenName
    def  ballsfaced(self) :
        self.ballsfaced = self.ballsfaced + 1
        return self.ballsfaced
class Baller :
    balls = 0
    overs = 0
    runs = 0
    wickets = 0
    ballerName = None
    def  runsANDball(self, run) :
        self.runs = self.runs + run
        self.balls = self.balls + 1
        return self.runs
    def  Economy(self, runs) :
        economy = runs / 6.0
        return economy
    def  wicket(self) :
        self.wickets = self.wickets + 1
        return self.wickets
    def  Overs(self, balls) :
        overs = int(balls / 6)
        ball = balls % 6
        Over = str(overs) + "." + str(ball)
        d = float(Over)
        return d
    def  BallerName(self, name) :
        self.ballerName = name
        return self.ballerName
class Team :
    Name = None
    Runs = 0
    Twicket = 0
    balls = 0
    Target = 0
    def  teamName(self, name) :
        self.Name = name
        return self.Name
    def  runs(self, runs) :
        self.Runs = runs + self.Runs
        self.balls = self.balls + 1
        return self.Runs
    def  Twicket(self) :
        self.Twicket = self.Twicket + 1
        return self.Twicket
    def  Tover(self, balls) :
        overs = int(balls / 6)
        ball = balls % 6
        Over = str(overs) + "." + str(ball)
        d = float(Over)
        return d
class GamePlay :
    def __init__(self) :
        scan =  "Python-inputs"
        t1 = Team()
        t2 = Team()
        t1player = [None] * (22)
        t2baller = [None] * (11)
        t1BatsmenNo1 = 0
        t1BatsmenNo2 = 1
        t2ballerNo = 0
        t1player[t1BatsmenNo1] = Batsmen()
        t1player[t1BatsmenNo2] = Batsmen()
        print("Enter the team names")
        t1.teamName()
        t1.Name = input()
        t2.teamName()
        t2.Name = input()
        print("Enter the name of the Batsmen whose going to take the strike")
        t1player[t1BatsmenNo1].Name()
        t1player[t1BatsmenNo1].batsmenName = input()
        print("Enter the name of the Batsmen who  is at non striker end")
        t1player[t1BatsmenNo2].Name()
        t1player[t1BatsmenNo2].batsmenName = input()
        print("Enter the 6 baller name")
        t2ballerNo = 0
        while (t2ballerNo < 6) :
            t2baller[t2ballerNo] = Baller()
            print("Enter baller no" + str((t2ballerNo + 1)))
            t2baller[t2ballerNo].BallerName()
            t2baller[t2ballerNo].ballerName = input()
            t2ballerNo += 1
        t2ballerNo = 0
        Flag = 1
        ball = 1
        while (ball <= 30) :
            print("Enter what happened on the next ball")
            hit = input()
            if (hit=="0"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + "* " + str(t1player[t1BatsmenNo1].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo1].ballsfaced()) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + " " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Ohhh its a dot ball")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + " " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + "* " + str(t1player[t1BatsmenNo2].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo2].ballsfaced()) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Ohhh its a dot ball")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="1"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + "* " + str(t1player[t1BatsmenNo1].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo1].ballsfaced()) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + " " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Batsmen hit the ball for a single")
                    if (int(hit) % 2 != 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + " " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + "* " + str(t1player[t1BatsmenNo2].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo2].ballsfaced()) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Batsmen hit the ball for a single")
                    if (int(hit) % 2 != 0) :
                        Flag = 1
                    if (ball % 6 == 0) :
                        if (Flag == 1) :
                            Flag = 2
                        else :
                            Flag = 1
            elif(hit=="2"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + "* " + str(t1player[t1BatsmenNo1].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo1].ballsfaced()) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + " " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Batsmen hit the ball for 2 through covers")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + " " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + "* " + str(t1player[t1BatsmenNo2].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo2].ballsfaced()) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Nicely driven for 2")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="3"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + "* " + str(t1player[t1BatsmenNo1].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo1].ballsfaced()) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + " " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print(" A beauiful on drive for 3 runs")
                    if (int(hit) % 2 != 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + " " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + "* " + str(t1player[t1BatsmenNo2].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo2].ballsfaced()) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Its a scoop shot over wicket keepers head for 3 runs")
                    if (int(hit) % 2 != 0) :
                        Flag = 1
                    if (ball % 6 == 0) :
                        if (Flag == 1) :
                            Flag = 2
                        else :
                            Flag = 1
            elif(hit=="4"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + "* " + str(t1player[t1BatsmenNo1].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo1].ballsfaced()) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + " " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("A beautiful covers drive for 4 runs")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + " " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + "* " + str(t1player[t1BatsmenNo2].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo2].ballsfaced()) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("It\'s a straight drive for 4 runs")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="6"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + "* " + str(t1player[t1BatsmenNo1].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo1].ballsfaced()) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + " " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Nicely pulled away for 6 runs over fielders head")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(int(hit))) + "-" + str(t1.Twicket) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + " " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + "* " + str(t1player[t1BatsmenNo2].runs(int(hit))) + "(" + str(t1player[t1BatsmenNo2].ballsfaced()) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wickets) + "-" + str(t2baller[t2ballerNo].runsANDball(int(hit))) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("OHHHHHH its a cover drive for 6!")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="W"):
                if (Flag == 1) :
                    print("Enter the name of the new Batsmen")
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(0)) + "-" + str(t1.Twicket()) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + "W " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced()) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + " " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wicket()) + "-" + str(t2baller[t2ballerNo].runsANDball(0)) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Beautiful in swinger for a W!")
                    t1BatsmenNo1 = t1BatsmenNo1 + 2
                    t1player[t1BatsmenNo1] = Batsmen()
                    print("Enter the new batsmen name:")
                    t1player[t1BatsmenNo1].Name()
                    t1player[t1BatsmenNo1].batsmenName = input()
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name)
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t1.runs(0)) + "-" + str(t1.Twicket()) + "]")
                    print(t1player[t1BatsmenNo1].batsmenName + " " + str(t1player[t1BatsmenNo1].runs) + "(" + str(t1player[t1BatsmenNo1].ballsfaced) + ")")
                    print(t1player[t1BatsmenNo2].batsmenName + "W " + str(t1player[t1BatsmenNo2].runs) + "(" + str(t1player[t1BatsmenNo2].ballsfaced()) + ")")
                    print(t2baller[t2ballerNo].ballerName + " " + str(t2baller[t2ballerNo].wicket()) + "-" + str(t2baller[t2ballerNo].runsANDball(0)) + " " + str(t2baller[t2ballerNo].Overs(t2baller[t2ballerNo].balls)))
                    print("Overs-" + str(t1.Tover(t1.balls)))
                    print("Its a toe Crusher yorker")
                    t1BatsmenNo2 = t1BatsmenNo2 + 2
                    t1player[t1BatsmenNo2] = Batsmen()
                    print("Enter the new batsmen ghhh name:")
                    t1player[t1BatsmenNo2].Name()
                    t1player[t1BatsmenNo2].batsmenName = input()
                    if (ball % 6 == 0) :
                        Flag = 1
            else:
                print("invalid input")
                ball -= 1
            if (t1.Twicket == 10) :
                t2.Target = t1.Runs + 1
                print("So the target is: " + str(t2.Target))
                break
            if (ball % 6 == 0) :
                if (ball == 30) :
                    t2.Target = t1.Runs + 1
                    print("So the target is: " + str(t2.Target))
                    break
                print("Available ballers\nPress:\n", end ="")
                balling = 0
                while (balling < 6) :
                    print(str(balling + 1) + " " + t2baller[balling].ballerName)
                    balling += 1
                t2ballerNo = input()
                input()
                t2ballerNo = t2ballerNo - 1
            ball += 1
        print("II innings start")
        t2player = [None] * (22)
        t1baller = [None] * (11)
        t2BatsmenNo1 = 0
        t2BatsmenNo2 = 1
        t1ballerNo = 0
        t2player[t2BatsmenNo1] = Batsmen()
        t2player[t2BatsmenNo2] = Batsmen()
        print(t1.Name + " VS " + t2.Name)
        print("Enter the name of the Batsmen whose going to take the strike")
        t2player[t2BatsmenNo1].Name()
        t2player[t2BatsmenNo1].batsmenName = input()
        print("Enter the name of the Batsmen who  is at non striker end")
        t2player[t2BatsmenNo2].Name()
        t2player[t2BatsmenNo2].batsmenName = input()
        print("Enter the 6 baller name")
        t1ballerNo = 0
        while (t1ballerNo < 6) :
            t1baller[t1ballerNo] = Baller()
            print("Enter baller no" + str((t1ballerNo + 1)))
            t1baller[t1ballerNo].BallerName()
            t1baller[t1ballerNo].ballerName = input()
            t1ballerNo += 1
        t1ballerNo = 0
        Flag = 1
        ball = 1
        while (ball <= 30) :
            print("Enter what happened on the next ball")
            hit = input()
            print("Target-" + str(t2.Target))
            if (hit=="0"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + "* " + str(t2player[t2BatsmenNo1].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo1].ballsfaced()) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + " " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Ohhh its a dot ball")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + " " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + "* " + str(t2player[t2BatsmenNo2].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo2].ballsfaced()) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Ohhh its a dot ball")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="1"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + "* " + str(t2player[t2BatsmenNo1].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo1].ballsfaced()) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + " " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Batsmen hit the ball for a single")
                    if (int(hit) % 2 != 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + " " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + "* " + str(t2player[t2BatsmenNo2].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo2].ballsfaced()) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Batsmen hit the ball for a single")
                    if (int(hit) % 2 != 0) :
                        Flag = 1
                    if (ball % 6 == 0) :
                        if (Flag == 1) :
                            Flag = 2
                        else :
                            Flag = 1
            elif(hit=="2"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + "* " + str(t2player[t2BatsmenNo1].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo1].ballsfaced()) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + " " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("it\'s a cut shot")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + " " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + "* " + str(t2player[t2BatsmenNo2].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo2].ballsfaced()) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("2 more runs through mid on")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="3"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + "* " + str(t2player[t2BatsmenNo1].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo1].ballsfaced()) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + " " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Nicely cut away for 3 runs")
                    if (int(hit) % 2 != 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + " " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + "* " + str(t2player[t2BatsmenNo2].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo2].ballsfaced()) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Nicely driven for 3 between 2 fielders")
                    if (int(hit) % 2 != 0) :
                        Flag = 1
                    if (ball % 6 == 0) :
                        if (Flag == 1) :
                            Flag = 2
                        else :
                            Flag = 1
            elif(hit=="4"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + "* " + str(t2player[t2BatsmenNo1].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo1].ballsfaced()) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + " " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("It\'s a square drive for 4 runs")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + " " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + "* " + str(t2player[t2BatsmenNo2].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo2].ballsfaced()) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("A fabulous scoop shot  for 4 runs")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="6"):
                if (Flag == 1) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + "* " + str(t2player[t2BatsmenNo1].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo1].ballsfaced()) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + " " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Hammered away for 6 runs")
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(int(hit))) + "-" + str(t2.Twicket) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + " " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + "* " + str(t2player[t2BatsmenNo2].runs(int(hit))) + "(" + str(t2player[t2BatsmenNo2].ballsfaced()) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wickets) + "-" + str(t1baller[t1ballerNo].runsANDball(int(hit))) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("What a cheeky shot for 6 runs")
                    if (ball % 6 == 0) :
                        Flag = 1
            elif(hit=="W"):
                if (Flag == 1) :
                    print("Enter the name of the new Batsmen")
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(0)) + "-" + str(t2.Twicket()) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + "W " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced()) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + " " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wicket()) + "-" + str(t1baller[t1ballerNo].runsANDball(0)) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Its a bouncer and fielder manage to catch it W!")
                    t2BatsmenNo1 = t2BatsmenNo1 + 2
                    t2player[t2BatsmenNo1] = Batsmen()
                    print("Enter the new batsmen name:")
                    t2player[t2BatsmenNo1].Name()
                    t2player[t2BatsmenNo1].batsmenName = input()
                    if (ball % 6 == 0) :
                        Flag = 2
                if (Flag == 2) :
                    print(t1.Name + " VS " + t2.Name + " " + "[" + str(t2.runs(0)) + "-" + str(t2.Twicket()) + "]")
                    print(t2player[t2BatsmenNo1].batsmenName + " " + str(t2player[t2BatsmenNo1].runs) + "(" + str(t2player[t2BatsmenNo1].ballsfaced) + ")")
                    print(t2player[t2BatsmenNo2].batsmenName + "W " + str(t2player[t2BatsmenNo2].runs) + "(" + str(t2player[t2BatsmenNo2].ballsfaced()) + ")")
                    print(t1baller[t1ballerNo].ballerName + " " + str(t1baller[t1ballerNo].wicket()) + "-" + str(t1baller[t1ballerNo].runsANDball(0)) + " " + str(t1baller[t1ballerNo].Overs(t1baller[t1ballerNo].balls)))
                    print("Overs-" + str(t2.Tover(t2.balls)))
                    print("Its a Lose shot by batsman he Loses his W!")
                    t2BatsmenNo2 = t2BatsmenNo2 + 2
                    t2player[t2BatsmenNo2] = Batsmen()
                    print("Enter the new batsmen name:")
                    t2player[t2BatsmenNo2].Name()
                    t2player[t2BatsmenNo2].batsmenName = input()
                    if (ball % 6 == 0) :
                        Flag = 1
            else:
                print("Invalid input")
                ball -= 1
            if (t2.Twicket == 10) :
                print(t2.Name + " lose by " + str((t2.Target - t2.Runs - 1)))
                break
            if (t2.Target < t2.Runs) :
                print(t2.Name + " won by " + str((10 - t2.Twicket)))
                break
            if (ball % 6 == 0) :
                if (ball == 30 and t2.Target < t2.Runs) :
                    print(t2.Name + " won by " + str((10 - t2.Twicket)))
                    break
                print("Available ballers\nPress:\n", end ="")
                balling = 0
                while (balling < 6) :
                    print(str(balling + 1) + " " + t1baller[balling].ballerName)
                    balling += 1
                t1ballerNo = input()
                input()
                t1ballerNo = t1ballerNo - 1
            ball += 1
class Main :
    @staticmethod
    def main( args) :
        g1 = GamePlay()
    

if __name__=="__main__":
    Main.main([])
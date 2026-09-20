import java.util.Scanner;

public class Sports_League {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the input of Cricket match(Team name,number of matches,number of win,number of draws):");
        String detail=sc.nextLine();
        String[] detaillist=detail.split(",");

        CricketTeam c=new CricketTeam(detaillist[1],Integer.parseInt(detaillist[2]),Integer.parseInt(detaillist[3]),Integer.parseInt(detaillist[4]));
        System.out.print("Enter the input of Football match(Team name,number of matches,number of win,number of draws):");
        detail=sc.nextLine();
        detaillist=detail.split(",");
        FootballTeam f=new FootballTeam(detaillist[1],Integer.parseInt(detaillist[2]),Integer.parseInt(detaillist[3]),Integer.parseInt(detaillist[4]));
    System.out.println(c);
    System.out.println(f);
    }
}
class Team
{
    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    private String name;
    protected int matchesPlayed,wins, draws;
    public int calculate(int win,int draws)
    {
        return win+draws;
    }

    @Override
    public String toString() {
        return "Team: "+name;
    }
}
class CricketTeam extends Team
{
    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculate(int win, int draws) {
        return (wins*2) + (draws*1);
    }

    @Override
    public String toString() {
        return super.toString()+"(Cricket) Points: "+calculate(wins,draws);
    }
}
class FootballTeam extends Team
{
    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculate(int win, int draws) {
        return (wins*3) + (draws*1);
    }
    @Override
    public String toString() {
        return super.toString()+"(Football) Points: "+calculate(wins,draws);

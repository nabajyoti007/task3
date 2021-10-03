package naba;

public class Cricket extends Sports{

    String matchType;
    int over;
    Player player;

    Cricket(String matchType,int over,Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match type: "+matchType);
        System.out.println("Over of the match: "+over);
        System.out.println("Name of the player: "+player.playerName);
        System.out.println("Jersey number of a player: "+player.jerseyNumber);
    }
}

/*
    Name: Nabajyoti Sharma
    Id: 2012020071
    Section: B
    Email: cse_2012020071@lus.ac.bd
           sharmanaba9@gmail.com
    Date: 10,Septembar,2021
 */

public class TennisGame2
{
    private int player1Point;
    private int player2Point;

    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String[] scoreWords = {"Love", "Fifteen", "Thirty", "Forty"};


        //Score is equal, but less than 4
        boolean isEqualNotDeuce = (player1Point == player2Point && player1Point < 3);
        if(isEqualNotDeuce) {
            return scoreWords[player1Point] + "-All";
        }


        //Deucing case
        boolean isDeuce = (player1Point == player2Point && player1Point >= 3);
        if(isDeuce){
            return "Deuce";
        }


        //Advantage
        if(player1Point > player2Point && player2Point >= 3 && (player1Point - player2Point) == 1){
            return "Advantage " + player1Name;
        }
        if(player2Point > player1Point && player1Point >= 3 && (player2Point - player1Point) == 1){
            return "Advantage " + player2Name;
        }


        //Win (including: Winning before deuce, Winning after deuce).
        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            return "Win for " + player1Name;
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            return "Win for " + player2Name;
        }


        //Normal cases
        return scoreWords[player1Point] + "-" + scoreWords[player2Point];
    }

    public void P1Score(){
        player1Point++;
    }

    public void P2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            P1Score();
        else
            P2Score();
    }
}

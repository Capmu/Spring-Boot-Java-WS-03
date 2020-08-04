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
        String player1Result = "";
        String player2Result = "";
        String score = "";

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

        if (player1Point > 0 && player2Point ==0)
        {
            if (player1Point ==1)
                player1Result = "Fifteen";
            if (player1Point ==2)
                player1Result = "Thirty";
            if (player1Point ==3)
                player1Result = "Forty";

            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player2Point > 0 && player1Point ==0)
        {
            if (player2Point ==1)
                player2Result = "Fifteen";
            if (player2Point ==2)
                player2Result = "Thirty";
            if (player2Point ==3)
                player2Result = "Forty";

            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point){
            if (player1Point < 4) {
                if (player1Point == 2)
                    player1Result = "Thirty";
                if (player1Point == 3)
                    player1Result = "Forty";
                if (player2Point == 1)
                    player2Result = "Fifteen";
                if (player2Point == 2)
                    player2Result = "Thirty";
                score = player1Result + "-" + player2Result;
            }
            else if (player2Point >= 3) {
                score = "Advantage player1";
            }
        }

        if (player2Point > player1Point){
            if (player2Point < 4) {
                if (player2Point == 2)
                    player2Result = "Thirty";
                if (player2Point == 3)
                    player2Result = "Forty";
                if (player1Point == 1)
                    player1Result = "Fifteen";
                if (player1Point == 2)
                    player1Result = "Thirty";
                score = player1Result + "-" + player2Result;
            }
            else if (player1Point >= 3) {
                score = "Advantage player2";
            }
        }

        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            score = "Win for player1";
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
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

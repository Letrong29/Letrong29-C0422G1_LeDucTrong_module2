package ss8_clean_and_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int pointOfPlayer1, int pointOfPlayer2) {

        String score = "";
        int tempScore = 0;
        boolean pointGreaterThan4 = (pointOfPlayer1 >= 4 || pointOfPlayer2 >= 4);

        if (pointOfPlayer1 == pointOfPlayer2) {
            switch (pointOfPlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (pointGreaterThan4) {

            int minusResult = pointOfPlayer1 - pointOfPlayer2;

            if (minusResult == 1){
                score = "Advantage player1";
            } else if (minusResult == -1){
                score = "Advantage player2";
            } else if (minusResult >= 2){
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }

        } else {
            for (int point = 1; point < 3; point++) {
                if (point == 1){
                    tempScore = pointOfPlayer1;
                } else {
                    score += "-";
                    tempScore = pointOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}

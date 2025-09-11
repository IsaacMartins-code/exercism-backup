public class FootballMatchReports {    
    public static String onField(int shirtNum) {

        String playerDescription = "";
        
        if(shirtNum < 1 || shirtNum > 11) {
            throw new IllegalArgumentException();
            
        } else {
            switch(shirtNum) {
            case 1:
                playerDescription = "goalie";
                break;

            case 2: 
                playerDescription = "left back";
                break;

            case 3:
            case 4:
                playerDescription = "center back";
                break;
                    
            case 5: 
                playerDescription = "right back";
                break;

            case 6: 
            case 7: 
            case 8:
                playerDescription = "midfielder";
                break;

            case 9: 
                playerDescription = "left wing";
                break;

            case 10: 
                playerDescription = "striker";
                break;

            case 11:
                playerDescription = "right wing";
                break;
            }
        }
        
        return playerDescription;
    }
}

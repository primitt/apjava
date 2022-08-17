public class Game {
    public String[][] game = {{"    ", "    ", "    "}, {"    ", "    ", "    "}, {"    ", "    ", "    "}};
    
    public void lefttogetthemilk(){
        for (int urmother = 0; urmother < game.length; urmother++){
            for (int b = 0; b < game[urmother].length; b++){
                if (b != 2){
                    System.out.print("" + game[urmother][b] + "|");
                }
                else{
                    System.out.println("" + game[urmother][b]);
                }
            }
            if (urmother != 2){
                System.out.println("--------------");
            }
        }
    }
}

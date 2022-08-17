import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Game urdad = new Game();
        urdad.lefttogetthemilk();
        Scanner sc = new Scanner(System.in);
        while (true){
            while (true){
                System.out.print("Player 1, choose: ");
                String space = sc.next();
                if (space.equals("A1")){
                    if(urdad.game[0][0].equals("    ")){
                        urdad.game[0][0] = " x  ";
                        break;
                    }
                }
                if (space.equals("A2")){
                    if(urdad.game[0][1].equals("    ")){
                        urdad.game[0][1] = " x  ";
                        break;
                    }
                }
                if (space.equals("A3")){
                    if(urdad.game[0][2].equals("    ")){
                        urdad.game[0][2] = " x  ";
                        break;
                    }
                }
                if (space.equals("B1")){
                    if(urdad.game[1][0].equals("    ")){
                        urdad.game[1][0] = " x  ";
                        break;
                    }
                }
                if (space.equals("B2")){
                    if(urdad.game[1][1].equals("    ")){
                        urdad.game[1][1] = " x  ";
                        break;
                    }
                }
                if (space.equals("B3")){
                    if(urdad.game[1][2].equals("    ")){
                        urdad.game[1][2] = " x  ";
                        break;
                    }
                }
                if (space.equals("C1")){
                    if(urdad.game[2][0].equals("    ")){
                        urdad.game[2][0] = " x  ";
                        break;
                    }
                }
                if (space.equals("C2")){
                    if(urdad.game[2][1].equals("    ")){
                        urdad.game[2][1] = " x  ";
                        break;                    }
                }
                if (space.equals("C3")){
                    if(urdad.game[2][2].equals("    ")){
                        urdad.game[2][2] = " x  ";
                        break;
                    }
                }
            }
            urdad.lefttogetthemilk();
            if (urdad.game[0][0].equals(" x  ") && urdad.game[0][1].equals(" x  ") && urdad.game[0][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[1][0].equals(" x  ") && urdad.game[1][1].equals(" x  ") && urdad.game[1][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[2][0].equals(" x  ") && urdad.game[2][1].equals(" x  ") && urdad.game[2][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[0][0].equals(" x  ") && urdad.game[1][1].equals(" x  ") && urdad.game[2][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[0][2].equals(" x  ") && urdad.game[1][1].equals(" x  ") && urdad.game[2][0].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            
            if (urdad.game[0][0].equals(" o  ") && urdad.game[0][1].equals(" o  ") && urdad.game[0][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[1][0].equals(" o  ") && urdad.game[1][1].equals(" o  ") && urdad.game[1][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[2][0].equals(" o  ") && urdad.game[2][1].equals(" o  ") && urdad.game[2][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[0][0].equals(" o  ") && urdad.game[1][1].equals(" o  ") && urdad.game[2][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[0][2].equals(" o  ") && urdad.game[1][1].equals(" o  ") && urdad.game[2][0].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            while (true){
                System.out.print("Player 2, choose: ");
                String space = sc.next();
                if (space.equals("A1")){
                    if(urdad.game[0][0].equals("    ")){
                        urdad.game[0][0] = " o  ";
                        break;
                    }
                }
                if (space.equals("A2")){
                    if(urdad.game[0][1].equals("    ")){
                        urdad.game[0][1] = " o  ";
                        break;
                    }
                }
                if (space.equals("A3")){
                    if(urdad.game[0][2].equals("    ")){
                        urdad.game[0][2] = " o  ";
                        break;
                    }
                }
                if (space.equals("B1")){
                    if(urdad.game[1][0].equals("    ")){
                        urdad.game[1][0] = " o  ";
                        break;
                    }
                }
                if (space.equals("B2")){
                    if(urdad.game[1][1].equals("    ")){
                        urdad.game[1][1] = " o  ";
                        break;
                    }
                }
                if (space.equals("B3")){
                    if(urdad.game[1][2].equals("    ")){
                        urdad.game[1][2] = " o  ";
                        break;
                    }
                }
                if (space.equals("C1")){
                    if(urdad.game[2][0].equals("    ")){
                        urdad.game[2][0] = " o  ";
                        break;
                    }
                }
                if (space.equals("C2")){
                    if(urdad.game[2][1].equals("    ")){
                        urdad.game[2][1] = " o  ";
                        break;                    }
                }
                if (space.equals("C3")){
                    if(urdad.game[2][2].equals("    ")){
                        urdad.game[2][2] = " o  ";
                        break;
                    }
                }
            }
            urdad.lefttogetthemilk();
            if (urdad.game[0][0].equals(" x  ") && urdad.game[0][1].equals(" x  ") && urdad.game[0][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[1][0].equals(" x  ") && urdad.game[1][1].equals(" x  ") && urdad.game[1][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[2][0].equals(" x  ") && urdad.game[2][1].equals(" x  ") && urdad.game[2][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[0][0].equals(" x  ") && urdad.game[1][1].equals(" x  ") && urdad.game[2][2].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            if (urdad.game[0][2].equals(" x  ") && urdad.game[1][1].equals(" x  ") && urdad.game[2][0].equals(" x  ")){
                System.out.println("Player 1 won the game!");
                break;
            }
            
            if (urdad.game[0][0].equals(" o  ") && urdad.game[0][1].equals(" o  ") && urdad.game[0][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[1][0].equals(" o  ") && urdad.game[1][1].equals(" o  ") && urdad.game[1][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[2][0].equals(" o  ") && urdad.game[2][1].equals(" o  ") && urdad.game[2][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[0][0].equals(" o  ") && urdad.game[1][1].equals(" o  ") && urdad.game[2][2].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
            if (urdad.game[0][2].equals(" o  ") && urdad.game[1][1].equals(" o  ") && urdad.game[2][0].equals(" o  ")){
                System.out.println("Player 2 won the game!");
                break;
            }
        }
    }
}

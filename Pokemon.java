import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {
    
    public static void main(String[] args) {

        ArrayList<String> pokemonTeam = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Luke's version of a java Pokemon game");
        System.out.println("This game allows you to catch Pokemon from Generations 1 - 8");
        System.out.println("The objective of this game is to put together the strongest team possible using this");
        System.out.println("Base stat totals will be used as the primary measure of strength here");
        System.out.println("Ready to begin (y/n)?");
        String startGame = input.next(); 


        if (startGame.equals("y")){
            System.out.print("Lets begin with your starter.");
            System.out.print("You may choose any starter from the Kanto region(Gen 1)!");
            System.out.print("Remember to capitalize all of your Pokemon's names!");
            String starter = input.next();
            if (starter.equals("Bulbasaur")){
                pokemonTeam.add(pokemonList[0]);
            }
            else if (starter.equals("Charmander")){
                pokemonTeam.add(pokemonList[3]);
            }
            else if (starter.equals("Squirtle")){
                pokemonTeam.add(pokemonList[6]);
            }
            else{ 
                System.out.print("Invalid Reponse!");
            }

            

        }

        else if (startGame.equals("n")){
            System.out.print("Game not Started");
        }

        else {
            System.out.print("Invalid response");
        }
    }
}

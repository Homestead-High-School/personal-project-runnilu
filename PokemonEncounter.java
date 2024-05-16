import java.util.Random;

public class PokemonEncounter {
   
    public static int getEncounter(){
        Random rand = new Random();
        

    }
    
    public static int PokemonCatcher(){
        int catch = Math.random(2);
        if(catch.equals(1)){
            System.out.println("Congrats, you captured the pokemon!");
        }
        else if(catch.equals(2)){
            System.out.println("The pokemon fled!");
        }
        else{
            System.out.print("Error");
        }
    }




}

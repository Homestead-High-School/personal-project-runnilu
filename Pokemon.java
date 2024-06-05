import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Pokemon {
    
    private static ArrayList<String> pokemonList = new ArrayList<>();
    private static ArrayList<String> pokemonTypes = new ArrayList<>();
    
    public static void main(String[] args) {
        addPokedex();
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
            if (pokemonList.contains(starter)) {
                pokemonTeam.add(starter);
                System.out.println("Successfully added " + starter + " to your team");
                System.out.println("Now that you have your starter Pokemon, it is time to catch your remaining team!");
                while (pokemonTeam.size() > 6){
                    int current = getEncounter();
                    System.out.println("A Wild " + pokemonList.get(current) + " Appears!");
                    System.out.println("Would you like to catch it? (y/n)");
                    String catched = input.next();
                    if(catched.equals("y")){
                        pokemonCatcher(pokemonTeam, current);
                    } else if(catched.equals("n")){
                        System.out.println("You got away safely");
                    } else {
                        System.out.print("Invalid Reponse!"); 
                    }
                    
                } 
                
                } else { 
                System.out.print("Invalid Reponse!");
            }

            } else if (startGame.equals("n")){
                System.out.print("Game not Started");
            } else {
                System.out.print("Invalid response");
            }
        }
    
    public static int getEncounter(){
        Random rand = new Random();
        return rand.nextInt(151);

    }

    public static void pokemonCatcher(ArrayList<String> pokemonTeam, int index){
        Random rand = new Random();
        int catch1 = rand.nextInt(2) + 1;
        if(catch1 == 1){
            System.out.println("Congrats, you captured the pokemon!");
            pokemonTeam.add(pokemonList.get(index));
        }
        else if(catch1 == 2){
            System.out.println("The pokemon fled!");
        }
        else{
            System.out.print("Error");
        }
    }
        public static void addPokedex(){
            pokemonList.add("Bulbasaur"); 
            pokemonList.add("Ivysaur");
            pokemonList.add("Venusaur");
            pokemonList.add("Charmander");
            pokemonList.add("Charmeleon");
            pokemonList.add("Charizard");
            pokemonList.add("Squirtle");
            pokemonList.add("Wartortle");
            pokemonList.add("Blastoise");
            pokemonList.add("Caterpie");
            pokemonList.add("Metapod");
            pokemonList.add("Butterfree");
            pokemonList.add("Weedle");
            pokemonList.add("Kakuna");
            pokemonList.add("Beedrill");
            pokemonList.add("Pidgey");
            pokemonList.add("Pidgeotto");
            pokemonList.add("Pidgeot");
            pokemonList.add("Rattata");
            pokemonList.add("Raticate");
            pokemonList.add("Spearow");
            pokemonList.add("Fearow");
            pokemonList.add("Ekans");
            pokemonList.add("Arbok");
            pokemonList.add("Pikachu");
            pokemonList.add("Raichu");
            pokemonList.add("Sandshrew");
            pokemonList.add("Sandslash");
            pokemonList.add("Nidoran♀");
            pokemonList.add("Nidorina");
            pokemonList.add("Nidoqueen");
            pokemonList.add("Nidoran♂");
            pokemonList.add("Nidorino");
            pokemonList.add("Nidoking");
            pokemonList.add("Clefairy");
            pokemonList.add("Clefable");
            pokemonList.add("Vulpix");
            pokemonList.add("Ninetales");
            pokemonList.add("Jigglypuff");
            pokemonList.add("Wigglytuff");
            pokemonList.add("Zubat");
            pokemonList.add("Golbat");
            pokemonList.add("Oddish");
            pokemonList.add("Gloom");
            pokemonList.add("Vileplume");
            pokemonList.add("Paras");
            pokemonList.add("Parasect");
            pokemonList.add("Venonat");
            pokemonList.add("Venomoth");
            pokemonList.add("Diglett");
            pokemonList.add("Dugtrio");
            pokemonList.add("Meowth");
            pokemonList.add("Persian");
            pokemonList.add("Psyduck");
            pokemonList.add("Golduck");
            pokemonList.add("Mankey");
            pokemonList.add("Primeape");
            pokemonList.add("Growlithe");
            pokemonList.add("Arcanine");
            pokemonList.add("Poliwag");
            pokemonList.add("Poliwhirl");
            pokemonList.add("Poliwrath");
            pokemonList.add("Abra");
            pokemonList.add("Kadabra");
            pokemonList.add("Alakazam");
            pokemonList.add("Machop");
            pokemonList.add("Machoke");
            pokemonList.add("Machamp");
            pokemonList.add("Bellsprout");
            pokemonList.add("Weepinbell");
            pokemonList.add("Victreebel");
            pokemonList.add("Tentacool");
            pokemonList.add("Tentacruel");
            pokemonList.add("Geodude");
            pokemonList.add("Graveler");
            pokemonList.add("Golem");
            pokemonList.add("Ponyta");
            pokemonList.add("Rapidash");
            pokemonList.add("Slowpoke");
            pokemonList.add("Slowbro");
            pokemonList.add("Magnemite");
            pokemonList.add("Magneton");
            pokemonList.add("Farfetch'd");
            pokemonList.add("Doduo");
            pokemonList.add("Dodrio");
            pokemonList.add("Seel");
            pokemonList.add("Dewgong");
            pokemonList.add("Grimer");
            pokemonList.add("Muk");
            pokemonList.add("Shellder");
            pokemonList.add("Cloyster");
            pokemonList.add("Gastly");
            pokemonList.add("Haunter");
            pokemonList.add("Gengar");
            pokemonList.add("Onix");
            pokemonList.add("Drowzee");
            pokemonList.add("Hypno");
            pokemonList.add("Krabby");
            pokemonList.add("Kingler");
            pokemonList.add("Voltorb");
            pokemonList.add("Electrode");
            pokemonList.add("Exeggcute");
            pokemonList.add("Exeggutor");
            pokemonList.add("Cubone");
            pokemonList.add("Marowak");
            pokemonList.add("Hitmonlee");
            pokemonList.add("Hitmonchan");
            pokemonList.add("Lickitung");
            pokemonList.add("Koffing");
            pokemonList.add("Weezing");
            pokemonList.add("Rhyhorn");
            pokemonList.add("Rhydon");
            pokemonList.add("Chansey");
            pokemonList.add("Tangela");
            pokemonList.add("Kangaskhan");
            pokemonList.add("Horsea");
            pokemonList.add("Seadra");
            pokemonList.add("Goldeen");
            pokemonList.add("Seaking");
            pokemonList.add("Staryu");
            pokemonList.add("Starmie");
            pokemonList.add("Mr. Mime");
            pokemonList.add("Scyther");
            pokemonList.add("Jynx");
            pokemonList.add("Electabuzz");
            pokemonList.add("Magmar");
            pokemonList.add("Pinsir");
            pokemonList.add("Tauros");
            pokemonList.add("Magikarp");
            pokemonList.add("Gyarados");
            pokemonList.add("Lapras");
            pokemonList.add("Ditto");
            pokemonList.add("Eevee");
            pokemonList.add("Vaporeon");
            pokemonList.add("Jolteon");
            pokemonList.add("Flareon");
            pokemonList.add("Porygon");
            pokemonList.add("Omanyte");
            pokemonList.add("Omastar");
            pokemonList.add("Kabuto");
            pokemonList.add("Kabutops");
            pokemonList.add("Aerodactyl");
            pokemonList.add("Snorlax");
            pokemonList.add("Articuno");
            pokemonList.add("Zapdos");
            pokemonList.add("Moltres");
            pokemonList.add("Dratini");
            pokemonList.add("Dragonair");
            pokemonList.add("Dragonite");
            pokemonList.add("Mewtwo");
            pokemonList.add("Mew");

            pokemonTypes.add("Normal");
            pokemonTypes.add("Fighting");
            pokemonTypes.add("Flying");
            pokemonTypes.add("Poison");
            pokemonTypes.add("Ground");
            pokemonTypes.add("Rock");
            pokemonTypes.add("Bug");
            pokemonTypes.add("Ghost");
            pokemonTypes.add("Steel");
            pokemonTypes.add("Fire");
            pokemonTypes.add("Water");
            pokemonTypes.add("Grass");
            pokemonTypes.add("Electric");
            pokemonTypes.add("Psychic");
            pokemonTypes.add("Ice");
            pokemonTypes.add("Dragon");
            pokemonTypes.add("Dark");
            pokemonTypes.add("Fairy");
        }
}

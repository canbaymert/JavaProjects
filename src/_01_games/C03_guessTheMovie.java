package _01_games;

import java.util.*;

public class C03_guessTheMovie {
    static List<String> film = new ArrayList<>(Arrays.asList("CITYOFGOD", "SPIDERMAN", "THEBATMAN", "THEWOLFOFWALLSTREET", "THESIXTHSENSE", "SLUMDOGMILLIONAIRE",
            "HANNIBAL", "THESILENCEOFLAMBS", "SINCITY", "THEREVENANT", "RUSH", "THETHING", "THELASTSAMURAI", "THEEXORCIST", "THELIVESOFOTHERS", "AMERICANBEAUTY",
            "AMERICANHISTORYX", "AMELIE", "XMEN", "OLDBOY", "THEAMERICANPIE", "ONEFLEWOVERTHECUCKOOSNEST", "TOYSTORY", "THESHINING", "THEDARKKNIGHTRISES", "BATMANBEGINS",
            "THEGREENMILE", "PARASITE", "THESHAWSHANKREDEMPTION", "SCHINDLERSLIST", "THELORDOFTHERINGS", "BEFORESUNRISE", "ROCKY", "INTOTHEWILD", "THERING", "JAWS", "LEON",
            "THEBIGLEBOWSKI", "BEFORESUNSET", "NOTEBOOK", "THETRUMANSHOW", "CATCHMEIFYOUCAN", "FARGO", "MILLIONDOLLARBABY", "VFORVENDETTA", "TRAINSPOTTING",
            "LOCKSTOCKANDTWOSMOKINGBARRELS", "AVENGERS", "SHUTTERISLAND", "JURASSICPARK", "TITANIC", "ABEAUTIFULMIND", "THEUSUALSUSPECTS", "DIEHARD", "SNATCH", "FULLMETALJACKET",
            "SCARFACE", "TAXIDRIVER", "THESTING", "THEDEPARTED", "ACLOCWORKORANGE", "WHIPLASH", "ALIEN", "REQUIEMFORADREAM", "ETERNALSUNSHINEOFTHESPOTLESSMIND", "JOKER", "BRAVEHEART",
            "DJANGOUNCHAINED", "STARWARS", "TERMINATOR", "BACKTOTHEFUTURE", "PSYCHO", "THEPIANIST", "GLADIATOR", "FORRESTGUMP", "THEMATRIX", "GOODFELLAS", "SAVINGPRIVATERYAN",
            "THEDARKKNIGHT", "INCEPTION", "THEPRESTIGE", "DUNKIRK", "MEMENTO", "TENET", "INTERSTELLAR", "FIGHTCLUB", "RESERVOIRDOGS", "KILLBILL", "PULPFICTION", "DEATHPROOF",
            "INGLORIOUSBASTERDS", "THEHATEFULEIGHT", "ONCEUPONATIMEINHOLLYWOOD", "GONEGIRL", "THEGIRLWITHTHEDRAGONTATTOO", "ZODIAC", "PANICROOM", "THEGAME", "SEVEN", "THEGODFATHER"));

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("================================================");
            System.out.println("Welcome to GuessTheMovie Game");
            System.out.println("================================================");
            System.out.print("Enter a number between 1 and " + (film.size()) + " (Enter a non-digit character to exit) : ");
            Collections.shuffle(film);
            int choice = 0;
            try {
                choice = scan.nextInt();
            } catch (Exception inputMismatchException) {
                System.exit(0);
            }
            while (choice < 1 || choice > film.size()) {
                System.out.print("Please enter a positive number between 1 and " + (film.size()) + " (Enter a non-digit character to exit) : ");
                try {choice = scan.nextInt();
                } catch (Exception inputMismatchException) {
                    System.exit(0);
                }
            }
            choice--;
            String chosenmovie = film.get(choice);
            String hiddenmovie = chosenmovie.replaceAll("\\w", "*");
            int tries = chosenmovie.length() * 2;
            String[] arrmovie = chosenmovie.split("");
            String[] hiddenmoviearr = hiddenmovie.split("");
            System.out.println("Name of the Movie consist of : " + arrmovie.length + " letters (Spaces are not included)");
            String guess = scan.nextLine().replaceAll("\\W", "").toUpperCase();
            while (tries >= 0) {
                if (guess.equals(chosenmovie) || !Arrays.toString(hiddenmoviearr).contains("*")) {
                    System.out.println("Congratulations, You guessed the movie!!!\nName of the movie : " + chosenmovie);
                    break;
                } else if (tries == 0) {
                    System.out.println("Game Over, You couldn't guess the movie.\nName of the movie : " + chosenmovie);
                    break;
                } else {
                    System.out.println("Tries Left: " + tries + "\n" + Arrays.toString(hiddenmoviearr)
                            + "\nPlease enter a letter or full name of the movie:");
                    guess = scan.nextLine().replaceAll("\\W", "").toUpperCase();
                    if (guess.length() != 1) tries--;
                    else if (!chosenmovie.contains(guess)) tries--;
                    else {
                        for (int i = 0; i < arrmovie.length; i++) {
                            if (!arrmovie[i].equals(guess)) {
                                arrmovie[i] = "*";
                            }
                        }
                        for (int i = 0; i < arrmovie.length; i++) {
                            if (!arrmovie[i].equals("*")) {
                                hiddenmoviearr[i] = arrmovie[i];
                            }
                        }
                        tries--;
                        arrmovie = chosenmovie.split("");
                    }
                }
            }
        }
    }
}


package pr1_2;
/**
 * This class prints out <code>hello world</code> in  a language
 * given in the command line
 * @author Eli Gavett
 */
public class PR1_2 {

    /**
     * returns <code>hello world</code> in the given language. English is default
     * @param args a language given in command line
     */
    public static void main(String[] args) {
        String greeting;
        if (args.length > 0 && args[0].equalsIgnoreCase("spanish"))
            greeting = "hola mundo";
        else if(args.length > 0 && args[0].equalsIgnoreCase("german"))
            greeting = "hallo welt";
        else if(args.length > 0 && args[0].equalsIgnoreCase("french"))
            greeting = "bon jour le monde";
        else
            greeting = "hello world";
        System.out.println(greeting);
    }
    
}

public class Main {

    public static void main(String[] args) {  // this is the chant that Java programmers chant around the fire.
        // "public" means other classes can find it.
        // "static" means that the function can be called without instantiating an object of the class.
        // "String[] args" is the commandline arguments passed in when the program is run.
    
        for (int i = 0; i < args.length; ++i) {
            System.out.println("args[" + i + "] = " + args[i]); // this is how you print to console. (or one way to, anyway.)
        }

    }
}
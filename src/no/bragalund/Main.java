package no.bragalund;

public class Main {

    public static void main(String[] args) {

        if(args == null || args.length < 1){
            throw new IllegalArgumentException("You should pass in 1, 2 or 3 as arguments!");
        }
        ArgumentFactory argumentFactory = new ArgumentFactory();
        AbstractArgument argument = argumentFactory.createArgumentBasedOnInput(args[0]);
        argument.writeCommandLineArgument();
    }
}

package no.bragalund;

public class Main {

    public static void main(String[] args) {
        ArgumentFactory argumentFactory = new ArgumentFactory();
        AbstractArgument argument = argumentFactory.createArgumentBasedOnInput(args);
        argument.writeCommandLineArgument();
    }
}

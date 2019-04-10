package no.bragalund;

public class NumberOneArgument extends AbstractArgument {
    @Override
    public void writeCommandLineArgument() {
        System.out.println("You provided argument 1!");
    }
}

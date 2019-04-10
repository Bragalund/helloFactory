package no.bragalund;

public interface IArgument {
    void writeCommandLineArgument();
    AbstractArgument createArgumentBasedOnInput(String input);

}

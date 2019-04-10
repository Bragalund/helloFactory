package no.bragalund;

public class ArgumentFactory {
    public AbstractArgument createArgumentBasedOnInput(String input){
        switch (input){
            case "1":
                return new NumberOneArgument();
            case "2":
                return new NumberTwoArgument();
            case "3":
                return new NumberThreeArgument();
            default:
                System.out.println("Supplied wrong input! Please choose 1,2 or 3");
                break;
        }
    throw new IllegalArgumentException("Input was wrong!");
    }

}

package no.bragalund;

public class ArgumentFactory {
    public AbstractArgument createArgumentBasedOnInput(String[] args){

        if(inputArgsIsValid(args)){
            String input = args[0];
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
        }

        throw new IllegalArgumentException("You should pass in 1, 2 or 3 as arguments!");
    }

    private boolean inputArgsIsValid(String[] args){
        if(args == null || args.length < 1){
 return false;       }
       return true;
    }

}

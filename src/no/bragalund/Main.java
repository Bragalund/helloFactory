package no.bragalund;

public class Main {

    public static void main(String[] args) {

        if(args == null || args.length < 1){
            throw new IllegalArgumentException("You should pass in 1, 2 or 3 as arguments!");
        }
        if(args[0].equals("1")){
            System.out.println("You provided argument 1!");
        }else if(args[0].equals("2")){
            System.out.println("You provided argument 2!");
        }else if(args[0].equals("3")){
            System.out.println("You provided argument 4!");
        }else{
            System.out.println("Supplied wrong input! Please choose 1,2 or 3");
        }
    }
}

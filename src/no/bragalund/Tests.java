package no.bragalund;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;

public class Tests {

    @Test
    public void testThatTestsWork(){
        assert(true);
    }


    @Test
    public void testThatRunningMainWithValidArgumentReturnsValidResponse(){
        // Arrange
        ByteArrayOutputStream out = createConsoleReader();
        Main main = new Main();

        // Act
        main.main(new String[]{"2"});

        // Assert
        Assert.assertEquals("You provided argument 2!\n", out.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThatWrongInputGivesErrorMessage(){

        // Arrange
        ByteArrayOutputStream outputStream = createConsoleReader();
        Main main = new Main();
        String[] commandlineArgs = new String[]{};

        // Act
        main.main(commandlineArgs);
    }

    @Test
    public void testWrongArgumentsShouldGiveHelpMessage(){

        // Arrange
        ByteArrayOutputStream outputStream = createConsoleReader();
        Main main = new Main();
        String[] commandLineArgs = new String[]{"bla","bla"};

        // Act
        main.main(commandLineArgs);

        // Assert
        Assert.assertEquals("Supplied wrong input! Please choose 1,2 or 3\n", outputStream.toString());

    }

    private ByteArrayOutputStream createConsoleReader(){
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        return out;
    }
}

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class Test_Main {
    @Test
    public void TestGivenWhenProgrammeStartsAndRespondsCorrectly(){

        //arrange
        String expected = "Hallo ArchiverApp";
        //act
        String actual= Main.getMessage();
        //assert
        Assertions.assertEquals(expected, actual);
    }


}
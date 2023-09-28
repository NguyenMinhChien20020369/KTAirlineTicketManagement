import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Main;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MainTest {

  @ParameterizedTest
  @CsvFileSource(resources = "/Data.csv", numLinesToSkip = 1)
  void test(int age, String seatClass, String expectedOutput) {
    assertEquals(Main.buyAirlineTicket(age, seatClass), expectedOutput);
  }
}

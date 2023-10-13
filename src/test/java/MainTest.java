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

  @ParameterizedTest
  @CsvFileSource(resources = "/DataC2.csv", numLinesToSkip = 1)
  void testC2(int age, String seatClass, String expectedOutput) {
    assertEquals(Main.buyAirlineTicket(age, seatClass), expectedOutput);
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/DataAllUses.csv", numLinesToSkip = 1)
  void testAllUses(int age, String seatClass, String expectedOutput) {
    assertEquals(Main.buyAirlineTicket(age, seatClass), expectedOutput);
  }
}

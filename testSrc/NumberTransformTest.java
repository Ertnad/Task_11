import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.sc.tretyakov_d_s.NumberTransform;

public class NumberTransformTest {

  NumberTransform transform;

  @Test
  public void testTransform1FromArabicToRomanNumber() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testTransform1FromArabicToRomanNumber.txt"));
    String input = scn.nextLine();
    String currentResult = "I";

    int arabic = Integer.parseInt(input);
    transform = new NumberTransform(arabic);

    String correctResult =String.valueOf(transform);

    Assertions.assertEquals(currentResult, correctResult);
  }

  @Test
  public void testTransform3999FromArabicToRomanNumber() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testTransform3999FromArabicToRomanNumber.txt"));
    String input = scn.nextLine();
    String currentResult = "MMMCMXCIX";

    int arabic = Integer.parseInt(input);
    transform = new NumberTransform(arabic);

    String correctResult =String.valueOf(transform);

    Assertions.assertEquals(currentResult, correctResult);
  }

  @Test
  public void testTransformIFromRomanToArabicNumber() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testTransformIFromRomanToArabicNumber.txt"));
    String input = scn.nextLine();
    String currentResult = "1";

    transform = new NumberTransform(input);

    String correctResult =String.valueOf(transform.toInt());

    Assertions.assertEquals(currentResult, correctResult);
  }

  @Test
  public void testTransformMMMCMXCIXFromRomanToArabicNumber() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testTransformMMMCMXCIXFromRomanToArabicNumber.txt"));
    String input = scn.nextLine();
    String currentResult = "3999";

    transform = new NumberTransform(input);

    String correctResult =String.valueOf(transform.toInt());

    Assertions.assertEquals(currentResult, correctResult);
  }

  @Test
  public void testTransform15FromArabicToRomanNumber() throws IOException {
    Scanner scn = new Scanner(new File("testSrc/TestCases/testTransform15FromArabicToRomanNumber.txt"));
    String input = scn.nextLine();
    String currentResult = "XV";

    int arabic = Integer.parseInt(input);
    transform = new NumberTransform(arabic);

    String correctResult =String.valueOf(transform);

    Assertions.assertEquals(currentResult, correctResult);
  }

}
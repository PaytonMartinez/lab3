import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  //My Added Tests:
  @Test
  public void testReverseInPlace2() {
    int[] input = { 5,4,3,2,1 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 1,2,3,4,5 }, input);
  }

  @Test
  public void testReversed2() {
    int[] input = { 2,3 };
    assertArrayEquals(new int[]{ 3,2 }, ArrayExamples.reversed(input));
  }

  //averageWithoutLowest tests

  @Test
  public void testAverageWithoutLowest1() {
    double[] input = { 4,16,8,10,28 };
    double comparison = 41;
    assertEquals(comparison, ArrayExamples.averageWithoutLowest(input), 0);
  }
}

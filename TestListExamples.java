import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import java.util.List;

class IsMoon implements StringChecker {
  public boolean checkString(String s) {
    return s.equalsIgnoreCase("moon");
  }
}

public class TestListExamples {
  @Test(timeout = 500)
  public void testMergeRightEnd() {
    List<String> left = Arrays.asList("a", "b", "c");
    List<String> right = Arrays.asList("a", "d");
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList("a", "a", "b", "c", "d");
    assertEquals(expected, merged);
  }
  @Test(timeout = 500)
  public void testMergeEmpty() {
    List<String> left = Arrays.asList();
    List<String> right = Arrays.asList();
    List<String> merged = ListExamples.merge(left, right);
    List<String> expected = Arrays.asList();
    assertEquals(expected, merged);
  }
  @Test(timeout = 500)
  public void testFilter() {
    List<String> given = ListExamples.filter(Arrays.asList("leg", "food", "moon"), new IsMoon());
    List<String> expected = Arrays.asList("moon");
    assertEquals(expected, given);
  }
  @Test(timeout = 500)
  public void testFilter2() {
    List<String> given = ListExamples.filter(Arrays.asList("mOoNnOnO", "moOn", "MOON"), new IsMoon());
    List<String> expected = Arrays.asList("moOn", "MOON");
    assertEquals(expected, given);
  }
}

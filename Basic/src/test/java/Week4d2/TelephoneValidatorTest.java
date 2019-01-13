package Week4d2;

import org.junit.Assert;
import org.junit.Test;

public class TelephoneValidatorTest {

  @Test
  public void test() {
    TelephoneValidator validator = new TelephoneValidator();
    String regex = "^[0-9]{3}([-]?|[ ]?)[0-9]{3}([-]?|[ ]?)[0-9]{3}$";
    String[] telArr = {"505879357", "505 879 357", "505-879-357"};

    for (int i = 0; i < telArr.length; i++) {
      boolean isValid = validator.validate(regex, telArr[i]);
      Assert.assertTrue(isValid);

    }
  }
}
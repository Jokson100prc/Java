package Week4d2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelephoneValidatorTestFalse {

  @Test
  public void test() {
    TelephoneValidator validator = new TelephoneValidator();
    String regex = "^[0-9]{3}([-]?|[ ]?)[0-9]{3}([-]?|[ ]?)[0-9]{3}$";
    String[] telArr = {"5058793w7", "505#879 357", "rrr-879-357", "50 58 79 35 7", "058794", "44505879357"};

    for (int i = 0; i < telArr.length; i++) {
      boolean isValid = validator.validate(regex, telArr[i]);
      Assert.assertFalse(isValid);

    }
  }

}
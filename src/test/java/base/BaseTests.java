package base;


import org.testng.annotations.*;


public class BaseTests extends BasePage {
  @BeforeSuite
  @Test
   public void beforeSuite(){
      iniWebDriver();
  }

  @AfterSuite
  @Test
    public void afterSuite(){
      quitWebDriver();
  }
}

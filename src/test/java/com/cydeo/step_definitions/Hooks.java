package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */
public class Hooks {

    //import from io.cucumber.java not from junit
    @Before       (order = 0)                                 // ikinci @Before u kullanabiliriz
    public void setupScenario(){
        System.out.println("======Setting up browser using cucumber");
    }

    @Before (value = "@login" , order = 2)
    public void setupScenarioForLogins(){
        System.out.println("======this will only apply to scnerios with @login");
    }


    @Before (value = "@db" , order = 1)
    public void setupForDatabaseScenarios(){
        System.out.println("====this will only apply to scenarios with @db tag");
    }



    //screenshot i after methodun icine koyduk cunku scnario bittikten sonra eger fail olursa screenshot alsin

    @After
    public void teardownScenario(Scenario scenario){

      if (scenario.isFailed()) { // if sceneries fails it takes screenshot

          byte[] screenShot = ((TakesScreenshot)Driver.getDriver()) . getScreenshotAs(OutputType.BYTES);
          scenario.attach(screenShot,"image/png", scenario.getName());
      }

        Driver.closeDriver();

       // System.out.println("=======Closing browser using cucumber");
      //  System.out.println("=======Scnerio ended take screenshot if failed!");
    }
    @BeforeStep
    public void setupSetup(){
        System.out.println("0------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------applying setup using @BAfterStep");
    }
}

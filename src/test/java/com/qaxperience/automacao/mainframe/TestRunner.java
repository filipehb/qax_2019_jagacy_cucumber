package com.qaxperience.automacao.mainframe;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class TestRunner {
    @BeforeClass
    public static void setUpSuite() {
        System.setProperty("jagacy.properties.dir",
                "./src/test/resources/");
        System.setProperty("test.window", "true");
    }
}
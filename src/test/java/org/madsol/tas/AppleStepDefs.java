package org.madsol.tas;

import cucumber.api.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AppleStepDefs {

    private final static Logger LOGGER = LogManager.getLogger();

    private Bucket myBucket;

    public AppleStepDefs(Bucket myBucket) {
        this.myBucket = myBucket;
    }

    @Given("^I have an (?:apple|orange)$")
    public void i_have_an_apple() {
        LOGGER.info("I have an fruit");
        myBucket.setFruits(1);
    }
}

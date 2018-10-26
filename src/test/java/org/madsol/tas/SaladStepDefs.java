package org.madsol.tas;

import cucumber.api.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class SaladStepDefs {

    private final static Logger LOGGER = LogManager.getLogger();

    private Bucket myBucket;

    public SaladStepDefs(Bucket myBucket) {
        this.myBucket = myBucket;
    }

    @Then("^I should have (\\d+) in total$")
    public void i_should_have_in_total(int expectedAmountOfFruits) {
        LOGGER.info("Let me count the fruits I have");
        Assert.assertTrue("I don't have enough fruits for my salad",
                expectedAmountOfFruits == myBucket.getFruits());
    }
}

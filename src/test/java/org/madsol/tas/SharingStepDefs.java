package org.madsol.tas;

import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SharingStepDefs {

    private final static Logger LOGGER = LogManager.getLogger();

    private Bucket myBucket;

    public SharingStepDefs(Bucket myBucket) {
        this.myBucket = myBucket;
    }

    @When("^Simon gives me (\\d+) more$")
    public void simon_gives_me_more(int receivedFruits) {
        for (int i = 1; i <= receivedFruits; i++) {
            try {
                //FIXME: Receiving fruits one by one
                Thread.sleep(1000);
                LOGGER.info("I received another fruit");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        myBucket.addFruits(receivedFruits);
    }
}

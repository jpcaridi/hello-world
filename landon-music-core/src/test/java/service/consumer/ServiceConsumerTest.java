package service.consumer;

import org.junit.Assert;
import org.junit.Test;

public class ServiceConsumerTest {

    @Test
    public void searchTest(){
        LastFmService lastFmService = new LastFmService();

        Assert.assertEquals(lastFmService.search("nevermind"), "&album=nevermind");
    }
}

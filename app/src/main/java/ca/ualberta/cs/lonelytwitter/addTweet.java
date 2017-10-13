package ca.ualberta.cs.lonelytwitter;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class addTweet extends LonelyTwitterActivity {
    @Test

    void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class, (Arrays.asList(tweets).contains(newestTweet)) -> {
            throw new IllegalArgumentException("Duplicate tweet attempted");
        });
        assertEquals("Cannot add duplicate tweet", exception.getMessage());
    }
}

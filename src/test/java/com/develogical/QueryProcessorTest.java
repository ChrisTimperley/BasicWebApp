package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void knowsAboutName() throws Exception {
        assertThat(queryProcessor.process("name"), containsString("Chris and Michael (after we listened to the instructions)"));
    }

    @Test
    public void canFindLargest() throws Exception {
        assertThat(queryProcessor.process("which is largest: 50, 600, 100"), containsString("600"));
    }

    @Test
    public void canAddNumbers() throws Exception {
        assertThat(queryProcessor.process("what is 250 plus 500"), containsString("750"));
        assertThat(queryProcessor.process("what is -100 plus 500"), containsString("400"));
    }

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutOneillCruz() throws Exception {
        assertThat(queryProcessor.process("Oneill Cruz"), containsString("batting"));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

}

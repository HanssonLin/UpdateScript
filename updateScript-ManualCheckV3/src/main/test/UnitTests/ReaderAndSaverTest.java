package UnitTests;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

class ReaderAndSaverTest {

    Script.ReaderAndSaver reader;

    @BeforeEach void initialize() {
        reader = new Script.ReaderAndSaver();

    }
    @org.junit.jupiter.api.Test
    void didNotFindFileTest() {

        String[] expectedOutput = null;
        String path = "file/DoesNotExist.txt";
        assertThat(reader.readAndReturnArray(path), is(expectedOutput));
    }

    @org.junit.jupiter.api.Test
    void foundFileTest() {

        String[] notExpectedOutput = null;
        //this exists
        String path = "file/URLS.txt";
        assertThat(reader.readAndReturnArray(path), is(not(notExpectedOutput)));
    }

    @org.junit.jupiter.api.Test
    void correctOutputTest() {

        String[] expectedOutput = {"http://google.com", "http://fake.com"};
        String path = "TestFile/ReaderAndSaverTest.txt";
        assertThat(reader.readAndReturnArray(path), is(expectedOutput));
    }
}
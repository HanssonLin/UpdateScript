package UnitTests;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.jupiter.api.Assertions.*;

class NamerTest {

    @Test
    void getDependenciesCorrectOutputTest() {

        String[] inputStrings = {"Tomcat7:     7.0.85"};
        String[] expectedOutput = {"Tomcat7"};
        Script.Namer name = new Script.Namer();
        assertThat(expectedOutput,  is(name.getDependencies(inputStrings)));
    }


}
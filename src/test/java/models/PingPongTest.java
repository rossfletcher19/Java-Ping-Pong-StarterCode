package models;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void runPingPong_countUpToOne_ArrayList() {
        PingPong testPingPong = new PingPong();
        ArrayList<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testPingPong.runPingPong(1));
    }

}
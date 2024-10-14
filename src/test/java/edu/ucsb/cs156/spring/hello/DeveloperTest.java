package edu.ucsb.cs156.spring.hello;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        // TODO: Replace Chris G. with your name as shown on
        // <https://bit.ly/cs156-f24-teams>
        assertEquals("Jennifer Z.", Developer.getName());
    }
    @Test
    public void getGithubId_returns_correct_githubId() {
        // TODO: Replace Chris G. with your name as shown on
        // <https://bit.ly/cs156-f24-teams>
        assertEquals("Refinnej04", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Aman"), "Team should contain Aman");
        assertTrue(t.getMembers().contains("Jennifer Z."), "Team should contain Jennifer");
        assertTrue(t.getMembers().contains("Kevin"), "Team should contain Kevin");
        assertTrue(t.getMembers().contains("Oviya"), "Team should contain Oviya");
        assertTrue(t.getMembers().contains("Riona"), "Team should contain Riona");
        assertTrue(t.getMembers().contains("Vala"), "Team should contain Vala");
    }
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}

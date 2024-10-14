package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void testEqualityWithSameObject() {
        Team teamOne = new Team();
        teamOne.setName("foo");
        teamOne.addMember("bar");
        assertTrue(teamOne.equals(teamOne));
    }

    @Test
    public void testEqualityWithDifferentClass() {
        Team teamOne = new Team();
        teamOne.setName("foo");
        teamOne.addMember("bar");
        // Explicitly test equality against an object of a different class (a String).
        assertFalse(teamOne.equals("foo"));
    }

    @Test
    public void testEqualityWithIdenticalNameAndMembers() {
        Team teamOne = new Team();
        teamOne.setName("foo");
        teamOne.addMember("bar");
        Team teamTwo = new Team();
        teamTwo.setName("foo");
        teamTwo.addMember("bar");
        assertTrue(teamOne.equals(teamTwo));
    }

    @Test
    public void testEqualityWithSameNameDifferentMembers() {
        Team teamOne = new Team();
        teamOne.setName("foo");
        teamOne.addMember("bar");
        Team teamTwo = new Team();
        teamTwo.setName("foo");
        teamTwo.addMember("baz");
        assertFalse(teamOne.equals(teamTwo));
    }

    @Test
    public void testEqualityWithDifferentNameSameMembers() {
        Team teamOne = new Team();
        teamOne.setName("foo");
        teamOne.addMember("bar");
        Team teamTwo = new Team();
        teamTwo.setName("baz");
        teamTwo.addMember("bar");
        assertFalse(teamOne.equals(teamTwo));
    }

    @Test
    public void testEqualityWithDifferentNameAndMembers() {
        Team teamOne = new Team();
        teamOne.setName("foo");
        teamOne.addMember("bar");
        Team teamTwo = new Team();
        teamTwo.setName("baz");
        teamTwo.addMember("qux");
        assertFalse(teamOne.equals(teamTwo));
    }

    @Test
    public void testHashCodeConsistency() {
        Team team = new Team();
        int actualHashCode = team.hashCode();
        int expectedHashCode = 1;  // Assuming a simple override of the hashCode that returns constant value.
        assertEquals(expectedHashCode, actualHashCode);
    }


   
  

}

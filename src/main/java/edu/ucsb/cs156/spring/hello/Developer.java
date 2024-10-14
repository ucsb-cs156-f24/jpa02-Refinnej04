package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        // Done 
        // You may use just the name that is used on <https://bit.ly/cs156-f24-teams>
        // i.e. your first name, or your first and initial of last name
        return "Jennifer Z.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        // TODO: Done
        return "Refinnej04";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    public static Team getTeam() {
        // TODO: Done
        Team team = new Team("f24-14");
        team.addMember("Aman");
        team.addMember("Jennifer Z.");
        team.addMember("Kevin");
        team.addMember("Oviya");
        team.addMember("Riona");
        team.addMember("Vala");
        return team;
    }
}

/**
 * @filename ChallengeBuilder.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Abstract base class from challenges are assembled.
 */
package gamemaster;

/**
 * Abstract base class from challenges are assembled.
 */
public abstract class ChallengeBuilder {

    /**
     * Enumeration for the accepted encounter difficulty levels
     */
    public enum EncounterDifficulty {EASY, MEDIUM, HARD};
    
    /**
     * Creates a random encounter and stores a reference to the builder's local variables.
     * @param level Specifies the level of encounter to create.
     */
    public void generateEncounter(EncounterDifficulty level) {}

    /**
     * Creates a tactical map for the encounter
     */
    public void generateMap() {}

    /**
     * Looks up scripted dialog for this encounter based on user progress
     * @param iProgress The user's progress through the scenario, as a percent
     */
    public void generateScriptedDialog(int iProgress) {}

    /**
     * Creates a random boost to apply to the user
     */
    public void generateRandomBoost() {}
    
    /**
     * Returns the generated encounter as a single object
     * @return The encounter
     */
    public abstract AbstractEncounterFactory getEncounter();
}

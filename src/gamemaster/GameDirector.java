/**
 * @filename GameDirector.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Abstract base class from which a director class is generated.
 */
package gamemaster;

import gamemaster.ChallengeBuilder.EncounterDifficulty;

/**
 * Abstract base class from which a director class is generated.
 */
public abstract class GameDirector {

    /**
     * Creates a challenge for the player
     * @param builder The builder object used to construct the challenge
     * @param level The difficulty level of the encounter to be created
     * @param iProgress The player's progress through the level
     * @return The requested encounter
     */
    public abstract AbstractEncounterFactory create(ChallengeBuilder builder, EncounterDifficulty level, int iProgress);
}

/**
 * @filename GameDirector.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose An object designed to create random challenges for the player
 */
package gamemaster;

import gamemaster.ChallengeBuilder.EncounterDifficulty;

/**
 * An object designed to create random challenges for the player
 */
public class RandomChallengeDirector extends GameDirector {
    @Override
    public AbstractEncounterFactory create(ChallengeBuilder builder, EncounterDifficulty level, int iProgress) {
        builder.generateMap();
        builder.generateRandomBoost();
        builder.generateEncounter(level);
        return builder.getEncounter();
    }
    
}

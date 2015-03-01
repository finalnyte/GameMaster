/**
 * @filename ScriptedChallengeDirector.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose An object designed to create scripted challenges for the player
 */
package gamemaster;

import gamemaster.ChallengeBuilder.EncounterDifficulty;

/**
 * An object designed to create scripted challenges for the player
 */
public class ScriptedChallengeDirector extends GameDirector {
    @Override
    public AbstractEncounterFactory create(ChallengeBuilder builder, EncounterDifficulty level, int iProgress) {
        builder.generateMap();
        builder.generateScriptedDialog(iProgress);
        builder.generateEncounter(level);
        return builder.getEncounter();
    }
}

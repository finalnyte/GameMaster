/**
 * @filename ScriptedChallengeBuilder.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates a scripted/planned challenge
 */
package gamemaster;

/**
 * Creates a scripted/planned challenge
 */
public class ScriptedChallengeBuilder extends ChallengeBuilder{
    private AbstractEncounterFactory enc;
    
    @Override
    public void generateEncounter(EncounterDifficulty level) {
        if (level == EncounterDifficulty.EASY) {
            enc = new EasyEncounter();
        } else if (level == EncounterDifficulty.MEDIUM) {
            enc = new MediumEncounter();
        } else if (level == EncounterDifficulty.HARD) {
            enc = new HardEncounter();
        }
        
        enc.selectRandomMonster();
        enc.selectRandomTerrain();
        enc.selectRandomTreasure();
    }
    
    @Override
    public void generateMap() {
        System.out.println("A challenge map is created.");
    }
    
    @Override
    public void generateScriptedDialog(int iProgress) {
        System.out.println("The dialog for this scripted event is looked up.");
    }

    @Override
    public AbstractEncounterFactory getEncounter() {
        return enc;
    }    
}

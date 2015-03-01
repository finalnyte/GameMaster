/**
 * @filename RandomChallengeBuilder.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates a random challenge
 */
package gamemaster;

/**
 * Creates a random challenge
 */
public class RandomChallengeBuilder extends ChallengeBuilder {
    private AbstractEncounterFactory enc;
    
    @Override
    public void generateEncounter(EncounterDifficulty level) {
        //String sEncounterType="hard";
        //AbstractEncounterFactory enc = null;
        
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
    public void generateRandomBoost() {
        System.out.println("A random recovery item is selected to offset the "+
        "resources lost during this encounter.");
    }
    
    @Override
    public AbstractEncounterFactory getEncounter() {
        return enc;
    }
}
    


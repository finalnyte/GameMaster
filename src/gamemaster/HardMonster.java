/**
 * @filename HardMonster.java
 * @author Victor Brode
 * @lastmodified 02/24/2015
 * @purpose Creates a hard monster and reports monster information
 */
package gamemaster;

/**
 * Creates a hard monster and reports monster information
 * @author Victor Brode
 */
public class HardMonster implements Monster {
    private String MonsterName;
    
    /**
     * Constructor: Randomly selects a monster.
     */
    public HardMonster() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                MonsterName="Leviathan";
                break;
            case 1:
                MonsterName="Dragon";
                break;
            case 2:
                MonsterName="Queen";
                break;
        }
    }
    
    /**
     * Gets the name and difficulty level of the monster this object describes
     * @return A string describing the monster class and the monster name
     */
    @Override
    public String getMonster() {
        return "Hard monster: "+MonsterName;
    }
}

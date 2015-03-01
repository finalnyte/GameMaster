/**
 * @filename MediumMonster.java
 * @author Victor Brode
 * @lastmodified 02/24/2015
 * @purpose Creates a medium monster and reports monster information
 */
package gamemaster;

/**
 * Creates a medium monster and reports monster information
 * @author Victor Brode
 */
public class MediumMonster implements Monster {
    private String MonsterName;
    
    /**
     * Constructor: Randomly selects a monster.
     */
    public MediumMonster() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                MonsterName="Tiger";
                break;
            case 1:
                MonsterName="Dagonnoth";
                break;
            case 2:
                MonsterName="Grub";
                break;
        }
    }
    
    /**
     * Gets the name and difficulty level of the monster this object describes
     * @return A string describing the monster class and the monster name
     */
    @Override
    public String getMonster() {
        return "Medium monster: "+MonsterName;
    }
}

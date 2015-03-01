/**
 * @filename EasyMonster.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates an easy monster and reports monster information
 */
package gamemaster;

/**
 * Creates an easy monster and reports monster information
 * @author Victor Brode
 */
public class EasyMonster implements Monster {
    private String MonsterName;
    
    /**
     * Constructor: Randomly selects an easy monster.
     */
    public EasyMonster() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                MonsterName="Rat";
                break;
            case 1:
                MonsterName="Goblin";
                break;
            case 2:
                MonsterName="Ticker";
                break;
        }
    }
    
    /**
     * Gets the name and difficulty level of the monster this object describes
     * @return A string describing the monster class and the monster name
     */
    @Override
    public String getMonster() {
        return "Easy monster: "+MonsterName;
    }
}

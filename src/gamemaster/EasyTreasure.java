/**
 * @filename EasyTreasure.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates an easy treasure and reports treasure information
 */
package gamemaster;

/**
 * Creates an easy treasure and reports treasure information
 * @author Victor Brode
 */
public class EasyTreasure implements Treasure {
    private String TreasureDescription;
    
    /**
     * Constructor: Randomly selects a treasure.
     */
    public EasyTreasure() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                TreasureDescription="Mundane Gemstone";
                break;
            case 1:
                TreasureDescription="Longsword";
                break;
            case 2:
                TreasureDescription="Healing Potion";
                break;
        }
    }
    
    /**
     * Gets the treasure object
     * @return A string describing the treasure.
     */
    @Override
    public String getTreasure() {
        return "Easy treasure: "+TreasureDescription;
    }
}

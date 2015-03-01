/**
 * @filename MediumTreasure.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates a medium treasure and reports treasure information
 */
package gamemaster;

/**
 * Creates a medium treasure and reports treasure information
 * @author Victor Brode
 */
public class MediumTreasure implements Treasure {
    private String TreasureDescription;
    
    /**
     * Constructor: Randomly selects a treasure.
     */
    public MediumTreasure() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                TreasureDescription="Diamond";
                break;
            case 1:
                TreasureDescription="Magic Armor";
                break;
            case 2:
                TreasureDescription="Magic Wand";
                break;
        }
    }
    
    /**
     * Gets the treasure object
     * @return A string describing the treasure.
     */
    @Override
    public String getTreasure() {
        return "Medium treasure: "+TreasureDescription;
    }
}

/**
 * @filename HardTreasure.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates a hard treasure and reports treasure information
 */
package gamemaster;

/**
 * Creates a hard treasure and reports treasure information
 * @author Victor Brode
 */
public class HardTreasure implements Treasure {
    private String TreasureDescription;
    
    /**
     * Constructor: Randomly selects a treasure.
     */
    public HardTreasure() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                TreasureDescription="Quantum Gemerald";
                break;
            case 1:
                TreasureDescription="Chaos Armor";
                break;
            case 2:
                TreasureDescription="Excalibur";
                break;
        }
    }
    
    /**
     * Gets the treasure object
     * @return A string describing the treasure.
     */
    @Override
    public String getTreasure() {
        return "Hard treasure: "+TreasureDescription;
    }
}

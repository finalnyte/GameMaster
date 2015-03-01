/**
 * @filename Treasure.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Describes the treasure found at the conclusion of an encounter
 */
package gamemaster;

/**
 * Describes the treasure found at the conclusion of an encounter
 */
public interface Treasure {

    /**
     * Gets the treasure object
     * @return A string describing the treasure.
     */
    public String getTreasure();
}

/**
 * @filename AbstractEncounterFactory.java
 * @author Victor Brode
 * @lastmodified 02/24/2015
 * @purpose Abstract base class from which all encounter varieties are derived.
 */
package gamemaster;

/**
 * Abstract base class from which all encounter varieties are derived.
 * @author Victor Brode
 */
public abstract class AbstractEncounterFactory {
    protected Terrain myTerrain;
    protected Monster myMonster;
    protected Treasure myTreasure;
    
    /**
     * Selects an appropriate terrain type based on the difficulty of the parent encounter.
     * @return A terrain upon which a battle will be fought
     */
    public abstract Terrain selectRandomTerrain();

    /**
     * Selects an appropriate monster based on the difficulty of the parent encounter.
     * @return A monster to fight
     */
    public abstract Monster selectRandomMonster();

    /**
     * Selects an appropriate reward based of the difficulty of the parent encounter.
     * @return A treasure to add to the player inventory
     */
    public abstract Treasure selectRandomTreasure();
}

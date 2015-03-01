/**
 * @filename HardEncounter.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Defines a hard encounter
 */
package gamemaster;

/**
 * Defines an easy encounter
 * @author Victor Brode
 */
public class HardEncounter extends AbstractEncounterFactory  {
    /**
     * @return an object selected from the hard monster list
     */
    @Override
    public Monster selectRandomMonster() {
        myMonster = new HardMonster();
        return myMonster;
    }
    
    /**
     * Selects a terrain from the hard terrain list.
     * @return an object selected from the hard terrain list
     */
    @Override 
    public Terrain selectRandomTerrain() {
        myTerrain = new HardTerrain();
        return myTerrain;
    }
    
    /**
     * @return an object selected from the hard treasure pool
     */
    @Override
    public Treasure selectRandomTreasure() {
        myTreasure = new HardTreasure();
        return myTreasure;
    }    
    
    /**
     * Returns a description of the encounter
     * @return A string containing the components of the encounter
     */
    @Override
    public String toString() {
        return myMonster.getMonster() + "\r\n" + myTerrain.getTerrain() + "\r\n" + myTreasure.getTreasure();
    }
}

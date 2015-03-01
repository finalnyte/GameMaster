/**
 * @filename EasyEncounter.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Defines an easy encounter
 */
package gamemaster;

/**
 * Defines an easy encounter
 * @author Victor Brode
 */
public class EasyEncounter extends AbstractEncounterFactory {
    /**
     * @return an object selected from the easy monster list
     */
    @Override
    public Monster selectRandomMonster() {
        myMonster = new EasyMonster();
        return myMonster;
    }
    
    /**
     * Selects a terrain from the easy terrain list.
     * @return an object selected from the easy terrain list
     */
    @Override 
    public Terrain selectRandomTerrain() {
        myTerrain = new EasyTerrain();
        return myTerrain;
    }
    
    /**
     * @return an object selected from the easy treasure pool
     */
    @Override
    public Treasure selectRandomTreasure() {
        myTreasure = new EasyTreasure();
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

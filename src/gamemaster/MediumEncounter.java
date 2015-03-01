/**
 * @filename MediumEncounter.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Defines a medium encounter
 */
package gamemaster;

/**
 * Defines a medium encounter
 * @author Victor Brode
 */
public class MediumEncounter extends AbstractEncounterFactory  {
    /**
     * @return an object selected from the medium monster list
     */
    @Override
    public Monster selectRandomMonster() {
        myMonster = new MediumMonster();
        return myMonster;
    }
    
    /**
     * Selects a terrain from the medium terrain list.
     * @return an object selected from the medium terrain list
     */
    @Override 
    public Terrain selectRandomTerrain() {
        myTerrain = new MediumTerrain();
        return myTerrain;
    }
    
    /**
     * @return an object selected from the medium treasure pool
     */
    @Override
    public Treasure selectRandomTreasure() {
        myTreasure = new MediumTreasure();
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

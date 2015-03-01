/**
 * @filename MediumTerrain.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates a medium terrain and reports terrain information
 */
package gamemaster;

/**
 * Creates a medium terrain and reports terrain information
 * @author Victor Brode
 */
public class MediumTerrain implements Terrain {
    private String TerrainType;
    
    /**
     * Constructor: Randomly selects a terrain.
     */
    public MediumTerrain() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                TerrainType="Beach";
                break;
            case 1:
                TerrainType="Desert";
                break;
            case 2:
                TerrainType="Sea Vessel";
                break;
        }
    }
    
    /**
     * Gets the name and difficulty level of the terrain this object describes
     * @return A string describing the terrain difficulty and name
     */
    @Override
    public String getTerrain() {
        return "Medium terrain: "+TerrainType;
    }
}

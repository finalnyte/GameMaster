/**
 * @filename HardTerrain.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates a hard terrain and reports terrain information
 */
package gamemaster;

/**
 * Creates a hard terrain and reports terrain information
 * @author Victor Brode
 */
public class HardTerrain implements Terrain {
    private String TerrainType;
    
    /**
     * Constructor: Randomly selects a terrain.
     */
    public HardTerrain() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                TerrainType="Active Volcano";
                break;
            case 1:
                TerrainType="Underwater";
                break;
            case 2:
                TerrainType="Flying";
                break;
        }
    }
    
    /**
     * Gets the name and difficulty level of the terrain this object describes
     * @return A string describing the terrain difficulty and name
     */
    @Override
    public String getTerrain() {
        return "Hard terrain: "+TerrainType;
    }
}

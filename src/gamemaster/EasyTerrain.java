/**
 * @filename EasyTerrain.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Creates an easy terrain and reports terrain information
 */
package gamemaster;

/**
 * Creates an easy terrain and reports terrain information
 * @author Victor Brode
 */
public class EasyTerrain implements Terrain {
    private String TerrainType;
    
    /**
     * Constructor: Randomly selects a terrain.
     */
    public EasyTerrain() {
        switch ((int)(Math.random()*3))
        {
            case 0:
                TerrainType="Grass";
                break;
            case 1:
                TerrainType="Footpath";
                break;
            case 2:
                TerrainType="Urban";
                break;
        }
    }
    
    /**
     * Gets the name and difficulty level of the terrain this object describes
     * @return A string describing the terrain difficulty and name
     */
    @Override
    public String getTerrain() {
        return "Easy terrain: "+TerrainType;
    }
}

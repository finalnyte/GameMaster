/**
 * @filename Monster.java
 * @author Victor Brode
 * @lastmodified 02/25/2015
 * @purpose Describes the monster faced during an encounter
 */
package gamemaster;

/**
 * Describes the monster faced during an encounter
 */
public interface Monster {

    /**
     * Gets the name and difficulty level of the monster this object describes
     * @return A string describing the monster class and the monster name
     */
    public String getMonster();
}

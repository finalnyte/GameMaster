/**
 * @filename GameMaster.java
 * @author Victor Brode
 * @lastmodified 02/22/2015
 * @purpose Test class for the GameDirector concepts
 */
package gamemaster;

public class GameMaster {

    public static void main(String[] args) {
        int iHealth=100;    // Health of player, out of 100
        int iProgress=0;    // Progress of player, out of 100
        
        ChallengeBuilder builder = new RandomChallengeBuilder();
        GameDirector director = new RandomChallengeDirector();
        AbstractEncounterFactory aef = director.create(builder, ChallengeBuilder.EncounterDifficulty.EASY, iProgress);
        System.out.println(aef);
        
        iProgress+=25;
        aef = director.create(builder, ChallengeBuilder.EncounterDifficulty.MEDIUM, iProgress);
        System.out.println(aef);
        
        builder = new ScriptedChallengeBuilder();
        director = new ScriptedChallengeDirector();
        iProgress+=25;
        aef = director.create(builder, ChallengeBuilder.EncounterDifficulty.HARD, iProgress);
        System.out.println(aef);
    }
}

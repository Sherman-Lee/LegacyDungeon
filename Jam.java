import java.awt.Image;
import java.awt.image.BufferedImage;


public class Jam extends Enemy
{
    //lol gridworld's revenge
    public Jam()
    {
        description = "More annoying than dangerous, this gelatinous creature simply gets in the way.";
        spawnRate = 1;
        //characterID = 2;
        maxHealth = 5;
        currentHealth = 5;
        
    }
    public BufferedImage getImage()
    {
        Image slimeImage = null;
        if (this.imageID == 0 && this.isHit == false)
        {
            switch(this.direction)
            {
            case 0: return LegacyDungeonPaintTest.slimeImageEast;
            case 1: return LegacyDungeonPaintTest.slimeImageNorth;
            case 2: return LegacyDungeonPaintTest.slimeImageWest;
            case 3: return LegacyDungeonPaintTest.slimeImageSouth;
            default: return LegacyDungeonPaintTest.slimeImageEast;
            }
        }
        //Jam alt. image
        else if(this.imageID == 1 && this.isHit == false)
        {
            switch(this.direction)
            {
            case 0: return LegacyDungeonPaintTest.slimeImageEastWalk;
            case 1: return LegacyDungeonPaintTest.slimeImageNorthWalk;
            case 2: return LegacyDungeonPaintTest.slimeImageWestWalk;
            case 3: return LegacyDungeonPaintTest.slimeImageSouthWalk;
            default: return LegacyDungeonPaintTest.slimeImageEastWalk;
            }
        }
        
        else if(this.isHit == true)
        {
            switch(this.direction)
            {
            case 0: return LegacyDungeonPaintTest.slimeImageEastHit;
            case 1: return LegacyDungeonPaintTest.slimeImageNorthHit;
            case 2: return LegacyDungeonPaintTest.slimeImageWestHit;
            case 3: return LegacyDungeonPaintTest.slimeImageSouthHit;
            default: return LegacyDungeonPaintTest.slimeImageEastHit;
            }
        }
        
        else 
        {
            //Should not run.
            return LegacyDungeonPaintTest.slimeImageEast;
        }
    }
    
    public void act(LegacyDungeonPaintTest lDungeon)
    {
        //Picks random spot to go to. Including walls.
        AIRandom(lDungeon);
    }
}

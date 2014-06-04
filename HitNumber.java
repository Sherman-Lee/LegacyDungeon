
public class HitNumber {
int damage;
int timer;
int x;
int y;
int initialTime;

    public HitNumber(int inputDamage, int xInput, int yInput)
    {
        damage = inputDamage;
        int secondsLiving = 2;

        timer = (1000 * secondsLiving)/LegacyDungeonPaintTest.DELAY;
        initialTime = timer;
        x = xInput;
        y = yInput;
        
    }
}

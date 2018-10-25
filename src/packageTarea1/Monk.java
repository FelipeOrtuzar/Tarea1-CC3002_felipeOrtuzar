package packageTarea1;
/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */
public class Monk extends Unit {
    /**
     *constructor
     *
     */
    public Monk(){
        this.hp = 100.0;
        this.maxHp = 2.0*hp;
        this.state = true;
        this.attackDamage = 20.0;
        this.ID = 6;
    }
}

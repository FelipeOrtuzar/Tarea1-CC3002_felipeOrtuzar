package packageTarea1;
/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */
public class CavalryUnit extends Unit{
    /**
     *Constructor of the CavalryUnit class
     *
     */
    public CavalryUnit(){
        this.state = true;
        this.attackDamage = 20.0;
        this.hp = 100.0;
        this.maxHp = 2.0*hp;
        this.ID = 3;
    }
}

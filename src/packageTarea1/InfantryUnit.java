package packageTarea1;
/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */
public class InfantryUnit extends Unit {
    /**
     *constructor
     *
     */
    public InfantryUnit(){
        this.attackDamage = 20.0;
        this.hp = 100.0;
        this.maxHp = 2.0*hp;
        this.state = true;
        this.ID = 1;
    }
}

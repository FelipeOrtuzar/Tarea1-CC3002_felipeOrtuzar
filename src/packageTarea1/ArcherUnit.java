package packageTarea1;

/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */


public class ArcherUnit extends Unit {

    /**
     *Constructor for the ArcherUnit class
     *
     */
    public ArcherUnit() {
        this.state = true;
        this.attackDamage = 20.0;
        this.hp = 100.0;
        this.maxHp = 2.0*hp;
        this.ID = 2;
    }
}

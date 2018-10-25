package packageTarea1;
/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */

public abstract class Unit extends Entity implements Attacker {
    /**
     *attackDamage: the amount of damage that it can deal
     *
     */
    protected double attackDamage;

    /**
     *getter
     *
     */
    public double getAttackDamage(){
        return this.attackDamage;
    }

    /**
     *
     *      attack: this attack a Entity
     *       @param Entity
     *       @return void
     *      *
     *
     */
    public void attack(Entity entity){
        if(this.state) {
            int attacker = this.ID;
            int x = 0;
            int attacked = entity.getID();
            double attackConstant = this.attackLookUpTable[attacked-1][attacker-1];

            entity.receiveAttack(attackConstant * this.attackDamage);
        }
    }

}

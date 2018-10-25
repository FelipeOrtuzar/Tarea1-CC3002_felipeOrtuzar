package packageTarea1;
/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */
public class DefBuilding extends Building implements Attacker {
    /**
     *
     *attackDamage will be used for the building that are able to attack
     */
    public double attackDamage;
    /**
     * getAttackDamage: get the attackDamage component
     * @param void
     * @return double
     *
     */
    public double getAttackDamage(){
        return this.attackDamage;
    }
    /**
     *attack: this attack a Entity
     * @param Entity
     * @return void
     */
    public void attack(Entity entity){
        if(this.state) {
            int attacker = this.ID;
            int attacked = entity.getID();
            double attackConstant = this.attackLookUpTable[attacked-1][attacker-1];
            entity.receiveAttack(attackConstant * this.attackDamage);
        }
    }



}

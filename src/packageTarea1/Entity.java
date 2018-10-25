package packageTarea1;
/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */
public abstract class Entity implements Attackable{
    /**
     *hp: the hit points of the Entity
     *
     */
    protected double hp;

    /**
     *state: boolean that describes if the Entity is alive or not
     *
     */
    protected boolean state;

    /**
     *ID: identification number used for the attack
     *
     */
    protected int ID;

    /**
     *maxHp: double that states the max hit points possible for a Entity
     *
     */
    protected double maxHp;

    /**
     *attackLookUpTable: easy way to identify the constant of every attack
     *
     */
    protected final double[][] attackLookUpTable = {
            {1.0, 1.2, 1.0, 1.5, 0.8, -0.5, 1.2, 0.0},
            {1.2, 1.2, 1.5, 1.5, 1.0, -0.5, 1.2, 0.0},
            {1.2, 1.0, 1.0, 1.0, 0.5, -0.5, 1.2, 0.0},
            {1.2, 0.8, 1.2, 1.5, -0.5, 0.0, 0.5, 0.0},
            {1.5, 1.5, 1.5, 1.5, 1.0, -0.5, 1.2, 0.0},
            {1000.0, 1000.0, 1000.0, 1000.0, 0.0, -0.5, 1000.0, 0.0},
            {0.3, 0.1, 0.3, 2.0, -0.3, 0.0, 0.1, 0.0},
            {0.7, 0.7, 0.7, 2.0, -0.7, 0.0, 0.7, 0.0}
    };

    /**
     *
     *getters
     */
    public double getHp(){
        return this.hp;
    }

    public int getID() {
        return ID;
    }

    public boolean getState(){
        return this.state;
    }

    public double getMaxHp() {
        return maxHp;
    }

    /**
     *setters
     *
     */
    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    /**
     *receiveAttack: methods use when an entity is attacked by another, it damages or heals it
     * @param : double
     * @return void
     */
    public void receiveAttack(double damage) {
        if(this.state) {
            this.hp -= damage;
            if (damage >= 0.0) {
                if(this.hp < 0.0){
                    this.hp = 0.0;
                    this.state = false;
                }
            }
            else {
                if(this.hp > this.maxHp){
                    this.hp = maxHp;
                }
            }
        }
    }
}


package packageTarea1;
/**
 *@author Felipe Ortuzar </felipeortuzarpk@gmail.com>
 *
 */
/**
 *Attacker implements the ability to attack another Entity and get their own attackDamage
 *
 */
public interface Attacker {

    double getAttackDamage();
    void attack(Entity entity);

}

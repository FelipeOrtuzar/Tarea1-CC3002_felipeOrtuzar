package packageTarea1;


import static junit.framework.TestCase.assertEquals;

public class test {

    @org.junit.Test
    public void test_getters() {
        InfantryUnit infantryUnit = new InfantryUnit();
        ArcherUnit archerUnit = new ArcherUnit();
        CavalryUnit cavalryUnit = new CavalryUnit();
        SiegeUnit siegeUnit = new SiegeUnit();
        Monk monk = new Monk();
        Villager villager = new Villager();
        Castle castle = new Castle();
        Barracks barracks = new Barracks();

        assertEquals(100.0, infantryUnit.getHp());
        assertEquals(100.0, archerUnit.getHp());
        assertEquals(100.0, cavalryUnit.getHp());
        assertEquals(100.0, siegeUnit.getHp());
        assertEquals(100.0, monk.getHp());
        assertEquals(100.0, villager.getHp());
        assertEquals(500.0, barracks.getHp());
        assertEquals(500.0, castle.getHp());

        assertEquals(200.0, infantryUnit.getMaxHp());
        assertEquals(200.0, archerUnit.getMaxHp());
        assertEquals(200.0, cavalryUnit.getMaxHp());
        assertEquals(200.0, siegeUnit.getMaxHp());
        assertEquals(200.0, monk.getMaxHp());
        assertEquals(200.0, villager.getMaxHp());
        assertEquals(500.0, barracks.getMaxHp());
        assertEquals(500.0, castle.getMaxHp());

        assertEquals(20.0, infantryUnit.getAttackDamage());
        assertEquals(20.0, archerUnit.getAttackDamage());
        assertEquals(20.0, cavalryUnit.getAttackDamage());
        assertEquals(20.0, siegeUnit.getAttackDamage());
        assertEquals(20.0, monk.getAttackDamage());
        assertEquals(20.0, villager.getAttackDamage());
        assertEquals(20.0, castle.getAttackDamage());

    }

    // por alguna razon los beforetest me hacen arrojar nullpointersException en los demas test. aka.
    // no hace nada y tengo que poner el before en cada test
    @org.junit.Test public void test_id() {

        InfantryUnit infantryUnit = new InfantryUnit();
        ArcherUnit archerUnit = new ArcherUnit();
        CavalryUnit cavalryUnit = new CavalryUnit();
        SiegeUnit siegeUnit = new SiegeUnit();
        Monk monk = new Monk();
        Villager villager = new Villager();
        Castle castle = new Castle();
        Barracks barracks = new Barracks();

        assertEquals(1,infantryUnit.getID());
        assertEquals(2,archerUnit.getID());
        assertEquals(3,cavalryUnit.getID());
        assertEquals(4,siegeUnit.getID());
        assertEquals(5,villager.getID());
        assertEquals(6,monk.getID());
        assertEquals(7,castle.getID());
        assertEquals(8,barracks.getID());
    }

    @org.junit.Test public void test_attack_archer(){

        InfantryUnit infantryUnit = new InfantryUnit();
        ArcherUnit archerUnit = new ArcherUnit();
        CavalryUnit cavalryUnit = new CavalryUnit();
        SiegeUnit siegeUnit = new SiegeUnit();
        Monk monk = new Monk();
        Villager villager = new Villager();
        Castle castle = new Castle();
        Barracks barracks = new Barracks();

        infantryUnit.attack(archerUnit);
        assertEquals(76.0, archerUnit.getHp());
        assertEquals(true, archerUnit.getState());

        cavalryUnit.attack(archerUnit);
        assertEquals(46.0, archerUnit.getHp());
        assertEquals(true, archerUnit.getState());

        siegeUnit.attack(archerUnit);
        assertEquals(16.0, archerUnit.getHp());
        assertEquals(true, archerUnit.getState());

        monk.attack(archerUnit);
        assertEquals(26.0, archerUnit.getHp());
        assertEquals(true, archerUnit.getState());

        villager.attack(archerUnit);
        assertEquals(6.0, archerUnit.getHp());
        assertEquals(true, archerUnit.getState());

        castle.attack(archerUnit);
        assertEquals(0.0, archerUnit.getHp());
        assertEquals(false, archerUnit.getState());

    }

    @org.junit.Test
    public void test_attack_monk() {

        InfantryUnit infantryUnit = new InfantryUnit();
        ArcherUnit archerUnit = new ArcherUnit();
        CavalryUnit cavalryUnit = new CavalryUnit();
        SiegeUnit siegeUnit = new SiegeUnit();
        Monk monk = new Monk();
        Villager villager = new Villager();
        Castle castle = new Castle();
        Barracks barracks = new Barracks();

        infantryUnit.attack(monk);
        assertEquals(0.0, monk.getHp());
        assertEquals(false, monk.getState());
        monk.setHp(100.0);
        monk.setState(true);


        archerUnit.attack(monk);
        assertEquals(0.0, monk.getHp());
        assertEquals(false, monk.getState());
        monk.setHp(100.0);
        monk.setState(true);

        cavalryUnit.attack(monk);
        assertEquals(0.0, monk.getHp());
        assertEquals(false, monk.getState());
        monk.setHp(100.0);
        monk.setState(true);

        siegeUnit.attack(monk);
        assertEquals(0.0, monk.getHp());
        assertEquals(false, monk.getState());
        monk.setHp(100.0);
        monk.setState(true);

        villager.attack(monk);
        assertEquals(100.0, monk.getHp());
        assertEquals(true, monk.getState());

        castle.attack(monk);
        assertEquals(0.0, monk.getHp());
        assertEquals(false, monk.getState());
    }

    @org.junit.Test
    public void test_attack_barracks() {

        InfantryUnit infantryUnit = new InfantryUnit();
        ArcherUnit archerUnit = new ArcherUnit();
        CavalryUnit cavalryUnit = new CavalryUnit();
        SiegeUnit siegeUnit = new SiegeUnit();
        Monk monk = new Monk();
        Villager villager = new Villager();
        Castle castle = new Castle();
        Barracks barracks = new Barracks();


        infantryUnit.attack(barracks);
        assertEquals(486.0, barracks.getHp());
        assertEquals(true, barracks.getState());

        cavalryUnit.attack(barracks);
        assertEquals(472.0, barracks.getHp());
        assertEquals(true, barracks.getState());

        siegeUnit.attack(barracks);
        assertEquals(432.0, barracks.getHp());
        assertEquals(true, barracks.getState());

        monk.attack(barracks);
        assertEquals(432.0, barracks.getHp());
        assertEquals(true, barracks.getState());

        villager.attack(barracks);
        assertEquals(446.0, barracks.getHp());
        assertEquals(true, barracks.getState());

        castle.attack(barracks);
        assertEquals(432.0, barracks.getHp());
        assertEquals(true, barracks.getState());
    }
}

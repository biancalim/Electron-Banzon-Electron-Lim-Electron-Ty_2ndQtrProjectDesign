package aloverorafighter;

import java.util.ArrayList;

public class Shop implements Available {
    
    private boolean availability;
    private String name;
    private ArrayList<Weapon> weaponsForSale;
    private ArrayList<Weapon> purchasedWeapons;
    private ArrayList<Potion> potionsForSale;
    private ArrayList<Potion> purchasedPotions;
    
    public void buyWeapon(Weapon weapon) {
        this.weaponsForSale.remove(weapon);
        this.purchasedWeapons.add(weapon);
    }
    
    public void buyPotion(Potion potion) {
        this.potionsForSale.remove(potion);
        this.purchasedPotions.add(potion);
    }
    
    @Override
    public void available() {
        this.availability = true;
    }
}

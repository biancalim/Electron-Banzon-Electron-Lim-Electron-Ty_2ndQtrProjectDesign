package aloverorafighter;


public class Potion extends Item {
    
    private int healthRegenerated;
    private int attackDebuff;
    private int defenseDebuff;
    
    
    public void setAttackDebuff(int newAttackDebuff) {
        this.attackDebuff = newAttackDebuff;
    }
    
    public void setDefenseDebuff(int newDefenseDebuff) {
        this.defenseDebuff = newDefenseDebuff;
    }
    
    public void setHealthRegenerated(int newHealthRegenerated) {
        this.healthRegenerated = newHealthRegenerated;
    }
    

    public int getAttackDebuff() {
        return this.attackDebuff;
    }
    
    public int getDefenseDebuff() {
        return this.defenseDebuff;
    }
    
    public int getHealthRegenerated() {
        return this.healthRegenerated;
    }
    
}

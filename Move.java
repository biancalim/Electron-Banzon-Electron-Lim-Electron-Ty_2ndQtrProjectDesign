package aloverorafighter;

public class Move {
    
    private String name;
    
    private int attackBonus;
    private int defenseBonus;
    private int healthRegenerated;
    private int enemyAttackDebuff;
    private int enemyDefenseDebuff;
    private int damageToEnemy;
    private int cooldownTime;
    private int timeElapsedSinceLastUse;
    private int lengthOfEffect;
    private boolean usability;
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAttackBonus(int newAttackBonus) {
        this.attackBonus = newAttackBonus;
    }
    
    public void setDefenseBonus(int newDefenseBonus) {
        this.defenseBonus = newDefenseBonus;
    }
    
    public void setHealthRegenerated(int newHealthRegenerated) {
        this.healthRegenerated = newHealthRegenerated;
    }
    
    public void setEnemyAttackDebuff(int newEnemyAttackDebuff) {
        this.enemyAttackDebuff = newEnemyAttackDebuff;
    }
    
    public void setEnemyDefenseDebuff(int newEnemyDefenseDebuff) {
        this.enemyDefenseDebuff = newEnemyDefenseDebuff;
    }
    
    public void setDamageToEnemy(int newDamageToEnemy) {
        this.damageToEnemy = newDamageToEnemy;
    }
    
    public void setCooldownTime(int newCooldownTime) {
        this.cooldownTime = newCooldownTime;
    }
    
    public void setTimeElapsedSinceLastUse(int newTimeElapsedSinceLastUse) {
        this.timeElapsedSinceLastUse = newTimeElapsedSinceLastUse;
    }
    
    public void setLengthOfEffect(int newLengthOfEffect) {
        this.lengthOfEffect = newLengthOfEffect;
    }
    
    public void setUsability(boolean newUsability) {
        this.usability = newUsability;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAttackBonus() {
        return this.attackBonus;
    }
    
    public int getDefenseBonus() {
        return this.defenseBonus;
    }
    
    public int getHealthRegenerated() {
        return this.healthRegenerated;
    }
    
    public int getEnemyAttackDebuff() {
        return this.enemyAttackDebuff;
    }
    
    public int getEnemyDefenseDebuff() {
        return this.enemyDefenseDebuff;
    }
    
    public int getDamageToEnemy() {
        return this.damageToEnemy;
    }
    
    public int getCooldownTime() {
        return this.cooldownTime;
    }
    
    public int getTimeElapsedSinceLastUse() {
        return this.timeElapsedSinceLastUse;
    }
    
    public int getLengthOfEffect() {
        return this.lengthOfEffect;
    }
    
    public boolean getUsability() {
        return this.usability;
    }
    
}

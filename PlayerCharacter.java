package aloverorafighter;


public class PlayerCharacter extends Entity {
    
    private String eyeColor;
    private String hairColor;
    
    private int currentXP;
    private int currentLevel;
    private int xpForNextLevel;
    private int currentMoneyAmount;
    
    private Weapon weapon;
    private Potion potion;
    private Potion oldPotion;
    
    private Section currentSection;
    private Stage currentStage;
    private Shop currentShop;
    
    
    public void setEyeColor(String newEyeColor) {
        this.eyeColor = newEyeColor;
    }
    
    public void setHairColor(String newHairColor) {
        this.hairColor = newHairColor;
    }
    
    public void setCurrentXP(int newCurrentXP) {
        this.currentXP = newCurrentXP;
    }
    
    public void setCurrentLevel(int newCurrentLevel) {
        this.currentLevel = newCurrentLevel;
    }
    
    public void setXPForNextLevel(int newXPForNextLevel) {
        this.xpForNextLevel = newXPForNextLevel;
    }
    
    public void setCurrentMoneyAmount(int newCurrentMoneyAmount) {
        this.currentMoneyAmount = newCurrentMoneyAmount;
    }
    
    public void setWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }
    
    public void setPotion(Potion newPotion) {
        this.potion = newPotion;
    }
    
    public void setOldPotion(Potion newOldPotion) {
        this.oldPotion = newOldPotion;
    }
    
    public void setCurrentSection(Section newCurrentSection) {
        this.currentSection = newCurrentSection;
    }
    
    public void setCurrentStage(Stage newCurrentStage) {
        this.currentStage = newCurrentStage;
    }
    
    public void setCurrentShop(Shop newCurrentShop) {
        this.currentShop = newCurrentShop;
    }
    
    public String getEyeColor() {
        return this.eyeColor;
    }
    
    public String getHairColor() {
        return this.hairColor;
    }
    
    public int getCurrentXP() {
        return this.currentXP;
    }
    
    public int getCurrentLevel() {
        return this.currentLevel;
    }
    
    public int getXPForNextLevel() {
        return this.xpForNextLevel;
    }
    
    public int getCurrentMoneyAmount() {
        return this.currentMoneyAmount;
    }
    
    public Weapon getWeapon() {
        return this.weapon;
    }
    
    public Potion getPotion() {
        return this.potion;
    }
    
    public Potion getOldPotion() {
        return this.oldPotion;
    }
    
    public Section getCurrentSection() {
        return this.currentSection;
    }
    
    public Stage getCurrentStage() {
        return this.currentStage;
    }
    
    public Shop getCurrentShop() {
        return this.currentShop;
    }
    
}

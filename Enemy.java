package aloverorafighter;

public class Enemy extends Entity {
    
    private int xpToGain;
    private int moneyToGain;
    private int xpToLose;
    private int moneyToLose;
    private int currentDisposition;
    private int maxDisposition;
    private int dispositionModifier;
    
    public void setXPToGain(int newXPToGain) {
        this.xpToGain = newXPToGain;
    }
    
    public void setMoneyToGain(int newMoneyToGain) {
        this.moneyToGain = newMoneyToGain;
    }
    
    public void setXPToLose(int newXPToLose) {
        this.xpToLose = newXPToLose;
    }
    
    public void setMoneyToLose(int newMoneyToLose) {
        this.moneyToLose = newMoneyToLose;
    }
    
    public void setCurrentDisposition(int newCurrentDisposition) {
        this.currentDisposition = newCurrentDisposition;
    }
    
    public void setMaxDisposition(int newMaxDisposition) {
        this.maxDisposition = newMaxDisposition;
    }
    
    public void setDispositionModifier(int newDispositionModifier) {
        this.dispositionModifier = newDispositionModifier;
    }
    
    public int getXPToGain() {
        return this.xpToGain;
    }
    
    public int getMoneyToGain() {
        return this.moneyToGain;
    }
    
    public int getXPToLose() {
        return this.xpToLose;
    }
    
    public int getMoneyToLose() {
        return this.moneyToLose;
    }
    
    public int getCurrentDisposition() {
        return this.currentDisposition;
    }
    
    public int getMaxDisposition() {
        return this.maxDisposition;
    }
    
    public int getDispositionModifier() {
        return this.dispositionModifier;
    }
            
    
}

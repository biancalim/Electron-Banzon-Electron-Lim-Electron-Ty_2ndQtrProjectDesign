package aloverorafighter;

import java.util.ArrayList;

public class Stage implements Available {
    
    private boolean availability;
    private Enemy enemy;
    private ArrayList<DialogueRound> dialogueRounds;
    private String name;
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setSectionShop(Enemy newEnemy) {
        this.enemy = newEnemy;
    }
    
    public void setDialogueRounds(ArrayList<DialogueRound> newDialogueRounds) {
        this.dialogueRounds = newDialogueRounds;
    }
    
    public void setAvailability(boolean newAvailability) {
        this.availability = newAvailability;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Enemy getEnemy() { 
        return this.enemy;
    }
    
    public boolean getAvailability() {
        return this.availability;
    }
    
    public ArrayList<DialogueRound> getDialogueRounds() {
        return this.dialogueRounds;
    }
    
    @Override
    public void available() {
        this.availability = true;
    }
    
}

package aloverorafighter;

import java.util.ArrayList;

public class Section implements Available {
    
    private ArrayList<Stage> stagesOfTheSection;
    private Shop sectionShop;
    private boolean availability;
    private String name;
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setSectionShop(Shop newSectionShop) {
        this.sectionShop = newSectionShop;
    }
    
    public void setStagesOfTheSection(ArrayList<Stage> newStagesOfTheSection) {
        this.stagesOfTheSection = newStagesOfTheSection;
    }
    
    public void setAvailability(boolean newAvailability) {
        this.availability = newAvailability;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Shop getSectionShop() { 
        return this.sectionShop;
    }
    
    public boolean getAvailability() {
        return this.availability;
    }
    
    public ArrayList<Stage> getStagesOfTheSection() {
        return this.stagesOfTheSection;
    }
    
    @Override
    public void available() {
        this.availability = true;
    }
}

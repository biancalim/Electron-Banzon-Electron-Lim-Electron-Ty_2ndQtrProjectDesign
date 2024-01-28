package aloverorafighter;

public class Dialogue {
    
    private int dispositionEffect;
    private String text;
    
    public void setText(String newText) {
        this.text = newText;
    }
    
    public void setDispositionEffect(int newDispositionEffect) {
        this.dispositionEffect = newDispositionEffect;
    }
    
    public String getText() {
        return this.text;
    }
    
    public int getDispositionEffect() {
        return this.dispositionEffect;
    }
    
}

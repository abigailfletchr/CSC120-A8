import java.util.ArrayList;

public class Game implements Contract {

    private String item;
    private ArrayList <String> inventory;
    private Boolean wantItem;
    private ArrayList <String> hands;
    private String direction;
    private Integer x;
    private Integer y;

    // public Game() {
    
    // }


    // my own getter
    public boolean wantItem() {
        return wantItem;
    }



    public void grab(String item) {
        this.inventory.add(item);
    } 

    public String drop(String item) {
        if(this.wantItem) {
            return "You still want this item!" + item + "not dropped.";
        }
        else{
            this.inventory.remove(item);
            return item + "dropped.";
        }
    }

    public void examine(String item) {
       this.hands.add(item);
       if(this.wantItem) {
        this.hands.remove(item);
        this.inventory.add(item);
       }
    }

    public void use(String item) {

    }

    public boolean walk(String direction) {

        boolean;
    }

    public boolean fly(int x, int y){
        boolean;
    }

    public Number shrink(){

    }

    public Number grow(){

    }


    public void rest(){
        
    }


    void undo(){

    }

    }






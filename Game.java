import java.util.ArrayList;

public class Game implements Contract {

    Player lonelyPlayer; // the one singular player in this game

    public Game(){
        this.lonelyPlayer = new Player();
        System.out.println("Our game has been created.");
    }

    public void grab(String item){
        lonelyPlayer.putInLeftHand(item);
    }

    public String drop(String item){
        lonelyPlayer.takeOutOfLeftHand(item);
        return item + " dropped.";
    }

    public void examine(String item){
        if(this.lonelyPlayer.getWant()){
            this.lonelyPlayer.putInRightHand(item);
        }else{
            drop(item);
        }
    } 

    public void use(String item){
        this.lonelyPlayer.playWithItem(item);
    }

    public boolean walk(String direction){

    }

    public boolean fly(int x, int y){

    }

    public Number shrink(){

    }

    public Number grow(){

    } 

    public void rest(){

    }

    public void undo(){
        
    }


    public void main(String[] args){

    }

}






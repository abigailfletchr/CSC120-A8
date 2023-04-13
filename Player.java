public class Player{

    // attributes
    String[] hands = new String[2]; // 2 hands 1 object in each hand
    String size;
    int health; // 10 health is max
    boolean want;


    // default constructor
    public Player(){
        this.size = "Medium";
        this.health = 10;
        this.hands[0] = "empty";
        this.hands[1] = "empty";
        this.want = true;
        System.out.println("Your player has been created.");
    }

    public Player(String[] handObjects, String size, int health, boolean want){
        this.hands = handObjects;
        this.size = size;
        this.health = health;
        this.want = want;
        System.out.println("Your player has been created.");
    }

    // methods
    public String getSize(){
        return this.size;
    }

    public int getHealth(){
        return this.health;
    }

    public String[] getHands(){
        return this.hands; // fix this later
    }

    // setters

    public void putInLeftHand(String obj){
        this.hands[0] = obj;
    }

    public void putInRightHand(String obj){
        this.hands[1] = obj;
    }

    public void takeOutOfLeftHand(String obj){
        this.hands[0] = "empty";
    }

    public void takeOutOfRightHand(String obj){
        this.hands[1] = "empty";
    }

    public void addHealth(int addBy){
        if(this.health >= 10){
            return;
        }else{
            this.health += addBy;
        }
    }

    public void reduceHealth(int reduceBy){
        this.health -= reduceBy;
    }

    public void changeSize(String size){
        this.size = size;
    }

    public boolean getWant(){
        return want;
    }

    public void changeWant(){
        this.want = !want;
    }

    public String playWithItem(String item){
        return "I'm playing with " + item;
    }

}

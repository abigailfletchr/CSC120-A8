public class Player{

    // attributes
    String[] hands = new String[2]; // 2 hands 1 object in each hand
    int size;
    int health; // 10 health is max
    boolean want;
    boolean canWalk;
    boolean canFly;


    // default constructor
    public Player(){
        this.size = 50;
        this.health = 10;
        this.hands[0] = "empty";
        this.hands[1] = "empty";
        this.want = true;
        this.canWalk = false;
        this.canFly = false;
        System.out.println("Your player has been created.");
    }

    public Player(String[] handObjects, int size, int health, boolean want){
        this.hands = handObjects;
        this.size = size;
        this.health = health;
        this.want = want;
        System.out.println("Your player has been created.");
    }

    // methods
    public int getSize(){
        return this.size;
    }

    public int getHealth(){
        return this.health;
    }

    public String[] getHands(){
        return this.hands; // fix this later
    }

    // setters

    public void putInLeftHand(String item){
        this.hands[0] = item;
    }

    public void putInRightHand(String item){
        this.hands[1] = item;
    }

    public void takeOutOfLeftHand(String item){
        this.hands[0] = "empty";
    }

    public void takeOutOfRightHand(String item){
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

    public void changeSize(int size){
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

    public boolean getCanFly(){
        return this.canFly;
    }

    public boolean getCanWalk(){
        return this.canWalk;
    }

    public boolean walk(String direction){
        if(this.getCanWalk()){
            System.out.println("We are walking in " + direction + " direction.");
            return true;
        }else{
            System.out.println("Sorry, you don't have the ability to walk.");
            return false;
        }
    }

    public boolean fly(int x, int y){
        if(this.getCanFly()){
            System.out.println("We are flying to (" + x + ", " + y + ").");
            return true;
        }else{
            System.out.println("Sorry, you don't have the ability to fly.");
            return false;
        }
    }




}

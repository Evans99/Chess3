package com.example.guest_20.chess3;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public abstract class Piece {

    private int numOfPieces;
    private int id;
    protected int charm;
    protected int health;
    protected String name;
    protected Position pos;
    protected String side;

    public final int MAX_CHARM = 25;
    public final int MIN_CHARM = 1;

    public final int MAX_HEALTH = 30;
    public final int MIN_HEALTH = 0;

    protected int healthCap;

    public final int MAX_NAME_LENGTH = 7;
    public final int MIN_NAME_LENGTH = 1;

    private boolean alive;

    public Piece(){
        this(new Position(),"Bowhamm");
    }

    public Piece(Position p){
        this(p,"Bowhamm");
    }

    public Piece(Position p,String n){
        this(p,n,1);
    }

    public Piece(Position p,String n,int s){
        setName(n);
        setPosition(p);
        setHealth(1);
        setCharm(1);
        setSide(s);
    }

    public void setSide(int x){
        if(x==1)
            side = "NORTH";
        if(x==2)
            side = "SOUTH";
    }

    public String getSide(){
        return side;
    }

    public void setHealth(int x){
        if(x>MIN_HEALTH && x<MAX_HEALTH)
            health = x;
    }

    public void setCharm(int x){
        if(x>MIN_CHARM && x<MAX_CHARM)
            charm = x;
    }

    public boolean isAlive(){
        return alive;
    }

    public void addHealth(int x){
        if(health+x < healthCap){
            health+=x;
        }
        else{
            health = healthCap;
        }
    }

    public boolean takeDamage(int x){  //returns false if dead
        health = health-x;

        if(health<=0){
            alive = false;
        }

        return alive;
    }

    public boolean setName(String s){
        if(s.length() <= MAX_NAME_LENGTH && s.length() >= MIN_NAME_LENGTH){
            name = s;
            return true;
        }

        return false;
    }

    public int doDamage(){
        return 10;
    }

    public void setPosition(Position p){
        pos = p;
    }

    public Position getPosition(){
        return pos;
    }

    public String getName(){
        return name;
    }

    public int getCharm(){
        return charm;
    }

    public int getHealth(){
        return health;
    }

    public int getID(){
        return id;
    }

    public int returnX(){
        return pos.getX();
    }

    public abstract boolean possibleMove(Position p);


}

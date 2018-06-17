package com.example.guest_20.chess3;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Position {

    private final int MAX = 7;
    private final int MIN = 0;

    private int x;
    private int y;

    public Position(){
        this(1,1);
    }

    public Position(int x,int y){
        setX(x);
        setY(y);
    }

    public void setY(int y){
        if(y>=MIN && y<=MAX)
            this.y = y;
    }

    public void setX(int x){
        if(x>=MIN && x<=MAX)
            this.x = x;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean equals(Object obj){
        Position temp = (Position)obj;

        if(temp.getY() == this.getY() && temp.getX()==this.getX())
            return true;
        return false;
    }
}

package com.example.guest_20.chess3;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Queen extends Piece {

    public Queen(){
        super();
    }

    public Queen(Position p,String n,int s){
        super(p,n,s);
    }

    @Override
    public boolean possibleMove(Position p) {

        if(pos.getY()==p.getY() ||
                pos.getX()==p.getX() ||
                Math.abs(pos.getX()-p.getX())==Math.abs(pos.getY()-p.getY()))
            return true;

        return false;
    }
}

package com.example.guest_20.chess3;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Knight extends Piece {

    public Knight(){
        super();
    }

    public Knight(Position p,String n,int s){
        super(p,n,s);
    }

    @Override
    public boolean possibleMove(Position p) {

        if((p.getX()==pos.getX()-2 && p.getY()==pos.getY()-1) ||
                (p.getX()==pos.getX()-1) && (p.getY()==pos.getY()-2) ||
                (p.getX()==pos.getX()+1) && (p.getY()==pos.getY()-2) ||
                (p.getX()==pos.getX()+2) && (p.getY()==pos.getY()-1) ||
                (p.getX()==pos.getX()+2) && (p.getY()==pos.getY()+1) ||
                (p.getX()==pos.getX()+1) && (p.getY()==pos.getY()+2) ||
                (p.getX()==pos.getX()-1) && (p.getY()==pos.getY()+2) ||
                (p.getX()==pos.getX()-2) && (p.getY()==pos.getY()+1))
            return true;

        return false;
    }
}

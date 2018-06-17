package com.example.guest_20.chess3;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Castle extends Piece {

    public Castle(){
        super();
    }

    public Castle(Position p,String n,int s){
        super(p,n,s);
    }

    @Override
    public boolean possibleMove(Position p) {




        return false;
    }
}

package com.example.guest_20.chess3;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Pawn extends Piece {

    private boolean hasMoved = false;

    public Pawn(){
        super();
    }

    public Pawn(Position p,String n,int s){
        super(p,n,s);
    }

    @Override
    public boolean possibleMove(Position p) {

            if (side.equals("NORTH")) {
                if (p.getY() == pos.getY() + 1 ||
                        (p.getY() == pos.getY()+2 || !hasMoved))
                    return true;
            }
            if(side.equals("SOUTH")){
                if (p.getY() == pos.getY() - 1 ||
                        (p.getY() == pos.getY()-2 || !hasMoved))
                    return true;
            }

        return false;
    }



}

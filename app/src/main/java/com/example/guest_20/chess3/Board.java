package com.example.guest_20.chess3;

import java.util.*;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Board {

    private Position[][] spaces = new Position[8][8];
    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    public Board(){
        for(int i=0;i<spaces.length;i++){
            for(int j=0;j<spaces[i].length;j++){
                spaces[i][j] = new Position(i+1,j+1);
            }
        }

        for(int i=0;i<8;i++) {
            pieces.add(new Pawn(new Position(i,1),"Bruce",1));
            pieces.add(new Pawn(new Position(i,6),"Devin",2));
        }

        pieces.add(new Castle(new Position(0,0),"Rose",1));
        pieces.add(new Castle(new Position(7,0),"Rose",1));

        pieces.add(new Castle(new Position(0,7),"Gale",2));
        pieces.add(new Castle(new Position(7,7),"Gale",2));

        pieces.add(new Knight(new Position(1,0),"Julian",1));
        pieces.add(new Knight(new Position(6,0),"Julian",1));

        pieces.add(new Knight(new Position(1,7),"Margrex",2));
        pieces.add(new Knight(new Position(6,7),"Margrex",2));

        pieces.add(new Bishop(new Position(2,0),"Fergal",1));
        pieces.add(new Bishop(new Position(5,0),"Fergal",1));

        pieces.add(new Bishop(new Position(2,7),"Ollie",2));
        pieces.add(new Bishop(new Position(5,7),"Ollie",2));

        pieces.add(new King(new Position(3,0),"Norbert",1));
        pieces.add(new King(new Position(3,7),"Sourbet",2));

        pieces.add(new Queen(new Position(4,0),"Emily",1));
        pieces.add(new Queen(new Position(4,7),"Daryl",2));
    }

    public String toString(){

        String retStr = "";

        for(int j=0;j<spaces.length;j++){
            for(int i=0;i<spaces[j].length;i++){


                Piece here = pieceAt(new Position(i,j));

                if(here==null)
                    retStr+= "\t"+i+","+j;
                else
                    retStr+= "\t"+here.getName().substring(0,3);
            }
            retStr+="\n";
        }

        return retStr;
    }

    public boolean move(Position a,Position b){
        Piece temp = pieceAt(a);

        if(temp!=null) {


            if (temp.possibleMove(b)) {
                if (free(b)) {
                    temp.setPosition(b);
                    return true;
                } else {

                    Piece taker = pieceAt(b);

                    if (!taker.getSide().equals(temp.getSide())) {
                        return combat(temp, taker);
                    }

                }
            }

        }

        return false;
    }

    private boolean combat(Piece attacker,Piece defender){

        defender.takeDamage(attacker.doDamage());

        if(defender.isAlive())
            return false;
        return true;

    }

    public Piece pieceAt(Position p){

        Iterator it = pieces.iterator();
        Piece temp;

        while(it.hasNext()){

            temp = (Piece)it.next();

            if(temp.getPosition().equals(p)){
                return temp;
            }
        }
        return null;
    }

    public boolean free(Position p){

        if(pieceAt(p)==null)
            return true;

        return false;
    }

    public boolean combat(Position a,Position d){


        return false;
    }
}

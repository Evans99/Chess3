package com.example.guest_20.chess3;

import android.util.Log;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Controller {

    private Board table;

    public Controller(){
        table = new Board();
        Log.v("hello",table.toString());

        table.move(new Position(0,1),new Position(0,2));
        table.move(new Position(6,7),new Position(5,5));
        table.move(new Position(2,1),new Position(4,6));
        table.move(new Position(4,7),new Position(4,1));

        Log.v("hello",table.toString());

    }

}

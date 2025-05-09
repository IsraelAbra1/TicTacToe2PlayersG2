package com.example.tictactoe2players;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    private FbModule fbModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_game);
        BoardGame boardGame = new BoardGame(this);
        setContentView(boardGame);

        fbModule = new FbModule(this);
    }


    public void setPositionFromFb(Position position) {
    }

    public void setNewTouch(int line, int col) {
        Position position = new Position(line,col);
        fbModule.setPositionInFirebase(position);
    }
}
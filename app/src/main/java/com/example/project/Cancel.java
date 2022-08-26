package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project.data.databasesqlite;

public class Cancel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel);
    }
<<<<<<< Updated upstream
=======
    public void to_user(View view) {
        Intent intent = new Intent(Cancel.this, MainActivity.class);
        Cancel.this.finish();
        startActivity(intent);
    }
>>>>>>> Stashed changes

    public void Cancel(View view){
        databasesqlite DB = new databasesqlite(this);
        EditText bnumtext = (EditText)findViewById(R.id.BookNum);
        String bookingnum = bnumtext.toString();

        if(bookingnum.isEmpty()){
            Toast.makeText(this,"Please Enter Booking Number !",Toast.LENGTH_LONG);
        }
        else{
            if(DB.delete_booking_info(bookingnum)==-1){
                Toast.makeText(this,"The Number you inserted was not found !",Toast.LENGTH_LONG);
            }
            else{
                Toast.makeText(this,"Succefully Cancelled !",Toast.LENGTH_LONG);
            }
        }
    }
}
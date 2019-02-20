package z1835941.niu.explicitintentwithreturn;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/******************************************
 * Justin Dupre and Brady Goldsworthy
 * Z1835941         Z1816747
 *
 * Portfolio 4, Explicit intent
 *
 *****************************************/
public class MainActivity extends Activity {

    private TextView nameTV;
    static final int REQUEST_CODE = 13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTV = findViewById(R.id.nameTextView);
    }

    public void getName(View view)
    {
        Intent nameIntent = new Intent(MainActivity.this, NameActivity.class);
        startActivityForResult(nameIntent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        String returnedName;
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            //retrieve name from the intent
            returnedName = data.getStringExtra("nameID");
            nameTV.setText("Your name is " + returnedName);
        }
    }
}

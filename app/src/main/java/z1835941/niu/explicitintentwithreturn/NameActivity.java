package z1835941.niu.explicitintentwithreturn;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/******************************************
 * Justin Dupre and Brady Goldsworthy
 * Z1835941         Z1816747
 *
 * Portfolio 4, Explicit intent
 *
 *****************************************/

public class NameActivity extends Activity {

    private EditText nameET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        nameET = findViewById(R.id.nameEditText);
    }

    public void goBack( View view )
    {
        String nameInput;
        nameInput = nameET.getText().toString();

        Intent intent;
        intent = getIntent();

        //put edittext into intent object
        intent.putExtra("nameID", nameInput );

        ((Activity)view.getContext()).setResult(RESULT_OK, intent);

        //go back to main
        finish();
    }
}

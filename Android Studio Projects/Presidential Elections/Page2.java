
package Main.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Page2 extends AppCompatActivity {

    EditText etPres, etVicePres;

    Button btn;

    String stPres, stVicePres;
    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_page2);

        btn = findViewById(R.id.submit);

        etPres = findViewById(R.id.pres);

        etVicePres = findViewById(R.id.vicepres);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Intent i = new Intent(Page2.this, Page3.class);

                stPres = etPres.getText().toString();

                stVicePres = etVicePres.getText().toString();

                i.putExtra("pres", stPres);

                i.putExtra("vicepres", stVicePres);

                startActivity(i);

                finish();

            }

        });

    }

}
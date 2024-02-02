package Main.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class Page3 extends AppCompatActivity {
    String stPres, stVicePres;
    TextView tvPres, tvVicePres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        tvPres = findViewById(R.id.textView1);
        tvVicePres = findViewById(R.id.textView2);
        stPres = getIntent().getStringExtra("pres");
        stVicePres = getIntent().getStringExtra("vicepres");
        tvPres.setText(stPres);
        tvVicePres.setText(stVicePres);
    }
}
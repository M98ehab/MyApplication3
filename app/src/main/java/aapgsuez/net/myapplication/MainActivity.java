package aapgsuez.net.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView n, u, e, p, f, d, y;
    String name ,email,username,password,faculty,department,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        n = (TextView) findViewById(R.id.name_text);
        u = (TextView) findViewById(R.id.username_text);
        e = (TextView) findViewById(R.id.email_text);
        p = (TextView) findViewById(R.id.password_text);
        f = (TextView) findViewById(R.id.faculty_text);
        d = (TextView) findViewById(R.id.department_text);
        y = (TextView) findViewById(R.id.year_text);

        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("name");
        email = bundle.getString("email");
        username = bundle.getString("username");
        password = bundle.getString("password");
        faculty = bundle.getString("faculty");
        department = bundle.getString("department");
        year = bundle.getString("year");

        n.setText(name);
        u.setText(username);
        e.setText(email);
        p.setText(password);
        f.setText(faculty);
        d.setText(department);
        y.setText(year);

    }
}

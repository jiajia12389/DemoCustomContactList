package sg.edu.rp.c346.democustomcontactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomerAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary",65,65442334,'f');
        Contact item2 = new Contact("Ken",65,97442437,'m');
        alContactList.add(item1);
        alContactList.add(item2);

        caContact = new CustomerAdapter(MainActivity.this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);
    }
}

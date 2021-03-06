package cn.edu.gdmec.s07150816.meun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int mid;
    private TextView tView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mid=3;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    tView= (TextView) findViewById(R.id.textView);
        registerForContextMenu(tView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
     //  MenuInflater mi=getMenuInflater();
      //  mi.inflate(R.menu.menu,menu);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        menu.add(0,1,0,R.string.m3);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,1,0,R.string.m1);
        menu.add(0,1,0,R.string.m2);
        menu.add(0,1,0,R.string.m3);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return super.onContextItemSelected(item);
    }
}

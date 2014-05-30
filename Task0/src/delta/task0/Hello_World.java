package delta.task0;




import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class Hello_World extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello__world);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello__world, menu);
		return true;
	}


public void jumble(View v)
{
	TextView s=(TextView)findViewById(R.id.textView1);
	String p=(String)s.getText();
	p=shuffle(p);
	s.setText(p);
	
	
	
}
public static String shuffle(String s)
{
	String shuffledstring="";
	while(s.length()!=0)
	{
		int index=(int)Math.floor(Math.random()*s.length());
		char c=s.charAt(index);
		s=s.substring(0, index)+s.substring(index+1);
		shuffledstring+=c;
	}
	return shuffledstring;
}	
	
}

package com.addu.ece298exercise1;
test
import com.addu.ece298exercise1.R;
import com.addu.ece298exercise1.R.id;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        ImageView  img1= (ImageView)findViewById(R.id.imageView1);
        ImageView  img2= (ImageView)findViewById(R.id.imageView2);
        ImageView  img3= (ImageView)findViewById(R.id.imageView3);
        ImageView  img4= (ImageView)findViewById(R.id.imageView4);
        ImageView  img5= (ImageView)findViewById(R.id.imageView5);
        final ImageView  img16= (ImageView)findViewById(R.id.imageView6);
        final ImageView  img12= (ImageView)findViewById(R.id.imageView12);
        final ImageView  img13= (ImageView)findViewById(R.id.imageView13);
        final ImageView  img14= (ImageView)findViewById(R.id.imageView14);
        final ImageView  img15= (ImageView)findViewById(R.id.imageView15);
        
        ImageView  img8= (ImageView)findViewById(R.id.imageView8);
        ImageView  img9= (ImageView)findViewById(R.id.imageView9);
        ImageView  img10= (ImageView)findViewById(R.id.imageView10);
        
        final LinearLayout l1= (LinearLayout)findViewById(id.layout1);
        final LinearLayout l2= (LinearLayout)findViewById(id._layout2);
        final LinearLayout l3= (LinearLayout)findViewById(id._layout3);
        final LinearLayout l4= (LinearLayout)findViewById(id._layout4);
        
       
        
        final Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        
        
        img1.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				
        				 performDial("8078088");
        			}
        		}
            );
        
       
        img2.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				startActivity(browserIntent);
        				
        				
        			}
        		}
            );
        
        img3.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				 Intent myIntent=new Intent();
        				 myIntent.setAction(Intent.ACTION_VIEW);
        				 myIntent.setData(android.provider.Contacts.People.CONTENT_URI);
        				 startActivity(myIntent);

        				
        			}
        		}
            );
        
        img4.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				Intent intentsms = new Intent( Intent.ACTION_VIEW, Uri.parse( "sms:" + "" ) );
        	            intentsms.putExtra( "sms_body", "Test text..." );
        	            startActivity( intentsms );
        			}
        		}
            );
        
        img5.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				finish();
        	            System.exit(0);
        			}
        		}
            );
        
        img8.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        			l1.setBackgroundColor(Color.RED);
        			l2.setBackgroundColor(Color.RED);
        			l3.setBackgroundColor(Color.RED);
        			l4.setBackgroundColor(Color.RED);
        			}
        		}
            );
        img9.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        			l1.setBackgroundColor(Color.GREEN);
        			l2.setBackgroundColor(Color.GREEN);
        			l3.setBackgroundColor(Color.GREEN);
        			l4.setBackgroundColor(Color.GREEN);
        			}
        		}
            );
        img10.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        			l1.setBackgroundColor(Color.BLUE);
        			l2.setBackgroundColor(Color.BLUE);
        			l3.setBackgroundColor(Color.BLUE);
        			l4.setBackgroundColor(Color.BLUE);
        			}
        		}
            );
        img12.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        			img16.setImageResource(R.drawable.images);
        			        			}
        		}
            );
        img13.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        			img16.setImageResource(R.drawable.image2);
        			        			}
        		}
            );
        
        img14.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        			img16.setImageResource(R.drawable.image3);
        			        			}
        		}
            );
        
        img15.setOnClickListener( 
            	new View.OnClickListener() {
        			
        			@Override
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        			img16.setImageResource(R.drawable.image4);
        			        			}
        		}
            );
    }
    private void performDial(String numberString) {
        if (!numberString.equals("")) {
           Uri number = Uri.parse("tel:" + numberString);
           Intent dial = new Intent(Intent.ACTION_CALL, number);
           startActivity(dial);
        }
    }

  
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

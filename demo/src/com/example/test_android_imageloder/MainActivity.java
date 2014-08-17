package com.example.test_android_imageloder;

import com.novoda.imageloader.core.ImageManager;
import com.novoda.imageloader.core.model.ImageTagFactory;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends ActionBarActivity {
	protected ImageTagFactory imageTagFactory;
    protected ImageManager imageManager;
    private static final int SIZE = 400;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initImageLoader();
		
		
		setImageTag((ImageView)findViewById(R.id.imageView1), "http://c.hiphotos.baidu.com/image/pic/item/562c11dfa9ec8a13311ab4e9f503918fa0ecc0b3.jpg");
		loadImage((ImageView)findViewById(R.id.imageView1));
		setImageTag((ImageView)findViewById(R.id.imageView2), "http://c.hiphotos.baidu.com/image/pic/item/3b292df5e0fe9925be8fc94e36a85edf8db17128.jpg");
		loadImage((ImageView)findViewById(R.id.imageView2));
		setImageTag((ImageView)findViewById(R.id.imageView3), "http://a.hiphotos.baidu.com/image/pic/item/fd039245d688d43f7f2f71fb7f1ed21b0ef43b31.jpg");
		loadImage((ImageView)findViewById(R.id.imageView3));
		setImageTag((ImageView)findViewById(R.id.imageView4), "http://c.hiphotos.baidu.com/image/pic/item/023b5bb5c9ea15ce0c3dc901b4003af33b87b2e2.jpg");
		loadImage((ImageView)findViewById(R.id.imageView4));
		setImageTag((ImageView)findViewById(R.id.imageView5), "http://h.hiphotos.baidu.com/image/pic/item/caef76094b36acafb10876f57ed98d1000e99ccb.jpg");
		loadImage((ImageView)findViewById(R.id.imageView5));
		setImageTag((ImageView)findViewById(R.id.imageView6), "http://h.hiphotos.baidu.com/image/pic/item/810a19d8bc3eb135b43aa7b0a41ea8d3fd1f443f.jpg");
		loadImage((ImageView)findViewById(R.id.imageView6));
		setImageTag((ImageView)findViewById(R.id.imageView7), "http://e.hiphotos.baidu.com/image/pic/item/faf2b2119313b07e4601bd0a0ed7912397dd8c70.jpg");
		loadImage((ImageView)findViewById(R.id.imageView7));
		setImageTag((ImageView)findViewById(R.id.imageView8), "http://e.hiphotos.baidu.com/image/pic/item/11385343fbf2b2111f2c6647c88065380cd78ebd.jpg");
		loadImage((ImageView)findViewById(R.id.imageView8));
		setImageTag((ImageView)findViewById(R.id.imageView9), "http://e.hiphotos.baidu.com/image/pic/item/f3d3572c11dfa9eca624981060d0f703918fc1ab.jpg");
		loadImage((ImageView)findViewById(R.id.imageView9));
		setImageTag((ImageView)findViewById(R.id.imageView10), "http://h.hiphotos.baidu.com/image/pic/item/a6efce1b9d16fdfa186e25e7b68f8c5494ee7bbd.jpg");
		loadImage((ImageView)findViewById(R.id.imageView10));
		setImageTag((ImageView)findViewById(R.id.imageView11), "http://b.hiphotos.baidu.com/image/pic/item/9345d688d43f87945d75a827d01b0ef41bd53a35.jpg");
		loadImage((ImageView)findViewById(R.id.imageView11));
		
	}
	private void initImageLoader() {
        imageManager = MyAplication.getImageLoader();
        imageTagFactory = ImageTagFactory.newInstance(SIZE, SIZE, R.drawable.ic_launcher);
        imageTagFactory.setErrorImageId(R.drawable.ic_launcher);
        imageTagFactory.setSaveThumbnail(true);
        //setAnimationFromIntent(imageTagFactory);
    }
	private void setImageTag(ImageView view, String url) {
        view.setTag(imageTagFactory.build(url, this));
    }

    private void loadImage(ImageView view) {
        imageManager.getLoader().load(view);
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

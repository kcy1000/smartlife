/**
 * @author 吴湧霖
 * @version 创建时间：2014年7月8日 下午11:08:07 
 */
package com.smartlife.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class CreateGroupActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_create_group);
	}

}

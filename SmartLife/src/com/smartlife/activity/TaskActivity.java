/**
 * 创建时间：2014-7-13 下午1:17:50
 * @author Zheng Xinwei
 * @since 1.0
 * @version 1.0<br>
 */
package com.smartlife.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Window;

import com.smartlife.fragment.CreateTaskFragment;
import com.smartlife.fragment.DetailTaskFragment;
import com.smartlife.model.Task;

public class TaskActivity extends FragmentActivity {

	Task task;
	Fragment fragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_task);

		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		if (bundle != null && bundle.getSerializable(Task.TAG) instanceof Task)
			task = (Task) bundle.get(Task.TAG);

		if (task != null)
			fragment = DetailTaskFragment.newInstance(task);
		else
			fragment = new CreateTaskFragment();

		getSupportFragmentManager().beginTransaction()
				.replace(R.id.task_container, fragment).commit();
	}
}

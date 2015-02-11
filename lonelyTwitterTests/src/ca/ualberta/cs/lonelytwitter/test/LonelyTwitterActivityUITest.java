package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.test.ViewAsserts;
import android.widget.ListView;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

/*
 * generate this class with new.. JUnit Test Case
 * set superclass to ActivityInstrumentationTestCase2
 */
public class LonelyTwitterActivityUITest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	Instrumentation instrumentation;
	Activity activity;
	EditText textInput;
	ArrayAdapter<NormalTweetModel> adapter;
	
	public LonelyTwitterActivityUITest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		instrumentation = getInstrumentation();
		activity = getActivity();

		textInput = ((EditText) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.body));
	}
	
	public void testSettingText() {
		instrumentation.runOnMainSync(new Runnable() {
			@Override
			public void run() {
				textInput.setText("Text");
			}
		});
		instrumentation.waitForIdleSync();
		assertEquals("Text?", "Text", textInput.getText().toString());
		
	}
	
	public void testTextViewDislay() {
		activity = getActivity();

		ViewAsserts.assertOnScreen(activity.getWindow().getDecorView(), (View)textInput);
	}
	
	public void testAddTweet() {
		NormalTweetModel tweet = (NormalTweetModel) textInput.getText();
		ArrayList<NormalTweetModel> tweets = new ArrayList<NormalTweetModel>();
		tweets.add(tweet);
	}
	
	/*
	 * fills in the input text field and clicks the 'save'
	 * button for the activity under test
	 */
	private void makeTweet(String text) {
		assertNotNull(activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save));
		textInput.setText(text);
		((Button) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save)).performClick();
	}
}

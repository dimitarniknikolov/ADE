http://developer.android.com/training/basics/activity-lifecycle/index.html

// on initial start
MainActivity: onCreate
MainActivity: onCreateView // many times ...
MainActivity: onAttachFragment
MainActivity: onCreateView ...
MainActivity: onStart
MainActivity: onTitleChanged
MainActivity: onPostCreate
MainActivity: onResume
MainActivity: onResumeFragments
MainActivity: onPostResume
MainActivity: onAttachedToWindow
MainActivity: onCreatePanelView
MainActivity: onCreateView ...
MainActivity: onCreateOptionsMenu
ActivityManager: Displayed com.mentormate.actrivitylifecycle/.MainActivity:

// on rotate
MainActivity: onPause
MainActivity: onSaveInstanceState
MainActivity: onStop
MainActivity: onDestroy
MainActivity: onDetachedFromWindow
MainActivity: onAttachFragment
MainActivity: onCreate
MainActivity: onCreateView ...
MainActivity: onStart
MainActivity: onRestoreInstanceState
MainActivity: onTitleChanged
MainActivity: onPostCreate
MainActivity: onResume
MainActivity: onResumeFragments
MainActivity: onPostResume
MainActivity: onAttachedToWindow
MainActivity: onCreatePanelView
MainActivity: onCreateView ...
MainActivity: onCreateOptionsMenu
MainActivity: onCreatePanelView


// on back pressed
MainActivity: finish
MainActivity: onBackPressed
MainActivity: onPause
MainActivity: onStop
MainActivity: onDestroy
MainActivity: onDetachedFromWindow

// on home pressed
MainActivity: onPause
MainActivity: onSaveInstanceState
MainActivity: onStop

// on resume after home
MainActivity: onRestart
MainActivity: onStart
MainActivity: onResume
MainActivity: onResumeFragments
MainActivity: onPostResume


// template
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    /**
     * Add support for inflating the &lt;fragment> tag.
     *
     * @param name
     * @param context
     * @param attrs
     */
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        Log.d(TAG, "onCreateView");
        return super.onCreateView(name, context, attrs);
    }

    /**
     * Called when a fragment is attached to the activity.
     *
     * @param fragment
     */
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.d(TAG, "onAttachFragment");
    }

    /**
     * Dispatch onStart() to all fragments.  Ensure any created loaders are
     * now started.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        Log.d(TAG, "onTitleChanged");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, "onPostCreate");
    }


    /**
     * Dispatch onResume() to fragments.  Note that for better inter-operation
     * with older versions of the platform, at the point of this call the
     * fragments attached to the activity are <em>not</em> resumed.  This means
     * that in some cases the previous state may still be saved, not allowing
     * fragment transactions that modify the state.  To correctly interact
     * with fragments in their proper state, you should instead override
     * {@link #onResumeFragments()}.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * This is the fragment-orientated version of {@link #onResume()} that you
     * can override to perform operations in the Activity at the same point
     * where its fragments are resumed.  Be sure to always call through to
     * the super-class.
     */
    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        Log.d(TAG, "onResumeFragments");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "onAttachedToWindow");
    }

    @Override
    public View onCreatePanelView(int featureId) {
        Log.d(TAG, "onCreatePanelView");
        return super.onCreatePanelView(featureId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.d(TAG, "onCreateOptionsMenu");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    // ---------------------------------------------------------------------------------------------
    // Activity is live
    // ---------------------------------------------------------------------------------------------

    /**
     * Dispatch onPause() to fragments.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * Save all appropriate fragment state.
     *
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * Destroy all fragments and loaders.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "onDetachedFromWindow");
    }

    @Override
    public void finish() {
        super.finish();
        Log.d(TAG, "finish");
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, "onBackPressed");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "onConfigurationChanged");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
    }


    /**
     * Called on resume after home pressed
     */
    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart");
        super.onRestart();
    }
}

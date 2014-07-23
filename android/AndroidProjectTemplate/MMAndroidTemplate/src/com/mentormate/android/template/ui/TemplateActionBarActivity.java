
package com.mentormate.android.template.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mentormate.android.template.R;
import com.mentormate.android.template.util.L;

public class TemplateActionBarActivity extends ActionBarActivity {

    private static final String TAG = L.makeLogTag(TemplateActionBarActivity.class);

    // ---------------------------------------------------------------------------------------------
    // Activity life cycle
    // ---------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        L.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        L.d(TAG, "onCreateView");
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
        L.d(TAG, "onAttachFragment");
    }

    /**
     * Dispatch onStart() to all fragments. Ensure any created loaders are now started.
     */
    @Override
    protected void onStart() {
        super.onStart();
        L.d(TAG, "onStart");
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        L.d(TAG, "onTitleChanged");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        L.d(TAG, "onPostCreate");
    }

    /**
     * Dispatch onResume() to fragments. Note that for better inter-operation with older versions of
     * the platform, at the point of this call the fragments attached to the activity are
     * <em>not</em> resumed. This means that in some cases the previous state may still be saved,
     * not allowing fragment transactions that modify the state. To correctly interact with
     * fragments in their proper state, you should instead override {@link #onResumeFragments()}.
     */
    @Override
    protected void onResume() {
        super.onResume();
        L.d(TAG, "onResume");
    }

    /**
     * This is the fragment-orientated version of {@link #onResume()} that you can override to
     * perform operations in the Activity at the same point where its fragments are resumed. Be sure
     * to always call through to the super-class.
     */
    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        L.d(TAG, "onResumeFragments");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        L.d(TAG, "onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        L.d(TAG, "onAttachedToWindow");
    }

    @Override
    public View onCreatePanelView(int featureId) {
        L.d(TAG, "onCreatePanelView");
        return super.onCreatePanelView(featureId);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        L.d(TAG, "onCreateOptionsMenu");
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    // ---------------------------------------------------------------------------------------------
    // Activity is live
    // ---------------------------------------------------------------------------------------------

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

    // ---------------------------------------------------------------------------------------------
    // END Activity is live
    // ---------------------------------------------------------------------------------------------

    /**
     * Dispatch onPause() to fragments.
     */
    @Override
    protected void onPause() {
        super.onPause();
        L.d(TAG, "onPause");
    }

    /**
     * Save all appropriate fragment state.
     * 
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        L.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        L.d(TAG, "onStop");
    }

    /**
     * Destroy all fragments and loaders.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        L.d(TAG, "onDestroy");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        L.d(TAG, "onDetachedFromWindow");
    }

    @Override
    public void finish() {
        super.finish();
        L.d(TAG, "finish");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        L.d(TAG, "onBackPressed");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        L.d(TAG, "onConfigurationChanged");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        L.d(TAG, "onRestoreInstanceState");
    }

    /**
     * Called on resume after home pressed
     */
    @Override
    protected void onRestart() {
        L.d(TAG, "onRestart");
        super.onRestart();
    }

    // ---------------------------------------------------------------------------------------------
    // Private methods
    // ---------------------------------------------------------------------------------------------

    // ---------------------------------------------------------------------------------------------
    // Protected methods
    // ---------------------------------------------------------------------------------------------

    // ---------------------------------------------------------------------------------------------
    // Public methods
    // ---------------------------------------------------------------------------------------------

    // ---------------------------------------------------------------------------------------------
    // Overridden methods
    // ---------------------------------------------------------------------------------------------

    // ---------------------------------------------------------------------------------------------
    // Interface implementations
    // ---------------------------------------------------------------------------------------------
}

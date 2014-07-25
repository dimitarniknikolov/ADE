
package com.mentormate.android.template.ui.fragment;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

import com.mentormate.android.template.R;
import com.mentormate.android.template.util.L;

/**
 * @author MentorMate
 */
public class TemplateFragment extends Fragment {

    private static final String TAG = L.makeLogTag(TemplateFragment.class);

    public static TemplateFragment newInstance() {
        return new TemplateFragment();
    }

    public TemplateFragment() {
    }

    // ---------------------------------------------------------------------------------------------
    // Fragment life cycle
    // ---------------------------------------------------------------------------------------------
    /**
     * Called when a fragment is first attached to its activity.
     * {@link #onCreate(android.os.Bundle)} will be called after this.
     * 
     * @param activity
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        L.d(TAG, "onAttach");
    }

    /**
     * Called to do initial creation of a fragment. This is called after
     * {@link #onAttach(android.app.Activity)} and before
     * {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}
     * .
     * <p/>
     * <p>
     * Note that this can be called while the fragment's activity is still in the process of being
     * created. As such, you can not rely on things like the activity's content view hierarchy being
     * initialized at this point. If you want to do work once the activity itself is created, see
     * {@link #onActivityCreated(android.os.Bundle)}.
     * 
     * @param savedInstanceState If the fragment is being re-created from a previous saved state,
     *            this is the state.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        L.d(TAG, "onCreate");
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        L.d(TAG, "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

    /**
     * Called when a fragment loads an animation.
     * 
     * @param transit
     * @param enter
     * @param nextAnim
     */
    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        L.d(TAG, "onCreateAnimation");
        return super.onCreateAnimation(transit, enter, nextAnim);
    }

    /**
     * Called immediately after
     * {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}
     * has returned, but before any saved state has been restored in to the view. This gives
     * subclasses a chance to initialize themselves once they know their view hierarchy has been
     * completely created. The fragment's view hierarchy is not however attached to its parent at
     * this point.
     * 
     * @param view The View returned by
     *            {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}
     *            .
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        L.d(TAG, "onViewCreated");
    }

    /**
     * Called when the fragment's activity has been created and this fragment's view hierarchy
     * instantiated. It can be used to do final initialization once these pieces are in place, such
     * as retrieving views or restoring state. It is also useful for fragments that use
     * {@link #setRetainInstance(boolean)} to retain their instance, as this callback tells the
     * fragment when it is fully associated with the new activity instance. This is called after
     * {@link #onCreateView} and before {@link #onViewStateRestored(android.os.Bundle)}.
     * 
     * @param savedInstanceState If the fragment is being re-created from a previous saved state,
     *            this is the state.
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        L.d(TAG, "onActivityCreated");
    }

    /**
     * Called when all saved state has been restored into the view hierarchy of the fragment. This
     * can be used to do initialization based on saved state that you are letting the view hierarchy
     * track itself, such as whether check box widgets are currently checked. This is called after
     * {@link #onActivityCreated(android.os.Bundle)} and before {@link #onStart()}.
     * 
     * @param savedInstanceState If the fragment is being re-created from a previous saved state,
     *            this is the state.
     */
    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        L.d(TAG, "onViewStateRestored");
    }

    /**
     * Called when the Fragment is visible to the user. This is generally tied to
     * {@link android.app.Activity#onStart() Activity.onStart} of the containing Activity's
     * lifecycle.
     */
    @Override
    public void onStart() {
        super.onStart();
        L.d(TAG, "onStart");
    }

    /**
     * Called when the fragment is visible to the user and actively running. This is generally tied
     * to {@link android.app.Activity#onResume() Activity.onResume} of the containing Activity's
     * lifecycle.
     */
    @Override
    public void onResume() {
        super.onResume();
        L.d(TAG, "onResume");
    }

    /**
     * Called when a fragment is being created as part of a view layout inflation, typically from
     * setting the content view of an activity. This may be called immediately after the fragment is
     * created from a <fragment> tag in a layout file. Note this is <em>before</em> the fragment's
     * {@link #onAttach(android.app.Activity)} has been called; all you should do here is parse the
     * attributes and save them away.
     * <p/>
     * <p>
     * This is called every time the fragment is inflated, even if it is being inflated into a new
     * instance with saved state. It typically makes sense to re-parse the parameters each time, to
     * allow them to change with different configurations.
     * </p>
     * <p/>
     * <p>
     * Here is a typical implementation of a fragment that can take parameters both through
     * attributes supplied here as well from {@link #getArguments()}:
     * </p>
     * <p/>
     * {@sample development/samples/ApiDemos/src/com/example/android/apis/app/FragmentArguments.java
     * fragment}
     * <p/>
     * <p>
     * Note that parsing the XML attributes uses a "styleable" resource. The declaration for the
     * styleable used here is:
     * </p>
     * <p/>
     * {@sample development/samples/ApiDemos/res/values/attrs.xml fragment_arguments}
     * <p/>
     * <p>
     * The fragment can then be declared within its activity's content layout through a tag like
     * this:
     * </p>
     * <p/>
     * {@sample development/samples/ApiDemos/res/layout/fragment_arguments.xml from_attributes}
     * <p/>
     * <p>
     * This fragment can also be created dynamically from arguments given at runtime in the
     * arguments Bundle; here is an example of doing so at creation of the containing activity:
     * </p>
     * <p/>
     * {@sample development/samples/ApiDemos/src/com/example/android/apis/app/FragmentArguments.java
     * create}
     * 
     * @param activity The Activity that is inflating this fragment.
     * @param attrs The attributes at the tag where the fragment is being created.
     * @param savedInstanceState If the fragment is being re-created from
     */
    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        super.onInflate(activity, attrs, savedInstanceState);
        L.d(TAG, "onInflate");
    }

    // ---------------------------------------------------------------------------------------------
    // Fragment is live
    // ---------------------------------------------------------------------------------------------

    /**
     * Called when the Fragment is no longer resumed. This is generally tied to
     * {@link android.app.Activity#onPause() Activity.onPause} of the containing Activity's
     * lifecycle.
     */
    @Override
    public void onPause() {
        super.onPause();
        L.d(TAG, "onPause");
    }

    /**
     * Called to ask the fragment to save its current dynamic state, so it can later be
     * reconstructed in a new instance of its process is restarted. If a new instance of the
     * fragment later needs to be created, the data you place in the Bundle here will be available
     * in the Bundle given to {@link #onCreate(android.os.Bundle)},
     * {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}
     * , and {@link #onActivityCreated(android.os.Bundle)}.
     * <p/>
     * <p>
     * This corresponds to {@link android.app.Activity#onSaveInstanceState(android.os.Bundle)
     * Activity.onSaveInstanceState(Bundle)} and most of the discussion there applies here as well.
     * Note however: <em>this method may be called
     * at any time before {@link #onDestroy()}</em>. There are many situations where a fragment may
     * be mostly torn down (such as when placed on the back stack with no UI showing), but its state
     * will not be saved until its owning activity actually needs to save its state.
     * 
     * @param outState Bundle in which to place your saved state.
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        L.d(TAG, "onSaveInstanceState");
    }

    /**
     * Called when the Fragment is no longer started. This is generally tied to
     * {@link android.app.Activity#onStop() Activity.onStop} of the containing Activity's lifecycle.
     */
    @Override
    public void onStop() {
        super.onStop();
        L.d(TAG, "onStop");
    }

    /**
     * Called when the view previously created by {@link #onCreateView} has been detached from the
     * fragment. The next time the fragment needs to be displayed, a new view will be created. This
     * is called after {@link #onStop()} and before {@link #onDestroy()}. It is called
     * <em>regardless</em> of whether {@link #onCreateView} returned a non-null view. Internally it
     * is called after the view's state has been saved but before it has been removed from its
     * parent.
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        L.d(TAG, "onDestroyView");
    }

    /**
     * Called when the fragment is no longer attached to its activity. This is called after
     * {@link #onDestroy()}.
     */
    @Override
    public void onDetach() {
        super.onDetach();
        L.d(TAG, "onDetach");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        L.d(TAG, "onConfigurationChanged");
    }

    /**
     * Initialize the contents of the Activity's standard options menu. You should place your menu
     * items in to <var>menu</var>. For this method to be called, you must have first called
     * {@link #setHasOptionsMenu}. See
     * {@link android.app.Activity#onCreateOptionsMenu(android.view.Menu)
     * Activity.onCreateOptionsMenu} for more information.
     * 
     * @param menu The options menu in which you place your items.
     * @param inflater
     * @see #setHasOptionsMenu
     * @see #onPrepareOptionsMenu
     * @see #onOptionsItemSelected
     */
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        L.d(TAG, "onCreateOptionsMenu");
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

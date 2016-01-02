package test.baali.activitylifecycle;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment
{
    private String TAG = "Exlpore: MainActivityFragment";
    
    public MainActivityFragment()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        Log.d(TAG, "onCreateView: ");
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context)
    {
        Log.d(TAG, "onAttach: ");
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState)
    {
        Log.d(TAG, "onViewCreated: ");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart()
    {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    public void onResume()
    {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    public void onStop()
    {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        Log.d(TAG, "onActivityCreated: ");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState)
    {
        Log.d(TAG, "onInflate: ");
        super.onInflate(context, attrs, savedInstanceState);
    }

    @Override
    public void onPause()
    {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

}

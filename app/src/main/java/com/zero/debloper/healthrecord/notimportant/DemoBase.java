package com.zero.debloper.healthrecord.notimportant;

/**
 * Created by debloper on 12/7/15.
 */


import android.support.v4.app.FragmentActivity;

import com.zero.debloper.healthrecord.R;


/**
 * Baseclass of all Activities of the Demo Application.
 *
 * @author Philipp Jahoda
 */
public abstract class DemoBase extends FragmentActivity {

    protected String[] mMonths = new String[]{
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"
    };

    protected String[] mDays = new String[]{
            "Today", "Yesterday", "Date3", "Date4", "Date5", "Date6", "Date7"
    };

    protected float[] mBP = new float[]{80, 90, 110, 100, 130, 160, 120};

    protected String[] mParties = new String[]{
            "Party A", "Party B", "Party C", "Party D", "Party E", "Party F", "Party G", "Party H",
            "Party I", "Party J", "Party K", "Party L", "Party M", "Party N", "Party O", "Party P",
            "Party Q", "Party R", "Party S", "Party T", "Party U", "Party V", "Party W", "Party X",
            "Party Y", "Party Z"
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.move_left_in_activity, R.anim.move_right_out_activity);
    }
}

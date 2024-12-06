package com.akshay.stageprogress.stateprogressbar.listeners;


import com.akshay.stageprogress.stateprogressbar.StateProgressBar;
import com.akshay.stageprogress.stateprogressbar.components.StateItem;

/**
 * Created by Kofi Gyan on 2/20/2018.
 */

public interface OnStateItemClickListener {

    void onStateItemClick(StateProgressBar stateProgressBar, StateItem stateItem, int stateNumber, boolean isCurrentState);

}

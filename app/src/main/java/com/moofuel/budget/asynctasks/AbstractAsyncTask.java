package com.moofuel.budget.asynctasks;

import android.os.AsyncTask;

/**
 * @author MoOFueL
 */
public abstract class AbstractAsyncTask<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {


    protected abstract Result doInBackground(Params... params);

    protected abstract void onPostExecute(Result result);

    protected abstract void onCancelled(Result result);

    protected abstract void onPreExecute();

}

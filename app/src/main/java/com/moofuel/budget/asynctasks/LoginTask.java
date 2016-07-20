package com.moofuel.budget.asynctasks;

import android.widget.EditText;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moofuel.budget.R;
import com.moofuel.budget.activities.LoginActivity;
import com.moofuel.budget.domain.User;
import com.moofuel.budget.misc.AuthObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author MoOFueL
 */
public class LoginTask extends AbstractAsyncTask<LoginActivity, Void, User> {

    private String fio;
    private String password;

    private LoginActivity loginActivity;
    private EditText mEmailView;

    public LoginTask(String fio, String password) {
        this.fio = fio;
        this.password = password;
    }

    @Override
    protected void onPreExecute() {


    }

    @Override
    protected void onPostExecute(User user) {
        loginActivity.showProgress(false);
        mEmailView = (EditText) loginActivity.findViewById(R.id.email);
        if (user != null) {
            mEmailView.setText(user.getFio());
        }
    }

    @Override
    protected void onCancelled(User user) {

    }

    @Override
    protected User doInBackground(LoginActivity... params) {

        loginActivity = params[0];

        User response = null;
        URL url;
        HttpURLConnection connection = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            url = new URL("http://192.168.1.45:8080/auth");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setConnectTimeout(5000);
            connection.setRequestProperty("Content-Type", "application/json");
            InputStream is = null;
            OutputStreamWriter outputStream = new OutputStreamWriter(connection.getOutputStream());
            AuthObject authObject = new AuthObject();
            authObject.setFio("Димон");
            authObject.setPassword("QWERTYUIOP1234567890asdfghjkl");
            String jsonString = mapper.writeValueAsString(authObject);
            outputStream.write(jsonString);
            outputStream.flush();
            outputStream.close();
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                is = connection.getInputStream();// is is inputstream
            } else {
                is = connection.getErrorStream();
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, "UTF-8"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
            is.close();
            response = mapper.readValue(sb.toString(), User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }

    /**
     * <p>Applications should preferably override {@link #onCancelled(Object)}.
     * This method is invoked by the default implementation of
     * {@link #onCancelled(Object)}.</p>
     * <p>
     * <p>Runs on the UI thread after {@link #cancel(boolean)} is invoked and
     * {@link #doInBackground(Object[])} has finished.</p>
     *
     * @see #onCancelled(Object)
     * @see #cancel(boolean)
     * @see #isCancelled()
     */
    @Override
    protected void onCancelled() {
        super.onCancelled();
    }

    /**
     * Runs on the UI thread after {@link #publishProgress} is invoked.
     * The specified values are the values passed to {@link #publishProgress}.
     *
     * @param values The values indicating progress.
     * @see #publishProgress
     * @see #doInBackground
     */
    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}

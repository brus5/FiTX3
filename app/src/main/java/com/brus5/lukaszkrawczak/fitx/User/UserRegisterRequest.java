package com.brus5.lukaszkrawczak.fitx.User;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lukaszkrawczak on 28.11.2017.
 */

public class UserRegisterRequest extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "http://justfitx.xyz/User/UserRegisterRequest.php";

    private Map<String,String> params;


    public UserRegisterRequest(String name, String username, String birthday, String password, String male, String email, Response.Listener<String> listener){

        super(Method.POST,REGISTER_REQUEST_URL,listener,null);

        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("age", birthday);
        params.put("password", password);
        params.put("male", male);
        params.put("email", email);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

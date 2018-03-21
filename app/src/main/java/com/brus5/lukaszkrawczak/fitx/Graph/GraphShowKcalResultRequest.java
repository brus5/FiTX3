package com.brus5.lukaszkrawczak.fitx.Graph;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lukaszkrawczak on 01.12.2017.
 */

public class GraphShowKcalResultRequest extends StringRequest{
    private static final String UPDATE_REQUEST_URL = "http://justfitx.xyz/Graph/GraphShowKcalResultRequest.php";
    private Map<String,String> params;
    public GraphShowKcalResultRequest(String username, Response.Listener<String> listener){

        super(Method.POST,UPDATE_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("username", username);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }

}

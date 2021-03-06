package com.example.edwingariza.franssenpropertiesinc;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by edwingariza on 4/10/17.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "franssen.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String unitNumb, String username, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL,listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("unitNumber", unitNumb);
        params.put("username", username);
        params.put("password", password);

    }
    @Override
    public Map<String, String> getParams(){
        return params;
    }

}

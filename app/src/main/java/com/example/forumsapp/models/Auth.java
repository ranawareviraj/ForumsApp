package com.example.forumsapp.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class Auth implements Serializable {


    public String status, token, user_id, user_fname, user_lname;

    public Auth() {
    }

    public Auth(JSONObject jsonObject) throws JSONException {
        this.status = jsonObject.getString("status");
        this.token = jsonObject.getString("token");
        this.user_id = jsonObject.getString("user_id");
        this.user_fname = jsonObject.getString("user_fname");
        this.user_lname = jsonObject.getString("user_lname");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_fname() {
        return user_fname;
    }

    public void setUser_fname(String user_fname) {
        this.user_fname = user_fname;
    }

    public String getUser_lname() {
        return user_lname;
    }

    public void setUser_lname(String user_lname) {
        this.user_lname = user_lname;
    }
}

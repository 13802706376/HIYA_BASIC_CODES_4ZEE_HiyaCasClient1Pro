package com.ee.cas.client;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class CasUtils
{

     
    private void callCasServer(HttpServletRequest req )
    {
        Map<String,String> params = new HashMap<>();
        params.put("userName", req.getParameter("userName"));
        params.put("TICKET", req.getParameter("TICKET"));
        params.put("passWord", req.getParameter("passWord"));
        String result = HttpUtil.sendHttpPostReqToServerByParams("http://127.0.0.1:8080/HiyaCasServerPro/authentication", params);
    }
}

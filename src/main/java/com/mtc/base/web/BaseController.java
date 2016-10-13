package com.mtc.base.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by majun on 10/13/16.
 */
@Controller
public class BaseController {

    @ResponseBody
    @RequestMapping(value = "/api/index.htm",method = RequestMethod.GET)
    public String test(){
        return "success";
    }

}

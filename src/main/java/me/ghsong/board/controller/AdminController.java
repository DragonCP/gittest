package me.ghsong.board.controller;

import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Song.gunho
 * <p>
 * Date: 2019-11-19
 */
@Controller
@RequiredArgsConstructor
public class AdminController {

    @GetMapping("/admin/wordcloud")
    public String getAdminView1(){
        return "admin/test123";
    }

    @GetMapping("/admin/wordtrend")
    public String getAdminView2(){
        return "admin/admintest";
    }


    @GetMapping("/admin/admin")
    public String getAdminView3(){
        return "admin/admin";
    }
    @GetMapping(value = "admin/test.json"   )
    public String getAdminView5(){
        return "admin/test.json";
    }

    @RestController
    public class RestTestController {

        @RequestMapping("/restTest")
        public String restTest(@RequestParam String str){
            return str + " : Rest Test 완료!!!";
        }

    }

}



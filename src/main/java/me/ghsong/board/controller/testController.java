package me.ghsong.board.controller;
import java.util.List;
import java.util.Map;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.ghsong.board.dto.Dao;
    @RestController
    @Controller
    @RequiredArgsConstructor
    public class testController {



        @Autowired
        Dao smd;

        @RequestMapping("/admin/json")
        public List<Map<String, ?>> getMessages() {
            return smd.selectAll();
        }


    }

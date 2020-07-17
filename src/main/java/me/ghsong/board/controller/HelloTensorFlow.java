package me.ghsong.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.tensorflow.Graph;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;

@Controller
@RequiredArgsConstructor
public class HelloTensorFlow {
    @GetMapping("/admin/admintest")
    public String getAdminView(){
        return "admin/admintest";
    }

}

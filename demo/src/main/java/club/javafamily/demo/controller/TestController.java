package club.javafamily.demo.controller;

import club.javafamily.oss.service.MinIOService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

   private final MinIOService minIOService;

   public TestController(MinIOService minIOService) {
      this.minIOService = minIOService;
   }

   @GetMapping("/minio/test")
   public void test1() {

   }

}

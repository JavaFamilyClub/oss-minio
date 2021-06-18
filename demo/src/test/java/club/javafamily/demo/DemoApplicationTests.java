package club.javafamily.demo;

import club.javafamily.oss.service.MinIOService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoApplicationTests {

   @Autowired
   private MinIOService minIOService;

   @ParameterizedTest
   @ValueSource(strings = "-645118676txt.txt")
   void contextLoads() {

   }

}

package club.javafamily.oss.conf;

import club.javafamily.oss.properties.OssMinIOProperties;
import io.minio.MinioClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

@EnableConfigurationProperties({
   OssMinIOProperties.class
})
@ComponentScan(basePackages = "club.javafamily.oss")
@Configuration
public class OssMinIOConfig {
   private final OssMinIOProperties ossMinIOProperties;

   public OssMinIOConfig(OssMinIOProperties ossMinIOProperties) {
      this.ossMinIOProperties = ossMinIOProperties;
   }

   @Bean
   public MinioClient minioClient() {
      return MinioClient.builder()
         .endpoint(ossMinIOProperties.getEndPoint())
         .credentials(ossMinIOProperties.getUser(), ossMinIOProperties.getPassword())
         .build();
   }

}

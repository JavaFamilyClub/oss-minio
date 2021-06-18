package club.javafamily.oss.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jf.oss.minio")
public class OssMinIOProperties {
   private String endPoint;
   private String user;
   private String password;
   private String defaultBucket;

   public String getEndPoint() {
      return endPoint;
   }

   public void setEndPoint(String endPoint) {
      this.endPoint = endPoint;
   }

   public String getUser() {
      return user;
   }

   public void setUser(String user) {
      this.user = user;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getDefaultBucket() {
      return defaultBucket;
   }

   public void setDefaultBucket(String defaultBucket) {
      this.defaultBucket = defaultBucket;
   }
}

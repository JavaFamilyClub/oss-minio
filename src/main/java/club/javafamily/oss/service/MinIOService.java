package club.javafamily.oss.service;

import club.javafamily.oss.properties.OssMinIOProperties;
import io.minio.GetObjectArgs;
import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.IOUtils;

import java.io.InputStream;

@Service
public class MinIOService {

   private final MinioClient client;
   private final OssMinIOProperties properties;

   @Autowired
   public MinIOService(MinioClient client, OssMinIOProperties properties) {
      this.client = client;
      this.properties = properties;
   }

   /**
    * Read oss obj to bytes.
    * @param objName object name(file name)
    * @return byte[]
    * @throws Exception when read failed.
    */
   public byte[] readBytes(String objName) throws Exception {
      return readBytes(properties.getDefaultBucket(), objName);
   }

   /**
    * Read oss obj to bytes.
    * @param objName object name(file name)
    * @return byte[]
    * @throws Exception when read failed.
    */
   public byte[] readBytes(String bucket, String objName) throws Exception {
      final GetObjectArgs getObjectArgs = GetObjectArgs.builder()
         .bucket(bucket)
         .object(objName)
         .build();

      byte[] bytes;

      try(InputStream in = client.getObject(getObjectArgs)) {
         bytes = IOUtils.readAllBytes(in);
      }

      return bytes;
   }

}

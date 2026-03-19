package com.sjk;

import com.aliyun.oss.*;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyun.oss.common.comm.SignVersion;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.file.Files;

public class Demo {
    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
        public static void main(String[] args) throws Exception {
            String endpoint = "oss-cn-beijing.aliyuncs.com";
            EnvironmentVariableCredentialsProvider credentialsProvider = CredentialsProviderFactory.newEnvironmentVariableCredentialsProvider();
            String bucketName = "java-ai010-0407";
            String objectName = "001.jpg";
            String region = "cn-beijing";
            ClientBuilderConfiguration clientBuilderConfiguration = new ClientBuilderConfiguration();
            clientBuilderConfiguration.setSignatureVersion(SignVersion.V4);
            OSS ossClient = OSSClientBuilder.create().endpoint(endpoint).credentialsProvider(credentialsProvider).clientConfiguration(clientBuilderConfiguration).region(region).build();

            try {
                File file = new File("D:\\images.jpg");
                byte[] content = Files.readAllBytes(file.toPath());
                System.out.println("Uploading a new object to OSS from a file");
                ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content));
            } catch (OSSException oe) {
                System.out.println("Caught an OSSException, which means your request made it to OSS, but was rejected with an error response for some reason.");
                System.out.println("Error Message:" + oe.getErrorMessage());
                System.out.println("Error Code:" + oe.getErrorCode());
                System.out.println("Request ID:" + oe.getRequestId());
                System.out.println("Host ID:" + oe.getHostId());
            } catch (ClientException ce) {
                System.out.println("Caught an ClientException, which means the client encountered a serious internal problem while trying to communicate with OSS, such as not being able to access the network.");
                System.out.println("Error Message:" + ce.getMessage());
            } finally {
                if (ossClient != null) {
                    ossClient.shutdown();
                }

            }

        }
}

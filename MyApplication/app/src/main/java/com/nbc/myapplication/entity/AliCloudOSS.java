package com.nbc.smartcar.phonecenter.bean;

import com.nbc.smartcar.phonecenter.bean.community.BaseEntity;

public class AliCloudOSS extends BaseEntity {

    private OSSPolicy data;

    public OSSPolicy getData() {
        return data;
    }

    public void setData(OSSPolicy data) {
        this.data = data;
    }

    public static class OSSPolicy {
        private String accessKeyId;
        private String host;
        private String dir;
        private String policy;
        private String signature;
        private String expire;

        public String getAccessKeyId() {
            return accessKeyId;
        }

        public void setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public String getPolicy() {
            return policy;
        }

        public void setPolicy(String policy) {
            this.policy = policy;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public String getExpire() {
            return expire;
        }

        public void setExpire(String expire) {
            this.expire = expire;
        }

    }

}

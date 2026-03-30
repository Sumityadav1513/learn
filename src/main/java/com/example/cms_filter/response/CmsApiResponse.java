package com.example.cms_filter.response;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CmsApiResponse {

    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Response {

        private List<Data> data;

        public List<Data> getData() {
            return data;
        }

        public void setData(List<Data> data) {
            this.data = data;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Data {

        private long msid;
        private long parentid;
        private long hostid;
        private String text;

        public long getMsid() {
            return msid;
        }

        public void setMsid(long msid) {
            this.msid = msid;
        }

        public long getParentid() {
            return parentid;
        }

        public void setParentid(long parentid) {
            this.parentid = parentid;
        }

        public long getHostid() {
            return hostid;
        }

        public void setHostid(long hostid) {
            this.hostid = hostid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}



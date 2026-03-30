package com.example.cms_filter.service;
import com.example.cms_filter.response.CmsApiResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CmsFetchService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String fetchTextFromCms(long id) {

        String url = "https://cloudservices.indiatimes.com/cms-api/detail/" + id + "?hostid=83";

        ResponseEntity<CmsApiResponse> response =
                restTemplate.getForEntity(url, CmsApiResponse.class);

        CmsApiResponse body = response.getBody();

        if (body != null &&
                body.getResponse() != null &&
                body.getResponse().getData() != null &&
                !body.getResponse().getData().isEmpty()) {

            return body.getResponse().getData().get(0).getText();
        }

        return "";
    }
}

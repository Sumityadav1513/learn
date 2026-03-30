package com.example.cms_filter.controller;

import com.example.cms_filter.response.CmsReq;
import com.example.cms_filter.response.CmsResponse;
import com.example.cms_filter.handler.CmsHandler;
import com.example.cms_filter.service.CmsFetchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cms")
@AllArgsConstructor
public class CmsFilterController {

    private final CmsFetchService fetchService;


    @PostMapping("/filter")
    public CmsResponse filter(@RequestBody CmsReq request) {

        CmsResponse response = new CmsResponse();
        response.setText(request.getText());
        response.setResultText(CmsHandler.filterText(request.getText()));

        return response;

    }


    @GetMapping("/filter/{articleId}")
    public CmsResponse filterArticle(@PathVariable long articleId) {

        String htmlText = fetchService.fetchTextFromCms(articleId);

        CmsResponse response = new CmsResponse();
        response.setText(htmlText);
        response.setResultText(CmsHandler.filterText(htmlText));

        return response;
    }
    }





package com.example.cms_filter.handler;

import java.util.regex.Pattern;

public class CmsHandler {

    private static final String REGEX =
            "(<strong>)?Go Beyond The Boundary[\\s\\S]*?<\\/a><br \\/>";

    private static final Pattern PATTERN =
            Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);

    public static String filterText(String text) {

        if (text == null) return "";

        return PATTERN.matcher(text).replaceAll("");
    }
}


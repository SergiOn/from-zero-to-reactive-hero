package com.example.part_10.external.utils;

import java.util.Map;

public interface MessageUnpacker {
    boolean supports(String messageType);

    Map<String, Object> unpack(String message);
}

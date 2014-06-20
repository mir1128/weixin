package com.wxservice.ItemPool;

import com.common.ConfigureService;

import java.util.Map;

public interface ItemsService {
    Map<Integer, String> loadItems();
}

package com.wxservice.ItemPool;

import com.common.ConfigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {

    private ConfigureService configureService;

    @Autowired
    public ItemsServiceImpl(ConfigureService configureService) {
        this.configureService = configureService;
    }

    @Override
    public Map<String, String> loadItems() {
        Map<String, String> result = new HashMap<String, String>();
        result.put("questions", configureService.getConfigure("questions_set"));
        return result;
    }
}

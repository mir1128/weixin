package com.wxservice.ItemPool;

import com.common.ConfigureService;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public interface ItemsService {
    void loadItems() throws IOException;
}

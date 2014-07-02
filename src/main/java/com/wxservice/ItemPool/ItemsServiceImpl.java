package com.wxservice.ItemPool;

import au.com.bytecode.opencsv.CSVReader;
import com.common.ConfigureService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    private static Logger logger = Logger.getLogger(ItemsServiceImpl.class);

    private ConfigureService configureService;

    private Map<Integer, Item> questionSet = new HashMap<Integer, Item>();

    public Map<Integer, Item> getQuestionSet() {
        return questionSet;
    }

    @Autowired
    public ItemsServiceImpl(ConfigureService configureService) {
        this.configureService = configureService;
        try {
            loadItems();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void loadItems() throws IOException {
        String questionSetFileName = configureService.getConfigure("questions_set");
        parseQuestionFile(questionSetFileName);
    }

    private void parseQuestionFile(String questionFile) throws IOException {
        List<String[]> fileContent = null;

        CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(questionFile), "UTF-8"));
        fileContent = reader.readAll();

        int index = 0;
        for (String[] line : fileContent) {
            Item item = new Item();
            item.setQuestion(line[0]);

            for (int i = 1; i < line.length - 1; ++i) {
                item.addOptions(line[i]);
            }
            item.setAnswer(line[line.length - 1]);
            questionSet.put(index++, item);
        }

    }
}
package com.wxservice.ItemPool;

import com.common.ConfigureService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    private static Logger logger = Logger.getLogger(ItemsServiceImpl.class);

    private ConfigureService configureService;

    @Autowired
    public ItemsServiceImpl(ConfigureService configureService) {
        this.configureService = configureService;
    }

    @Override
    public Map<Integer, String> loadItems() {
        String questionSetFileName = configureService.getConfigure("questions_set");
        return parseQuestionFile(questionSetFileName);
    }

    private Map<Integer, String> parseQuestionFile(String questionFile) {
        try {
            List<String> lines = readFileByLines(questionFile);

            for (String line : lines){
                if (line.contains("question_set")){

                }
            }

        } catch (FileNotFoundException e) {
            logger.error("file: " + questionFile + "not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> readFileByLines(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = null;
        List<String> result = new ArrayList<String>();
        try {
            reader = new BufferedReader(new FileReader(file));

            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                result.add(tempString);
            }
            reader.close();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return null;
    }
}
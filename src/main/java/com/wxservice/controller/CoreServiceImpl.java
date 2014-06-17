package com.wxservice.controller;

import com.wxservice.common.Constant;
import com.wxservice.common.MessageUtil;
import com.wxservice.common.response.TextResponseMessage;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

@Service("coreService")
public class CoreServiceImpl implements CoreService {
    @Override
    public String processRequest(HttpServletRequest request) {
        String respMessage = null;
        try {
            Map<String, String> requestMap = MessageUtil.parseXml(request);

            String fromUserName = requestMap.get("FromUserName");
            String toUserName = requestMap.get("ToUserName");
            String msgType = requestMap.get("MsgType");

            TextResponseMessage textMessage = new TextResponseMessage();
            textMessage.setToUserName(fromUserName);
            textMessage.setFromUserName(toUserName);
            textMessage.setCreateTime(new Date().getTime());
            textMessage.setMsgType(Constant.RESP_MESSAGE_TYPE_TEXT);
            textMessage.setFuncFlag(0);
            if (msgType.equals(Constant.REQ_MESSAGE_TYPE_TEXT)) {
                String content = requestMap.get("Content");

                System.out.println(Charset.defaultCharset());

                if ("1".equals(content)) {
                    textMessage.setContent(new String("中文".getBytes(), "UTF-8"));
                    respMessage = MessageUtil.textMessageToXml(textMessage);
                }else if ("2".equals(content)) {
                    textMessage.setContent(new String("小鸡炖蘑菇".getBytes(), "UTF-8"));
                    respMessage = MessageUtil.textMessageToXml(textMessage);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respMessage;

    }

}

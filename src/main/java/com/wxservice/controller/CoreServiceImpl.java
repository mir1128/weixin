package com.wxservice.controller;

import com.wxservice.common.Constant;
import com.wxservice.common.MessageUtil;
import com.wxservice.common.response.TextResponseMessage;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

@Service("coreService")
public class CoreServiceImpl implements CoreService {
    private static Logger logger = Logger.getLogger(CoreServiceImpl.class);

    private ClientMessageProcessor clientMessageProcessor;

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

            logger.info("the charset is: " + Charset.defaultCharset());

            if (!msgType.equals(Constant.REQ_MESSAGE_TYPE_TEXT)) {
                logger.info("receive a none text message, type is: " + msgType);
            } else {
                String content = requestMap.get("Content");
                logger.info("receive text message from: " + fromUserName + "and the content is: " + content);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return respMessage;
    }
}

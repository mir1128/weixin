package com.wxservice.common.request;

public class LocationRequestMessage extends WeChatBaseRequestMessage {
    private String LocationX;
    private String LocationY;
    private String Scale;
    private String Label;

    public String getLocationX() {
        return LocationX;
    }

    public void setLocationX(String locationX) {
        this.LocationX = locationX;
    }

    public String getLocationY() {
        return LocationY;
    }

    public void setLocationY(String locationY) {
        this.LocationY = locationY;
    }

    public String getScale() {
        return Scale;
    }

    public void setScale(String scale) {
        this.Scale = scale;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        this.Label = label;
    }
}

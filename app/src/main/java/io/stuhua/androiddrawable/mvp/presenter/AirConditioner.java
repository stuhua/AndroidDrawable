package io.stuhua.androiddrawable.mvp.presenter;

/**
 * Created by liulh on 2017/5/17 15:03 星期三
 */

public class AirConditioner {


    /**
     * focus : airControl
     * rawText : 空调升高10度
     * operation : SET
     * device : 空调
     * mode : 制冷
     * temperature : 1
     * fanSpeed : 高风
     * airflowDirection : 上下扫风启动
     * fanLevel : 1
     * name : 定时
     * target : 主驾
     */

    private String focus;
    private String rawText;
    private String operation;
    private String device;
    private String mode;
    private String temperature;
    private String fanSpeed;
    private String airflowDirection;
    private String fanLevel;
    private String name;
    private String target;

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    public String getRawText() {
        return rawText;
    }

    public void setRawText(String rawText) {
        this.rawText = rawText;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(String fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public String getAirflowDirection() {
        return airflowDirection;
    }

    public void setAirflowDirection(String airflowDirection) {
        this.airflowDirection = airflowDirection;
    }

    public String getFanLevel() {
        return fanLevel;
    }

    public void setFanLevel(String fanLevel) {
        this.fanLevel = fanLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}

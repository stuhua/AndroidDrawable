package io.stuhua.androiddrawable.mvp.presenter;

/**
 * Created by liulh on 2017/5/17 15:03 星期三
 */

public class AirConditioner1 {

    /**
     * focus : airControl
     * rawText : 空调升高10度
     * operation : SET
     * device : 空调
     * mode : 制冷
     * temperature : {"direct":"+","type":"SPOT","offset":"10","ref":"CUR"}
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
    private TemperatureBean temperature;
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

    public TemperatureBean getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureBean temperature) {
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

    public  class TemperatureBean {
        /**
         * direct : +
         * type : SPOT
         * offset : 10
         * ref : CUR
         */

        private String direct;
        private String type;
        private String offset;
        private String ref;

        public String getDirect() {
            return direct;
        }

        public void setDirect(String direct) {
            this.direct = direct;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getOffset() {
            return offset;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public String getRef() {
            return ref;
        }

        public void setRef(String ref) {
            this.ref = ref;
        }
    }
    @Override
    public String toString() {
        return "focus=" + getFocus() + "...rawText=" + getRawText() + "...operation=" + getOperation() + "...device=" + getDevice() + "...mode=" + getMode()
                + "...direct=" + getTemperature().getDirect() + "...offset=" + getTemperature().getOffset()
                + "...fanSpeed=" + getFanSpeed() + "...airflowDirection=" + getAirflowDirection() + "...fanLevel=" + getFanLevel() + "...name=" + getName() + "...target=" + getTarget();
    }
}

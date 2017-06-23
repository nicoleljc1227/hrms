package com.nicole.hrms.util;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by xl on 2017/6/22.
 */
//，其作用是将日期转化使之能在 easyUI 的 datagrid 中正常显
public class JsonDateValueProcessor implements JsonValueProcessor{
    //JSONObject插件将JavaBean或List<JavaBean>转换为JSON格式的字符串,将Date转换为我们认识的“yyyy-MM-dd”格式
    private String format = "yyyy-MM-dd";
    public JsonDateValueProcessor() {
        super();
    }

    public JsonDateValueProcessor(String format) {
        super();
        this.format = format;
    }

    public Object processArrayValue(Object o, JsonConfig jsonConfig) {
        return proces(o);
    }

    public Object processObjectValue(String s, Object o, JsonConfig jsonConfig) {
        return proces(o);
    }

    private Object proces(Object value){
        if(value instanceof Date){
            SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.CHINA);
            return sdf.format(value);
        }
        return value == null? "":value.toString();
    }
}

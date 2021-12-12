package cn.mvc.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.net.BindException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

//定义类型转换器 需要明确源类型 和目标性
//在convert方法自定义类型转换的实现
//在springMVC中配置自定义类型转换器

public class MyStringToDateconverter implements Converter<String, Date> {

    @Override
    public Date convert(String source) {
        if(StringUtils.isEmpty(source)) {
            try {
                if (source.split("-").length == 3) {
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    return df.parse(source);
                } else if (source.split("/").length == 3) {
                    DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                    return df.parse(source);
                } else {
                    throw new RuntimeException("日期转换后错误" + source);
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
            return null;
        }
    }

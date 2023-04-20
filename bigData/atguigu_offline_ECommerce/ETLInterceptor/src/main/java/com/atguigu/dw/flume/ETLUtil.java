package com.atguigu.dw.flume;

import oracle.jrockit.jfr.StringConstantPool;
import org.apache.commons.lang.NumberUtils;
import org.apache.commons.lang.StringUtils;

public class ETLUtil {

    public static boolean validStartLog(String source) {
        if (StringUtils.isBlank(source)) {
            return false;
        }
        String trimStr = source.trim();
        return trimStr.startsWith("{") && trimStr.endsWith("}");

    }

    public static boolean validEventLog(String source) {
        if (StringUtils.isBlank(source)) {
            return false;
        }

        String trimStr = source.trim();
        String[] words = trimStr.split("\\|");

        if (words.length != 2) {
            return false;
        }

        if (words[0].length() != 13 || !NumberUtils.isDigits(words[0])) {
            return false;
        }

        return words[1].startsWith("{") && words[1].endsWith("}");
    }
}

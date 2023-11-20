package com.atguigu11._annotation;

/**
 * ClassName: MyAnnotation
 * Package: com.atguigu11._annotation
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/8/7 - 11:38
 * @Version: v1.0
 */


public @interface MyAnnotation {

    String value() default "hello";

}

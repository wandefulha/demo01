package com.example.demo.Scanner;

import com.example.demo.Annotation.AutoWired;
import org.reflections.Reflections;

import java.util.Set;

public class AnnotationScanner {
    public static void getAnnotation(){
        String packageName="com.example.demo";
        Reflections ref=new Reflections(packageName);
        Set<Class<?>> set=ref.getTypesAnnotatedWith(AutoWired.class);
        for(Class<?> cls:set){
            AutoWired anno=cls.getAnnotation(AutoWired.class);
            if(anno!=null){
                System.out.println(anno.value());
            }
        }
    }
}

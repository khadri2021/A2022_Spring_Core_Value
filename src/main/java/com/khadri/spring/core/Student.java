package com.khadri.spring.core;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Student {

    @Value("JHON")
    private String name;

    @Value("${prettyName}")
    private String prettyName;

    @Value("${systemValue}")
    private String dynamicName;


    @Value("${unknownProperty:jooooony}")
    private String unknownName;

    @Value("${allNames}")
    private String[] allNames;

    @Value("${listNames}")
    private List<String> listNames;


    @Value("#{${subjectMarks}}")
    private Map<String,Integer> subjectMarks;

    public void setSubjectMarks(Map<String, Integer> subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public Map<String, Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public void setListNames(List<String> listNames) {
        this.listNames = listNames;
    }

    public List<String> getListNames() {
        return listNames;
    }

    public void setAllNames(String[] allNames) {
        this.allNames = allNames;
    }

    public String[] getAllNames() {
        return allNames;
    }

    public void setUnknownName(String unknownName) {
        this.unknownName = unknownName;
    }

    public String getUnknownName() {
        return unknownName;
    }

    public void setDynamicName(String dynamicName) {
        this.dynamicName = dynamicName;
    }

    public String getDynamicName() {
        return dynamicName;
    }

    public void setPrettyName(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getPrettyName() {
        return prettyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

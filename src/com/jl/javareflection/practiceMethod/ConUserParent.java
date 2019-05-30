package com.jl.javareflection.practiceMethod;

public class ConUserParent {
    public String father;
    public String mother;

    public ConUserParent() {
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public ConUserParent(String father, String mother) {
        this.father = father;
        this.mother = mother;
    }
}

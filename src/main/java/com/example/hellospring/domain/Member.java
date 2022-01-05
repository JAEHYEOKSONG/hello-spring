package com.example.hellospring.domain;

public class Member {
    private Long id;
    private String name;

    public Long getId() { //쉬운 예제를 만드는 것이기때문에 getset다만든것
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package io.scarletgraph.api.enums;

public enum Role {
    COMPANY("company"),
    CANDIDATE("candidate"),
    ADMIN("admin");

    private String content;

    private Role (String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}

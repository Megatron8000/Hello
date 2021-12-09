package com.java.hello.module21;

public class Robot <H> {  // H - параметр имеющий несколько вариантов реализации
    private Body body;
    private H head;

    public Robot(Body body, H head) {
        this.body = body;
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public H getHead() {
        return head;
    }

    public void setHead(H head) {
        this.head = head;
    }
}

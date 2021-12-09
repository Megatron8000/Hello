package com.java.hello.module21;

 /*H - параметр имеющий несколько вариантов реализации,
фиктивный тип, которому при реализации присваивается конкретное зачение
extends Head - говорит о том, что тип моэет принимать только те значения,
которые наследуются от Head*/

public class Robot <H extends Head> {
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

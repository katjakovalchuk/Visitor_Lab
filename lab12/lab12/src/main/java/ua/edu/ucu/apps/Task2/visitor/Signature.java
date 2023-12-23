package lab12.lab12.src.main.java.ua.edu.ucu.apps.Task2.visitor;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {

    public Consumer<T> consumer;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }

    @Override
    public void stamp(Visitor<T> visitor) { 
        setHeader("groups", visitor.setSignature(this).get("groups"));
    }
}

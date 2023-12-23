package lab12.lab12.src.main.java.ua.edu.ucu.apps.Task2.visitor;

import java.util.Map;

public interface Visitor<T> {
    Map<String, String> setSignature(Task<T> task);
    Map<String, String> setGroupStart(Group<T> task);
    void groupEnd(Group<T> task);
}
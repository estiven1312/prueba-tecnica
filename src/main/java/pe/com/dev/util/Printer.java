package pe.com.dev.util;

import java.util.List;

public interface Printer<T> {
    void print(T t);
    void print(List<T> t);

}

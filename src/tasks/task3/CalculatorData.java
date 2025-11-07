package tasks.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CalculatorData {
  int conNumber = 5;
  int addNumber = 2;

  public void run() {
    try {
      Class<?> clazz = Calculator.class;

      Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
      constructor.setAccessible(true);

      Object obj = constructor.newInstance(conNumber);

      Method method = clazz.getDeclaredMethod("add", int.class);
      method.setAccessible(true);
      Object result = method.invoke(obj, addNumber);

      System.out.println(obj);
      System.out.println(result);
    } catch (Exception e) {
      System.out.println("error");
    }
  }
}

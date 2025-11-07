package tasks.task4;

import java.lang.reflect.Method;

// Skriv en funktion som tar in ett objekt, vilket som helst, och anropar alla metoder för objektet som har en
// `@AutoCall` annotation. Ni skall skapa den själva. Metoderna med `@AutoCall` kan inte ha några parametrar
// när ni testar.

public class Task4 {

  public static void runAll(Object object) {
    try {
      Method[] methods = object.getClass().getDeclaredMethods();
      for (Method method : methods) {
        if (method.isAnnotationPresent(Autocall.class) && method.getParameterTypes().length == 0) {
          method.invoke(object);
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Autocall
  public void test() {
    System.out.println("HELLO");
  }

  @Autocall
  public void test2() {
    System.out.println("HELLO2");
  }

  public void test3() {
    System.out.println("HELLO3");
  }

  @Autocall
  public void test4() {
    System.out.println("HELLO4");
  }

}



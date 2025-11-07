package tasks.task3;

//Skapa ett nytt objekt utifrån klassen, skicka in valfritt nummer som argument till constructorn,
// och anropa sedan `add` funktionen, allt genom att använda reflection. Koden måste skrivas i en separat klass.

  public class Calculator {
    private int number;

    private Calculator(int number) {
      this.number = number;
    }

    private int add(int other) {
      return this.number + other;
    }

    @Override
    public String toString() {
      return "" + this.number;
    }
  }

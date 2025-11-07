package tasks.task2;

//Skriv en enkel EGEN ArrayList implementation med följande funktioner:
//    - `add` Lägger till element i listan
//- `remove` Tar bort element från listan
//- `get` Hämtar ett element baserat på index
//- `clear` Tömmer hela listan / Raderar alla element
//
//VIKTIGT: Koden får inte på något sätt innehålla den existerande ArrayList klassen som finns inbyggd i Java. Er uppgift är att skapa en egen sådan.

public class CustomArrayList<E> {
  private Object[] elementData = new Object[2];
  private int size = 0;

  public void add(E element) {
    if (size >= elementData.length) {
      resize();
    }
    elementData[size++] = element;
  }

  public void remove(E element) {
    for (int i = find(element); i < size;) {
      if (i == -1) return;
      elementData[i] = elementData[++i];
    }
    size--;
  }

  public int find(E element) {
    for (int i = 0; i < this.size; i++) {
      if (element.equals(elementData[i])) {
        return i;
      }
    }
    return -1;
  }

  public E get(int index) {
    if (index < 0 || index >= size) {
      return null;
    }
    return (E) elementData[index];
  }

  public void clear() {
    elementData = new Object[size];
    size = 0;
  }

  public void resize() {
    Object[] cal = new Object[size * 2];
    for (int i = 0; i < size; i++) {
      cal[i] = elementData[i];
    }
    elementData = cal;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("{ ");
    for (int i = 0; i < size; i++) {
      builder.append(elementData[i]).append(" ");
    }
    builder.append("}");
    return builder.toString();
  }

}
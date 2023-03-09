import java.util.Arrays;

/*Если при добавлении очередного элемента в список в массиве уже нет места,
в методе add() происходит следующее:

1. создается новый массив в полтора раза длиннее предыдущего
2. в него копируются все элементы из существующего массива
3. в объекте ArrayList вместо старого массива сохраняется ссылка на новый.
4. В 10-ю ячейку нового массива записывается переданный элемент
5. size увеличивается на 1 и теперь будет равняться 11*/
public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] temp = Arrays.copyOf(elements, (int)(capacity*1.5));
        elements = temp;

    }

}


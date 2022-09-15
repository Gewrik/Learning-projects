package Finished;

public class ArrayBubble {
    private long[] a;   //array created
    private int elems;  //array length

    public ArrayBubble(int max) {
        a = new long[max];
        elems = 0;
    }

    public void add(long value) {   //метод вставки элемента в массив
        a[elems] = value;           //вставка value в массив a
        elems++;                    //размер массива увеличивается
    }

    public void printer() {          //метод вывода массива в консоль
        for (int i = 0; i < elems; i++) {    //для каждого элемента в массиве
            System.out.print(a[i] + " ");   //вывести в консоль
            System.out.println("");
        }
        System.out.println("----End of print of the array----");

    }

    private void toSwap(int first, int second) { //метод меняет местами пару чисел массива
        long dummy = a[first];      //во временную переменную помещаем первый элемент
        a[first] = a[second];       //на место первого ставим второй элемент
        a[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
    }

    public void bubbleSorter() {     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--) {  //Внешний цикл
            for (int in = 0; in < out; in++) {       //Внутренний цикл
                if (a[in] > a[in + 1])               //Если порядок элементов нарушен
                    toSwap(in, in + 1);             //вызвать метод, меняющий местами
            }
        }
    }
}

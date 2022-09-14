class ArrayBubble{
    private long[] a;   //ссылка на массив
    private int elems;  //количество элементов в массиве

    public ArrayBubble(int max){    //конструктор класса
        a = new long[max];          //создание массива размером max
        elems = 0;                  //при создании массив содержит 0 элементов
    }

    public void add(long value){   //метод вставки элемента в массив
        a[elems] = value;           //вставка value в массив a
        elems++;                    //размер массива увеличиваетс€
    }

    public void printer(){          //метод вывода массива в консоль
        for (int i = 0; i < elems; i++){    //дл€ каждого элемента в массиве
            System.out.print(a[i] + " ");   //вывести в консоль
            System.out.println("");         //с новой строки
        }
        System.out.println("----ќкончание вывода массива----");

    }

    private void toSwap(int first, int second){ //метод мен€ет местами пару чисел массива
        long dummy = a[first];      //во временную переменную помещаем первый элемент
        a[first] = a[second];       //на место первого ставим второй элемент
        a[second] = dummy;          //вместо второго элемента пишем первый из временной пам€ти
    }

    public void bubbleSorter(){     //ћ≈“ќƒ ѕ”«џ–№ ќ¬ќ… —ќ–“»–ќ¬ »
        for (int out = elems - 1; out >= 1; out--){  //¬нешний цикл
            for (int in = 0; in < out; in++){       //¬нутренний цикл
                if(a[in] > a[in + 1])               //≈сли пор€док элементов нарушен
                    toSwap(in, in + 1);             //вызвать метод, мен€ющий местами
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(5); //—оздаем массив array на 5 элементов

        array.add(163);       //заполн€ем массив
        array.add(300);
        array.add(184);
        array.add(191);
        array.add(174);

        array.printer();            //выводим элементы до сортировки
        array.bubbleSorter();       //»—ѕќЋ№«”≈ћ ѕ”«џ–№ ќ¬”ё —ќ–“»–ќ¬ ”
        array.printer();            //снова выводим отсортированный йсписок
    }
}
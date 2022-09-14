class ArrayBubble{
    private long[] a;   //������ �� ������
    private int elems;  //���������� ��������� � �������

    public ArrayBubble(int max){    //����������� ������
        a = new long[max];          //�������� ������� �������� max
        elems = 0;                  //��� �������� ������ �������� 0 ���������
    }

    public void add(long value){   //����� ������� �������� � ������
        a[elems] = value;           //������� value � ������ a
        elems++;                    //������ ������� �������������
    }

    public void printer(){          //����� ������ ������� � �������
        for (int i = 0; i < elems; i++){    //��� ������� �������� � �������
            System.out.print(a[i] + " ");   //������� � �������
            System.out.println("");         //� ����� ������
        }
        System.out.println("----��������� ������ �������----");

    }

    private void toSwap(int first, int second){ //����� ������ ������� ���� ����� �������
        long dummy = a[first];      //�� ��������� ���������� �������� ������ �������
        a[first] = a[second];       //�� ����� ������� ������ ������ �������
        a[second] = dummy;          //������ ������� �������� ����� ������ �� ��������� ������
    }

    public void bubbleSorter(){     //����� ����������� ����������
        for (int out = elems - 1; out >= 1; out--){  //������� ����
            for (int in = 0; in < out; in++){       //���������� ����
                if(a[in] > a[in + 1])               //���� ������� ��������� �������
                    toSwap(in, in + 1);             //������� �����, �������� �������
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(5); //������� ������ array �� 5 ���������

        array.add(163);       //��������� ������
        array.add(300);
        array.add(184);
        array.add(191);
        array.add(174);

        array.printer();            //������� �������� �� ����������
        array.bubbleSorter();       //���������� ����������� ����������
        array.printer();            //����� ������� ��������������� �������
    }
}
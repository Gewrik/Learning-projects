package Finished;

public class ArrayBubble {
    private long[] a;   //array created
    private int elems;  //array length

    public ArrayBubble(int max) {
        a = new long[max];
        elems = 0;
    }

    public void add(long value) {   //����� ������� �������� � ������
        a[elems] = value;           //������� value � ������ a
        elems++;                    //������ ������� �������������
    }

    public void printer() {          //����� ������ ������� � �������
        for (int i = 0; i < elems; i++) {    //��� ������� �������� � �������
            System.out.print(a[i] + " ");   //������� � �������
            System.out.println("");
        }
        System.out.println("----End of print of the array----");

    }

    private void toSwap(int first, int second) { //����� ������ ������� ���� ����� �������
        long dummy = a[first];      //�� ��������� ���������� �������� ������ �������
        a[first] = a[second];       //�� ����� ������� ������ ������ �������
        a[second] = dummy;          //������ ������� �������� ����� ������ �� ��������� ������
    }

    public void bubbleSorter() {     //����� ����������� ����������
        for (int out = elems - 1; out >= 1; out--) {  //������� ����
            for (int in = 0; in < out; in++) {       //���������� ����
                if (a[in] > a[in + 1])               //���� ������� ��������� �������
                    toSwap(in, in + 1);             //������� �����, �������� �������
            }
        }
    }
}

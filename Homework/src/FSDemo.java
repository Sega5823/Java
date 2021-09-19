class FailSoftArray{
    private int a[];
    private int errval;

    int length;

    /*Конструктору данного класса передаются размер массива
    и значение , которое должжен возвращать метод get() при
    возникновении ошибок
     */
    public FailSoftArray(int size, int ervv){
        a = new int[size];
        errval = ervv;
        length = size;
    }

    // Возврат значения элемента массива с заданным индексом
    public int get(int index){
        if (indexOK(index)) return a[index];
        return errval;
    }

    // Установка значения элемента с заданным индексом.
    // Если возникает ошибка, вернуть логическое значение false
    public boolean put(int index, int val){
        if (indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    // Возврат логического значения true, если индекс
    // не выходит за пределы массива
    private boolean indexOK(int index){
        if (index >= 0 & index < length) return true;
        return false;
    }
}

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        //Демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчета.");
        for (int i = 0; i < (fs.length) * 2; i++)
            fs.put(i, i * 10);

        for (int i = 0; i < (fs.length) * 2; i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        //Обработка ошибок
        System.out.println("\nОбработка ошибок с с выводом отчета");
        for (int i = 0; i < (fs.length*2); i++)
            if(!fs.put(i, i*10))
                System.out.println("Индекс " + i + " вне допустимого диапазона");

        for (int i = 0; i < (fs.length*2); i++){
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
            else
                System.out.println("Индекс " + i + " вне допустимого диапазона");
        }


    }
}



//class QDemo {
    class Queue {
        private char q[];
        private int putloc, getloc;

        Queue(int size) {
            q = new char[size];
            putloc = getloc = 0;
        }

        void put(char ch) {
            if (putloc == q.length) {
                System.out.println(" - Очередь заполнена");
                return;
            }
            q[putloc++] = ch;
        }

        char get() {
            if (getloc == putloc) {
                System.out.println(" - Очередь пуста");
                return (char) 0;
            }

            return q[getloc++];
        }
    }


class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Использование очереди bigQ для" +
                " сохранения алфавита");
        //Помещение буквенных символов в очередь bigQ
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        //Извлечение и отображение буквенных символов из
        //очереди bigQ
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Использование очереди smallQ: " +
                "для генерации ошибок");
        //Использование очереди smallQ для генерации ошибок
        for (i=0; i < 5; i++){
            System.out.print("Попытка сохранения " + (char) ('Z'-i));

            smallQ.put((char)('Z' - i));

            System.out.println();
        }

        System.out.println();

        //Дополнительные ошибки при обращении к очереди smallQ
        System.out.println("Содержимое очереди smallQ: ");
        for (i=0; i < 5; i++){
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
        }
    }
}


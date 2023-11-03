public class Main {
    public static void main(String[] args) {
        MyVector myVector = new MyVector();

        myVector.add(5);
        myVector.add(10);
        myVector.add(15);
        myVector.add(20);

        System.out.println("Вектор после добавления элементов: " + myVector);

        myVector.add(2, 25);
        System.out.println("Вектор после вставки элемента на позицию 2: " + myVector);

        myVector.removeAt(1);
        System.out.println("Вектор после удаления элемента на позиции 1: " + myVector);

        System.out.println("Вектор содержит 15: " + myVector.contains(15));

        int elem = myVector.get(3);
        System.out.println("Элемент с индексом 3: " + elem);

        int index = myVector.indexOf(25);
        System.out.println("Индекс элемента 25: " + index);

        myVector.reverse();
        System.out.println("Реверсированный вектор: " + myVector);

        myVector.sort();
        System.out.println("Отсортированный вектор: " + myVector);

        int[] array = myVector.toArray();
        System.out.print("Представление в виде массива: ");
        for (int result : array) {
            System.out.print(result + " ");
        }
        System.out.println();

        myVector.clear();
        System.out.println("Вектор после очистки: " + myVector);
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Integer> arrList = new ArrayList<>();
            List<Integer> linkedList = new LinkedList<>();

            fillOutList(arrList, 1_000_000);
            fillOutList(linkedList, 1_000_000);

            System.out.println("=========== ARRAY LIST ===========");

            // ============== 100 elements

            long time = System.nanoTime();
            addElementsToBeginning(arrList, 100);
            long add100ElementArrayListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100 element added into the beginning: "  + add100ElementArrayListBeginning);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToMiddle(arrList, 100);
            long add100ElementArrayListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("100 element added into the middle: " + add100ElementArrayListMiddle);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToEnd(arrList, 100);
            long add100ElementArrayListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100 element added into the end: " + add100ElementArrayListEnd);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromBeginning(arrList, 100);
            long remove100ElementArrayListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100 element removed from the beginning: " + remove100ElementArrayListBeginning);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromMiddle(arrList, 100);
            long remove100ElementArrayListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("100 element removed from the middle: " + remove100ElementArrayListMiddle);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromEnd(arrList, 100);
            long remove100ElementArrayListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100 element removed from the end: " + remove100ElementArrayListEnd);

            // ============== 10.000 elements

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToBeginning(arrList, 10000);
            long add10000ElementArrayListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element added into the beginning: " + add10000ElementArrayListBeginning);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToMiddle(arrList, 10000);
            long add10000ElementArrayListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element added into the middle: " + add10000ElementArrayListMiddle);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToEnd(arrList, 10000);
            long add100000ElementArrayListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element added into the end: " + add100000ElementArrayListEnd);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromBeginning(arrList, 10000);
            long remove10000ElementArrayListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element removed from the beginning: " + remove10000ElementArrayListBeginning);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromMiddle(arrList, 10000);
            long remove100000ElementArrayListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element removed from the middle: " + remove100000ElementArrayListMiddle);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromEnd(arrList, 10000);
            long remove10000ElementArrayListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element removed from the end: " + remove10000ElementArrayListEnd);

            // ============== 100.000 elements

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToBeginning(arrList, 100_000);
            long add1000000ElementArrayListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element added into the beginning: " + add1000000ElementArrayListBeginning);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToMiddle(arrList, 100_000);
            long add1000000ElementArrayListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element added into the middle: " + add1000000ElementArrayListMiddle);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            addElementsToEnd(arrList, 100_000);
            long add10000000ElementArrayListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element added into the end: " + add10000000ElementArrayListEnd);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromBeginning(arrList, 100_000);
            long remove1000000ElementArrayListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element removed from the beginning: " + remove1000000ElementArrayListBeginning);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromMiddle(arrList, 100_000);
            long remove10000000ElementArrayListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element removed from the middle: " + remove10000000ElementArrayListMiddle);

            arrList = new ArrayList<>();
            fillOutList(arrList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromEnd(arrList, 100_000);
            long remove1000000ElementArrayListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element removed from the end: " + remove1000000ElementArrayListEnd);

            System.out.println("=========== LINKED LIST ===========");

            // ============== 100 elements

            time = System.nanoTime();
            addElementsToBeginning(linkedList, 100);
            long add100ElementLinkedListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100 element added into the beginning: " + add100ElementLinkedListBeginning);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            addElementsToMiddle(linkedList, 100);
            long add100ElementLinkedListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("100 element added into the middle: " + add100ElementLinkedListMiddle);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            addElementsToEnd(linkedList, 100);
            long add100ElementLinkedListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100 element added into the end: " + add100ElementLinkedListEnd);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromBeginning(linkedList, 100);
            long remove100ElementLinkedListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100 element removed from the beginning: " + remove100ElementLinkedListBeginning);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromMiddle(linkedList, 100);
            long remove100ElementLinkedListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("100 element removed from the middle: " + remove100ElementLinkedListMiddle);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromEnd(linkedList, 100);
            long remove100ElementLinkedListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100 element removed from the end: " + remove100ElementLinkedListEnd);

            // ============== 10.000 elements

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            addElementsToBeginning(linkedList, 10000);
            long add10000ElementLinkedListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element added into the beginning: " + add10000ElementLinkedListBeginning);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            addElementsToMiddle(linkedList, 10000);
            long add10000ElementLinkedListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element added into the middle: " + add10000ElementLinkedListMiddle);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            addElementsToEnd(linkedList, 10000);
            long add100000ElementLinkedListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element added into the end: " + add100000ElementLinkedListEnd);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromBeginning(linkedList, 10000);
            long remove10000ElementLinkedListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element removed from the beginning: " + remove10000ElementLinkedListBeginning);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromMiddle(linkedList, 10000);
            long remove100000ElementLinkedListMiddle = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element removed from the middle: " + remove100000ElementLinkedListMiddle);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromEnd(linkedList, 10000);
            long remove10000ElementLinkedListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("10.000 element removed from the end: " + remove10000ElementLinkedListEnd);

            // ============== 100.000 elements

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            addElementsToBeginning(linkedList, 100_000);
            long add1000000ElementLinkedListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element added into the beginning: " + add1000000ElementLinkedListBeginning);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            addElementsToEnd(linkedList, 100_000);
            long add10000000ElementLinkedListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element added into the end: " + add10000000ElementLinkedListEnd);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromBeginning(linkedList, 100_000);
            long remove1000000ElementLinkedListBeginning = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element removed from the beginning: " + remove1000000ElementLinkedListBeginning);

            linkedList = new LinkedList<>();
            fillOutList(linkedList, 1_000_000);
            time = System.nanoTime();
            removeElementsFromEnd(linkedList, 100_000);
            long remove1000000ElementLinkedListEnd = (System.nanoTime() - time) / 10000;

            System.out.println("100.000 element removed from the end: " + remove1000000ElementLinkedListEnd);

        }

        private static void fillOutList(List<Integer> list, int amountOfElements) {
            for (int i = 0; i < amountOfElements; i++) {
                list.add(i);
            }
        }

        public static void addElementsToBeginning(List<Integer> list, int numberOfElementsToAdd) {
            for (int i = 0; i < numberOfElementsToAdd; i++) {
                list.add(0, Integer.MAX_VALUE);
            }
        }

        public static void addElementsToMiddle(List<Integer> list, int numberOfElementsToAdd) {
            for (int i = 0; i < numberOfElementsToAdd; i++) {
                list.add(list.size() / 2, Integer.MAX_VALUE);
            }

        }

        public static void addElementsToEnd(List<Integer> list, int numberOfElementsToAdd) {
            for (int i = 0; i < numberOfElementsToAdd; i++) {
                list.add(Integer.MAX_VALUE);
            }
        }

        public static void removeElementsFromBeginning(List<Integer> list, int numberOfElementsToRemove) {
            for (int i = 0; i < numberOfElementsToRemove; i++) {
                list.remove(0);
            }
        }

        public static void removeElementsFromMiddle(List<Integer> list, int numberOfElementsToRemove) {
            for (int i = 0; i < numberOfElementsToRemove; i++) {
                list.remove(list.size() / 2);
            }
        }

        public static void removeElementsFromEnd(List<Integer> list, int numberOfElementsToRemove) {
            for (int i = 0; i < numberOfElementsToRemove; i++) {
                list.remove(list.size() - 1);
            }
        }
}
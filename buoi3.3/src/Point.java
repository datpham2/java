import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.print();
        p1.move(1, 2);
        p1.print();

        Point p2 = new Point(3, 4);
        p2.print();
        p2.move(5, 6);
        p2.print();

        List<Integer> list = new ArrayList<>();

        // Explain: what the heck is .stream() method in collections?
        // Answer: .stream() method is used to convert a collection into a Stream.
        // Stream is a new abstract layer introduced in Java 8. Using stream, you can process data in a declarative way similar to SQL statements.
        // For example, consider the following code which finds the first string in a collection that starts with letter 'a':
        // List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        // String result = list.stream().filter(s -> s.startsWith("a")).findFirst().orElse(null);
        // System.out.println(result);
        // In the above example, we first convert the list into a stream using the stream() method. We filter the stream to get a stream of strings which starts with character 'a'. Finally, we call the findFirst() method which returns an Optional. The orElse(null) method returns the value if present, otherwise returns null.
        // The stream() method is available in the Collection interface. Thus, you can call the method on any Collection like List, Set, Queue, etc.
        // The stream() method is used to get a stream from the collection.
        // The stream() method is a default method in the Collection interface.
        // The stream() method is used to perform operations on the collection.
        // The stream() method is used to return a sequential stream considering collection as its source.
        // The stream() method is used to get a sequential stream from the collection.

        // What is stream?
        // A stream represents a sequence of elements and supports different kind of operations to perform computations upon those elements.
        // Stream operations are either intermediate or terminal. Intermediate operations return a stream so we can chain multiple intermediate operations without using semicolons. Terminal operations are either void or return a non-stream result. In the above example, the filter, map, and sorted are intermediate operations, and forEach is a terminal operation.
        // Stream is used to compute elements as per the pipelined methods.

        // Explain stream more easy to understand
        // Stream is a sequence of elements supporting sequential and parallel aggregate operations. Stream is designed to work with Java 8 lambda expressions. Using Stream, you can process data in a declarative way similar to SQL statements. For example, consider the following code which finds the first string in a collection that starts with letter 'a':
        // List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        // String result = list.stream().filter(s -> s.startsWith("a")).findFirst().orElse(null);
        // System.out.println(result);
        // In the above example, we first convert the list into a stream using the stream() method. We filter the stream to get a stream of strings which starts with character 'a'. Finally, we call the findFirst() method which returns an Optional. The orElse(null) method returns the value if present, otherwise returns null.
        // Stream is a new abstract layer introduced in Java 8. Using stream, you can process data in a declarative way similar to SQL statements.
        // Stream is used to compute elements as per the pipelined methods.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer sum = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }
}

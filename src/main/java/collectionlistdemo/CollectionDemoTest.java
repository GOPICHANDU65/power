package collectionlistdemo;
import java.util.ArrayList;
import java.util.List;


public class CollectionDemoTest {
    public static void main(String[] args) {
        ReastruantDemo reastruantDemo = new ReastruantDemo();
        reastruantDemo.names = "Chandu";

        ReastruantDemo reastruantDemo1 = new ReastruantDemo();
        reastruantDemo1.names = "Chandu";

        ReastruantDemo reastruantDemo2 = new ReastruantDemo();
        reastruantDemo2.names = "Chandu";

        List<ReastruantDemo> reastruantDemoList1 = new ArrayList<>();
        reastruantDemoList1.add(reastruantDemo);
        reastruantDemoList1.add(reastruantDemo1);
        reastruantDemoList1.add(reastruantDemo2);

    }

}


class TaskNode {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class Task {
    TaskNode head = null;
    TaskNode tail = null;
    TaskNode current = null;

    public void addAtBeginning(int taskID, String taskName, int priority, String dueDate) {
        TaskNode node1 = new TaskNode(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = tail = node1;
            node1.next = head;
        } else {
            node1.next = head;
            tail.next = node1;
            head = node1;
        }
    }

    public void addAtEnd(int taskID, String taskName, int priority, String dueDate) {
        TaskNode node2 = new TaskNode(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = tail = node2;
            node2.next = head;
        } else {
            tail.next = node2;
            node2.next = head;
            tail = node2;
        }
    }

    public void addAtPosition(int position, int taskID, String taskName, int priority, String dueDate) {
        if (position <= 1 || head == null) {
            addAtBeginning(taskID, taskName, priority, dueDate);
            return;
        }
        TaskNode node = new TaskNode(taskID, taskName, priority, dueDate);
        TaskNode temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        if (temp == tail) {
            tail = node;
        }
    }

    public void removeByID(int id) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail && head.taskID == id) {
            head = null;
            tail = null;
            return;
        }
        if (head.taskID == id) {
            tail.next = head.next;
            head = head.next;
            return;
        }
        TaskNode prev = head;
        TaskNode curr = head.next;
        while (curr != head && curr.taskID != id) {
            prev = curr;
            curr = curr.next;
        }
        if (curr == head) {
            System.out.println("Element not found");
            return;
        }
        prev.next = curr.next;
        if (curr == tail) {
            tail = prev;
        }
    }

    public void viewCurrentAndMoveNext() {
        if (current == null) {
            current = head;
        }
        if (current == null) {
            System.out.println("No task");
            return;
        }
        System.out.println("ID: " + current.taskID + ", Name: " + current.taskName +
                ", Priority: " + current.priority + ", Due: " + current.dueDate);
        current = current.next;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }
        TaskNode temp = head;
        do {
            System.out.println("ID: " + temp.taskID + ", Name: " + temp.taskName +
                    ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks");
            return;
        }
        boolean found = false;
        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("ID: " + temp.taskID + ", Name: " + temp.taskName +
                        ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) {
            System.out.println("No task with that priority");
        }
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Task scheduler = new Task();
        scheduler.addAtBeginning(1, "Backup", 2, "2025-07-22");
        scheduler.addAtEnd(2, "Update", 1, "2025-07-21");
        scheduler.addAtPosition(2, 3, "Deploy", 2, "2025-07-23");
        scheduler.traverse();
        System.out.println("View current and move next:");
        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        System.out.println("Search priority 2:");
        scheduler.searchByPriority(2);

        scheduler.removeByID(3);
        scheduler.traverse();
    }
}

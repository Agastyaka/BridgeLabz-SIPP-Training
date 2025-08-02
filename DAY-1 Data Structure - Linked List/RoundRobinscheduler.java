class Process {
    int processID;
    int burstTime;
    int priority;
    int remainingTime;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

class RoundRobin {
    private Process head = null;

    public void addProcess(int processID, int burstTime, int priority) {
        Process newProcess = new Process(processID, burstTime, priority);

        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newProcess;
            newProcess.next = head;
        }
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        Process temp = head;
        System.out.println("\nProcesses in Circular Queue:");
        do {
            System.out.println("ID: " + temp.processID + ", Burst: " + temp.burstTime + ", Remaining: " + temp.remainingTime + ", Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public void schedule(int timeQuantum) {
        if (head == null) return;

        int time = 0;
        int totalWT = 0, totalTAT = 0, count = 0;

        Process current = head;

        System.out.println("\n--- Round Robin Scheduling Start ---");

        while (true) {
            boolean done = true;
            Process temp = current;

            do {
                if (temp.remainingTime > 0) {
                    done = false;
                    int execTime = Math.min(timeQuantum, temp.remainingTime);
                    System.out.println("Process " + temp.processID + " executed for " + execTime + " units.");
                    time += execTime;
                    temp.remainingTime -= execTime;

                    if (temp.remainingTime == 0) {
                        int tat = time;
                        int wt = tat - temp.burstTime;
                        totalWT += wt;
                        totalTAT += tat;
                        count++;
                        System.out.println("Process " + temp.processID + " completed. Waiting Time: " + wt + ", Turnaround Time: " + tat);
                    }
                }
                temp = temp.next;
            } while (temp != current);

            displayProcesses();

            if (done) break;
        }

        System.out.println("\nAverage Waiting Time: " + (float) totalWT / count);
        System.out.println("Average Turnaround Time: " + (float) totalTAT / count);
    }
}

public class RoundRobinscheduler {
    public static void main(String[] args) {
        RoundRobin scheduler = new RoundRobin();

        scheduler.addProcess(1, 6, 1);
        scheduler.addProcess(2, 4, 2);
        scheduler.addProcess(3, 5, 1);

        scheduler.displayProcesses();

        int timeQuantum = 3;
        scheduler.schedule(timeQuantum);
    }
}

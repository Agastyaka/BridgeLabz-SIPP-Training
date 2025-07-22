class TaskNode{
    int taskid;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;
    TaskNode(int taskid,String taskName,int priority,String duedate){
        this.taskid=taskid;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate=duedate;
        this.next=null;
    }
}
class Task{
    TaskNode head=null;
    TaskNode tail=null;
    TaskNode current =null;

    public void addatbeggning(int taskid,String taskName,int priority,String duedate){
        TaskNode node1=new TaskNode(taskid, taskName, priority, duedate);
        if(head == null){
            head=tail=node1;
            node1.next=head;
        }
        else{
            node1.next=head;
            tail.next=node1;
            head=node1;

        }
    }
    public void addateend(int taskid,String taskName,int priority,String duedate){
        TaskNode node2=new TaskNode(taskid, taskName, priority, duedate);
        if(head==null){
            head=tail=node2;
            node2.next=head;
        }
        else{
            tail.next=node2;
            node2.next=head;
            tail=node2;
        }

    }
    public void addatspecificposition(int taskid,String taskName,int priority,String duedate,int position){
        if(position==1 || head==null){
            addatbeggning(taskid, taskName, priority, duedate);
            return;
        }
        TaskNode node3= new TaskNode(taskid, taskName, priority, duedate);
        TaskNode temp=head;
        for(int i=1;i<position-1;i++){
            task
        }



    }
}
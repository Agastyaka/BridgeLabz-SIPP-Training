abstract class Checkpoint{
    int companyid;
    String locationName;
    double distanceFromLast;
    double expectedDuration;
    double actualDuration;
    Checkpoint(int companyid,String locationName,double distanceFromLast,double expectedDuration,double actualDuration){
        this.companyid=companyid;
        this.locationName=locationName;
        this.distanceFromLast=distanceFromLast;
        this.expectedDuration=expectedDuration;
        this.actualDuration=actualDuration;
    }
    abstract Boolean isCritical();
    abstract String getType(); 
    abstract double calculatePenalty(); 
    public boolean isDelayed(){
        return actualDuration>expectedDuration;
    }
   public void getsummary(){
    System.out.println(getType()+"-"+locationName+"-"+(isDelayed() ? "delayed":"ontime")+" penelty:"+calculatePenalty());
   } 

}
class driver{
    String driverId;
    String name;
}
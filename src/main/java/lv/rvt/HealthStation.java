package lv.rvt;

public class HealthStation {
    int sum=0;
    public int weigh(Person person) {
        sum=sum+1;
        return person.getWeight();
    }

    public void feed(Person person) {
        
        person.setWeight(person.getWeight()+1);
    }
    
    public int weighings(){
        return sum;

    }
}
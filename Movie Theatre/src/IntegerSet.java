import java.util.ArrayList;

public class IntegerSet {

    ArrayList<Integer> integerSet;
    IntegerSet(){
        integerSet = new ArrayList<>();
    }

    //Requires: int
    //Modifies: this
    //Effects: if the integer is in the set remove it, otherwise do nothing
    public void remove(int num){
        for(int x=0; x<this.integerSet.size(); x++){
            if(this.integerSet.get(x).intValue()==num){
                this.integerSet.remove(x);
            }
        }
    }

    //Requires: value
    //Modifies: this
    //Effects: returns the size of the set value given
    public int getsize(){
        return integerSet.size();
    }

    //Requires: int
    //Modifies: this
    //Effects: inserts into set unless it's already there, in which case do nothing
    public void insert(int num){
        Integer temp = num;
        this.integerSet.add(temp);
    }

    //Requires: int
    //Modifies: this
    //Effects: checks if the value is in the set, otherwise do nothing
    public boolean contains(int num){
        boolean flag = false;

        for(int x=0; x<this.integerSet.size(); x++){
            if(this.integerSet.get(x).intValue()==num){
                flag = true;
                break;
            }
        }
        return flag;
    }
}

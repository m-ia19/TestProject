public class ByTwos implements Series {
    int val;

    public ByTwos(){
        this.val=0;
    }

    @Override
    public int getNext() {
        if (val >= MAX){
            System.out.println(ERRORMSG);

        }
        else{
        val +=2;}
        return val;
    }

}

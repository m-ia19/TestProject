public class ByThrees implements Series{

    int val;


    @Override
    public int getNext() {
        return val +=3;
    }
}

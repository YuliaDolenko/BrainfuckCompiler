package brainfuck;

public class Memory {

    private byte[] cells = new byte[30000];
    private int pointer;

    private static Memory memoryModel;

    public Memory() {
    }

    public Memory getMemorySkeleton() {
        if (memoryModel == null) {
            memoryModel = new Memory();
        }
        return memoryModel;
    }

    public byte getCurrentCellValue() {
        return cells[pointer];
    }

    public int getPointer(){
        return pointer;
    }

    public void increment() {
        cells[pointer]++;
    }

    public void decrement() {
        cells[pointer]--;
    }

    public void valueMore() {
        if (pointer == cells.length - 1) {
            pointer = 0;
        } else {
            pointer++;
        }
    }

    public void valueLess() {
        if (pointer == 0) {
            pointer = cells.length - 1;
        } else {
            pointer--;
        }
    }
}

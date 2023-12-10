import java.util.ArrayList;
import java.util.List;

public class MemoryManager {
    private List<byte[]> memoryChunks;

    public MemoryManager() {
        this.memoryChunks = new ArrayList<>();
    }

    public void allocateMemory(int sizeInBytes) {
        byte[] memoryChunk = new byte[sizeInBytes];
        memoryChunks.add(memoryChunk);
        System.out.println("Allocated " + sizeInBytes + " bytes of memory.");
    }

    public void releaseMemory() {
        if (!memoryChunks.isEmpty()) {
            byte[] releasedMemory = memoryChunks.remove(memoryChunks.size() - 1);
            System.out.println("Released " + releasedMemory.length + " bytes of memory.");
        } else {
            System.out.println("No memory to release.");
        }
    }

    public int getUsedMemory() {
        int usedMemory = 0;
        for (byte[] chunk : memoryChunks) {
            usedMemory += chunk.length;
        }
        return usedMemory;
    }
}

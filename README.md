# MemoryManagement
java ram size manager

## Usage:

```Java
public class Main {
    public static void main(String[] args) {
        MemoryManager memoryManager = new MemoryManager();

        memoryManager.allocateMemory(1024);  // Allocate 1 KB
        memoryManager.allocateMemory(2048);  // Allocate 2 KB
        memoryManager.allocateMemory(512);   // Allocate 512 bytes

        System.out.println("Used Memory: " + memoryManager.getUsedMemory() + " bytes");

        memoryManager.releaseMemory();       // Release last allocated memory

        System.out.println("Used Memory after release: " + memoryManager.getUsedMemory() + " bytes");
    }
}
```

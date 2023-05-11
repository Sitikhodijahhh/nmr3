public class b {
    public static void main(String[] args) {
        float[] suhu = new float[]{35, 4f, 32, 43f, 30, 7f, 32, 56f, 29, 23f};
        b _myBubble = new b();
        _myBubble.sort(suhu);
        System.out.println("Hasil pengurutan suhu:");
        for (float s : suhu) {
            System.out.print(s + " ");
        }
    }

    public void sort(float[] suhu) {
    }
}

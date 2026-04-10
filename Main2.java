class Pair<K,V>{

        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "("+ key + ", " + value + ")";
        }
    }

     public class Main2 {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Book", 15);
        Pair<Integer, String> item = new Pair<>(101, "Pen");

        System.out.println(student);
        System.out.println(student.getKey());
        System.out.println(student.getValue());

        System.out.println(item);

        student.setValue(100);
        System.out.println(student);
    }
}
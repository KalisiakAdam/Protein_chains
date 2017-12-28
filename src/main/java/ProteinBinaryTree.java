//
//public class ProteinBinaryTree  {
//
//    private Node root;
//
//    private class Node {
//        private Character key;
//        private Character value;
//        private Node left;
//        private Node right;
//        private int n;
//
//        public Node(Character key, Character value, int n) {
//            this.key = key;
//            this.value = value;
//            this.n = n;
//        }
//
//        @Override
//        public String toString() {
//            return "Node{" +
//                    "key=" + key +
//                    ", value=" + value +
//                    ", left=" + left +
//                    ", right=" + right +
//                    ", n=" + n +
//                    '}';
//        }
//    }
//
//    public int size() {return size(root);}
//
//    private int size(Node x){
//        if(x==null) return 0;
//        else return x.n;
//    }
//
//    public Character get (Character key){
//        return get(root, key);
//    }
//
//    private Character get(Node x, Character key){
//
//        if (x == null) return null;
//        int cmp = key.compareTo(x.key);
//        if (cmp < 0) return get(x.left, key);
//        else if (cmp > 0) return get(x.right, key);
//        else return x.value;
//    }
//
//    public void put(Character key, Character value){
//        root = put(root, key, value);
//    }
//
//    private Node put(Node x, Character key, Character value){
//
//        if (x == null) return new Node(key,value,1);
//        int cmp = key.compareTo(x.key);
//
//        if (cmp < 0) x.left = put(x.left, key, value);
//        else if (cmp > 0) x.right = put(x.right, key, value);
//        else x.value = value;
//        x.n = size(x.right) + size(x.left) + 1;
//
//        return x;
//    }
//
//}

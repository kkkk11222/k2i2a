public class sOMEFile {
    public static void main(String[] args) {
        System.out.println("Hello, World!, this is a dictionary");

    }

    class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
        }
    }

    class Tree{
        //root
        Node root;


        //insert

        public void insert(int value){
            Node node = new Node(value);

            if(root == null){
                root = node;
                return;
            }

            Node current = root;
            while(true){
                if(value < current.data){
                    //left
                    if(current.left == null){
                        current.left = node;
                        return;
                    }
                    current = current.left;
                }else{
                    //right
                    if(current.right == null){
                        current.right = node;
                        return;
                    }
                    current = current.right;
                }
            }
        }

    }
}

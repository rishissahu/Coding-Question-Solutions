<body>
  <h1>Explanation of Java Code</h1>
  <pre>
    class Solution {
        public static int dfs(Node root){
            if(root == null) return 0;
            int left = dfs(root.left);
            int right = dfs(root.right);
            return Math.max(left, right)+1;
        }

        public static int maxDepth(Node root) {
            return dfs(root);
        }
    }
  </pre>
  <h2>Explanation:</h2>
  <ol>
    <li>The <code>Solution</code> class is defined.</li>
    <li>The <code>dfs</code> method is declared as <code>public static int dfs(Node root)</code>. It takes a <code>Node</code> object (representing the root of a binary tree) as input and returns an integer value.</li>
    <li>Inside the <code>dfs</code> method, the first line checks if the <code>root</code> node is null. If it is, it means we have reached a leaf node or an empty tree, so we return 0.</li>
    <li>If the <code>root</code> node is not null, the method continues by recursively calling <code>dfs</code> on the left and right child nodes of the current <code>root</code> node. These recursive calls will traverse the left and right subtrees of the current node and calculate the maximum depth for each subtree.</li>
    <li>The values returned from the recursive calls are stored in the <code>left</code> and <code>right</code> variables, respectively.</li>
    <li>Finally, the method calculates the maximum depth of the current node by taking the maximum value between <code>left</code> and <code>right</code>, and then adds 1 to it (representing the current node). This result is returned as the maximum depth of the subtree rooted at the current node.</li>
    <li>The <code>maxDepth</code> method is declared as <code>public static int maxDepth(Node root)</code>. It takes a <code>Node</code> object (representing the root of a binary tree) as input and returns an integer value.</li>
    <li>Inside the <code>maxDepth</code> method, it simply calls the <code>dfs</code> method with the <code>root</code> node and returns the result, which is the maximum depth of the binary tree.</li>
  </ol>
</body>
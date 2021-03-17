package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ErChaShuTree {
	int val;
	ErChaShuTree left;
	ErChaShuTree right;

	private ErChaShuTree(int val, ErChaShuTree left, ErChaShuTree right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	// 先序遍历： 1、先入根节点 2、弹出栈顶元素，并输出  3、先判断右子树不为空，入栈，再判断左子树不为空入栈，以此循环
	public static void pre(ErChaShuTree node) {
		System.out.println("先序");
		Stack<ErChaShuTree> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		stack.push(node);
		while (node != null && !stack.isEmpty()) {
			node = stack.pop();
			System.out.println(node);
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
	}

	public static void mid(ErChaShuTree node) {

	}

	public static void aft(ErChaShuTree node) {

	}


	public static void main(String[] args) {

	}
}

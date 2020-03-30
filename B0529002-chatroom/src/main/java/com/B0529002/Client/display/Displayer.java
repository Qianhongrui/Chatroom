package com.B0529002.Client.display;

import java.util.LinkedList;
import java.util.Queue;


import javafx.scene.Node;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Displayer {

	public static Node[] createtheTextNode(String input) {

		Queue<Object> queue = new LinkedList<>();
		queue.add(input);
		Node[] nodes = new Node[queue.size()];
		int i = 0;
		while (!queue.isEmpty()) {
			Object ob = queue.poll();
			if (ob instanceof String) {
				String text = (String) ob;
				nodes[i++] = createTextNode(text);
			}
		}
		return nodes;
	}

	private static Node createTextNode(String text) {
		Text textNode = new Text(text);
		textNode.setFont(Font.font("Arial", 15));// 字体样式和大小
		return textNode;
	}


}

package com.foo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Bar {
	public void permut(List<String> input, Stack<String> results){
		if (input.size() == 0){
			System.out.println(results);
			return;
		}
		
		for (String current : new ArrayList<String>(input)){
			results.push(current);
			input.remove(current);
			permut(input, results);
			results.pop();
			input.add(current);
		}
	}
}

package com.foo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class Bar_T {

	@Test
	public void test() {
		Stack<String> input = new Stack<String>();
		String test[] = {"a", "b", "c", "d"};
		input.addAll( Arrays.asList( test ) );
	
		Bar bar = new Bar();
		bar.permut(input, new Stack<String>() );
	}
	
	@Test
	public void test2(){
		Listy listy = new Listy();
		listy.push( new Node("a"));
		listy.push( new Node("b"));
		listy.push( new Node("c"));
		listy.push( new Node("d"));
		listy.push( new Node("e"));
		

		Listy newListy = Listy.copy(listy);
		assertEquals("e->d->c->b->a->null", newListy.dump());	
	}
	
	@Test
	public void testPal(){
		assertTrue( Pali.isPali("!Red rum, sir, is murder"));
		assertFalse( Pali.isPali("Programcreek is awesome"));
	}

}

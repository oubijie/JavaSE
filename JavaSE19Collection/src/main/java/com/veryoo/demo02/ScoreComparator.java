package com.veryoo.demo02;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ScoreComparator implements Comparator<Entry<Student, Integer>>{

	@Override
	public int compare(Entry<Student, Integer> o1, Entry<Student, Integer> o2) {
		return o2.getValue().compareTo(o1.getValue());
	}

}

package example;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class GradingStudent {
	public static List<Integer> gradingStudents(List<Integer> grades){
		List<Integer> result = new ArrayList<Integer>();
		int rem = 0, nrem = 0, index = -1;
		for(int i : grades){
			// find the nrem
			rem = i%5;
			nrem = 5 - rem;
			//rounding off only when i is greater than 38 or its nrem is less than 3
			if(nrem<3 && i>=38)
				i = i+nrem;
			rem =0;
			nrem=0;
			index++;
			result.set(index, i);
		}
		return result;
	}
}

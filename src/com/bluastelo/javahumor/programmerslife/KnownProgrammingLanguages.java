package com.bluastelo.javahumor.programmerslife;

import java.util.Random;
import java.util.Vector;

/**
 * Algorithm of a programmer's life
 * version 0.2
 * @author Romain BOURGIN
 */
public class KnownProgrammingLanguages {
	protected Vector<ProgrammingLanguage> programmingLanguages;

	public KnownProgrammingLanguages() {
		this.programmingLanguages = new Vector<>();
	}
	
	public void add(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguages.add(programmingLanguage);
		System.out.println("Individual has learn a new programming language : " + programmingLanguage.getLanguageName() + " !");
	}
	
	public ProgrammingLanguage getRandomLanguage() {
		int size = this.programmingLanguages.size();
		if (size > 0) {
			Random random = new Random();
			int index = random.nextInt(size);
			return this.programmingLanguages.get(index);
		}
		return null;
	}
}

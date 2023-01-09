package com.tmachinya.vowels;

import com.tmachinya.vowels.ifaces.VowelsAvgCalculator;
import com.tmachinya.vowels.ifaces.WordsFileReader;
import com.tmachinya.vowels.ifaces.WordsFileWritter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class VowelsApplication implements CommandLineRunner {
	static final String inputLocation = "src/main/resources/data/input.txt";
	static final String outputLocation = "src/main/resources/data/output.txt";
	private final WordsFileReader wordsFileReader;
	private final WordsFileWritter wordsFileWritter;
	private final VowelsAvgCalculator vowelsAvgCalculator;

	public VowelsApplication(WordsFileReader wordsFileReader, WordsFileWritter wordsFileWritter, VowelsAvgCalculator vowelsAvgCalculator) {
		this.wordsFileReader = wordsFileReader;
		this.wordsFileWritter = wordsFileWritter;
		this.vowelsAvgCalculator = vowelsAvgCalculator;
	}

	public static void main(String[] args) {
		SpringApplication.run(VowelsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		File source = new File(inputLocation);
		String[] words = wordsFileReader.readFile(source);

		List<String> output = vowelsAvgCalculator.calculateAverage(words);
		File destination = new File(outputLocation);
		wordsFileWritter.writeFile(output, destination);
	}
}

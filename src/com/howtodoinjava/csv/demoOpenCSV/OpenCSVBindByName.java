package com.howtodoinjava.csv.demoOpenCSV;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVBindByName {
	private static final String csvPath = "/home/djd/Documents/Turismo Molise/strutture_ricettive.csv";
	private static final String newCsvPath = "/home/djd/Documents/Turismo Molise/strutture_ricettive_nuovo.csv";

	public static void main(String[] args) throws IOException {
		FusionBuildString fusionBuildString = new FusionBuildString();

		try (
				Reader reader = Files.newBufferedReader(Paths.get(csvPath));
				Writer writer = Files.newBufferedWriter(Paths.get(newCsvPath));

				CSVWriter csvWriter = new CSVWriter(writer,
						CSVWriter.NO_QUOTE_CHARACTER,
						CSVWriter.DEFAULT_ESCAPE_CHARACTER,
						CSVWriter.DEFAULT_LINE_END);
		) {
			CsvToBean<StruttureRicettive> csvToBean = new CsvToBeanBuilder(reader)
					.withType(StruttureRicettive.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
			for (StruttureRicettive strRic : csvToBean) {
				String str = fusionBuildString.getContent();

				for (Fields c : Fields.values()) {
					str = str.replaceAll(c.name(), strRic.getField(c));

					if (c.name() == strRic.getField(c)) {
						try (BufferedReader bufferedReader = new BufferedReader(new StringReader(str))) {
							String line;
							String previousLine = "";

							while ((line = bufferedReader.readLine()) != null) {
								if (line.contains(c.name())) {
									str = str.replace(line, "");
									str = str.replaceAll(previousLine, "");

									System.out.println("previous: " + previousLine);
									System.out.println("line: " + line);
								} else {
									if(line != ""){
										previousLine = line;
									}
									System.out.println("else prev " + previousLine);
								}
							}
						} catch (IOException exc) {
							// quit
						}
					}
				}

				csvWriter.writeNext(new String[]{str});
			}
		}
	}
}

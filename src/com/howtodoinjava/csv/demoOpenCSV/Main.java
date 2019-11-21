package com.howtodoinjava.csv.demoOpenCSV;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	private static final String csvPath = "/home/djd/Documents/Turismo Molise/strutture_ricettive.csv";
	private static final String newCsvPath = "/home/djd/Documents/Turismo Molise/strutture_ricettive_nuovo.csv";

	public static void main(String[] args) throws IOException {
		FusionBuildString fusionBuildString = new FusionBuildString();

		try (
				Reader reader = Files.newBufferedReader(Paths.get(csvPath));
				Writer writer = Files.newBufferedWriter(Paths.get(newCsvPath));

				CSVWriter csvWriter = new CSVWriter(
						writer,
						CSVWriter.NO_QUOTE_CHARACTER,
						CSVWriter.DEFAULT_ESCAPE_CHARACTER,
						CSVWriter.DEFAULT_LINE_END
				)) {

			CsvToBean<StruttureRicettive> csvToBean = new CsvToBeanBuilder(reader)
					.withType(StruttureRicettive.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();

			for (StruttureRicettive struttureRicettive : csvToBean) {
				String stringToReplace = fusionBuildString.getContent();

				for (Fields fields : Fields.values()) {
					if(!struttureRicettive.getField(fields).equals("-")) {
						stringToReplace = stringToReplace.replaceAll(fields.name(), struttureRicettive.getField(fields));
					}

					if(struttureRicettive.getField(fields).equals(fields.name()) || struttureRicettive.getField(fields).equals("-")) {
						stringToReplace = stringToReplace.replaceAll(fields.name(), "");
					}
				}
				csvWriter.writeNext(new String[] {stringToReplace});
			}
		}
	}
}

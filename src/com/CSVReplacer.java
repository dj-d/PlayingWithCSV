package com;

import com.attractors.All;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSVReplacer {
	private static String nameOfCsv = "agenzieViaggiETurismo";

	private static final String csvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + ".csv";
	private static final String newCsvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + "_nuovo.csv";

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

			CsvToBean<All> csvToBean = new CsvToBeanBuilder(reader)
					.withType(All.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();

			for (All all : csvToBean) {
				String stringToReplace = fusionBuildString.getContent();

				stringToReplace = stringToReplace.replaceAll("\n", "");

				String regex = "]\\[";
				stringToReplace = stringToReplace.replaceAll(regex, "]\n\n[");

				for (Fields fields : Fields.values()) {
					if (!all.getField(fields).equals("-")) {
						if(fields.name().contains("CAMPO_TELEFONO") || fields.name().contains("CAMPO_INDIRIZZO")) {
							stringToReplace = stringToReplace.replaceAll(fields.name(), all.getField(fields) + "\n");
						} else {
							stringToReplace = stringToReplace.replaceAll(fields.name(), all.getField(fields));
						}
					}

					if (all.getField(fields).equals(fields.name()) || all.getField(fields).equals("-") || all.getField(fields).equals("")) {
						BufferedReader bufferedReader = new BufferedReader(new StringReader(stringToReplace));
						String line;

						while ((line = bufferedReader.readLine()) != null) {
							if (line.contains(fields.name())) {
								stringToReplace = stringToReplace.replace(line, "");
							}
						}
					}
				}
				csvWriter.writeNext(new String[]{stringToReplace});
			}
		}
	}
}

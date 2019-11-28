package com;

import com.attractors.AgenzieViaggiETurismo;
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

			CsvToBean<AgenzieViaggiETurismo> csvToBean = new CsvToBeanBuilder(reader)
					.withType(AgenzieViaggiETurismo.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();

			for (AgenzieViaggiETurismo agenzieViaggiETurismo : csvToBean) {
				String stringToReplace = fusionBuildString.getContent();

				stringToReplace = stringToReplace.replaceAll("\n", "");

				String regex = "]\\[";
				stringToReplace = stringToReplace.replaceAll(regex, "]\n\n[");

				for (Fields fields : Fields.values()) {
					if (!agenzieViaggiETurismo.getField(fields).equals("-")) {
						if(fields.name().contains("CAMPO_TELEFONO") || fields.name().contains("CAMPO_INDIRIZZO")) {
							stringToReplace = stringToReplace.replaceAll(fields.name(), agenzieViaggiETurismo.getField(fields) + "\n");
						} else {
							stringToReplace = stringToReplace.replaceAll(fields.name(), agenzieViaggiETurismo.getField(fields));
						}
					}

					if (agenzieViaggiETurismo.getField(fields).equals(fields.name()) || agenzieViaggiETurismo.getField(fields).equals("-")) {
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

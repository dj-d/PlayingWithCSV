package com;

import com.attractors.All;
import com.attractors.StruttureRicettive;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.risorse_eventi.Eventi;
import com.risorse_eventi.Risorse;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSVReplacer {
	private static String nameOfCsv = "joined";

	private static final String csvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + ".csv";
	private static final String newCsvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + "_nuovo.csv";

	private static final String placeholderLogo = "https://www.molise-italia.it/wp-content/uploads/2019/10/logo-placeholder.png";
	private static final String placeholderGallery = "https://www.molise-italia.it/wp-content/uploads/2019/10/imagePlaceholderImage.jpg";

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

			for (All atr : csvToBean) {
				String stringToReplace = fusionBuildString.getContent();

				stringToReplace = stringToReplace.replaceAll("\n", "");

				String regex = "]\\[";
				stringToReplace = stringToReplace.replaceAll(regex, "]\n\n[");

				for (Fields fields : Fields.values()) {
					if (!atr.getField(fields).equals("-")) {
						if (fields.name().contains("CAMPO_TELEFONO") || fields.name().contains("CAMPO_INDIRIZZO")) {
							stringToReplace = stringToReplace.replaceAll(fields.name(), atr.getField(fields) + "\n");
						} else if (fields.name().contains("CAMPO_TIPOLOGIA")) {
							stringToReplace = stringToReplace.replace("CAMPO_TIPOLOGIA", atr.getField(fields));

							if (!atr.getField(Fields.CAMPO_ALTRA_TIPOLOGIA).equals("-")) {
								stringToReplace = stringToReplace.replace("CAMPO_ALTRA_TIPOLOGIA", atr.getField(Fields.CAMPO_ALTRA_TIPOLOGIA));
							} else {
								stringToReplace = stringToReplace.replace("|", "");
								stringToReplace = stringToReplace.replace("CAMPO_ALTRA_TIPOLOGIA", "");
							}
						} else {
							stringToReplace = stringToReplace.replaceAll(fields.name(), atr.getField(fields));
						}
					} else {
						if (fields.name().contains(Fields.CAMPO_IMAGE_LOGO.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_IMAGE_LOGO.name(), placeholderLogo);
						} else if (fields.name().contains(Fields.CAMPO_IMAGE_COPERTINA.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_IMAGE_COPERTINA.name(), placeholderGallery);
						} else if (fields.name().contains(Fields.CAMPO_IMAGE_GALLERIA_1.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_IMAGE_GALLERIA_1.name(), placeholderGallery);
						} else if (fields.name().contains(Fields.CAMPO_IMAGE_GALLERIA_2.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_IMAGE_GALLERIA_2.name(), placeholderGallery);
						} else if (fields.name().contains(Fields.CAMPO_IMAGE_GALLERIA_3.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_IMAGE_GALLERIA_3.name(), placeholderGallery);
						} else if (fields.name().contains(Fields.CAMPO_IMAGE_GALLERIA_4.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_IMAGE_GALLERIA_4.name(), placeholderGallery);
						} else if (fields.name().contains(Fields.CAMPO_IMAGE_GALLERIA_5.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_IMAGE_GALLERIA_5.name(), placeholderGallery);
						}
					}

					if (atr.getField(fields).equals(fields.name()) || atr.getField(fields).equals("-")) {
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

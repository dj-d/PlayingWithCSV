package com.eventi;

import com.CSVReplacer;
import com.FieldsAziendeRisorse;
import com.attractors.All;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Replacer {
	private static final String EVENTI = "eventi";

	private static String nameOfCsv = EVENTI;
	private static final String csvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + ".csv";
	private static final String newCsvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + "_nuovo.csv";

	private static final String placeholderLogo = "https://www.molise-italia.it/wp-content/uploads/2019/10/logo-placeholder.png";
	private static final String placeholderGallery = "https://www.molise-italia.it/wp-content/uploads/2019/10/imagePlaceholderImage.jpg";

	public static void main(String[] args) throws IOException {
		FusionBuildStringEventi megaString = new FusionBuildStringEventi();

		try (
				Reader reader = Files.newBufferedReader(Paths.get(csvPath));
				Writer writer = Files.newBufferedWriter(Paths.get(newCsvPath));

				CSVWriter csvWriter = new CSVWriter(
						writer,
						CSVWriter.NO_QUOTE_CHARACTER,
						CSVWriter.DEFAULT_ESCAPE_CHARACTER,
						CSVWriter.DEFAULT_LINE_END
				)) {

			CsvToBean<Eventi> csvToBean = new CsvToBeanBuilder(reader)
					.withType(Eventi.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();

			for (Eventi ev : csvToBean) {
				String stringToReplace = megaString.getContent();

				stringToReplace = stringToReplace.replaceAll("\n", "");
				String regex = "]\\[";
				stringToReplace = stringToReplace.replaceAll(regex, "]\n\n[");

				for (FieldsEventi fields : FieldsEventi.values()) {
					if (!ev.getField(fields).equals("-")) {
						if (fields.name().contains(FieldsEventi.CAMPO_CATEGORIA.name())) {
							StringBuilder categoryIcon = new StringBuilder();

							System.out.println(categoryList(ev.getField(fields)));

							for (String category : categoryList(ev.getField(fields))) {
								System.out.println(category);
								if (category.equals(CSVReplacer.ARCHEOLOGIA)) {
									categoryIcon.append(CSVReplacer.iconArcheologiaArteEStoria);

								} else if (category.equals(CSVReplacer.VACANZE_NELLA_NATURA)) {
									categoryIcon.append(CSVReplacer.iconVacanzeNellaNatura);

								} else if (category.equals(CSVReplacer.PAESI_E_CULTURE)) {
									categoryIcon.append(CSVReplacer.iconPaeseECulture);

								} else if (category.equals(CSVReplacer.LE_TRADIZIONI)) {
									categoryIcon.append(CSVReplacer.iconLeTradizioni);

								} else if (category.equals(CSVReplacer.I_SAPORI)) {
									categoryIcon.append(CSVReplacer.iconISapori);

								} else if (category.contains(CSVReplacer.IL_MARE)) {
									categoryIcon.append(CSVReplacer.iconIlMare);

								} else if (category.equals(CSVReplacer.LA_MONTAGNA)) {
									categoryIcon.append(CSVReplacer.iconLaMontagna);

								} else if (category.equals(CSVReplacer.BENESSERE)) {
									categoryIcon.append(CSVReplacer.iconBenessere);
								}
							}

							stringToReplace = stringToReplace.replace(CSVReplacer.CAMPO_ICON_CATEGORY, categoryIcon);
						} else {
							stringToReplace = stringToReplace.replaceAll(fields.name(), ev.getField(fields));
						}
					} else {
						if (fields.name().contains(FieldsAziendeRisorse.CAMPO_IMAGE_LOGO.name())) {
							stringToReplace = stringToReplace.replace(FieldsAziendeRisorse.CAMPO_IMAGE_LOGO.name(), placeholderLogo);

						} else if (fields.name().contains(FieldsAziendeRisorse.CAMPO_IMAGE_COPERTINA.name())) {
							stringToReplace = stringToReplace.replace(FieldsAziendeRisorse.CAMPO_IMAGE_COPERTINA.name(), placeholderGallery);

						} else if (fields.name().contains(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_1.name())) {
							stringToReplace = stringToReplace.replace(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_1.name(), placeholderGallery);

						} else if (fields.name().contains(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_2.name())) {
							stringToReplace = stringToReplace.replace(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_2.name(), placeholderGallery);

						} else if (fields.name().contains(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_3.name())) {
							stringToReplace = stringToReplace.replace(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_3.name(), placeholderGallery);

						} else if (fields.name().contains(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_4.name())) {
							stringToReplace = stringToReplace.replace(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_4.name(), placeholderGallery);

						} else if (fields.name().contains(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_5.name())) {
							stringToReplace = stringToReplace.replace(FieldsAziendeRisorse.CAMPO_IMAGE_GALLERIA_5.name(), placeholderGallery);
						}
					}

					if (ev.getField(fields).equals(fields.name()) || ev.getField(fields).equals("-")) {
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

	private static List<String> categoryList(String s) {
		ArrayList<String> rawList = new ArrayList<>();

		for (String a : s.split("\\|")) {
			rawList.add(a.trim());
		}

		return rawList.stream().distinct().collect(Collectors.toList());
	}
}

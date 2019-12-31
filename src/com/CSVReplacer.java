package com;

import com.attractors.All;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.risorse_eventi.Eventi;
import com.risorse_eventi.ProLocoEdAssociazioni;
import com.risorse_eventi.Risorse;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CSVReplacer {
	private static final String RISORSE = "risorse";
	private static final String EVENTI = "eventi";
	private static final String PROLOCO = "proloco";

	private static String nameOfCsv = RISORSE;

	private static final String csvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + ".csv";
	private static final String newCsvPath = "/home/djd/Documents/Turismo Molise/" + nameOfCsv + "_nuovo.csv";

	private static final String placeholderLogo = "https://www.molise-italia.it/wp-content/uploads/2019/10/logo-placeholder.png";
	private static final String placeholderGallery = "https://www.molise-italia.it/wp-content/uploads/2019/10/imagePlaceholderImage.jpg";

	private static final String CAMPO_ICON_CATEGORY = "CAMPO_ICON_CATEGORY";

	private static final String ARCHEOLOGIA = "Archeologia";
	private static final String ARTE_E_STORIA = "Arte e Storia";
	private static final String VACANZE_NELLA_NATURA = "Vacanze nella natura";
	private static final String PAESI_E_CULTURE = "Paesi e culture";
	private static final String LE_TRADIZIONI = "Le tradizioni";
	private static final String I_SAPORI = "I sapori";
	private static final String IL_MARE = "Il mare";
	private static final String LA_MONTAGNA = "La montagna";
	private static final String BENESSERE = "Benessere";

	private static final String iconArcheologiaArteEStoria = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/10/Archeologia_arte_e_storia-e1574194179395.png\" image_id=\"6084|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";
	private static final String iconVacanzeNellaNatura = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/07/Vacanze_nella_natura-e1574193238920.png\" image_id=\"3255|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";
	private static final String iconPaeseECulture = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/10/Paese_e_culture-e1574194147226.png\" image_id=\"6083|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";
	private static final String iconLeTradizioni = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/10/Le_tradizioni-150x150.png\" image_id=\"6085|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";
	private static final String iconISapori = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/10/I_sapori-e1574193995857.png\" image_id=\"6078|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";
	private static final String iconIlMare = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/10/Il_mare-e1574194063851.png\" image_id=\"6079|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";
	private static final String iconLaMontagna = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/10/La_montagna-e1574194096676.png\" image_id=\"6080|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";
	private static final String iconBenessere = "[fusion_image image=\"https://www.molise-italia.it/wp-content/uploads/2019/10/Benessere_30x30.png\" image_id=\"7549|thumbnail\" link=\"\" linktarget=\"_self\" alt=\"\" /]";

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

			CsvToBean<Risorse> csvToBean = new CsvToBeanBuilder(reader)
					.withType(Risorse.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();

			for (Risorse atr : csvToBean) {
				String stringToReplace = fusionBuildString.getContent();

				stringToReplace = stringToReplace.replaceAll("\n", "");

				String regex = "]\\[";
				stringToReplace = stringToReplace.replaceAll(regex, "]\n\n[");

				for (Fields fields : Fields.values()) {
					if (!atr.getField(fields).equals("-")) {
						if (fields.name().contains(Fields.CAMPO_TELEFONO.name()) || fields.name().contains(Fields.CAMPO_INDIRIZZO.name())) {
							stringToReplace = stringToReplace.replaceAll(fields.name(), atr.getField(fields) + "\n");
						} else if (fields.name().contains(Fields.CAMPO_TIPOLOGIA.name())) {
							stringToReplace = stringToReplace.replace(Fields.CAMPO_TIPOLOGIA.name(), atr.getField(fields));

//							if (!atr.getField(Fields.CAMPO_ALTRA_TIPOLOGIA).equals("-")) {
//								stringToReplace = stringToReplace.replace("CAMPO_ALTRA_TIPOLOGIA", atr.getField(Fields.CAMPO_ALTRA_TIPOLOGIA));
//							} else {
//								stringToReplace = stringToReplace.replace("|", "");
//								stringToReplace = stringToReplace.replace("CAMPO_ALTRA_TIPOLOGIA", "");
//							}
						} else if (fields.name().contains(Fields.CAMPO_CATEGORIA.name())) {
							StringBuilder categoryIcon = new StringBuilder();
							List<String> listCategory;

							if (nameOfCsv.equals(EVENTI)) {
								listCategory = categoryListForEventi(atr.getField(fields));
							} else {
								listCategory = categoryList(atr.getField(fields));
							}

							for (String category : listCategory) {
								if (category.equals(ARCHEOLOGIA)) {
									categoryIcon.append(iconArcheologiaArteEStoria);

								} else if (category.equals(VACANZE_NELLA_NATURA)) {
									categoryIcon.append(iconVacanzeNellaNatura);

								} else if (category.equals(PAESI_E_CULTURE)) {
									categoryIcon.append(iconPaeseECulture);

								} else if (category.equals(LE_TRADIZIONI)) {
									categoryIcon.append(iconLeTradizioni);

								} else if (category.equals(I_SAPORI)) {
									categoryIcon.append(iconISapori);

								} else if (category.contains(IL_MARE)) {
									categoryIcon.append(iconIlMare);

								} else if (category.equals(LA_MONTAGNA)) {
									categoryIcon.append(iconLaMontagna);

								} else if (category.equals(BENESSERE)) {
									categoryIcon.append(iconBenessere);
								}
							}

							stringToReplace = stringToReplace.replace(CAMPO_ICON_CATEGORY, categoryIcon);

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

	private static List<String> categoryList(String s) {
		ArrayList<String> rawList = new ArrayList<>();

		for (String a : s.split(",")) { // Problema con: Archeologia, arte e storia (?)
			String[] moreSplit = a.split("->");

			for (int i = 1; i < moreSplit.length; i += 2) {
				rawList.add(moreSplit[i]);
			}
		}

		return rawList.stream().distinct().collect(Collectors.toList());
	}

	private static List<String> categoryListForEventi(String s) {
		ArrayList<String> rawList = new ArrayList<>();

		for (String a : s.split("\\|")) {
			rawList.add(a);
		}

		return rawList.stream().distinct().collect(Collectors.toList());
	}
}

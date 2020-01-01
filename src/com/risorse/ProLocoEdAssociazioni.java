package com.risorse;

import com.FieldsAziendeRisorse;
import com.opencsv.bean.CsvBindByName;

public class ProLocoEdAssociazioni {
//	private static final String ID = "Id ";
	private static final String NOME_COMMERCIALE = "NOME COMMERCIALE";
	private static final String COMUNE = "COMUNE";
	private static final String PROVINCIA = "PROVINCIA";
	private static final String LATITUDINE = "LATITUDINE";
	private static final String LONGITUDINE = "LONGITUDINE";
	private static final String GOOGLE_MAPS = "GOOGLE MAPS";
	private static final String SITO_WEB = "SITO WEB";
	private static final String E_MAIL = "INDIRIZZO E-MAIL";
	private static final String EMAIL_1 = "INDIRIZZO E-MAIL SECONDARIO";
	private static final String TELEFONO = "TELEFONO";
	private static final String TELEFONO_1 = "TELEFONO SECONDARIO";
	private static final String INDIRIZZO = "INDIRIZZO";
	private static final String FACEBOOK = "FACEBOOK";
	private static final String INSTAGRAM = "INSTAGRAM";
	private static final String YOUTUBE = "YOUTUBE";
	private static final String LINK_IMAGE_LOGO = "LINK IMMAGINE LOGO";
	private static final String LINK_IMAGE_COPERTINA = "LINK IMMAGINE COPERTINA";
	private static final String LINK_IMAGE_GALLERIA_1 = "IMMAGINE GALLERIA 1";
	private static final String LINK_IMAGE_GALLERIA_2 = "IMMAGINE GALLERIA 2";
	private static final String LINK_IMAGE_GALLERIA_3 = "IMMAGINE GALLERIA 3";
	private static final String LINK_IMAGE_GALLERIA_4 = "IMMAGINE GALLERIA 4";

//	@CsvBindByName(column = ID, required = true)
//	private String id;

	@CsvBindByName(column = NOME_COMMERCIALE, required = true)
	private String nome;

	@CsvBindByName(column = COMUNE, required = true)
	private String comune;

	@CsvBindByName(column = PROVINCIA, required = true)
	private String provincia;

	@CsvBindByName(column = LATITUDINE, required = true)
	private String latitudine;

	@CsvBindByName(column = LONGITUDINE, required = true)
	private String longitudine;

	@CsvBindByName(column = GOOGLE_MAPS, required = true)
	private String googleMaps;

	@CsvBindByName(column = SITO_WEB, required = true)
	private String sitoWeb;

	@CsvBindByName(column = E_MAIL, required = true)
	private String email;

	@CsvBindByName(column = EMAIL_1, required = true)
	private String emailOne;

	@CsvBindByName(column = TELEFONO, required = true)
	private String telefono;

	@CsvBindByName(column = TELEFONO_1, required = true)
	private String telefonoOne;

	@CsvBindByName(column = INDIRIZZO, required = true)
	private String indirizzo;

	@CsvBindByName(column = FACEBOOK, required = true)
	private String facebook;

	@CsvBindByName(column = INSTAGRAM, required = true)
	private String instagram;

	@CsvBindByName(column = YOUTUBE, required = true)
	private String youtube;

	@CsvBindByName(column = LINK_IMAGE_LOGO, required = true)
	private String linkImgLogo;

	@CsvBindByName(column = LINK_IMAGE_COPERTINA, required = true)
	private String linkImgCopertina;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_1, required = true)
	private String linkImgGalleria1;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_2, required = true)
	private String linkImgGalleria2;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_3, required = true)
	private String linkImgGalleria3;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_4, required = true)
	private String linkImgGalleriaFour;

	public String getField(FieldsAziendeRisorse str) {
		switch (str) {
//			case CAMPO_ID:
//				return id;

			case CAMPO_NOME_COMMERCIALE:
				return nome;

			case CAMPO_COMUNE:
				return comune(comune);

			case CAMPO_PROVINCIA:
				return provincia;

			case CAMPO_LATITUDINE:
				return latitudine;

			case CAMPO_LONGITUDINE:
				return longitudine;

			case CAMPO_GOOGLE_MAPS:
				return googleMaps;

			case CAMPO_SITO_WEB:
				return sitoWeb;

			case CAMPO_EMAIL:
				if(!email.equals("-") || !emailOne.equals("-"))
					return isEmpty(email);
				return email;

			case CAMPO_EMAIL1:
				if(!email.equals("-") || !emailOne.equals("-"))
					return isEmpty(emailOne);

				return emailOne;

			case CAMPO_TELEFONO:
				if(!telefono.equals("-") || !telefonoOne.equals("-"))
					return isEmpty(telefono);

				return telefono;

			case CAMPO_TELEFONO1:
				if(!telefono.equals("-") || !telefonoOne.equals("-"))
					return isEmpty(telefonoOne);
				return telefonoOne;

			case CAMPO_INDIRIZZO:
				return indirizzo;

			case CAMPO_FACEBOOK:
				return facebook;

			case CAMPO_INSTAGRAM:
				return instagram;

			case CAMPO_YOUTUBE:
				return youtube;

			case CAMPO_IMAGE_LOGO:
				return linkImgLogo;

			case CAMPO_IMAGE_COPERTINA:
				return linkImgCopertina;

			case CAMPO_IMAGE_GALLERIA_1:
				return linkImgGalleria1;

			case CAMPO_IMAGE_GALLERIA_2:
				return linkImgGalleria2;

			case CAMPO_IMAGE_GALLERIA_3:
				return linkImgGalleria3;

			case CAMPO_IMAGE_GALLERIA_4:
				return linkImgGalleriaFour;

			default:
				return str.name();
		}
	}

	private static String comune(String s) {
		String[] split = s.split("\\(");

		return split[0];
	}

	private String isEmpty(String s) {
		if(s.equals("-")) {
			return "";
		}

		return s;
	}
}

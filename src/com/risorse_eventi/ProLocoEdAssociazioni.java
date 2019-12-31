package com.risorse_eventi;

import com.Fields;
import com.opencsv.bean.CsvBindByName;

public class ProLocoEdAssociazioni {
	private static final String ID = "Id ";
	private static final String NOME = "Nome";
	private static final String COMUNE = "Comune";
//	private static final String PROVINCIA = "Provincia";
	private static final String LATITUDINE = "Latitudine";
	private static final String LONGITUDINE = "Longitudine";
	private static final String GOOGLE_MAPS = "Google maps";
	private static final String SITO_WEB = "Sito web";
	private static final String E_MAIL = "Indirizzo e-mail";
	private static final String EMAIL_1 = "Indirizzo e-mail secondario";
	private static final String TELEFONO = "Telefono";
	private static final String TELEFONO_1 = "Telefono secondario";
	private static final String INDIRIZZO = "Indirizzo";
	private static final String FACEBOOK = "Facebook";
	private static final String INSTAGRAM = "Instagram";
	private static final String YOUTUBE = "Youtube";
	private static final String LINK_IMAGE_LOGO = "Link immagine logo";
	private static final String LINK_IMAGE_COPERTINA = "Link immagine copertina";
	private static final String LINK_IMAGE_GALLERIA_1 = "Immagine Galleria 1";
	private static final String LINK_IMAGE_GALLERIA_2 = "Immagine Galleria 2";
	private static final String LINK_IMAGE_GALLERIA_3 = "Immagine Galleria 3";
	private static final String LINK_IMAGE_GALLERIA_4 = "Immagine Galleria 4";

	@CsvBindByName(column = ID, required = true)
	private String id;

	@CsvBindByName(column = NOME, required = true)
	private String nome;

	@CsvBindByName(column = COMUNE, required = true)
	private String comune;

//	@CsvBindByName(column = PROVINCIA, required = true)
//	private String provincia;

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
	private String linkImgGalleria4;

	public String getField(Fields str) {
		switch (str) {
//			case CAMPO_ID:
//				return id;

			case CAMPO_NOME_COMMERCIALE:
				return nome;

			case CAMPO_COMUNE:
				return comune;

//			case CAMPO_PROVINCIA:
//				return provincia;

			case CAMPO_LATITUDINE:
				return latitudine;

			case CAMPO_LONGITUDINE:
				return longitudine;

			case CAMPO_GOOGLE_MAPS:
				return googleMaps;

			case CAMPO_SITO_WEB:
				return sitoWeb;

			case CAMPO_EMAIL:
				return email;

			case CAMPO_EMAIL1:
				return emailOne;

			case CAMPO_TELEFONO:
				return telefono;

			case CAMPO_TELEFONO1:
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
				return linkImgGalleria4;

			default:
				return str.name();
		}
	}
}

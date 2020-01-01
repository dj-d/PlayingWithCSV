package com.risorse;

import com.FieldsAziendeRisorse;
import com.opencsv.bean.CsvBindByName;

public class ServiziPerIlTurismo {
//	private static final String ID = "Id";
	private static final String NOME = "NOME COMMERCIALE";
	private static final String SOCIETA_ASSOCIAZIONE = "SOCIETÀ/ASSOCIAZIONE";
	private static final String COMUNE_PROVINCIA = "COMUNE (PROVINCIA)";
	private static final String PROVINCIA = "PROVINCIA";
	private static final String TIPOLOGIA = "TIPOLOGIA";
	private static final String BREVE_DESCRIZIONE = "BREVE DESCIZIONE";
	private static final String LATITUDINE = "LATITUDINE";
	private static final String LONGITUDINE = "LONGITUDINE";
	private static final String SITO_WEB = "SITO WEB";
	private static final String TELEFONO = "TELEFONO";
	private static final String TELEFONO_1 = "TELEFONO1";
	private static final String E_MAIL = "E-MAIL";
	private static final String E_MAIL_1 = "E-MAIL1";
	private static final String INDIRIZZO = "INDIRIZZO";
	private static final String ORARI_APERTURA = "ORARI APERTURA";
	private static final String PERIODO_APERTURA = "PERIODO APERTURA";
	private static final String GOOGLE_MAPS = "GOOGLE MAPS";
	private static final String FACEBOOK = "FACEBOOK";
	private static final String INSTAGRAM = "INSTAGRAM";
	private static final String TWITTER = "TWITTER";
	private static final String YOUTUBE = "YOUTUBE";
	private static final String LINKEDIN = "LINKEDIN";
	private static final String PINTEREST = "PINTEREST";
	private static final String FLICKR = "FLICKR";
	private static final String GOOGLE_PLUS = "GOOGLE PLUS";
	private static final String VALITAZIONE_GOOGLE = "VALUTAZIONE GOOGLE (IN STELLINE)";
	private static final String INFO_AGGIUNTIVE = "INFO AGGIUNTIVE";
	private static final String ALTRO = "ALTRO";
	private static final String LINK_IMAGE_LOGO = "LINK IMMAGINE LOGO";
	private static final String LINK_IMAGE_COPERTINA = "LINK IMMAGINE COPERTINA";
	private static final String LINK_IMAGE_GALLERIA_1 = "IMMAGINE GALLERIA 1";
	private static final String LINK_IMAGE_GALLERIA_2 = "IMMAGINE GALLERIA 2";
	private static final String LINK_IMAGE_GALLERIA_3 = "IMMAGINE GALLERIA 3";
	private static final String LINK_IMAGE_GALLERIA_4 = "IMMAGINE GALLERIA 4";
	private static final String INFORMAZIONI_CRONOLOGICHE = "INFORMAZIONI CRONOLOGICHE";
	private static final String DISTANZA_TEMPO_DA_LUOGO_CENTRALE = "DISTANZA TEMPO DA LUOGO CENTRALE";
	private static final String LUOGO_CENTRALE = "LUOGO CENTRALE";

	@CsvBindByName(column = NOME, required = true)
	private String nome;

	@CsvBindByName(column = SOCIETA_ASSOCIAZIONE, required = true)
	private String societaAssociazione;

	@CsvBindByName(column = COMUNE_PROVINCIA, required = true)
	private String comuneProvincia;

	@CsvBindByName(column = PROVINCIA, required = true)
	private String provincia;

	@CsvBindByName(column = TIPOLOGIA, required = true)
	private String tipologia;

	@CsvBindByName(column = BREVE_DESCRIZIONE, required = true)
	private String breveDescrizione;

	@CsvBindByName(column = LATITUDINE, required = true)
	private String latitudine;

	@CsvBindByName(column = LONGITUDINE, required = true)
	private String longitudine;

	@CsvBindByName(column = SITO_WEB, required = true)
	private String sitoWeb;

	@CsvBindByName(column = TELEFONO, required = true)
	private String telefono;

	@CsvBindByName(column = TELEFONO_1, required = true)
	private String telefonoOne;

	@CsvBindByName(column = E_MAIL, required = true)
	private String email;

	@CsvBindByName(column = E_MAIL_1, required = true)
	private String emailOne;

	@CsvBindByName(column = INDIRIZZO, required = true)
	private String indirizzo;

	@CsvBindByName(column = ORARI_APERTURA, required = true)
	private String orariApertura;

	@CsvBindByName(column = PERIODO_APERTURA, required = true)
	private String periodoApertura;

	@CsvBindByName(column = GOOGLE_MAPS, required = true)
	private String googleMaps;

	@CsvBindByName(column = FACEBOOK, required = true)
	private String facebook;

	@CsvBindByName(column = INSTAGRAM, required = true)
	private String instagram;

	@CsvBindByName(column = TWITTER, required = true)
	private String twitter;

	@CsvBindByName(column = YOUTUBE, required = true)
	private String youtube;

	@CsvBindByName(column = LINKEDIN, required = true)
	private String linkedin;

	@CsvBindByName(column = PINTEREST, required = true)
	private String pinterest;

	@CsvBindByName(column = FLICKR, required = true)
	private String flickr;

	@CsvBindByName(column = GOOGLE_PLUS, required = true)
	private String googlePlus;

	@CsvBindByName(column = VALITAZIONE_GOOGLE, required = true)
	private String valutazioneGoogle;

	@CsvBindByName(column = INFO_AGGIUNTIVE, required = true)
	private String infoAggiuntive;

	@CsvBindByName(column = ALTRO, required = true)
	private String altro;

	@CsvBindByName(column = LINK_IMAGE_LOGO, required = true)
	private String linkImageLogo;

	@CsvBindByName(column = LINK_IMAGE_COPERTINA, required = true)
	private String linkImageCopertina;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_1, required = true)
	private String linkImgGalleriaOne;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_2, required = true)
	private String linkImgGalleriaTwo;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_3, required = true)
	private String linkImgGalleriaTree;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_4, required = true)
	private String linkImgGalleriaFour;

	@CsvBindByName(column = INFORMAZIONI_CRONOLOGICHE, required = true)
	private String informazioniCronologiche;

	@CsvBindByName(column = DISTANZA_TEMPO_DA_LUOGO_CENTRALE, required = true)
	private String distanzaTempoDaLuogoCentrale;

	@CsvBindByName(column = LUOGO_CENTRALE, required = true)
	private String luogoCentrale;

	public String getField(FieldsAziendeRisorse str) {
		switch (str) {
			case CAMPO_NOME_COMMERCIALE:
				return nome;

			case CAMPO_SOCIETA_ASSOCIAZIONE:
				return societaAssociazione;

			case CAMPO_COMUNE:
				return comune(comuneProvincia);

			case CAMPO_PROVINCIA:
				return provincia;

			case CAMPO_TIPOLOGIA:
				return tipologia;

			case CAMPO_DESCRIZIONE:
				return breveDescrizione;

			case CAMPO_LATITUDINE:
				return latitudine;

			case CAMPO_LONGITUDINE:
				return longitudine;

			case CAMPO_SITO_WEB:
				return sitoWeb;

			case CAMPO_TELEFONO:
				return isEmpty(telefono);

			case CAMPO_TELEFONO1:
				return isEmpty(telefonoOne);

			case CAMPO_EMAIL:
				return isEmpty(email);

			case CAMPO_EMAIL1:
				return isEmpty(emailOne);

			case CAMPO_INDIRIZZO:
				return indirizzo;

			case CAMPO_ORARI_APERTURA:
				return orariApertura;

			case CAMPO_PERIODO_APERTURA:
				return periodoApertura;

			case CAMPO_GOOGLE_MAPS:
				return googleMaps;

			case CAMPO_FACEBOOK:
				return facebook;

			case CAMPO_INSTAGRAM:
				return instagram;

			case CAMPO_TWITTER:
				return twitter;

			case CAMPO_YOUTUBE:
				return youtube;

			case CAMPO_LINKEDIN:
				return linkedin;

			case CAMPO_PINTEREST:
				return pinterest;

			case CAMPO_FLICKR:
				return flickr;

			case CAMPO_GOOGLE_PLUS:
				return googlePlus;

			case CAMPO_VALUTAZIONI_GOOGLE:
				return valutazioneGoogle;

			case CAMPO_INFO_AGGIUNTIVE:
				return infoAggiuntive;

			case CAMPO_ALTRO:
				return altro;

			case CAMPO_IMAGE_LOGO:
				return linkImageLogo;

			case CAMPO_IMAGE_COPERTINA:
				return linkImageCopertina;

			case CAMPO_IMAGE_GALLERIA_1:
				return linkImgGalleriaOne;

			case CAMPO_IMAGE_GALLERIA_2:
				return linkImgGalleriaTwo;

			case CAMPO_IMAGE_GALLERIA_3:
				return linkImgGalleriaTree;

			case CAMPO_IMAGE_GALLERIA_4:
				return linkImgGalleriaFour;

			case CAMPO_INFORMAZIONI_CRONOLOGICHE:
				return informazioniCronologiche;

			case CAMPO_DISTANZA:
				return distanzaTempoDaLuogoCentrale + " minuti da " + luogoCentrale;

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

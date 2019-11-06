package com.howtodoinjava.csv.demoOpenCSV;

import com.opencsv.bean.CsvBindByName;

public class Agroalimentare {
	private static final String
			NOME_COMMERCIALE = "NOME COMMERCIALE",
			DESCRIZIONE = "DESCRIZIONE",
			SITO_WEB = "SITO WEB",
			TELEFONO = "TELEFONO",
			TELEFONO_1 = "TELEFONO1",
			EMAIL = "E-mail",
			EMAIL_1 = "E-mail1",
			INDIRIZZO_DI_PRODUZIONE = "INDIRIZZO PRODUZIONE",
			INDIRIZZO_PUNTO_VENDITA = "INDIRIZZO PUNTO VENDITA",
			COMUNE = "COMUNE",
			ORARI_APERTURA_PRODUZIONE = "ORARI APERTURA PRODUZIONE",
			ORARI_APERTURA_PUNTO_VENDITA = "ORARI APERTURA PUNTO VENDITA",
			PERIODO_APERTURA = "PERIODO DI APERTURA",
			FACEBOOK = "Facebook",
			FLICKR = "Flickr",
			GOOGLE = "Google",
			INSTAGRAM = "Instagram",
			LINKEDIN = "LinkedIn",
			PINTEREST = "Pinterest",
			TWITTER = "Twitter",
			YOUTUBE = "Youtube",
			GOOGLE_MAPS_PRODUZIONE = "Google Maps (PRODUZIONE)",
			GOOGLE_MAPS_VENDITA = "Google Maps (VENDITA)",
			TRIPADVISOR = "Tripadvisor",
			INFO_AGGIUNTIVE = "INFO AGGIUNTIVE",
			TIPOLOGIA = "Tipologia",
			DEGUSTAZIONI_IN_LOCO = "Degustazioni in loco",
			VISITE_GUIDATE = "Visite guidate",
			ALTRO = "Altro",
			SPECIFICARE_ALTRO = "Specificare altro",
			LATITUDINE_PRODUZIONE = "Latitudine PRODUZIONE",
			LONGITUDINE_PRODUZIONE = "Longitudine PRODUZIONE",
			LATITUDINE_VENDITA = "Latitudine VENDITA",
			LONGITUDINE_VENDITA = "Longitudine VENDITE",
			LINK_IMG_LOGO = "Link immagine logo",
			LINK_IMG_COPERTINA = "Link immagine copertina",
			LINK_IMG_GALLERIA_1 = "Immagine galleria 1",
			LINK_IMG_GALLERIA_2 = "Immagine galleria 2",
			LINK_IMG_GALLERIA_3 = "Immagine galleria 3",
			LINK_IMG_GALLERIA_4 = "Immagine galleria 4",
			CATEGORIA = "Categoria",
			INFORMAZIONI_CRONOLOGICHE = "Informazioni cronologiche",
			FONTE = "FONTE",
			PROVINCIA = "PROVINCIA",
			GIORNO_DI_CHIUSURA_PRODUZIONE = "GIORNO DI CHIUSURA PRODUZIONE",
			GIORNO_DI_CHIUSURA_VENDITA = "GIORNO DI CHIUSURA VENDITA";

	@CsvBindByName(column = NOME_COMMERCIALE, required = true)
	private String nomeCommerciale;

	@CsvBindByName(column = DESCRIZIONE, required = true)
	private String descrizione;

	@CsvBindByName(column = SITO_WEB, required = true)
	private String sitoWeb;

	@CsvBindByName(column = TELEFONO, required = true)
	private String telefono;

	@CsvBindByName(column = TELEFONO_1, required = true)
	private String telefonoOne;

	@CsvBindByName(column = EMAIL, required = true)
	private String email;

	@CsvBindByName(column = EMAIL_1, required = true)
	private String emailOne;

	@CsvBindByName(column = INDIRIZZO_DI_PRODUZIONE, required = true)
	private String indirizzoDiProduzione;

	@CsvBindByName(column = INDIRIZZO_PUNTO_VENDITA, required = true)
	private String indirizzoPuntoVendita;

	@CsvBindByName(column = COMUNE, required = true)
	private String comune;

	@CsvBindByName(column = ORARI_APERTURA_PRODUZIONE, required = true)
	private String orariAperturaProduzione;

	@CsvBindByName(column = ORARI_APERTURA_PUNTO_VENDITA, required = true)
	private String orariAperturaPuntoVendita;

	@CsvBindByName(column = PERIODO_APERTURA, required = true)
	private String periodoApertura;

	@CsvBindByName(column = FACEBOOK, required = true)
	private String facebook;

	@CsvBindByName(column = FLICKR, required = true)
	private String flickr;

	@CsvBindByName(column = GOOGLE, required = true)
	private String google;

	@CsvBindByName(column = INSTAGRAM, required = true)
	private String instagram;

	@CsvBindByName(column = LINKEDIN, required = true)
	private String linkedin;

	@CsvBindByName(column = PINTEREST, required = true)
	private String pinterest;

	@CsvBindByName(column = TWITTER, required = true)
	private String twitter;

	@CsvBindByName(column = YOUTUBE, required = true)
	private String youtube;

	@CsvBindByName(column = GOOGLE_MAPS_PRODUZIONE, required = true)
	private String googleMapsProduzione;

	@CsvBindByName(column = GOOGLE_MAPS_VENDITA, required = true)
	private String googleMapsVendita;

	@CsvBindByName(column = TRIPADVISOR, required = true)
	private String tripadvisor;

	@CsvBindByName(column = INFO_AGGIUNTIVE, required = true)
	private String infoAggiuntive;

	@CsvBindByName(column = TIPOLOGIA, required = true)
	private String tipologia;

	@CsvBindByName(column = ALTRO, required = true)
	private String altro;

	@CsvBindByName(column = SPECIFICARE_ALTRO, required = true)
	private String specificareAltro;

	@CsvBindByName(column = LATITUDINE_PRODUZIONE, required = true)
	private String latitudineProduzione;

	@CsvBindByName(column = LONGITUDINE_PRODUZIONE, required = true)
	private String longitudineProduzione;

	@CsvBindByName(column = LATITUDINE_VENDITA, required = true)
	private String latitudineVendita;

	@CsvBindByName(column = LONGITUDINE_VENDITA, required = true)
	private String longitudineVendita;

	@CsvBindByName(column = LINK_IMG_LOGO, required = true)
	private String linkImgLogo;

	@CsvBindByName(column = LINK_IMG_COPERTINA, required = true)
	private String linkImgCopertina;

	@CsvBindByName(column = LINK_IMG_GALLERIA_1, required = true)
	private String linkImgGlOne;

	@CsvBindByName(column = LINK_IMG_GALLERIA_2, required = true)
	private String linkImgGlTwo;

	@CsvBindByName(column = LINK_IMG_GALLERIA_3, required = true)
	private String linkImgGlTree;

	@CsvBindByName(column = LINK_IMG_GALLERIA_4, required = true)
	private String linkImgGlFour;

	@CsvBindByName(column = CATEGORIA, required = true)
	private String categoria;

	@CsvBindByName(column = INFORMAZIONI_CRONOLOGICHE, required = true)
	private String informazioniCronologiche;

	@CsvBindByName(column = FONTE, required = true)
	private String fonte;

	@CsvBindByName(column = PROVINCIA, required = true)
	private String provincia;

	@CsvBindByName(column = GIORNO_DI_CHIUSURA_PRODUZIONE, required = true)
	private String giornoDiChiusuraProduzione;

	@CsvBindByName(column = GIORNO_DI_CHIUSURA_VENDITA, required = true)
	private String giornoDiChiusuraVendita;

	public String getField(Fields str) {
		switch (str) {
			case CAMPO_NOME_COMMERCIALE:
				return nomeCommerciale;

			case CAMPO_DESCRIZIONE:
				return descrizione;

			case CAMPO_TIPOLOGIA:
				return tipologia;

			case CAMPO_SITO_WEB:
				return sitoWeb;

			case CAMPO_TELEFONO1:
				return telefonoOne;

			case CAMPO_TELEFONO:
				return telefono;

			case CAMPO_EMAIL1:
				return emailOne;

			case CAMPO_EMAIL:
				return email;

			case CAMPO_INDIRIZZO_PRODUZIONE:
				return indirizzoDiProduzione;

			case CAMPO_INDIRIZZO_PUNTO_VENDITA:
				return indirizzoPuntoVendita;

			case CAMPO_COMUNE:
				return comune;

			case CAMPO_PROVINCIA:
				return provincia;

			case CAMPO_ORARI_APERTURA_PRODUZIONE:
				return orariAperturaProduzione;

			case CAMPO_ORARI_APERTURA_PUNTO_VENDITA:
				return orariAperturaPuntoVendita;

			case CAMPO_PERIODO_APERTURA:
				return periodoApertura;

			case CAMPO_FACEBOOK:
				return facebook;

			case CAMPO_FLICKR:
				return flickr;

			case CAMPO_GOOGLE:
				return google;

			case CAMPO_INSTAGRAM:
				return instagram;

			case CAMPO_LINKEDIN:
				return linkedin;

			case CAMPO_PINTEREST:
				return pinterest;

			case CAMPO_TWITTER:
				return twitter;

			case CAMPO_YOUTUBE:
				return youtube;

			case CAMPO_GOOGLE_MAPS_PRODUZIONE:
				return googleMapsProduzione;

			case CAMPO_GOOGLE_MAPS_VENDITA:
				return googleMapsVendita;

			case CAMPO_TRIPADVISOR:
				return tripadvisor;

			case CAMPO_INFO_AGGIUNTIVE:
				return infoAggiuntive;

			case CAMPO_ALTRO:
				return altro;

			case CAMPO_SPECIFICARE_ALTRO:
				return specificareAltro;

			case CAMPO_CATEGORIA:
				return categoria;

			case CAMPO_INFORMAZIONI_CRONOLOGICHE:
				return informazioniCronologiche;

			case CAMPO_FONTE:
				return fonte;

			case CAMPO_GIORNO_DI_CHIUSURA_PRODUZIONE:
				return giornoDiChiusuraProduzione;

			case CAMPO_GIORNO_DI_CHIUSURA_PUNTO_VENDITA:
				return giornoDiChiusuraVendita;

			default:
				return str.name();
		}
	}
}

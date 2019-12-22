package com.attractors;

import com.Fields;
import com.opencsv.bean.CsvBindByName;

import java.rmi.AlreadyBoundException;

public class Agroalimentare {
	private static final String NOME_COMMERCIALE = "NOME COMMERCIALE";
	private static final String DESCRIZIONE = "DESCRIZIONE";
	private static final String SITO_WEB = "SITO WEB";
	private static final String TELEFONO = "TELEFONO";
	private static final String TELEFONO_1 = "TELEFONO1";
	private static final String EMAIL = "E-mail";
	private static final String EMAIL_1 = "E-mail1";
	private static final String INDIRIZZO_DI_PRODUZIONE = "INDIRIZZO PRODUZIONE";
	private static final String INDIRIZZO_PUNTO_VENDITA = "INDIRIZZO PUNTO VENDITA";
	private static final String COMUNE = "COMUNE";
	private static final String ORARI_APERTURA_PRODUZIONE = "ORARI APERTURA PRODUZIONE";
	private static final String ORARI_APERTURA_PUNTO_VENDITA = "ORARI APERTURA PUNTO VENDITA";
	private static final String PERIODO_APERTURA = "PERIODO DI APERTURA";
	private static final String FACEBOOK = "Facebook";
	private static final String FLICKR = "Flickr";
	private static final String GOOGLE = "Google";
	private static final String INSTAGRAM = "Instagram";
	private static final String LINKEDIN = "LinkedIn";
	private static final String PINTEREST = "Pinterest";
	private static final String TWITTER = "Twitter";
	private static final String YOUTUBE = "Youtube";
	private static final String GOOGLE_MAPS_PRODUZIONE = "Google Maps (PRODUZIONE)";
	private static final String GOOGLE_MAPS_VENDITA = "Google Maps (VENDITA)";
	private static final String TRIPADVISOR = "Tripadvisor";
	private static final String INFO_AGGIUNTIVE = "INFO AGGIUNTIVE";
	private static final String TIPOLOGIA = "Tipologia";
	private static final String DEGUSTAZIONI_IN_LOCO = "Degustazioni in loco";
	private static final String VISITE_GUIDATE = "Visite guidate";
	private static final String ALTRO = "Altro";
	private static final String LATITUDINE_PRODUZIONE = "Latitudine PRODUZIONE";
	private static final String LONGITUDINE_PRODUZIONE = "Longitudine PRODUZIONE";
	private static final String LATITUDINE_VENDITA = "Latitudine VENDITA";
	private static final String LONGITUDINE_VENDITA = "Longitudine VENDITA";
	private static final String LINK_IMG_LOGO = "Link immagine logo";
	private static final String LINK_IMG_COPERTINA = "Link immagine copertina";
	private static final String LINK_IMG_GALLERIA_1 = "Immagine galleria 1";
	private static final String LINK_IMG_GALLERIA_2 = "Immagine galleria 2";
	private static final String LINK_IMG_GALLERIA_3 = "Immagine galleria 3";
	private static final String LINK_IMG_GALLERIA_4 = "Immagine galleria 4";
	private static final String CATEGORIA = "Categoria";
	private static final String INFORMAZIONI_CRONOLOGICHE = "Informazioni cronologiche";
	private static final String FONTE = "FONTE";
	private static final String PROVINCIA = "PROVINCIA";
	private static final String GIORNO_DI_CHIUSURA_PRODUZIONE = "GIORNO DI CHIUSURA PRODUZIONE";
	private static final String GIORNO_DI_CHIUSURA_VENDITA = "GIORNO DI CHIUSURA VENDITA";
	private static final String ALTRA_TIPOLOGIA = "ALTRA TIPOLOGIA";

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

	@CsvBindByName(column = DEGUSTAZIONI_IN_LOCO, required = true)
	private String degustazioniInLoco;

	@CsvBindByName(column = VISITE_GUIDATE, required = true)
	private String visiteGuidate;

	@CsvBindByName(column = ALTRO, required = true)
	private String altro;

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

	@CsvBindByName(column = ALTRA_TIPOLOGIA, required = true)
	private String altraTipologia;

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

			case CAMPO_DEGUSTAZIONI_IN_LOCO:
				return degustazioniInLoco;

			case CAMPO_VISITE_GUIDATE:
				return visiteGuidate;

			case CAMPO_ALTRO:
				return altro;

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

//			case CAMPO_ALTRA_TIPOLOGIA:
//				return altraTipologia;

			default:
				return str.name();
		}
	}
}

package com.attractors;

import com.Fields;
import com.opencsv.bean.CsvBindByName;

public class StabilimentiBalneari {
	private static final String NOME_COMMERCIALE = "NOME COMMERCIALE";
	private static final String DESCRIZIONE = "DESCRIZIONE";
	private static final String SITO_WEB = "SITO WEB";
	private static final String TELEFONO = "TELEFONO";
	private static final String TELEFONO_1 = "TELEFONO1";
	private static final String EMAIL = "E-mail";
	private static final String EMAIL_1 = "E-mail1";
	private static final String INDIRIZZO = "INDIRIZZO";
	private static final String COMUNE = "COMUNE";
	private static final String ORARI_APERTURA = "ORARI APERTURA";
	private static final String PERIODO_APERTURA = "PERIODO DI APERTURA";
	private static final String FACEBOOK = "Facebook";
	private static final String FLICKR = "Flickr";
	private static final String GOOGLE = "Google";
	private static final String INSTAGRAM = "Instagram";
	private static final String LINKEDIN = "LinkedIn";
	private static final String PINTEREST = "Pinterest";
	private static final String TWITTER = "Twitter";
	private static final String YOUTUBE = "Youtube";
	private static final String GOOGLE_MAPS = "Google Maps";
	private static final String TRIPADVISOR = "Tripadvisor";
	private static final String INFO_AGGIUNTIVE = "INFO AGGIUNTIVE";
	private static final String PARCHEGGIO_COPERTO = "Parcheggio coperto";
	private static final String PARCHEGGIO_GRATUITO = "Parcheggio gratuito";
	private static final String FREE_WIFI = "Free wifi";
	private static final String ANIMALI_AMMESSI = "Animali ammessi";
	private static final String PAGAMENTO_CON_CARTA = "Pagamento con carta";
	private static final String ACCESSIBILE_AI_DISABILI = "Accessibile ai disabili";
	private static final String PER_FAMIGLIE_CON_BAMBINI = "Per famiglie con bambini";
	private static final String BAR = "Bar";
	private static final String RISTORANTE = "Ristorante";
	private static final String NOLEGGIO_PEDALO_ATTREZZATURE_MARINE = "Noleggio pedalò/attrezzature marine";
	private static final String PISICINA = "Piscina";
	private static final String ALTRO = "Altro";
	private static final String LATITUDINE = "Latitudine";
	private static final String LONGITUDINE = "Longitudine";
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
	private static final String ALTRA_TIPOLOGIA = "ALTRA_TIPOLOGIA";

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

	@CsvBindByName(column = INDIRIZZO, required = true)
	private String indirizzo;

	@CsvBindByName(column = COMUNE, required = true)
	private String comune;

	@CsvBindByName(column = ORARI_APERTURA, required = true)
	private String orariApertura;

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

	@CsvBindByName(column = GOOGLE_MAPS, required = true)
	private String googleMaps;

	@CsvBindByName(column = TRIPADVISOR, required = true)
	private String tripadvisor;

	@CsvBindByName(column = INFO_AGGIUNTIVE, required = true)
	private String infoAggiuntive;

	@CsvBindByName(column = PARCHEGGIO_COPERTO, required = true)
	private String parcheggioCoperto;

	@CsvBindByName(column = PARCHEGGIO_GRATUITO, required = true)
	private String parcheggioGratuito;

	@CsvBindByName(column = PAGAMENTO_CON_CARTA, required = true)
	private String pagamentoConCarta;

	@CsvBindByName(column = FREE_WIFI, required = true)
	private String freeWifi;

	@CsvBindByName(column = ANIMALI_AMMESSI, required = true)
	private String animaliAmmessi;

	@CsvBindByName(column = ACCESSIBILE_AI_DISABILI, required = true)
	private String accessibileAiDisabili;

	@CsvBindByName(column = PER_FAMIGLIE_CON_BAMBINI, required = true)
	private String perFamiglieConBambini;

	@CsvBindByName(column = BAR, required = true)
	private String bar;

	@CsvBindByName(column = RISTORANTE, required = true)
	private String ristorante;

	@CsvBindByName(column = NOLEGGIO_PEDALO_ATTREZZATURE_MARINE, required = true)
	private String noleggioPedaloAttrezzatureMarine;

	@CsvBindByName(column = PISICINA, required = true)
	private String piscina;

	@CsvBindByName(column = ALTRO, required = true)
	private String altro;

	@CsvBindByName(column = LATITUDINE, required = true)
	private String latitudine;

	@CsvBindByName(column = LONGITUDINE, required = true)
	private String longitudine;

	@CsvBindByName(column = LINK_IMG_LOGO, required = true)
	private String linkImgLogo;

	@CsvBindByName(column = LINK_IMG_COPERTINA, required = true)
	private String linkImgCopertina;

	@CsvBindByName(column = LINK_IMG_GALLERIA_1, required = true)
	private String lingImgGalleriaUno;

	@CsvBindByName(column = LINK_IMG_GALLERIA_2, required = true)
	private String lingImgGalleriaDue;

	@CsvBindByName(column = LINK_IMG_GALLERIA_3, required = true)
	private String lingImgGalleriaTre;

	@CsvBindByName(column = LINK_IMG_GALLERIA_4, required = true)
	private String lingImgGalleriaQuattro;

	@CsvBindByName(column = CATEGORIA, required = true)
	private String categoria;

	@CsvBindByName(column = INFORMAZIONI_CRONOLOGICHE, required = true)
	private String informazioniCronologiche;

	@CsvBindByName(column = FONTE, required = true)
	private String fonte;

	@CsvBindByName(column = PROVINCIA, required = true)
	private String provincia;

	@CsvBindByName(column = ALTRA_TIPOLOGIA, required = true)
	private String altraTipologia;

	public String getField(Fields str) {
		switch (str) {
			case CAMPO_NOME_COMMERCIALE:
				return nomeCommerciale;

			case CAMPO_DESCRIZIONE:
				return descrizione;

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

			case CAMPO_INDIRIZZO:
				return indirizzo;

			case CAMPO_COMUNE:
				return comune;

			case CAMPO_PROVINCIA:
				return provincia;

			case CAMPO_ORARI_APERTURA:
				return orariApertura;

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

			case CAMPO_GOOGLE_MAPS:
				return googleMaps;

			case CAMPO_TRIPADVISOR:
				return tripadvisor;

			case CAMPO_INFO_AGGIUNTIVE:
				return infoAggiuntive;

			case CAMPO_PARCHEGGIO_COPERTO:
				return parcheggioCoperto;

			case CAMPO_PARCHEGGIO_GRATUITO:
				return parcheggioGratuito;

			case CAMPO_PAGAMENTO_CON_CARTA:
				return pagamentoConCarta;

			case CAMPO_PISCINA:
				return piscina;

			case CAMPO_ANIMALI_AMMESSI:
				return animaliAmmessi;

			case CAMPO_RISTORANTE:
				return ristorante;

			case CAMPO_FREE_WIFI:
				return freeWifi;

			case CAMPO_ACCESSIBILE_AI_DISABILI:
				return accessibileAiDisabili;

			case CAMPO_ALTRO:
				return altro;

			case CAMPO_LATITUDINE:
				return latitudine;

			case CAMPO_LONGITUDINE:
				return longitudine;

			case CAMPO_CATEGORIA:
				return categoria;

			case CAMPO_INFORMAZIONI_CRONOLOGICHE:
				return informazioniCronologiche;

			case CAMPO_FONTE:
				return fonte;

			case CAMPO_PER_FAMIGLIE_CON_BAMBINI:
				return perFamiglieConBambini;

			case CAMPO_BAR:
				return bar;

			case CAMPO_NOLEGGIO_PEDALO_ATTREZZATURE_MARINE:
				return noleggioPedaloAttrezzatureMarine;

			case CAMPO_ALTRA_TIPOLOGIA:
				return altraTipologia;

			default:
				return str.name();
		}
	}
}

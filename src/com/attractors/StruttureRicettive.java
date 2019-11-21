package com.attractors;

import com.Fields;
import com.opencsv.bean.CsvBindByName;

public class StruttureRicettive {
	private static final String
			NOME_COMMERCIALE = "NOME COMMERCIALE",
			DESCRIZIONE = "DESCRIZIONE",
			SITO_WEB = "SITO WEB",
			TELEFONO = "TELEFONO",
			TELEFONO_1 = "TELEFONO1",
			EMAIL = "E-mail",
			EMAIL_1 = "E-mail1",
			INDIRIZZO = "INDIRIZZO",
			COMUNE = "COMUNE",
			ORARI_APERTURA = "ORARI APERTURA",
			PERIODO_APERTURA = "PERIODO DI APERTURA",
			FACEBOOK = "Facebook",
			FLICKR = "Flickr",
			GOOGLE = "Google",
			INSTAGRAM = "Instagram",
			LINKEDIN = "LinkedIn",
			PINTEREST = "Pinterest",
			TWITTER = "Twitter",
			YOUTUBE = "Youtube",
			GOOGLE_MAPS = "Google Maps",
			TRIPADVISOR = "Tripadvisor",
			BOOKING = "Booking",
			HOTELS_COM = "Hotels.com",
			AIRBNB = "AirBnB",
			TRIVAGO = "Trivago",
			INFO_AGGIUNTIVE = "INFO AGGIUNTIVE",
			TIPOLOGIA = "Tipologia",
			STELLE = "Stelle",
			PARCHEGGIO_APERTO = "Parcheggio all'aperto",
			PARCHEGGIO_COPERTO = "Parcheggio coperto",
			PARCHEGGIO_GRATUITO = "Parcheggio gratuito",
			PAGAMENTO_CON_CARTA = "Pagamento con carta",
			POSTO_BICI = "Posto bici",
			SERVIZI_SPIAGGIA = "Servizi spiaggia",
			PISICINA = "Piscina",
			ANIMALI_AMMESSI = "Animali ammessi",
			RISTORANTE = "Ristorante",
			PALESTRA = "Palestra",
			MANEGGIO = "Maneggio",
			BEAUTY_FARM = "Beauty farm",
			FREE_WIFI = "Free wifi",
			SERVIZIO_IN_CAMERA = "Servizio in camera",
			ACCESSIBILE_AI_DISABILI = "Accessibile ai disabili",
			ALTRO = "Altro",
			SPECIFICARE_ALTRO = "Specificare altro",
			PACCHETTI_OFFERTI = "Pacchetti offerti",
			LATITUDINE = "Latitudine",
			LONGITUDINE = "Longitudine",
			LINK_IMG_LOGO = "Link immagine logo",
			LINK_IMG_COPERTINA = "Link immagine copertina",
			LINK_IMG_GALLERIA_1 = "Immagine galleria 1",
			LINK_IMG_GALLERIA_2 = "Immagine galleria 2",
			LINK_IMG_GALLERIA_3 = "Immagine galleria 3",
			LINK_IMG_GALLERIA_4 = "Immagine galleria 4",
			CATEGORIA = "Categoria",
			INFORMAZIONI_CRONOLOGICHE = "Informazioni cronologiche",
			FONTE = "FONTE",
			PROVINCIA = "PROVINCIA";

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

	@CsvBindByName(column = BOOKING, required = true)
	private String booking;

	@CsvBindByName(column = HOTELS_COM, required = true)
	private String hotels;

	@CsvBindByName(column = AIRBNB, required = true)
	private String airBnb;

	@CsvBindByName(column = TRIVAGO, required = true)
	private String trivago;

	@CsvBindByName(column = INFO_AGGIUNTIVE, required = true)
	private String infoAggiuntive;

	@CsvBindByName(column = TIPOLOGIA, required = true)
	private String tipologia;

	@CsvBindByName(column = STELLE, required = true)
	private String stelle;

	@CsvBindByName(column = PARCHEGGIO_APERTO, required = true)
	private String parcheggioAperto;

	@CsvBindByName(column = PARCHEGGIO_COPERTO, required = true)
	private String parcheggioCoperto;

	@CsvBindByName(column = PARCHEGGIO_GRATUITO, required = true)
	private String parcheggioGratuito;

	@CsvBindByName(column = PAGAMENTO_CON_CARTA, required = true)
	private String pagamentoConCarta;

	@CsvBindByName(column = POSTO_BICI, required = true)
	private String postoBici;

	@CsvBindByName(column = SERVIZI_SPIAGGIA, required = true)
	private String serviziSpiaggia;

	@CsvBindByName(column = PISICINA, required = true)
	private String piscina;

	@CsvBindByName(column = ANIMALI_AMMESSI, required = true)
	private String animaliAmmessi;

	@CsvBindByName(column = RISTORANTE, required = true)
	private String ristorante;

	@CsvBindByName(column = PALESTRA, required = true)
	private String palestra;

	@CsvBindByName(column = MANEGGIO, required = true)
	private String maneggio;

	@CsvBindByName(column = BEAUTY_FARM, required = true)
	private String beautyFarm;

	@CsvBindByName(column = FREE_WIFI, required = true)
	private String freeWifi;

	@CsvBindByName(column = SERVIZIO_IN_CAMERA, required = true)
	private String servizioinCamera;

	@CsvBindByName(column = ACCESSIBILE_AI_DISABILI, required = true)
	private String accessibileAiDisabili;

	@CsvBindByName(column = ALTRO, required = true)
	private String altro;

	@CsvBindByName(column = SPECIFICARE_ALTRO, required = true)
	private String specificareAltro;

	@CsvBindByName(column = PACCHETTI_OFFERTI, required = true)
	private String pacchettiOfferti;

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

			case CAMPO_BOOKING:
				return booking;

			case CAMPO_HOTELS_COM:
				return hotels;

			case CAMPO_AIRBNB:
				return airBnb;

			case CAMPO_TRIVAGO:
				return trivago;

			case CAMPO_INFO_AGGIUNTIVE:
				return infoAggiuntive;

			case CAMPO_STELLE:
				return stelle;

			case CAMPO_PARCHEGGIO_ALL_APERTO:
				return parcheggioAperto;

			case CAMPO_PARCHEGGIO_COPERTO:
				return parcheggioCoperto;

			case CAMPO_PARCHEGGIO_GRATUITO:
				return parcheggioGratuito;

			case CAMPO_PAGAMENTO_CON_CARTA:
				return pagamentoConCarta;

			case CAMPO_POSTO_BICI:
				return postoBici;

			case CAMPO_SERVIZI_SPIAGGIA:
				return serviziSpiaggia;

			case CAMPO_PISCINA:
				return piscina;

			case CAMPO_ANIMALI_AMMESSI:
				return animaliAmmessi;

			case CAMPO_RISTORANTE:
				return ristorante;

			case CAMPO_PALESTRA:
				return palestra;

			case CAMPO_MANEGGIO:
				return maneggio;

			case CAMPO_BEAUTY_FARM:
				return beautyFarm;

			case CAMPO_FREE_WIFI:
				return freeWifi;

			case CAMPO_SERVIZIO_IN_CAMERA:
				return servizioinCamera;

			case CAMPO_ACCESSIBILE_AI_DISABILI:
				return accessibileAiDisabili;

			case CAMPO_ALTRO:
				return altro;

			case CAMPO_SPECIFICARE_ALTRO:
				return specificareAltro;

			case CAMPO_PACCHETTI_OFFERTI:
				return pacchettiOfferti;

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

			default:
				return str.name();
		}
	}
}

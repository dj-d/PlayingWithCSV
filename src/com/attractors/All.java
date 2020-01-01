package com.attractors;

import com.FieldsAziendeRisorse;
import com.opencsv.bean.CsvBindByName;

public class All {
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
	private static final String BOOKING = "Booking";
	private static final String HOTELS_COM = "Hotels.com";
	private static final String AIRBNB = "AirBnB";
	private static final String TRIVAGO = "Trivago";
	private static final String INFO_AGGIUNTIVE = "INFO AGGIUNTIVE";
	private static final String TIPOLOGIA = "Tipologia";
	private static final String STELLE = "Stelle";
	private static final String PARCHEGGIO_IN_STRADA = "Parcheggio in strada";
	private static final String PARCHEGGIO_CUSTODITO = "Parcheggio custodito";
	private static final String PAGAMENTO_CON_CARTA = "Pagamento con carta";
	private static final String POSTO_BICI = "Posto bici";
	private static final String SERVIZI_SPIAGGIA = "Servizi spiaggia";
	private static final String PISICINA = "Piscina";
	private static final String ANIMALI_AMMESSI = "Animali ammessi";
	private static final String RISTORANTE = "Ristorante";
	private static final String PALESTRA = "Palestra";
	private static final String MANEGGIO = "Maneggio";
	private static final String BEAUTY_FARM = "Beauty farm";
	private static final String FREE_WIFI = "Free wifi";
	private static final String SERVIZIO_IN_CAMERA = "Servizio in camera";
	private static final String ACCESSIBILE_AI_DISABILI = "Accessibile ai disabili";
	private static final String ALTRO = "Altro";
	private static final String PACCHETTI_OFFERTI = "Pacchetti offerti";
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
	private static final String ALTRA_TIPOLOGIA = "ALTRA TIPOLOGIA";
	private static final String INDIRIZZO_DI_PRODUZIONE = "INDIRIZZO PRODUZIONE";
	private static final String INDIRIZZO_PUNTO_VENDITA = "INDIRIZZO PUNTO VENDITA";
	private static final String ORARI_APERTURA_PRODUZIONE = "ORARI APERTURA PRODUZIONE";
	private static final String ORARI_APERTURA_PUNTO_VENDITA = "ORARI APERTURA PUNTO VENDITA";
	private static final String GOOGLE_MAPS_PRODUZIONE = "Google Maps (PRODUZIONE)";
	private static final String GOOGLE_MAPS_VENDITA = "Google Maps (VENDITA)";
	private static final String DEGUSTAZIONI_IN_LOCO = "Degustazioni in loco";
	private static final String VISITE_GUIDATE = "Visite guidate";
	private static final String LATITUDINE_PRODUZIONE = "Latitudine PRODUZIONE";
	private static final String LONGITUDINE_PRODUZIONE = "Longitudine PRODUZIONE";
	private static final String LATITUDINE_VENDITA = "Latitudine VENDITA";
	private static final String LONGITUDINE_VENDITA = "Longitudine VENDITA";
	private static final String GIORNO_DI_CHIUSURA_PRODUZIONE = "GIORNO DI CHIUSURA PRODUZIONE";
	private static final String GIORNO_DI_CHIUSURA_VENDITA = "GIORNO DI CHIUSURA PUNTO VENDITA";
	private static final String PARCHEGGIO_GRATUITO = "Parcheggio gratuito";
	private static final String MENU_VEGETARIANO = "Menù vegetariano";
	private static final String MENU_CARNE = "Menù carne";
	private static final String MENU_PESCE = "Menù pesce";
	private static final String MENU_PER_CELIACI = "Menù per celiaci";
	private static final String MENU_VEGANO = "Menù vegano";
	private static final String FORNO_A_LEGNA = "Forno a legna";
	private static final String CUCINA_LOCALE = "Cucina locale";
	private static final String PER_FAMIGLIE_CON_BAMBINI = "Per famiglie con bambini";
	private static final String CUCINA_INTERNAZIONE = "Cucina internazionale";
	private static final String GIORNO_DI_CHIUSURA = "GIORNO DI CHIUSURA";
	private static final String PARCHEGGIO_COPERTO = "Parcheggio coperto";
	private static final String BAR = "Bar";
	private static final String NOLEGGIO_PEDALO_ATTREZZATURE_MARINE = "Noleggio pedalò/attrezzature marine";
	private static final String SERVIZI_DI_NOLEGGIO = "Servizi di noleggio";
	private static final String PROPOSTE_VACANZE_IN_MOLISE = "Proposte vacanze in Molise";
	private static final String LINK_ALLE_PROPOSTE = "Link alle proposte";

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

	@CsvBindByName(column = PARCHEGGIO_IN_STRADA, required = true)
	private String parcheggioInStrada;

	@CsvBindByName(column = PARCHEGGIO_CUSTODITO, required = true)
	private String parcheggioCustodito;

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
	private String linkImgGalleriaUno;

	@CsvBindByName(column = LINK_IMG_GALLERIA_2, required = true)
	private String linkImgGalleriaDue;

	@CsvBindByName(column = LINK_IMG_GALLERIA_3, required = true)
	private String linkImgGalleriaTre;

	@CsvBindByName(column = LINK_IMG_GALLERIA_4, required = true)
	private String linkImgGalleriaQuattro;

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

	@CsvBindByName(column = INDIRIZZO_DI_PRODUZIONE, required = true)
	private String indirizzoDiProduzione;

	@CsvBindByName(column = INDIRIZZO_PUNTO_VENDITA, required = true)
	private String indirizzoPuntoVendita;

	@CsvBindByName(column = ORARI_APERTURA_PRODUZIONE, required = true)
	private String orariAperturaProduzione;

	@CsvBindByName(column = ORARI_APERTURA_PUNTO_VENDITA, required = true)
	private String orariAperturaPuntoVendita;

	@CsvBindByName(column = GOOGLE_MAPS_PRODUZIONE, required = true)
	private String googleMapsProduzione;

	@CsvBindByName(column = GOOGLE_MAPS_VENDITA, required = true)
	private String googleMapsVendita;

	@CsvBindByName(column = DEGUSTAZIONI_IN_LOCO, required = true)
	private String degustazioniInLoco;

	@CsvBindByName(column = VISITE_GUIDATE, required = true)
	private String visiteGuidate;

	@CsvBindByName(column = LATITUDINE_PRODUZIONE, required = true)
	private String latitudineProduzione;

	@CsvBindByName(column = LONGITUDINE_PRODUZIONE, required = true)
	private String longitudineProduzione;

	@CsvBindByName(column = LATITUDINE_VENDITA, required = true)
	private String latitudineVendita;

	@CsvBindByName(column = LONGITUDINE_VENDITA, required = true)
	private String longitudineVendita;

	@CsvBindByName(column = GIORNO_DI_CHIUSURA_PRODUZIONE, required = true)
	private String giornoDiChiusuraProduzione;

	@CsvBindByName(column = GIORNO_DI_CHIUSURA_VENDITA, required = true)
	private String giornoDiChiusuraVendita;

	@CsvBindByName(column = PARCHEGGIO_GRATUITO, required = true)
	private String parcheggioGratuito;

	@CsvBindByName(column = MENU_VEGETARIANO, required = true)
	private String menuVegetariano;

	@CsvBindByName(column = MENU_CARNE, required = true)
	private String menuCarne;

	@CsvBindByName(column = MENU_PESCE, required = true)
	private String menuPesce;

	@CsvBindByName(column = MENU_PER_CELIACI, required = true)
	private String menuPerCeliaci;

	@CsvBindByName(column = MENU_VEGANO, required = true)
	private String menuVegano;

	@CsvBindByName(column = FORNO_A_LEGNA, required = true)
	private String fornoALegna;

	@CsvBindByName(column = CUCINA_LOCALE, required = true)
	private String cucinaLocale;

	@CsvBindByName(column = PER_FAMIGLIE_CON_BAMBINI, required = true)
	private String perFamiglieConBambini;

	@CsvBindByName(column = CUCINA_INTERNAZIONE, required = true)
	private String cucinaInternazione;

	@CsvBindByName(column = GIORNO_DI_CHIUSURA, required = true)
	private String giornoDiChiusura;

	@CsvBindByName(column = PARCHEGGIO_COPERTO, required = true)
	private String parcheggioCoperto;

	@CsvBindByName(column = BAR, required = true)
	private String bar;

	@CsvBindByName(column = NOLEGGIO_PEDALO_ATTREZZATURE_MARINE, required = true)
	private String noleggioPedaloAttrezzatureMarine;

	@CsvBindByName(column = SERVIZI_DI_NOLEGGIO, required = true)
	private String serviziDiNoleggio;

	@CsvBindByName(column = PROPOSTE_VACANZE_IN_MOLISE, required = true)
	private String proposteVacanzeInMolise;

	@CsvBindByName(column = LINK_ALLE_PROPOSTE, required = true)
	private String linkAlleProposte;

	public String getField(FieldsAziendeRisorse str) {
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
				if(!telefono.equals("-") || !telefonoOne.equals("-"))
					return isEmpty(telefonoOne);
				return telefonoOne;

			case CAMPO_TELEFONO:
				if(!telefono.equals("-") || !telefonoOne.equals("-"))
					return isEmpty(telefono);

				return telefono;

			case CAMPO_EMAIL1:
				if(!email.equals("-") || !emailOne.equals("-"))
					return isEmpty(emailOne);

				return emailOne;

			case CAMPO_EMAIL:
				if(!email.equals("-") || !emailOne.equals("-"))
					return isEmpty(email);
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

			case CAMPO_PARCHEGGIO_IN_STRADA:
				return parcheggioInStrada;

			case CAMPO_PARCHEGGIO_CUSTODITO:
				return parcheggioCustodito;

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

			case CAMPO_PACCHETTI_OFFERTI:
				return pacchettiOfferti;

			case CAMPO_LATITUDINE:
				return latitudine;

			case CAMPO_LONGITUDINE:
				return longitudine;

			case CAMPO_CATEGORIA:
				return categoria;

//			case CAMPO_INFORMAZIONI_CRONOLOGICHE:
//				return informazioniCronologiche;

			case CAMPO_FONTE:
				return fonte;

//			case CAMPO_ALTRA_TIPOLOGIA:
//				return altraTipologia;

			case CAMPO_INDIRIZZO_PRODUZIONE:
				return indirizzoDiProduzione;

			case CAMPO_INDIRIZZO_PUNTO_VENDITA:
				return indirizzoPuntoVendita;

			case CAMPO_ORARI_APERTURA_PRODUZIONE:
				return orariAperturaProduzione;

			case CAMPO_ORARI_APERTURA_PUNTO_VENDITA:
				return orariAperturaPuntoVendita;

			case CAMPO_GOOGLE_MAPS_PRODUZIONE:
				return googleMapsProduzione;

			case CAMPO_GOOGLE_MAPS_VENDITA:
				return googleMapsVendita;

			case CAMPO_DEGUSTAZIONI_IN_LOCO:
				return degustazioniInLoco;

			case CAMPO_VISITE_GUIDATE:
				return visiteGuidate;

			case CAMPO_GIORNO_DI_CHIUSURA_PRODUZIONE:
				return giornoDiChiusuraProduzione;

			case CAMPO_GIORNO_DI_CHIUSURA_PUNTO_VENDITA:
				return giornoDiChiusuraVendita;

			case CAMPO_PARCHEGGIO_GRATUITO:
				return parcheggioGratuito;

			case CAMPO_MENU_VEGETARIANI:
				return menuVegetariano;

			case CAMPO_MENU_CARNE:
				return menuCarne;

			case CAMPO_MENU_PESCE:
				return menuPesce;

			case CAMPO_MENU_PER_CELIACI:
				return menuPerCeliaci;

			case CAMPO_MENU_VEGANO:
				return menuVegano;

			case CAMPO_FORNO_A_LEGNA:
				return fornoALegna;

			case CAMPO_CUCINA_LOCALE:
				return cucinaLocale;

			case CAMPO_CUCINA_INTERNAZIONALE:
				return cucinaInternazione;

			case CAMPO_PER_FAMIGLIE_CON_BAMBINI:
				return perFamiglieConBambini;

			case CAMPO_GIORNO_DI_CHIUSURA:
				return giornoDiChiusura;

			case CAMPO_PARCHEGGIO_COPERTO:
				return parcheggioCoperto;

			case CAMPO_BAR:
				return bar;

			case CAMPO_NOLEGGIO_PEDALO_ATTREZZATURE_MARINE:
				return noleggioPedaloAttrezzatureMarine;

			case CAMPO_SERVIZI_DI_NOLEGGIO:
				return serviziDiNoleggio;

			case CAMPO_PROPOSTE_VACANZE_IN_MOLISE:
				return proposteVacanzeInMolise;

			case CAMPO_LINK_ALLE_PROPOSTE:
				return linkAlleProposte;

			case CAMPO_IMAGE_GALLERIA_1:
				return linkImgGalleriaUno;

			case CAMPO_IMAGE_GALLERIA_2:
				return linkImgGalleriaDue;

			case CAMPO_IMAGE_GALLERIA_3:
				return linkImgGalleriaTre;

			case CAMPO_IMAGE_GALLERIA_4:
				return linkImgGalleriaQuattro;

			case CAMPO_IMAGE_LOGO:
				return linkImgLogo;

			case CAMPO_IMAGE_COPERTINA:
				return linkImgCopertina;

			default:
				return str.name();
		}
	}

	private String isEmpty(String s) {
		if(s.equals("-")) {
			return "";
		}

		return s;
	}
}

package com.risorse_eventi;

import com.Fields;
import com.opencsv.bean.CsvBindByName;

public class Risorse {
//	private static final String ID = "id";
//	private static final String STATO_RISORSA = "STATO RISORSA";
	private static final String NOME_COMMERCIALE = "NOME COMMERCIALE";
	private static final String COMUNE_PROVINCIA = "COMUNE (PROVINCIA)";
	private static final String TIPOLOGIA = "TIPOLOGIA";
	private static final String CATEGORIA = "CATEGORIA";
	private static final String LATITUDINE = "LATITUDINE";
	private static final String LONGITUDINE = "LONGITUDINE";
	private static final String DESCRIZIONE = "BREVE DESCRIZIONE";
	private static final String SITO_WEB = "SITO WEB";
	private static final String TELEFONO = "TELEFONO";
	private static final String TELEFONO_1 = "TELEFONO1";
	private static final String EMAIL = "E-MAIL";
	private static final String EMAIL_1 = "E-MAIL.1";
	private static final String INDIRIZZO = "INDIRIZZO";
	private static final String INDIRIZZO_PUNTO_VENDITA = "INDIRIZZO PUNTO VENDITA";
	private static final String ORARI_APERTURA = "ORARI APERTURA";
	private static final String PERIODO_DI_APERTURA = "PERIODO DI APERTURA";
	private static final String FACEBOOK = "FACEBOOK";
	private static final String FLICKR = "FLICKR";
	private static final String GOOGLE_PLUS = "GOOGLE PLUS";
	private static final String VALUTAZIONE_GOOGLE = "VALUTAZIONE GOOGLE (IN STELLINE)";
	private static final String INSTAGRAM = "INSTRAGRAM";
	private static final String LINKEDIN = "LINKEDIN";
	private static final String PINTEREST = "PINTEREST";
	private static final String TWITTER = "TWITTER";
	private static final String YOUTUBE = "YOUTUBE";
	private static final String GOOGLE_MAPS = "GOOGLE MAPS";
	private static final String TRIPADVISOR = "TRIPADVISIOR";
	private static final String INFO_AGGIUNTIVE = "INFO AGGIUNTIVE";
	private static final String BIGLIETTI = "BIGLIETTI";
	private static final String PARCHEGGIO = "PARCHEGGIO";
	private static final String SENTIERI_ESCURSIONISTICI = "SENTIERI ESCURSIONISTICI";
	private static final String AREA_CAMPER = "AREE CAMPER";
	private static final String AREA_PICNIC = "AREE PICNIC";
	private static final String DETTAGLI_VISITE = "DETTAGLI VISITE";
	private static final String STATO_CONSERVAZIONE = "STATO CONSERVAZIONE";
	private static final String VENDITA_AL_DETTAGLIO = "VENDITA AL DETTAGLIO";
	private static final String POSTO_AUTO = "POSTO AUTO";
	private static final String ACCESSIBILE_AI_DISABILI = "ACCESSIBILE AI DISABILI";
	private static final String POSTO_BICI = "POSTO BICI";
	private static final String PACCHETTI_OFFERTI = "PACCHETTI OFFERTI";
	private static final String LINK_IMAGE_LOGO = "LINK IMMAGINE LOGO";
	private static final String LINK_IMAGE_COPERTINA = "LINK IMMAGINE COPERTINA";
	private static final String LINK_IMAGE_GALLERIA_1 = "IMMAGINE GALLERIA 1";
	private static final String LINK_IMAGE_GALLERIA_2 = "IMMAGINE GALLERIA 2";
	private static final String LINK_IMAGE_GALLERIA_3 = "IMMAGINE GALLERIA 3";
	private static final String LINK_IMAGE_GALLERIA_4 = "IMMAGINE GALLERIA 4";
	private static final String PROVINCIA = "PROVINCIA";
//	private static final String POSIZIONE = "POSIZIONE";
	private static final String GIORNO_DI_CHIUSURA = "GIORNO DI CHIUSURA";
	private static final String COSTO_BIGLIETTERIA = "COSTO BIGLIETTERIA";
//	private static final String FONTE_INFORMAZIONE_CRONOLOGIA = "FONTE INFORMAZIONE CRONOLOGICA";
//	private static final String LABORATORI_ESPERENZIALI = "LABORATORI ESPERIENZIALI";// TODO: Add to template
//	private static final String LABORATORI_ESPERENZIALI_ID = "LABORATORI ESPERIENZIALI ID";
	private static final String INFOMOBILITA = "INFOMOBILITÀ";

//	@CsvBindByName(column = ID, required = true)
//	private String id;

//	@CsvBindByName(column = STATO_RISORSA, required = true)
//	private String statoRisorsa;

	@CsvBindByName(column = NOME_COMMERCIALE, required = true)
	private String nome;

	@CsvBindByName(column = COMUNE_PROVINCIA, required = true)
	private String comuneProvincia;

	@CsvBindByName(column = TIPOLOGIA, required = true)
	private String tipologia;

	@CsvBindByName(column = CATEGORIA, required = true)
	private String categoria;

	@CsvBindByName(column = LATITUDINE, required = true)
	private String latitudine;

	@CsvBindByName(column = LONGITUDINE, required = true)
	private String longitudine;

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

	@CsvBindByName(column = INDIRIZZO_PUNTO_VENDITA, required = true)
	private String indirizzoPuntoVendita;

	@CsvBindByName(column = ORARI_APERTURA, required = true)
	private String orariApertura;

	@CsvBindByName(column = PERIODO_DI_APERTURA, required = true)
	private String periodoDiApertura;

	@CsvBindByName(column = FACEBOOK, required = true)
	private String facebook;

	@CsvBindByName(column = FLICKR, required = true)
	private String flickr;

	@CsvBindByName(column = GOOGLE_PLUS, required = true)
	private String googlePlus;

	@CsvBindByName(column = VALUTAZIONE_GOOGLE, required = true)
	private String valutazioneGoogle;

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

	@CsvBindByName(column = BIGLIETTI, required = true)
	private String biglietti;

	@CsvBindByName(column = PARCHEGGIO, required = true)
	private String parcheggio;

	@CsvBindByName(column = SENTIERI_ESCURSIONISTICI, required = true)
	private String sentieriEscursionistici;

	@CsvBindByName(column = AREA_CAMPER, required = true)
	private String areaCamper;

	@CsvBindByName(column = AREA_PICNIC, required = true)
	private String areaPicnic;

	@CsvBindByName(column = DETTAGLI_VISITE, required = true)
	private String dettagliVisite;

	@CsvBindByName(column = STATO_CONSERVAZIONE, required = true)
	private String statoConservazione;

	@CsvBindByName(column = VENDITA_AL_DETTAGLIO, required = true)
	private String venditaAlDettaglio;

	@CsvBindByName(column = POSTO_AUTO, required = true)
	private String postoAuto;

	@CsvBindByName(column = ACCESSIBILE_AI_DISABILI, required = true)
	private String accessibileAiDisabili;

	@CsvBindByName(column = POSTO_BICI, required = true)
	private String postoBici;

	@CsvBindByName(column = PACCHETTI_OFFERTI, required = true)
	private String pacchettiOfferti;

	@CsvBindByName(column = LINK_IMAGE_LOGO, required = true)
	private String linkImageLogo;

	@CsvBindByName(column = LINK_IMAGE_COPERTINA, required = true)
	private String linkImageCopertina;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_1, required = true)
	private String linkImageGalleriaOne;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_2, required = true)
	private String linkImageGalleriaTwo;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_3, required = true)
	private String linkImageGalleriaTree;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_4, required = true)
	private String linkImageGalleriaFour;

	@CsvBindByName(column = PROVINCIA, required = true)
	private String provincia;

//	@CsvBindByName(column = POSIZIONE, required = true)
//	private String posizione;

	@CsvBindByName(column = GIORNO_DI_CHIUSURA, required = true)
	private String giornoDiChiusura;

	@CsvBindByName(column = COSTO_BIGLIETTERIA, required = true)
	private String costoBiglietteria;

//	@CsvBindByName(column = FONTE_INFORMAZIONE_CRONOLOGIA, required = true)
//	private String fonteInformazioneCronologia;

//	@CsvBindByName(column = LABORATORI_ESPERENZIALI, required = true)
//	private String laboratoriEsperenziali;

//	@CsvBindByName(column = LABORATORI_ESPERENZIALI_ID, required = true)
//	private String laboratoriEsperenzialiId;

	@CsvBindByName(column = INFOMOBILITA, required = true)
	private String infomobilita;

	public String getField(Fields str) {
		switch (str) {
//			case CAMPO_STATO_RISORSA:
//				return statoRisorsa;

			case CAMPO_NOME_COMMERCIALE:
				return nome;

			case CAMPO_COMUNE:
				return comune(comuneProvincia);

			case CAMPO_TIPOLOGIA:
				return tipologia;

			case CAMPO_CATEGORIA:
				return categoria;

			case CAMPO_LATITUDINE:
				return latitudine;

			case CAMPO_LONGITUDINE:
				return longitudine;

			case CAMPO_DESCRIZIONE:
				return descrizione;

			case CAMPO_SITO_WEB:
				return sitoWeb;

			case CAMPO_TELEFONO:
				if(!telefono.equals("-") || !telefonoOne.equals("-"))
					return isEmpty(telefono);

				return telefono;

			case CAMPO_TELEFONO1:
				if(!telefono.equals("-") || !telefonoOne.equals("-"))
					return isEmpty(telefonoOne);
				return telefonoOne;

			case CAMPO_EMAIL:
				if(!email.equals("-") || !emailOne.equals("-"))
					return isEmpty(email);
				return email;

			case CAMPO_EMAIL1:
				if(!email.equals("-") || !emailOne.equals("-"))
					return isEmpty(emailOne);

				return emailOne;

			case CAMPO_INDIRIZZO:
				return indirizzo;

			case CAMPO_INDIRIZZO_PUNTO_VENDITA:
				return indirizzoPuntoVendita;

			case CAMPO_ORARI_APERTURA:
				return orariApertura;

			case CAMPO_PERIODO_APERTURA:
				return periodoDiApertura;

			case CAMPO_FACEBOOK:
				return facebook;

			case CAMPO_FLICKR:
				return flickr;

			case CAMPO_GOOGLE_PLUS:
				return googlePlus;

			case CAMPO_VALUTAZIONI_GOOGLE:
				return valutazioneGoogle;

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

			case CAMPO_COSTO_BIGLIETTO:
				return biglietti + " " + costoBiglietteria;

			case CAMPO_PARCHEGGIO:
				return parcheggio;

			case CAMPO_SENTIERI_ESCURSIONISTICI:
				return sentieriEscursionistici;

			case CAMPO_AREA_CAMPER:
				return areaCamper;

			case CAMPO_AREA_PICNIC:
				return areaPicnic;

			case CAMPO_DETTAGLI_VISITE:
				return dettagliVisite;

			case CAMPO_STATO_CONSERVAZIONE:
				return statoConservazione;

			case CAMPO_VENDITA_AL_DETTAGLIO:
				return venditaAlDettaglio;

			case CAMPO_POSTO_AUTO:
				return postoAuto;

			case CAMPO_ACCESSIBILE_AI_DISABILI:
				return accessibileAiDisabili;

			case CAMPO_POSTO_BICI:
				return postoBici;

			case CAMPO_PACCHETTI_OFFERTI:
				return pacchettiOfferti;

			case CAMPO_IMAGE_LOGO:
				return linkImageLogo;

			case CAMPO_IMAGE_COPERTINA:
				return linkImageCopertina;

			case CAMPO_IMAGE_GALLERIA_1:
				return linkImageGalleriaOne;

			case CAMPO_IMAGE_GALLERIA_2:
				return linkImageGalleriaTwo;

			case CAMPO_IMAGE_GALLERIA_3:
				return linkImageGalleriaTree;

			case CAMPO_IMAGE_GALLERIA_4:
				return linkImageGalleriaFour;

			case CAMPO_PROVINCIA:
				return provincia;

//			case CAMPO_POSIZIONE:
//				return posizione;

			case CAMPO_GIORNO_DI_CHIUSURA:
				return giornoDiChiusura;

				// TODO: Sta anche sopra
//			case CAMPO_COSTO_BIGLIETTO:
//				return costoBiglietteria;

//			case CAMPO_INFORMAZIONI_CRONOLOGICHE:
//				return fonteInformazioneCronologia;

//			case CAMPO_LABORATORI_ESPERENZIALI:
//				return laboratoriEsperenziali;

//			case CAMPO_LABORATORI_ESPERENZIALI_ID:
//				return laboratoriEsperenzialiID;

			case CAMPO_INFOMOBILITA:
				return infomobilita;

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

package com.risorse_eventi;

import com.Fields;
import com.opencsv.bean.CsvBindByName;

public class All {
	//	private static final String ID = "id";
	private static final String NOME = "Nome";
	private static final String COMUNE_PROVINCIA = "Comune (Provincia)";
	private static final String TIPOLOGIA = "Tipologia";
	private static final String CATEGORIA = "Categoria";
	private static final String LATITUDINE = "Latitudine";
	private static final String LONGITUDINE = "Longitudine";
	private static final String DESCRIZIONE = "Descrizione";
	private static final String SITO_WEB = "Sito web";
	private static final String TELEFONO = "Telefono";
	private static final String TELEFONO_1 = "Telefono1";
	private static final String EMAIL = "E-mail";
	private static final String EMAIL_1 = "E-mail 1";
	private static final String INDIRIZZO = "Indirizzo";
	private static final String INDIRIZZO_PUNTO_VENDITA = "Indirizzo punto vendita";
	private static final String ORARI_APERTURA = "Orari apertura";
	private static final String PERIODO_DI_APERTURA = "Periodo di apertura";
	private static final String FACEBOOK = "Facebook";
	private static final String FLICKR = "Flickr";
	private static final String GOOGLE = "Google";
	private static final String VALUTAZIONE_GOOGLE = "Valutazione Google";
	private static final String INSTAGRAM = "Instragram";
	private static final String LINKEDIN = "Linkedin";
	private static final String PINTEREST = "Pinterest";
	private static final String TWITTER = "Twitter";
	private static final String YOUTUBE = "Youtube";
	private static final String GOOGLE_MAPS = "Google Maps";
	private static final String TRIPADVISOR = "Tripadvisior";
	private static final String INFO_AGGIUNTIVE = "Info aggiuntive";
	private static final String BIGLIETTI = "Biglietti";
	private static final String PARCHEGGIO_GRATUITO = "Parcheggio gratuito";
	private static final String SENTIERI_ESCURSIONISTICI = "Sentieri escursionistici";
	private static final String AREA_CAMPER = "Aree camper";
	private static final String AREA_PICNIC = "Aree picnic";
	private static final String DETTAGLI_VISITE = "Dettagli visite";
	private static final String STATO_CONSERVAZIONE = "Stato Conservazione";
	private static final String VENDITA_AL_DETTAGLIO = "Vendita al dettaglio";
	private static final String POSTO_AUTO = "Posto auto";
	private static final String ACCESSIBILE_AI_DISABILI = "Accensibile ai disabili";
	private static final String POSTO_BICI = "Posto bici";
	private static final String PACCHETTI_OFFERTI = "Pacchetti offerti";
	private static final String LINK_IMAGE_GALLERIA_1 = "Immagine Galleria 1";
	private static final String LINK_IMAGE_GALLERIA_2 = "Immagine Galleria 2";
	private static final String LINK_IMAGE_GALLERIA_3 = "Immagine Galleria 3";
	private static final String LINK_IMAGE_GALLERIA_4 = "Immagine Galleria 4";
	//	private static final String PROVINCIA = "Provincia";
	private static final String POSIZIONE = "Posizione";
	private static final String GIORNO_DI_CHIUSURA = "Giorno di chiusura";
	private static final String COSTO_BIGLIETTERIA = "Costo biglietteria";
	private static final String FONTE_INFORMAZIONE_CRONOLOGIA = "Fonte Informazione cronologica";
	private static final String LABORATORI_DIDATTICI = "laboratori didattici";
	//	private static final String LABORATORI_DIDATTICI_ID = "laboratori didattici ID";
	private static final String INFOMOBILITA = "Infomobilità";
	private static final String COMUNE = "Comune";
	private static final String PROVINCIA = "Provincia";
	private static final String PERIODO = "Periodo";
	private static final String LUOGO = "Luogo";
	private static final String FONTE = "Fonte";
	private static final String INFORMAZIONE_CRONOLOGIA = "Informazione cronologica";
	private static final String LINK_IMAGE_COPERTINA = "Link immagine copertina";
	private static final String ORGANIZZATORE = "Organizzatore";

	//	@CsvBindByName(column = ID, required = true)
//	private String id;

	@CsvBindByName(column = NOME, required = true)
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

	@CsvBindByName(column = GOOGLE, required = true)
	private String google;

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

	@CsvBindByName(column = PARCHEGGIO_GRATUITO, required = true)
	private String parcheggioGratuito;

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

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_1, required = true)
	private String linkImageGalleria1;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_2, required = true)
	private String linkImageGalleria2;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_3, required = true)
	private String linkImageGalleria3;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_4, required = true)
	private String linkImageGalleria4;

	@CsvBindByName(column = POSIZIONE, required = true)
	private String posizione;

	@CsvBindByName(column = GIORNO_DI_CHIUSURA, required = true)
	private String giornoDiChiusura;

	@CsvBindByName(column = COSTO_BIGLIETTERIA, required = true)
	private String costoBiglietteria;

	@CsvBindByName(column = FONTE_INFORMAZIONE_CRONOLOGIA, required = true)
	private String fonteInformazioneCronologia;

	@CsvBindByName(column = LABORATORI_DIDATTICI, required = true)
	private String laboratoriDidattici;

//	@CsvBindByName(column = LABORATORI_DIDATTICI_ID, required = true)
//	private String laboratoriDidatticiId;

	@CsvBindByName(column = INFOMOBILITA, required = true)
	private String infomobilita;

	@CsvBindByName(column = COMUNE, required = true)
	private String comune;

	@CsvBindByName(column = PROVINCIA, required = true)
	private String provincia;

	@CsvBindByName(column = PERIODO, required = true)
	private String periodo;

	@CsvBindByName(column = LUOGO, required = true)
	private String luogo;

	@CsvBindByName(column = FONTE, required = true)
	private String fonte;

	@CsvBindByName(column = INFORMAZIONE_CRONOLOGIA, required = true)
	private String informazioneCronologia;

	@CsvBindByName(column = LINK_IMAGE_COPERTINA, required = true)
	private String linkImageCopertina;

	@CsvBindByName(column = ORGANIZZATORE, required = true)
	private String organizzatore;

	public String getField(Fields str) {
		switch (str) {
			case CAMPO_NOME_COMMERCIALE:
				return nome;

			// TODO: Risolvere conflitto, questo è per risorse
			case CAMPO_COMUNE:
				return comuneProvincia;

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
				return telefono;

			case CAMPO_TELEFONO1:
				return telefonoOne;

			case CAMPO_EMAIL:
				return email;

			case CAMPO_EMAIL1:
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

			case CAMPO_GOOGLE:
				return google;

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

			case CAMPO_COSTO_BIGLIETTO: // TODO: DA CONTROLLARE
				return biglietti + " " + costoBiglietteria;

			case CAMPO_PARCHEGGIO_GRATUITO:
				return parcheggioGratuito;

			// TODO: Da aggiungere
//			case CAMPO_SENTIERI_ESCURSIONISTICI:
//				return sentieriEscursionistici;

//			case CAMPO_AREA_CAMPER:
//				return areaCamper;

//			case CAMPO_AREA_PICNIC:
//				return areaPicnic;

//			case CAMPO_DETTAGLI_VISITE:
//				return dettagliVisite;

//			case CAMPO_STATO_CONSERVAZIONE:
//				return statoConservazione;

//			case CAMPO_VENDITA_AL_DETTAGLIO:
//				return venditaAlDettaglio;

//			case CAMPO_POSTO_AUTO:
//				return postoAuto;

			case CAMPO_ACCESSIBILE_AI_DISABILI:
				return accessibileAiDisabili;

			case CAMPO_POSTO_BICI:
				return postoBici;

			case CAMPO_PACCHETTI_OFFERTI:
				return pacchettiOfferti;

//			case CAMPO_POSIZIONE:
//				return posizione;

			case CAMPO_GIORNO_DI_CHIUSURA:
				return giornoDiChiusura;

			// TODO: Sta anche sopra
//			case CAMPO_COSTO_BIGLIETTO:
//				return costoBiglietteria;

			// TODO: Risolvere conflitto, questo è per eventi
//			case CAMPO_COMUNE:
//				return comune;

			case CAMPO_PROVINCIA:
				return provincia;

//			case CAMPO_PERIODO:
//				return periodo;

//			case CAMPO_LUOGO:
//				return luogo;

			case CAMPO_FONTE:
				return fonte;

			// TODO: Da verificare
			case CAMPO_INFORMAZIONI_CRONOLOGICHE:
				return informazioneCronologia;

			case CAMPO_IMAGE_COPERTINA:
				return linkImageCopertina;

			case CAMPO_IMAGE_GALLERIA_1:
				return linkImageGalleria1;

			case CAMPO_IMAGE_GALLERIA_2:
				return linkImageGalleria2;

			case CAMPO_IMAGE_GALLERIA_3:
				return linkImageGalleria3;

			case CAMPO_IMAGE_GALLERIA_4:
				return linkImageGalleria4;

//			case CAMPO_ORGANIZZATORE:
//				return organizzatore;

			case CAMPO_LABORATORI_DIDATTICI:
				return laboratoriDidattici;

			case CAMPO_INFOMOBILITA:
				return infomobilita;

			default:
				return str.name();
		}
	}
}

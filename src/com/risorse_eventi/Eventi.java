package com.risorse_eventi;

import com.Fields;
import com.opencsv.bean.CsvBindByName;

public class Eventi {
	//	private static final String ID = "id";
	private static final String NOME = "Nome";
	private static final String COMUNE = "Comune";
	private static final String PROVINCIA = "Provincia";
	private static final String CATEGORIA = "Categoria";
	private static final String DESCRIZIONE = "Descrizione";
	private static final String PERIODO = "Periodo";
	private static final String LUOGO = "Luogo";
	private static final String FONTE = "Fonte";
//	private static final String INFORMAZIONE_CRONOLOGIA = "Informazione cronologica";
	private static final String LATITUDINE = "Latitudine";
	private static final String LONGITUDINE = "Longitudine";
	private static final String LINK_IMAGE_COPERTINA = "Link immagine copertina";
	private static final String LINK_IMAGE_GALLERIA_1 = "Immagine Galleria 1";
	private static final String LINK_IMAGE_GALLERIA_2 = "Immagine Galleria 2";
	private static final String LINK_IMAGE_GALLERIA_3 = "Immagine Galleria 3";
	private static final String LINK_IMAGE_GALLERIA_4 = "Immagine Galleria 4";
	private static final String ORGANIZZATORE = "Organizzatore";
//	private static final String LABORATORI_DIDATTICI = "laboratori didattici"; // TODO: Add to template
	//	private static final String LABORATORI_DIDATTICI_ID = "laboratori didattici ID";
	private static final String INFOMOBILITA = "Infomobilità";

	//	@CsvBindByName(column = ID, required = true)
//	private String id;

	@CsvBindByName(column = NOME, required = true)
	private String nome;

	@CsvBindByName(column = COMUNE, required = true)
	private String comune;

	@CsvBindByName(column = PROVINCIA, required = true)
	private String provincia;

	@CsvBindByName(column = CATEGORIA, required = true)
	private String categoria;

	@CsvBindByName(column = DESCRIZIONE, required = true)
	private String descrizione;

	@CsvBindByName(column = PERIODO, required = true)
	private String periodo;

	@CsvBindByName(column = LUOGO, required = true)
	private String luogo;

	@CsvBindByName(column = FONTE, required = true)
	private String fonte;

//	@CsvBindByName(column = INFORMAZIONE_CRONOLOGIA, required = true)
//	private String informazioneCronologia;

	@CsvBindByName(column = LATITUDINE, required = true)
	private String latitudine;

	@CsvBindByName(column = LONGITUDINE, required = true)
	private String longitudine;

	@CsvBindByName(column = LINK_IMAGE_COPERTINA, required = true)
	private String linkImageCopertina;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_1, required = true)
	private String linkImageGalleria1;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_2, required = true)
	private String linkImageGalleria2;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_3, required = true)
	private String linkImageGalleria3;

	@CsvBindByName(column = LINK_IMAGE_GALLERIA_4, required = true)
	private String linkImageGalleria4;

	@CsvBindByName(column = ORGANIZZATORE, required = true)
	private String organizzatore;

//	@CsvBindByName(column = LABORATORI_DIDATTICI, required = true)
//	private String laboratoriDidattici;

//	@CsvBindByName(column = LABORATORI_DIDATTICI_ID, required = true)
//	private String laboratoriDidatticiId;

	@CsvBindByName(column = INFOMOBILITA, required = true)
	private String infomobilita;

	public String getField(Fields str) {
		switch (str) {
			case CAMPO_NOME_COMMERCIALE:
				return nome;

			case CAMPO_COMUNE:
				return comune;

			case CAMPO_PROVINCIA:
				return provincia;

			case CAMPO_CATEGORIA:
				return categoria;

			case CAMPO_DESCRIZIONE:
				return descrizione;

			case CAMPO_PERIODO:
				return periodo;

			case CAMPO_LUOGO:
				return luogo;

			case CAMPO_FONTE:
				return fonte;

//			case CAMPO_INFORMAZIONI_CRONOLOGICHE:
//				return informazioneCronologia;

			case CAMPO_LATITUDINE:
				return latitudine;

			case CAMPO_LONGITUDINE:
				return longitudine;

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

			case CAMPO_ORGANIZZATORE:
				return organizzatore;

//			case CAMPO_LABORATORI_DIDATTICI:
//				return laboratoriDidattici;

			case CAMPO_INFOMOBILITA:
				return infomobilita;

			default:
				return str.name();
		}
	}
}

// $ANTLR 3.5.3 Recognizer.g 2023-11-08 13:02:15
package com.mysql.spring.app.antlr;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RecognizerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AGREGAR", "ALFABETICO", "ASIGNACION", 
		"CERRAR", "CREAR", "DECIMAL", "ELIMINAR", "FECHA", "FIN", "ID", "INICIO", 
		"INSERTAR", "LLAVE", "MODIFICAR", "NUMERICO", "TABLA", "USAR", "VALOR", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int AGREGAR=4;
	public static final int ALFABETICO=5;
	public static final int ASIGNACION=6;
	public static final int CERRAR=7;
	public static final int CREAR=8;
	public static final int DECIMAL=9;
	public static final int ELIMINAR=10;
	public static final int FECHA=11;
	public static final int FIN=12;
	public static final int VALOR=21;
	public static final int ID=13;
	public static final int INICIO=14;
	public static final int INSERTAR=15;
	public static final int LLAVE=16;
	public static final int MODIFICAR=17;
	public static final int NUMERICO=18;
	public static final int TABLA=19;
	public static final int USAR=20;
	
	public static final int WS=22;
	public boolean kill = false;

	public static String extraerTextoEntreComillas(String texto) {
        Pattern patron = Pattern.compile("'(.*?)'");
        Matcher coincidencias = patron.matcher(texto);

        if (coincidencias.find()) {
            return coincidencias.group(1);
        }

        return null; // o puedes devolver una cadena vacía si lo prefieres
    }
	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RecognizerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecognizerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return RecognizerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Recognizer.g"; }

	   List <Tabla> tablas = new ArrayList<Tabla>();  
	            List<String > valores = new ArrayList<String >();
	             Tabla tablaActual = null;
	             boolean coma = false;
	             String sentencia="";
	             String bd="";
				 String respuesta="";
	             mysql dbManager = new mysql();



	// $ANTLR start "inicio"
	// Recognizer.g:17:1: inicio : ( usar ( creartabla | insertarDatos | eliminartabla | modificartabla )* )* cerrar ;
	public final String inicio() throws RecognitionException {
		try {
			// Recognizer.g:17:8: ( ( usar ( creartabla | insertarDatos | eliminartabla | modificartabla )* )* cerrar )
			// Recognizer.g:17:11: ( usar ( creartabla | insertarDatos | eliminartabla | modificartabla )* )* cerrar
			{
			// Recognizer.g:17:11: ( usar ( creartabla | insertarDatos | eliminartabla | modificartabla )* )*
			loop2:
			while (true && !kill) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==USAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Recognizer.g:17:12: usar ( creartabla | insertarDatos | eliminartabla | modificartabla )*
					{
					pushFollow(FOLLOW_usar_in_inicio23);
					usar();
					state._fsp--;

					// Recognizer.g:17:17: ( creartabla | insertarDatos | eliminartabla | modificartabla )*
					loop1:
					while (true&& !kill) {
						int alt1=5;
						switch ( input.LA(1) ) {
						case CREAR:
							{
							alt1=1;
							}
							break;
						case INSERTAR:
							{
							alt1=2;
							}
							break;
						case ELIMINAR:
							{
							alt1=3;
							}
							break;
						case MODIFICAR:
							{
							alt1=4;
							}
							break;
						}
						switch (alt1) {
						case 1 :
							// Recognizer.g:17:18: creartabla
							{
							pushFollow(FOLLOW_creartabla_in_inicio26);
							creartabla();
							state._fsp--;

							}
							break;
						case 2 :
							// Recognizer.g:17:31: insertarDatos
							{
							pushFollow(FOLLOW_insertarDatos_in_inicio30);
							insertarDatos();
							state._fsp--;

							}
							break;
						case 3 :
							// Recognizer.g:17:46: eliminartabla
							{
							pushFollow(FOLLOW_eliminartabla_in_inicio33);
							eliminartabla();
							state._fsp--;

							}
							break;
						case 4 :
							// Recognizer.g:17:62: modificartabla
							{
							pushFollow(FOLLOW_modificartabla_in_inicio37);
							modificartabla();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_cerrar_in_inicio43);
			cerrar();
			state._fsp--;

			}
			

		}
		catch (RecognitionException re) {
			
reportError(re);
			recover(input,re);
		}
		finally {
			return respuesta; // do for sure before leaving
		}
	}
	// $ANTLR end "inicio"



	// $ANTLR start "usar"
	// Recognizer.g:19:1: usar : USAR ID ;
	public final void usar() throws RecognitionException {
		Token ID1=null;

		try {
			// Recognizer.g:19:10: ( USAR ID )
			// Recognizer.g:19:12: USAR ID
			{
			match(input,USAR,FOLLOW_USAR_in_usar55); 
			ID1=(Token)match(input,ID,FOLLOW_ID_in_usar58); 

			    sentencia="CREATE DATABASE IF NOT EXISTS "+(ID1!=null?ID1.getText():null)+";";
			    respuesta+=dbManager.comandoSQL(sentencia);
			    sentencia="USE "+(ID1!=null?ID1.getText():null)+";";
			    bd=(ID1!=null?ID1.getText():null);
			    respuesta+=dbManager.comandoSQL(sentencia);
			  
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "usar"



	// $ANTLR start "creartabla"
	// Recognizer.g:27:1: creartabla : CREAR TABLA ID ( campo )+ ;
	public final void creartabla() throws RecognitionException {
		Token ID2=null;

		try {
			// Recognizer.g:27:15: ( CREAR TABLA ID ( campo )+ )
			// Recognizer.g:27:17: CREAR TABLA ID ( campo )+
			{
			match(input,CREAR,FOLLOW_CREAR_in_creartabla71); 
			match(input,TABLA,FOLLOW_TABLA_in_creartabla73); 
			ID2=(Token)match(input,ID,FOLLOW_ID_in_creartabla75); 
			 
			                    //c�digo para generar SQL
			                    sentencia="DROP TABLE IF EXISTS `"+(ID2!=null?ID2.getText():null)+"`;";
			                    respuesta+=dbManager.comandoBDSQL(sentencia,bd);
			                    
			                    sentencia="CREATE TABLE "+(ID2!=null?ID2.getText():null)+" ("+(ID2!=null?ID2.getText():null)+"_key INTEGER PRIMARY KEY AUTO_INCREMENT \n";
			                     //c�digo para crear estructura de datos
			                        Tabla t = new Tabla();
			                        t.nombre =(ID2!=null?ID2.getText():null);
			                        tablas.add(t);
			                        tablaActual = t;
			                     //
			                     
			// Recognizer.g:41:14: ( campo )+
			int cnt3=0;
			loop3:
			while (true&& !kill) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Recognizer.g:41:15: campo
					{
					pushFollow(FOLLOW_campo_in_creartabla112);
					campo();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 sentencia+=" );"; respuesta+=dbManager.comandoBDSQL(sentencia,bd);
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "creartabla"



	// $ANTLR start "modificartabla"
	// Recognizer.g:43:1: modificartabla : MODIFICAR TABLA ID ( agregar | eliminar )+ ;
	public final void modificartabla() throws RecognitionException {
		Token ID3=null;

		try {
			// Recognizer.g:43:16: ( MODIFICAR TABLA ID ( agregar | eliminar )+ )
			// Recognizer.g:43:18: MODIFICAR TABLA ID ( agregar | eliminar )+
			{
			match(input,MODIFICAR,FOLLOW_MODIFICAR_in_modificartabla124); 
			match(input,TABLA,FOLLOW_TABLA_in_modificartabla126); 
			ID3=(Token)match(input,ID,FOLLOW_ID_in_modificartabla128); 

			              sentencia="ALTER  TABLE "+(ID3!=null?ID3.getText():null)+" ";
			              coma = false;
			              
			          
			// Recognizer.g:47:13: ( agregar | eliminar )+
			int cnt4=0;
			loop4:
			while (true&& !kill) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ELIMINAR) ) {
					int LA4_2 = input.LA(2);
					if ( (LA4_2==ID) ) {
						alt4=2;
					}

				}
				else if ( (LA4_0==AGREGAR) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Recognizer.g:47:14: agregar
					{
					pushFollow(FOLLOW_agregar_in_modificartabla133);
					agregar();
					state._fsp--;

					}
					break;
				case 2 :
					// Recognizer.g:47:22: eliminar
					{
					pushFollow(FOLLOW_eliminar_in_modificartabla135);
					eliminar();
					state._fsp--;

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			sentencia+=";"; respuesta+=dbManager.comandoBDSQL(sentencia,bd);
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "modificartabla"



	// $ANTLR start "eliminartabla"
	// Recognizer.g:49:1: eliminartabla : ELIMINAR TABLA ID ;
	public final void eliminartabla() throws RecognitionException {
		Token ID4=null;

		try {
			// Recognizer.g:49:18: ( ELIMINAR TABLA ID )
			// Recognizer.g:49:20: ELIMINAR TABLA ID
			{
			match(input,ELIMINAR,FOLLOW_ELIMINAR_in_eliminartabla150); 
			match(input,TABLA,FOLLOW_TABLA_in_eliminartabla152); 
			ID4=(Token)match(input,ID,FOLLOW_ID_in_eliminartabla154); 
			 
			                      sentencia="DROP TABLE IF EXISTS `"+(ID4!=null?ID4.getText():null)+"`;"; 
			                      respuesta+=dbManager.comandoBDSQL(sentencia,bd);
			                    
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eliminartabla"



	// $ANTLR start "insertarDatos"
	// Recognizer.g:54:1: insertarDatos : INSERTAR TABLA ID ( asignacion )+ ;
	public final void insertarDatos() throws RecognitionException {
		Token ID5=null;

		try {
			// Recognizer.g:54:18: ( INSERTAR TABLA ID ( asignacion )+ )
			// Recognizer.g:54:20: INSERTAR TABLA ID ( asignacion )+
			{
			match(input,INSERTAR,FOLLOW_INSERTAR_in_insertarDatos167); 
			match(input,TABLA,FOLLOW_TABLA_in_insertarDatos169); 
			ID5=(Token)match(input,ID,FOLLOW_ID_in_insertarDatos171); 
			 
			                    //c�digo para generar SQL
			                    coma = false;
			                    valores = new ArrayList<String>();
			                    sentencia="INSERT INTO "+(ID5!=null?ID5.getText():null)+"(";
			                     
			// Recognizer.g:61:14: ( asignacion )+
			int cnt5=0;
			loop5:
			while (true&& !kill) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Recognizer.g:61:15: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_insertarDatos208);
					asignacion();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			 
			                sentencia+=") VALUES ( ";
			                for(int i = 0, size = valores.size(); i < size; i ++)
			                {
			                  if(i>0)
			                    sentencia+=", ";
								sentencia+="\"";
								String asig=valores.get(i).substring(0, valores.get(i).length() - 1);
			                    sentencia+=asig; 
								sentencia+="\"";
			                }
			                sentencia+=" );"; 
			                respuesta+=dbManager.comandoBDSQL(sentencia,bd);
			              
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "insertarDatos"



	// $ANTLR start "campo"
	// Recognizer.g:75:1: campo : ID tipo ;
	public final void campo() throws RecognitionException {
		Token ID7=null;
		String tipo6 =null;

		try {
			// Recognizer.g:75:9: ( ID tipo )
			// Recognizer.g:75:11: ID tipo
			{
			ID7=(Token)match(input,ID,FOLLOW_ID_in_campo238); 
			pushFollow(FOLLOW_tipo_in_campo240);
			tipo6=tipo();
			state._fsp--;

			 //aqu� hay que agregar c�digo para generar SQL
			                if(tipo6=="FOREIGN"){
			                  sentencia+=", \n"+(ID7!=null?ID7.getText():null)+" INTEGER, FOREIGN KEY ("+(ID7!=null?ID7.getText():null)+") REFERENCES "+(ID7!=null?ID7.getText():null)+"("+(ID7!=null?ID7.getText():null)+"_key)"; 
			                }else{
			                   sentencia+=", "+(ID7!=null?ID7.getText():null) + " " +tipo6;
			                }
			                  //el que sigue es c�digo para crear estructura de datos
			                  Atributo a  = new Atributo();
			                      a.nombreAtributo = (ID7!=null?ID7.getText():null);
			                      a.tipoAtributo = tipo6;
			                  tablaActual.atributos.add(a);
			                       
			                
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "campo"



	// $ANTLR start "asignacion"
	// Recognizer.g:90:1: asignacion : ID ASIGNACION VALOR ;
	public final void asignacion() throws RecognitionException {
		Token ID8=null;
		Token VALOR9=null;

		try {
			// Recognizer.g:90:14: ( ID ASIGNACION VALOR )
			// Recognizer.g:90:16: ID ASIGNACION VALOR
			{
			ID8=(Token)match(input,ID,FOLLOW_ID_in_asignacion268); 
			match(input,ASIGNACION,FOLLOW_ASIGNACION_in_asignacion270); 
			VALOR9=(Token)match(input,VALOR,FOLLOW_VALOR_in_asignacion272); 
			 
			                  if(coma)
			                    sentencia+=", ";
			                  coma = true;
			                  sentencia+=(ID8!=null?ID8.getText():null);
			                  valores.add((VALOR9!=null?VALOR9.getText():null));   
			                
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "asignacion"



	// $ANTLR start "agregar"
	// Recognizer.g:99:1: agregar : AGREGAR ID tipo ;
	public final void agregar() throws RecognitionException {
		Token ID10=null;
		String tipo11 =null;

		try {
			// Recognizer.g:99:11: ( AGREGAR ID tipo )
			// Recognizer.g:99:13: AGREGAR ID tipo
			{
			match(input,AGREGAR,FOLLOW_AGREGAR_in_agregar300); 
			ID10=(Token)match(input,ID,FOLLOW_ID_in_agregar302); 
			pushFollow(FOLLOW_tipo_in_agregar304);
			tipo11=tipo();
			state._fsp--;

			 
			                    if(coma)
			                      sentencia+=", ";
			                  coma = true;
			                  sentencia+="ADD "+(ID10!=null?ID10.getText():null)+" "+tipo11;
			                
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "agregar"



	// $ANTLR start "eliminar"
	// Recognizer.g:107:1: eliminar : ELIMINAR ID ;
	public final void eliminar() throws RecognitionException {
		Token ID12=null;

		try {
			// Recognizer.g:107:12: ( ELIMINAR ID )
			// Recognizer.g:107:14: ELIMINAR ID
			{
			match(input,ELIMINAR,FOLLOW_ELIMINAR_in_eliminar332); 
			ID12=(Token)match(input,ID,FOLLOW_ID_in_eliminar334); 
			 
			                    if(coma)
			                      sentencia+=", ";
			                  coma = true;
			                  sentencia+="DROP COLUMN  "+(ID12!=null?ID12.getText():null);
			                
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "eliminar"



	// $ANTLR start "cerrar"
	// Recognizer.g:115:1: cerrar : CERRAR ;
	public final void cerrar() throws RecognitionException {
		try {
			// Recognizer.g:115:10: ( CERRAR )
			// Recognizer.g:115:12: CERRAR
			{
			match(input,CERRAR,FOLLOW_CERRAR_in_cerrar362); 

			              for (int i=0; i<tablas.size(); i++)
			                   { 
			                     System.out.println("\nTabla: "+tablas.get(i).nombre);

			                     List <Atributo> atribs= tablas.get(i).atributos;

			                     for (int j=0; j<atribs.size(); j++)
			                          {  
			                    System.out.print("**Atributo:  "+atribs.get(j).nombreAtributo);
			                     System.out.println(" \t**TipoAtrib: "+atribs.get(j).tipoAtributo);
			                           }
			                    }

			                
			}

		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cerrar"



	// $ANTLR start "tipo"
	// Recognizer.g:131:1: tipo returns [String tipoSQL] : ( NUMERICO | ALFABETICO | FECHA | DECIMAL | TABLA );
	public final String tipo() throws RecognitionException {
		String tipoSQL = null;


		try {
			// Recognizer.g:131:30: ( NUMERICO | ALFABETICO | FECHA | DECIMAL | TABLA )
			int alt6=5;
			switch ( input.LA(1) ) {
			case NUMERICO:
				{
				alt6=1;
				}
				break;
			case ALFABETICO:
				{
				alt6=2;
				}
				break;
			case FECHA:
				{
				alt6=3;
				}
				break;
			case DECIMAL:
				{
				alt6=4;
				}
				break;
			case TABLA:
				{
				alt6=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Recognizer.g:131:33: NUMERICO
					{
					match(input,NUMERICO,FOLLOW_NUMERICO_in_tipo376); 
					tipoSQL = "NUMERIC";
					}
					break;
				case 2 :
					// Recognizer.g:132:14: ALFABETICO
					{
					match(input,ALFABETICO,FOLLOW_ALFABETICO_in_tipo395); 
					tipoSQL = "TEXT";
					}
					break;
				case 3 :
					// Recognizer.g:133:14: FECHA
					{
					match(input,FECHA,FOLLOW_FECHA_in_tipo413); 
					tipoSQL = "DATE";
					}
					break;
				case 4 :
					// Recognizer.g:134:14: DECIMAL
					{
					match(input,DECIMAL,FOLLOW_DECIMAL_in_tipo433); 
					tipoSQL = "DECIMAL(11,2)";
					}
					break;
				case 5 :
					// Recognizer.g:135:14: TABLA
					{
					match(input,TABLA,FOLLOW_TABLA_in_tipo452); 
					tipoSQL = "FOREIGN";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			if(!kill)
			respuesta+="\nError de syntaxis en la linea: "+re.line+", en la posicion: "+re.charPositionInLine+".\nValor inesperado: "+extraerTextoEntreComillas(re.token.toString())+"\n";
kill = true;
reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tipoSQL;
	}
	// $ANTLR end "tipo"

	// Delegated rules



	public static final BitSet FOLLOW_usar_in_inicio23 = new BitSet(new long[]{0x0000000000128580L});
	public static final BitSet FOLLOW_creartabla_in_inicio26 = new BitSet(new long[]{0x0000000000128580L});
	public static final BitSet FOLLOW_insertarDatos_in_inicio30 = new BitSet(new long[]{0x0000000000128580L});
	public static final BitSet FOLLOW_eliminartabla_in_inicio33 = new BitSet(new long[]{0x0000000000128580L});
	public static final BitSet FOLLOW_modificartabla_in_inicio37 = new BitSet(new long[]{0x0000000000128580L});
	public static final BitSet FOLLOW_cerrar_in_inicio43 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USAR_in_usar55 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_usar58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREAR_in_creartabla71 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TABLA_in_creartabla73 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_creartabla75 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_campo_in_creartabla112 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_MODIFICAR_in_modificartabla124 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TABLA_in_modificartabla126 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_modificartabla128 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_agregar_in_modificartabla133 = new BitSet(new long[]{0x0000000000000412L});
	public static final BitSet FOLLOW_eliminar_in_modificartabla135 = new BitSet(new long[]{0x0000000000000412L});
	public static final BitSet FOLLOW_ELIMINAR_in_eliminartabla150 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TABLA_in_eliminartabla152 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_eliminartabla154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERTAR_in_insertarDatos167 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_TABLA_in_insertarDatos169 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_insertarDatos171 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_asignacion_in_insertarDatos208 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_ID_in_campo238 = new BitSet(new long[]{0x00000000000C0A20L});
	public static final BitSet FOLLOW_tipo_in_campo240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_asignacion268 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASIGNACION_in_asignacion270 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_VALOR_in_asignacion272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AGREGAR_in_agregar300 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_agregar302 = new BitSet(new long[]{0x00000000000C0A20L});
	public static final BitSet FOLLOW_tipo_in_agregar304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELIMINAR_in_eliminar332 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_eliminar334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CERRAR_in_cerrar362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERICO_in_tipo376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALFABETICO_in_tipo395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FECHA_in_tipo413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECIMAL_in_tipo433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TABLA_in_tipo452 = new BitSet(new long[]{0x0000000000000002L});
}

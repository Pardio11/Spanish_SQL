// $ANTLR 3.5.3 Recognizer.g 2023-11-08 13:02:15
package com.mysql.spring.app.antlr;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class RecognizerLexer extends Lexer {
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
	public static final int ID=13;
	public static final int INICIO=14;
	public static final int INSERTAR=15;
	public static final int LLAVE=16;
	public static final int MODIFICAR=17;
	public static final int NUMERICO=18;
	public static final int TABLA=19;
	public static final int USAR=20;
	public static final int VALOR=21;
	public static final int WS=22;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public RecognizerLexer() {} 
	public RecognizerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RecognizerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Recognizer.g"; }

	// $ANTLR start "AGREGAR"
	public final void mAGREGAR() throws RecognitionException {
		try {
			int _type = AGREGAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:137:11: ( 'agregar' )
			// Recognizer.g:137:13: 'agregar'
			{
			match("agregar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AGREGAR"

	// $ANTLR start "INSERTAR"
	public final void mINSERTAR() throws RecognitionException {
		try {
			int _type = INSERTAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:138:11: ( 'insertar' )
			// Recognizer.g:138:13: 'insertar'
			{
			match("insertar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSERTAR"

	// $ANTLR start "LLAVE"
	public final void mLLAVE() throws RecognitionException {
		try {
			int _type = LLAVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:139:9: ( 'llave' )
			// Recognizer.g:139:11: 'llave'
			{
			match("llave"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LLAVE"

	// $ANTLR start "ASIGNACION"
	public final void mASIGNACION() throws RecognitionException {
		try {
			int _type = ASIGNACION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:140:14: ( '=' )
			// Recognizer.g:140:16: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASIGNACION"

	// $ANTLR start "CERRAR"
	public final void mCERRAR() throws RecognitionException {
		try {
			int _type = CERRAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:141:10: ( 'cerrar' )
			// Recognizer.g:141:12: 'cerrar'
			{
			match("cerrar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CERRAR"

	// $ANTLR start "NUMERICO"
	public final void mNUMERICO() throws RecognitionException {
		try {
			int _type = NUMERICO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:142:11: ( 'numeros' )
			// Recognizer.g:142:13: 'numeros'
			{
			match("numeros"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERICO"

	// $ANTLR start "ALFABETICO"
	public final void mALFABETICO() throws RecognitionException {
		try {
			int _type = ALFABETICO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:143:11: ( 'letras' )
			// Recognizer.g:143:13: 'letras'
			{
			match("letras"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALFABETICO"

	// $ANTLR start "DECIMAL"
	public final void mDECIMAL() throws RecognitionException {
		try {
			int _type = DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:144:8: ( 'decimal' )
			// Recognizer.g:144:10: 'decimal'
			{
			match("decimal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECIMAL"

	// $ANTLR start "FECHA"
	public final void mFECHA() throws RecognitionException {
		try {
			int _type = FECHA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:145:11: ( 'fecha' )
			// Recognizer.g:145:13: 'fecha'
			{
			match("fecha"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FECHA"

	// $ANTLR start "TABLA"
	public final void mTABLA() throws RecognitionException {
		try {
			int _type = TABLA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:146:7: ( 'tabla' )
			// Recognizer.g:146:9: 'tabla'
			{
			match("tabla"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TABLA"

	// $ANTLR start "INICIO"
	public final void mINICIO() throws RecognitionException {
		try {
			int _type = INICIO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:147:7: ( 'inicio' )
			// Recognizer.g:147:9: 'inicio'
			{
			match("inicio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INICIO"

	// $ANTLR start "FIN"
	public final void mFIN() throws RecognitionException {
		try {
			int _type = FIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:148:7: ( 'fin' )
			// Recognizer.g:148:9: 'fin'
			{
			match("fin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIN"

	// $ANTLR start "USAR"
	public final void mUSAR() throws RecognitionException {
		try {
			int _type = USAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:149:7: ( 'usar' )
			// Recognizer.g:149:9: 'usar'
			{
			match("usar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USAR"

	// $ANTLR start "CREAR"
	public final void mCREAR() throws RecognitionException {
		try {
			int _type = CREAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:150:7: ( 'crear' )
			// Recognizer.g:150:9: 'crear'
			{
			match("crear"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREAR"

	// $ANTLR start "ELIMINAR"
	public final void mELIMINAR() throws RecognitionException {
		try {
			int _type = ELIMINAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:151:10: ( 'eliminar' )
			// Recognizer.g:151:12: 'eliminar'
			{
			match("eliminar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELIMINAR"

	// $ANTLR start "MODIFICAR"
	public final void mMODIFICAR() throws RecognitionException {
		try {
			int _type = MODIFICAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:152:11: ( 'modificar' )
			// Recognizer.g:152:13: 'modificar'
			{
			match("modificar"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODIFICAR"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:153:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// Recognizer.g:153:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Recognizer.g:153:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Recognizer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "VALOR"
	public final void mVALOR() throws RecognitionException {
		try {
			int _type = VALOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:154:7: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )* )
			// Recognizer.g:154:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )*
			{
			// Recognizer.g:154:9: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '/' | '.' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '.' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Recognizer.g:
					{
					if ( (input.LA(1) >= '.' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALOR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Recognizer.g:156:6: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// Recognizer.g:156:7: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// Recognizer.g:156:7: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Recognizer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			_channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Recognizer.g:1:8: ( AGREGAR | INSERTAR | LLAVE | ASIGNACION | CERRAR | NUMERICO | ALFABETICO | DECIMAL | FECHA | TABLA | INICIO | FIN | USAR | CREAR | ELIMINAR | MODIFICAR | ID | VALOR | WS )
		int alt4=19;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// Recognizer.g:1:10: AGREGAR
				{
				mAGREGAR(); 

				}
				break;
			case 2 :
				// Recognizer.g:1:18: INSERTAR
				{
				mINSERTAR(); 

				}
				break;
			case 3 :
				// Recognizer.g:1:27: LLAVE
				{
				mLLAVE(); 

				}
				break;
			case 4 :
				// Recognizer.g:1:33: ASIGNACION
				{
				mASIGNACION(); 

				}
				break;
			case 5 :
				// Recognizer.g:1:44: CERRAR
				{
				mCERRAR(); 

				}
				break;
			case 6 :
				// Recognizer.g:1:51: NUMERICO
				{
				mNUMERICO(); 

				}
				break;
			case 7 :
				// Recognizer.g:1:60: ALFABETICO
				{
				mALFABETICO(); 

				}
				break;
			case 8 :
				// Recognizer.g:1:71: DECIMAL
				{
				mDECIMAL(); 

				}
				break;
			case 9 :
				// Recognizer.g:1:79: FECHA
				{
				mFECHA(); 

				}
				break;
			case 10 :
				// Recognizer.g:1:85: TABLA
				{
				mTABLA(); 

				}
				break;
			case 11 :
				// Recognizer.g:1:91: INICIO
				{
				mINICIO(); 

				}
				break;
			case 12 :
				// Recognizer.g:1:98: FIN
				{
				mFIN(); 

				}
				break;
			case 13 :
				// Recognizer.g:1:102: USAR
				{
				mUSAR(); 

				}
				break;
			case 14 :
				// Recognizer.g:1:107: CREAR
				{
				mCREAR(); 

				}
				break;
			case 15 :
				// Recognizer.g:1:113: ELIMINAR
				{
				mELIMINAR(); 

				}
				break;
			case 16 :
				// Recognizer.g:1:122: MODIFICAR
				{
				mMODIFICAR(); 

				}
				break;
			case 17 :
				// Recognizer.g:1:132: ID
				{
				mID(); 

				}
				break;
			case 18 :
				// Recognizer.g:1:135: VALOR
				{
				mVALOR(); 

				}
				break;
			case 19 :
				// Recognizer.g:1:141: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\17\3\16\1\uffff\11\16\3\uffff\31\16\1\71\16\16\1\uffff\1\16\1\111\5"+
		"\16\1\117\2\16\1\122\2\16\1\125\1\126\1\uffff\4\16\1\133\1\uffff\1\134"+
		"\1\135\1\uffff\2\16\2\uffff\2\16\1\142\1\16\3\uffff\1\144\1\145\2\16\1"+
		"\uffff\1\150\2\uffff\1\151\1\16\2\uffff\1\153\1\uffff";
	static final String DFA4_eofS =
		"\154\uffff";
	static final String DFA4_minS =
		"\1\11\3\56\1\uffff\11\56\3\uffff\50\56\1\uffff\17\56\1\uffff\5\56\1\uffff"+
		"\2\56\1\uffff\2\56\2\uffff\4\56\3\uffff\4\56\1\uffff\1\56\2\uffff\2\56"+
		"\2\uffff\1\56\1\uffff";
	static final String DFA4_maxS =
		"\4\172\1\uffff\11\172\3\uffff\50\172\1\uffff\17\172\1\uffff\5\172\1\uffff"+
		"\2\172\1\uffff\2\172\2\uffff\4\172\3\uffff\4\172\1\uffff\1\172\2\uffff"+
		"\2\172\2\uffff\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\4\uffff\1\4\11\uffff\1\21\1\22\1\23\50\uffff\1\14\17\uffff\1\15\5\uffff"+
		"\1\3\2\uffff\1\16\2\uffff\1\11\1\12\4\uffff\1\13\1\7\1\5\4\uffff\1\1\1"+
		"\uffff\1\6\1\10\2\uffff\1\2\1\17\1\uffff\1\20";
	static final String DFA4_specialS =
		"\154\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\20\2\uffff\1\20\22\uffff\1\20\34\uffff\1\4\3\uffff\32\15\4\uffff\1"+
			"\16\1\uffff\1\1\1\15\1\5\1\7\1\13\1\10\2\15\1\2\2\15\1\3\1\14\1\6\5\15"+
			"\1\11\1\12\5\15",
			"\2\17\12\22\7\uffff\32\22\6\uffff\6\22\1\21\23\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\15\22\1\23\14\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\25\6\22\1\24\16\22",
			"",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\26\14\22\1\27\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\24\22\1\30\5\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\31\25\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\32\3\22\1\33\21\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\34\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\22\22\1\35\7\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\13\22\1\36\16\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\16\22\1\37\13\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\32\22",
			"",
			"",
			"",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\40\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\10\22\1\42\11\22\1\41\7\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\43\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\23\22\1\44\6\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\45\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\46\25\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\14\22\1\47\15\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\2\22\1\50\27\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\2\22\1\51\27\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\15\22\1\52\14\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\22\1\53\30\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\54\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\10\22\1\55\21\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\3\22\1\56\26\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\57\25\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\60\25\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\2\22\1\61\27\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\25\22\1\62\4\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\63\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\64\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\65\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\66\25\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\10\22\1\67\21\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\7\22\1\70\22\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\13\22\1\72\16\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\73\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\14\22\1\74\15\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\10\22\1\75\21\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\6\22\1\76\23\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\77\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\10\22\1\100\21\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\4\22\1\101\25\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\102\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\103\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\104\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\105\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\14\22\1\106\15\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\107\31\22",
			"",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\110\31\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\10\22\1\112\21\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\5\22\1\113\24\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\114\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\23\22\1\115\6\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\16\22\1\116\13\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\22\22\1\120\7\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\121\10\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\16\22\1\123\13\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\124\31\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"",
			"\2\17\12\22\7\uffff\32\22\6\uffff\15\22\1\127\14\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\10\22\1\130\21\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\131\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\132\31\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"",
			"\2\17\12\22\7\uffff\32\22\6\uffff\22\22\1\136\7\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\13\22\1\137\16\22",
			"",
			"",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\140\31\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\2\22\1\141\27\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\143\10\22",
			"",
			"",
			"",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\146\10\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\1\147\31\22",
			"",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"",
			"",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			"\2\17\12\22\7\uffff\32\22\6\uffff\21\22\1\152\10\22",
			"",
			"",
			"\2\17\12\22\7\uffff\32\22\4\uffff\1\16\1\uffff\32\22",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AGREGAR | INSERTAR | LLAVE | ASIGNACION | CERRAR | NUMERICO | ALFABETICO | DECIMAL | FECHA | TABLA | INICIO | FIN | USAR | CREAR | ELIMINAR | MODIFICAR | ID | VALOR | WS );";
		}
	}

}

package gen;// Generated from F:/compiler/practices/Project-Phase1/Compiler/grammar\Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, INHERITS=2, SEMICOLON=3, OPENBRACE=4, CLOSEBRACE=5, COLON=6, 
		COMMA=7, OPENPARENTHESES=8, CLOSEPARENTHESES=9, DOT=10, AT=11, INTCOMP=12, 
		NEW=13, ADD=14, SUB=15, MUL=16, DIV=17, EQUAL=18, LT=19, LTEQ=20, ASSIGN=21, 
		NOT=22, TRUE=23, FALSE=24, STRING=25, IF=26, THEN=27, ELSE=28, FI=29, 
		WHILE=30, LOOP=31, POOL=32, CASE=33, OF=34, ESAC=35, LET=36, IN=37, CASEASSIGN=38, 
		ISVOID=39, ID=40, NUM=41, TYPE=42, SINGLECOMMENT=43, MULTICOMMENT=44, 
		WS=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "H", "I", "L", "N", "O", "P", "R", "S", 
			"T", "V", "W", "CLASS", "INHERITS", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", 
			"COLON", "COMMA", "OPENPARENTHESES", "CLOSEPARENTHESES", "DOT", "AT", 
			"INTCOMP", "NEW", "ADD", "SUB", "MUL", "DIV", "EQUAL", "LT", "LTEQ", 
			"ASSIGN", "NOT", "TRUE", "FALSE", "STRING", "IF", "THEN", "ELSE", "FI", 
			"WHILE", "LOOP", "POOL", "CASE", "OF", "ESAC", "LET", "IN", "CASEASSIGN", 
			"ISVOID", "ID", "NUM", "TYPE", "SINGLECOMMENT", "MULTICOMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "';'", "'{'", "'}'", "':'", "','", "'('", "')'", "'.'", 
			"'@'", "'~'", null, "'+'", "'-'", "'*'", "'/'", "'='", "'<'", "'<='", 
			"'<-'", null, "'true'", "'false'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "INHERITS", "SEMICOLON", "OPENBRACE", "CLOSEBRACE", "COLON", 
			"COMMA", "OPENPARENTHESES", "CLOSEPARENTHESES", "DOT", "AT", "INTCOMP", 
			"NEW", "ADD", "SUB", "MUL", "DIV", "EQUAL", "LT", "LTEQ", "ASSIGN", "NOT", 
			"TRUE", "FALSE", "STRING", "IF", "THEN", "ELSE", "FI", "WHILE", "LOOP", 
			"POOL", "CASE", "OF", "ESAC", "LET", "IN", "CASEASSIGN", "ISVOID", "ID", 
			"NUM", "TYPE", "SINGLECOMMENT", "MULTICOMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u016b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u00f1"+
		"\n+\3+\7+\u00f4\n+\f+\16+\u00f7\13+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38"+
		"\39\39\39\39\39\39\39\3:\3:\7:\u013b\n:\f:\16:\u013e\13:\3;\6;\u0141\n"+
		";\r;\16;\u0142\3<\3<\7<\u0147\n<\f<\16<\u014a\13<\3=\3=\3=\3=\7=\u0150"+
		"\n=\f=\16=\u0153\13=\3=\3=\3>\3>\3>\3>\7>\u015b\n>\f>\16>\u015e\13>\3"+
		">\3>\3>\3>\3>\3?\6?\u0166\n?\r?\16?\u0167\3?\3?\3\u015c\2@\3\2\5\2\7\2"+
		"\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\3\'"+
		"\4)\5+\6-\7/\b\61\t\63\n\65\13\67\f9\r;\16=\17?\20A\21C\22E\23G\24I\25"+
		"K\26M\27O\30Q\31S\32U\33W\34Y\35[\36]\37_ a!c\"e#g$i%k&m\'o(q)s*u+w,y"+
		"-{.}/\3\2\33\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2JJjj\4"+
		"\2KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2XXx"+
		"x\4\2YYyy\4\2\13\13^^\4\2\f\f\17\17\6\2\13\f\17\17$$^^\4\2aac|\6\2\62"+
		";C\\aac|\3\2\62;\3\2C\\\5\2\13\f\17\17\"\"\2\u0164\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177"+
		"\3\2\2\2\5\u0081\3\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0087\3\2"+
		"\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3\2\2"+
		"\2\25\u0091\3\2\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2"+
		"\35\u0099\3\2\2\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1"+
		"\3\2\2\2\'\u00a7\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2"+
		"/\u00b6\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00bc\3\2\2\2\67"+
		"\u00be\3\2\2\29\u00c0\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00c8\3\2"+
		"\2\2A\u00ca\3\2\2\2C\u00cc\3\2\2\2E\u00ce\3\2\2\2G\u00d0\3\2\2\2I\u00d2"+
		"\3\2\2\2K\u00d4\3\2\2\2M\u00d7\3\2\2\2O\u00da\3\2\2\2Q\u00de\3\2\2\2S"+
		"\u00e3\3\2\2\2U\u00e9\3\2\2\2W\u00fa\3\2\2\2Y\u00fd\3\2\2\2[\u0102\3\2"+
		"\2\2]\u0107\3\2\2\2_\u010a\3\2\2\2a\u0110\3\2\2\2c\u0115\3\2\2\2e\u011a"+
		"\3\2\2\2g\u011f\3\2\2\2i\u0122\3\2\2\2k\u0127\3\2\2\2m\u012b\3\2\2\2o"+
		"\u012e\3\2\2\2q\u0131\3\2\2\2s\u0138\3\2\2\2u\u0140\3\2\2\2w\u0144\3\2"+
		"\2\2y\u014b\3\2\2\2{\u0156\3\2\2\2}\u0165\3\2\2\2\177\u0080\t\2\2\2\u0080"+
		"\4\3\2\2\2\u0081\u0082\t\3\2\2\u0082\6\3\2\2\2\u0083\u0084\t\4\2\2\u0084"+
		"\b\3\2\2\2\u0085\u0086\t\5\2\2\u0086\n\3\2\2\2\u0087\u0088\t\6\2\2\u0088"+
		"\f\3\2\2\2\u0089\u008a\t\7\2\2\u008a\16\3\2\2\2\u008b\u008c\t\b\2\2\u008c"+
		"\20\3\2\2\2\u008d\u008e\t\t\2\2\u008e\22\3\2\2\2\u008f\u0090\t\n\2\2\u0090"+
		"\24\3\2\2\2\u0091\u0092\t\13\2\2\u0092\26\3\2\2\2\u0093\u0094\t\f\2\2"+
		"\u0094\30\3\2\2\2\u0095\u0096\t\r\2\2\u0096\32\3\2\2\2\u0097\u0098\t\16"+
		"\2\2\u0098\34\3\2\2\2\u0099\u009a\t\17\2\2\u009a\36\3\2\2\2\u009b\u009c"+
		"\t\20\2\2\u009c \3\2\2\2\u009d\u009e\t\21\2\2\u009e\"\3\2\2\2\u009f\u00a0"+
		"\t\22\2\2\u00a0$\3\2\2\2\u00a1\u00a2\5\7\4\2\u00a2\u00a3\5\23\n\2\u00a3"+
		"\u00a4\5\3\2\2\u00a4\u00a5\5\35\17\2\u00a5\u00a6\5\35\17\2\u00a6&\3\2"+
		"\2\2\u00a7\u00a8\5\21\t\2\u00a8\u00a9\5\25\13\2\u00a9\u00aa\5\17\b\2\u00aa"+
		"\u00ab\5\13\6\2\u00ab\u00ac\5\33\16\2\u00ac\u00ad\5\21\t\2\u00ad\u00ae"+
		"\5\37\20\2\u00ae\u00af\5\35\17\2\u00af(\3\2\2\2\u00b0\u00b1\7=\2\2\u00b1"+
		"*\3\2\2\2\u00b2\u00b3\7}\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7\177\2\2\u00b5"+
		".\3\2\2\2\u00b6\u00b7\7<\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9"+
		"\62\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7B\2\2\u00c1"+
		":\3\2\2\2\u00c2\u00c3\7\u0080\2\2\u00c3<\3\2\2\2\u00c4\u00c5\5\25\13\2"+
		"\u00c5\u00c6\5\13\6\2\u00c6\u00c7\5#\22\2\u00c7>\3\2\2\2\u00c8\u00c9\7"+
		"-\2\2\u00c9@\3\2\2\2\u00ca\u00cb\7/\2\2\u00cbB\3\2\2\2\u00cc\u00cd\7,"+
		"\2\2\u00cdD\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cfF\3\2\2\2\u00d0\u00d1\7"+
		"?\2\2\u00d1H\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3J\3\2\2\2\u00d4\u00d5\7>"+
		"\2\2\u00d5\u00d6\7?\2\2\u00d6L\3\2\2\2\u00d7\u00d8\7>\2\2\u00d8\u00d9"+
		"\7/\2\2\u00d9N\3\2\2\2\u00da\u00db\5\25\13\2\u00db\u00dc\5\27\f\2\u00dc"+
		"\u00dd\5\37\20\2\u00ddP\3\2\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2"+
		"\u00e0\u00e1\7w\2\2\u00e1\u00e2\7g\2\2\u00e2R\3\2\2\2\u00e3\u00e4\7h\2"+
		"\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7g\2\2\u00e8T\3\2\2\2\u00e9\u00f5\7$\2\2\u00ea\u00f1\t\23\2\2\u00eb\u00ec"+
		"\7\17\2\2\u00ec\u00f1\7\f\2\2\u00ed\u00f1\t\24\2\2\u00ee\u00ef\7^\2\2"+
		"\u00ef\u00f1\7$\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ed"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\n\25\2\2"+
		"\u00f3\u00f0\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7$\2\2\u00f9V\3\2\2\2\u00fa\u00fb\5\21\t\2\u00fb\u00fc\5\r\7\2"+
		"\u00fcX\3\2\2\2\u00fd\u00fe\5\37\20\2\u00fe\u00ff\5\17\b\2\u00ff\u0100"+
		"\5\13\6\2\u0100\u0101\5\25\13\2\u0101Z\3\2\2\2\u0102\u0103\5\13\6\2\u0103"+
		"\u0104\5\23\n\2\u0104\u0105\5\35\17\2\u0105\u0106\5\13\6\2\u0106\\\3\2"+
		"\2\2\u0107\u0108\5\r\7\2\u0108\u0109\5\21\t\2\u0109^\3\2\2\2\u010a\u010b"+
		"\5#\22\2\u010b\u010c\5\17\b\2\u010c\u010d\5\21\t\2\u010d\u010e\5\23\n"+
		"\2\u010e\u010f\5\13\6\2\u010f`\3\2\2\2\u0110\u0111\5\23\n\2\u0111\u0112"+
		"\5\27\f\2\u0112\u0113\5\27\f\2\u0113\u0114\5\31\r\2\u0114b\3\2\2\2\u0115"+
		"\u0116\5\31\r\2\u0116\u0117\5\27\f\2\u0117\u0118\5\27\f\2\u0118\u0119"+
		"\5\23\n\2\u0119d\3\2\2\2\u011a\u011b\5\7\4\2\u011b\u011c\5\3\2\2\u011c"+
		"\u011d\5\35\17\2\u011d\u011e\5\13\6\2\u011ef\3\2\2\2\u011f\u0120\5\27"+
		"\f\2\u0120\u0121\5\r\7\2\u0121h\3\2\2\2\u0122\u0123\5\13\6\2\u0123\u0124"+
		"\5\35\17\2\u0124\u0125\5\3\2\2\u0125\u0126\5\7\4\2\u0126j\3\2\2\2\u0127"+
		"\u0128\5\23\n\2\u0128\u0129\5\13\6\2\u0129\u012a\5\37\20\2\u012al\3\2"+
		"\2\2\u012b\u012c\5\21\t\2\u012c\u012d\5\25\13\2\u012dn\3\2\2\2\u012e\u012f"+
		"\7?\2\2\u012f\u0130\7@\2\2\u0130p\3\2\2\2\u0131\u0132\5\21\t\2\u0132\u0133"+
		"\5\35\17\2\u0133\u0134\5!\21\2\u0134\u0135\5\27\f\2\u0135\u0136\5\21\t"+
		"\2\u0136\u0137\5\t\5\2\u0137r\3\2\2\2\u0138\u013c\t\26\2\2\u0139\u013b"+
		"\t\27\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013dt\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\t"+
		"\30\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143v\3\2\2\2\u0144\u0148\t\31\2\2\u0145\u0147\t\27\2"+
		"\2\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149x\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7/\2\2\u014c\u014d"+
		"\7/\2\2\u014d\u0151\3\2\2\2\u014e\u0150\n\24\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0154\u0155\b=\2\2\u0155z\3\2\2\2\u0156\u0157"+
		"\7*\2\2\u0157\u0158\7,\2\2\u0158\u015c\3\2\2\2\u0159\u015b\13\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015d\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7,\2\2\u0160"+
		"\u0161\7+\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b>\2\2\u0163|\3\2\2\2\u0164"+
		"\u0166\t\32\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b?\2\2\u016a"+
		"~\3\2\2\2\f\2\u00f0\u00f3\u00f5\u013c\u0142\u0148\u0151\u015c\u0167\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
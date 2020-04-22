// Generated from /home/jordan/Desktop/Etudes/Master/Semestre2/Compilation/tp2/src/Machine/Pascal.g4 by ANTLR 4.7.2
package Machine;

    import Instructions.Comparaisons.*;
    import Instructions.Internes.*;
    import Instructions.Operations.*;
    import Instructions.OpBools.*;
    import Instructions.Instruction;
    import TablesSymboles.Types.*;
	import TablesSymboles.Types.Boolean;
	import TablesSymboles.Data;
    import Exceptions.*;
    import static Machine.Program.*;
    import java.util.Arrays;
	import static Machine.Main.printSymbolTable;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, TRUE=49, FALSE=50, ID=51, TYPE=52, INT=53, 
		WS=54, COMMENT=55;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_defprocs = 2, RULE_defproc = 3, 
		RULE_defparams = 4, RULE_defparam = 5, RULE_typedefs = 6, RULE_typedef = 7, 
		RULE_vars = 8, RULE_var = 9, RULE_type = 10, RULE_champ = 11, RULE_insts = 12, 
		RULE_inst = 13, RULE_cond = 14, RULE_condterm = 15, RULE_condfact = 16, 
		RULE_bool = 17, RULE_boolunop = 18, RULE_boolbiop = 19, RULE_relop = 20, 
		RULE_affect = 21, RULE_ifcond = 22, RULE_switchCase = 23, RULE_callFunc = 24, 
		RULE_params = 25, RULE_param = 26, RULE_read = 27, RULE_write = 28, RULE_expr = 29, 
		RULE_addop = 30, RULE_term = 31, RULE_mulop = 32, RULE_fact = 33, RULE_integer = 34, 
		RULE_whileDo = 35, RULE_repeatUntil = 36, RULE_forDo = 37, RULE_adresse = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "defprocs", "defproc", "defparams", "defparam", "typedefs", 
			"typedef", "vars", "var", "type", "champ", "insts", "inst", "cond", "condterm", 
			"condfact", "bool", "boolunop", "boolbiop", "relop", "affect", "ifcond", 
			"switchCase", "callFunc", "params", "param", "read", "write", "expr", 
			"addop", "term", "mulop", "fact", "integer", "whileDo", "repeatUntil", 
			"forDo", "adresse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "':'", "'.'", "';'", "'procedure'", "'('", "')'", 
			"'()'", "','", "'var'", "'type'", "'end'", "'='", "'integer'", "'boolean'", 
			"'array'", "'['", "'..'", "']'", "'of'", "'record'", "'begin'", "'!'", 
			"'&&'", "'||'", "'<>'", "'<'", "'>'", "'<='", "'>='", "':='", "'if'", 
			"'then'", "'else'", "'case'", "'read'", "'write'", "'+'", "'-'", "'*'", 
			"'/'", "'while'", "'do'", "'repeat'", "'until'", "'for'", "'to'", "'downto'", 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TRUE", "FALSE", "ID", "TYPE", "INT", "WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private Program prog = new Program();

	/**
	* Lit le programme dans un fichier et le convertit en instruction
	*
	* @return Le programme vérifié
	* @throws SyntaxErrorException
	*/
	public  Program lire() throws SyntaxErrorException {

	    program();

		if (this._syntaxErrors > 0 || prog.HasError()) {
		    prog.printErr();
		    printSymbolTable(this.prog.getSymbolTables());
			throw new SyntaxErrorException();
		}else
		    return prog;
	}

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(ID);
			setState(80);
			match(T__1);
			setState(81);
			block();
			setState(82);
			match(T__2);
			 prog.addPCode(new HLT()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public DefprocsContext x;
		public TypedefsContext typedefs() {
			return getRuleContext(TypedefsContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public DefprocsContext defprocs() {
			return getRuleContext(DefprocsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			typedefs();
			setState(86);
			vars();

			    INC inc = new INC(prog.getSizeSymbolsTable());
			    BRN brn = new BRN();
			    prog.addPCode(Arrays.asList(new Instruction[]{inc, brn}));
			    int tmp = prog.getSizeSymbolsTable();

			setState(88);
			((BlockContext)_localctx).x = defprocs();

			    inc.increment(((BlockContext)_localctx).x.size - tmp);
			    brn.setJump(prog.getNbrInstruction());

			setState(90);
			insts();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefprocsContext extends ParserRuleContext {
		public int size;
		public DefprocContext x;
		public List<DefprocContext> defproc() {
			return getRuleContexts(DefprocContext.class);
		}
		public DefprocContext defproc(int i) {
			return getRuleContext(DefprocContext.class,i);
		}
		public DefprocsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defprocs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDefprocs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDefprocs(this);
		}
	}

	public final DefprocsContext defprocs() throws RecognitionException {
		DefprocsContext _localctx = new DefprocsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_defprocs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((DefprocsContext)_localctx).size =  prog.getSizeSymbolsTable(); 
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(93);
				((DefprocsContext)_localctx).x = defproc(_localctx.size);
				 _localctx.size += ((DefprocsContext)_localctx).x.size; 
				setState(95);
				match(T__3);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefprocContext extends ParserRuleContext {
		public int shift;
		public Procedure proc;
		public int size;
		public Token ID;
		public DefprocsContext x;
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TypedefsContext typedefs() {
			return getRuleContext(TypedefsContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public DefprocsContext defprocs() {
			return getRuleContext(DefprocsContext.class,0);
		}
		public DefparamsContext defparams() {
			return getRuleContext(DefparamsContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefprocContext(ParserRuleContext parent, int invokingState, int shift) {
			super(parent, invokingState);
			this.shift = shift;
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDefproc(this);
		}
	}

	public final DefprocContext defproc(int shift) throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState(), shift);
		enterRule(_localctx, 6, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__4);
			setState(103);
			((DefprocContext)_localctx).ID = match(ID);

			((DefprocContext)_localctx).proc =  new Procedure(prog.getNbrInstruction()+1,_localctx.shift);
			    prog.putInTable((((DefprocContext)_localctx).ID!=null?((DefprocContext)_localctx).ID.getText():null),_localctx.proc,PROCEDURE);
			    prog.downLevel((((DefprocContext)_localctx).ID!=null?((DefprocContext)_localctx).ID.getText():null));

			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(105);
				match(T__5);
				setState(106);
				defparams();
				setState(107);
				match(T__6);
				}
				break;
			case T__7:
				{
				setState(109);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			match(T__1);
			setState(113);
			typedefs();
			setState(114);
			vars();

			    BRN brn = new BRN();
			    prog.addPCode(brn);
			    int tmp = prog.getSizeSymbolsTable();

			setState(116);
			((DefprocContext)_localctx).x = defprocs();
			setState(117);
			insts();

			    prog.addPCode(new RET(prog.getNbrParam((((DefprocContext)_localctx).ID!=null?((DefprocContext)_localctx).ID.getText():null))));
			    brn.setJump(prog.getNbrInstruction());
			    ((DefprocContext)_localctx).size =  prog.getSizeSymbolsTable() + ((DefprocContext)_localctx).x.size - tmp;
			    prog.upLevel();

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefparamsContext extends ParserRuleContext {
		public List<DefparamContext> defparam() {
			return getRuleContexts(DefparamContext.class);
		}
		public DefparamContext defparam(int i) {
			return getRuleContext(DefparamContext.class,i);
		}
		public DefparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDefparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDefparams(this);
		}
	}

	public final DefparamsContext defparams() throws RecognitionException {
		DefparamsContext _localctx = new DefparamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			defparam();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(121);
				match(T__8);
				setState(122);
				defparam();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefparamContext extends ParserRuleContext {
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDefparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDefparam(this);
		}
	}

	public final DefparamContext defparam() throws RecognitionException {
		DefparamContext _localctx = new DefparamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Parameter param = new Parameter(); 
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				{
				setState(129);
				match(T__9);
				setState(130);
				((DefparamContext)_localctx).ID = match(ID);
				setState(131);
				match(T__1);
				setState(132);
				((DefparamContext)_localctx).type = type();
				 param.setReference(true); 
				}
				}
				break;
			case ID:
				{
				{
				setState(135);
				((DefparamContext)_localctx).ID = match(ID);
				setState(136);
				match(T__1);
				setState(137);
				((DefparamContext)_localctx).type = type();
				 param.setReference(false); 
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			    param.setType(((DefparamContext)_localctx).type.t);
			    prog.putInTable((((DefparamContext)_localctx).ID!=null?((DefparamContext)_localctx).ID.getText():null),param,PARAMETER);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefsContext extends ParserRuleContext {
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public TypedefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTypedefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTypedefs(this);
		}
	}

	public final TypedefsContext typedefs() throws RecognitionException {
		TypedefsContext _localctx = new TypedefsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typedefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(144);
				match(T__10);
				setState(145);
				typedef();
				setState(146);
				match(T__11);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefContext extends ParserRuleContext {
		public Token x;
		public TypeContext type;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> TYPE() { return getTokens(PascalParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(PascalParser.TYPE, i);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typedef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				((TypedefContext)_localctx).x = match(TYPE);
				setState(154);
				match(T__12);
				setState(155);
				((TypedefContext)_localctx).type = type();
				 prog.putInTable((((TypedefContext)_localctx).x!=null?((TypedefContext)_localctx).x.getText():null),((TypedefContext)_localctx).type.t,TYPEPERSO);
				setState(157);
				match(T__3);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(163);
				match(T__9);
				setState(164);
				var();
				setState(165);
				match(T__3);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public Token x;
		public Token y;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PascalParser.ID, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((VarContext)_localctx).x = match(ID);
			 List<String> variables = new ArrayList<String>(){{ add((((VarContext)_localctx).x!=null?((VarContext)_localctx).x.getText():null)); }}; 
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(174);
				match(T__8);
				setState(175);
				((VarContext)_localctx).y = match(ID);
				 variables.add((((VarContext)_localctx).y!=null?((VarContext)_localctx).y.getText():null)); 
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__1);
			setState(183);
			((VarContext)_localctx).type = type();

			    for(String variable : variables){
			        prog.putInTable(variable,((VarContext)_localctx).type.t,VARIABLE);
			    }

			 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type t;
		public IntegerContext b;
		public IntegerContext e;
		public TypeContext x;
		public ChampContext champ;
		public Token TYPE;
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ChampContext> champ() {
			return getRuleContexts(ChampContext.class);
		}
		public ChampContext champ(int i) {
			return getRuleContext(ChampContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(PascalParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__13);
				 ((TypeContext)_localctx).t =  new Entier(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(T__14);
				 ((TypeContext)_localctx).t =  new Boolean(); 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(T__15);
				int begin = 0;
				setState(192);
				match(T__16);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(193);
					((TypeContext)_localctx).b = integer();
					setState(194);
					match(T__17);
					begin = ((TypeContext)_localctx).b.val;prog.removeHead();
					}
					break;
				}
				setState(199);
				((TypeContext)_localctx).e = integer();
				setState(200);
				match(T__18);
				setState(201);
				match(T__19);
				setState(202);
				((TypeContext)_localctx).x = type();
				 prog.removeHead();((TypeContext)_localctx).t =  new Tableau(begin,((TypeContext)_localctx).e.val,((TypeContext)_localctx).x.t);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__20);
				 List<Pair<String,Type>> champs = new ArrayList<Pair<String,Type>>(); 
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(207);
					((TypeContext)_localctx).champ = champ();
					 champs.add(new Pair<String,Type>(((TypeContext)_localctx).champ.info1,((TypeContext)_localctx).champ.info2)); 
					}
					}
					setState(212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(214);
				match(T__11);

				            try{
				                ((TypeContext)_localctx).t =  new Record(champs);
				            }catch(VariableAlReadyUsedException e){
				                prog.addError(e.getMessage());
				            }
				       
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				((TypeContext)_localctx).TYPE = match(TYPE);
				 ((TypeContext)_localctx).t =  prog.getData((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null),TYPEPERSO).getType(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChampContext extends ParserRuleContext {
		public String info1;
		public Type info2;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ChampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_champ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterChamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitChamp(this);
		}
	}

	public final ChampContext champ() throws RecognitionException {
		ChampContext _localctx = new ChampContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_champ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((ChampContext)_localctx).ID = match(ID);
			setState(222);
			match(T__1);
			setState(223);
			((ChampContext)_localctx).type = type();
			setState(224);
			match(T__3);
			 ((ChampContext)_localctx).info1 =  (((ChampContext)_localctx).ID!=null?((ChampContext)_localctx).ID.getText():null); ((ChampContext)_localctx).info2 =  ((ChampContext)_localctx).type.t; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstsContext extends ParserRuleContext {
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public InstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterInsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitInsts(this);
		}
	}

	public final InstsContext insts() throws RecognitionException {
		InstsContext _localctx = new InstsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__21);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				inst();
				setState(229);
				match(T__3);
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__31) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__43) | (1L << T__45) | (1L << ID))) != 0) );
			setState(235);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstContext extends ParserRuleContext {
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public IfcondContext ifcond() {
			return getRuleContext(IfcondContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ForDoContext forDo() {
			return getRuleContext(ForDoContext.class,0);
		}
		public WhileDoContext whileDo() {
			return getRuleContext(WhileDoContext.class,0);
		}
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public RepeatUntilContext repeatUntil() {
			return getRuleContext(RepeatUntilContext.class,0);
		}
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitInst(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inst);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				insts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				affect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				ifcond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				read();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				write();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				forDo();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				whileDo();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				switchCase();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				repeatUntil();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				callFunc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public BoolunopContext x;
		public CondtermContext condterm() {
			return getRuleContext(CondtermContext.class,0);
		}
		public BoolunopContext boolunop() {
			return getRuleContext(BoolunopContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cond);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__38:
			case TRUE:
			case FALSE:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				condterm();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				((CondContext)_localctx).x = boolunop();
				setState(251);
				match(T__5);
				setState(252);
				condterm();
				setState(253);
				match(T__6);
				 prog.addPCode(((CondContext)_localctx).x.op); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondtermContext extends ParserRuleContext {
		public BoolbiopContext x;
		public List<CondfactContext> condfact() {
			return getRuleContexts(CondfactContext.class);
		}
		public CondfactContext condfact(int i) {
			return getRuleContext(CondfactContext.class,i);
		}
		public BoolbiopContext boolbiop() {
			return getRuleContext(BoolbiopContext.class,0);
		}
		public CondtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCondterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCondterm(this);
		}
	}

	public final CondtermContext condterm() throws RecognitionException {
		CondtermContext _localctx = new CondtermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			condfact();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==T__24) {
				{
				setState(259);
				((CondtermContext)_localctx).x = boolbiop();
				setState(260);
				condfact();
				 prog.addPCode(((CondtermContext)_localctx).x.op); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondfactContext extends ParserRuleContext {
		public RelopContext x;
		public AdresseContext y;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public AdresseContext adresse() {
			return getRuleContext(AdresseContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondfactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condfact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCondfact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCondfact(this);
		}
	}

	public final CondfactContext condfact() throws RecognitionException {
		CondfactContext _localctx = new CondfactContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condfact);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				bool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				expr();
				setState(267);
				((CondfactContext)_localctx).x = relop();
				setState(268);
				expr();
				 prog.addPCode(((CondfactContext)_localctx).x.op); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				((CondfactContext)_localctx).y = adresse();

				    if(prog.isBoolean(((CondfactContext)_localctx).y.t)){
				        prog.addPCode(new LDV(((CondfactContext)_localctx).y.t.size()));
				    }else{
				        prog.addError(((CondfactContext)_localctx).y.t+" is not a boolean.");
				    }


				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(T__5);
				setState(275);
				cond();
				setState(276);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascalParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(TRUE);
				 prog.addPCode(new LDI(1)); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(FALSE);
				 prog.addPCode(new LDI(0)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolunopContext extends ParserRuleContext {
		public Instruction op;
		public BoolunopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolunop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBoolunop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBoolunop(this);
		}
	}

	public final BoolunopContext boolunop() throws RecognitionException {
		BoolunopContext _localctx = new BoolunopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_boolunop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__22);
			 ((BoolunopContext)_localctx).op =  new NOT(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolbiopContext extends ParserRuleContext {
		public Instruction op;
		public BoolbiopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolbiop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBoolbiop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBoolbiop(this);
		}
	}

	public final BoolbiopContext boolbiop() throws RecognitionException {
		BoolbiopContext _localctx = new BoolbiopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolbiop);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(T__23);
				 ((BoolbiopContext)_localctx).op =  new AND(); 
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(T__24);
				 ((BoolbiopContext)_localctx).op =  new OR(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public Instruction op;
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relop);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__12);
				 ((RelopContext)_localctx).op =  new EQL(); 
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__25);
				 ((RelopContext)_localctx).op =  new NEQ(); 
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(T__26);
				 ((RelopContext)_localctx).op =  new LSS(); 
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				match(T__27);
				 ((RelopContext)_localctx).op =  new GTR(); 
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(303);
				match(T__28);
				 ((RelopContext)_localctx).op =  new LEQ(); 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(T__29);
				 ((RelopContext)_localctx).op =  new GEQ(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffectContext extends ParserRuleContext {
		public AdresseContext x;
		public AdresseContext adresse() {
			return getRuleContext(AdresseContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAffect(this);
		}
	}

	public final AffectContext affect() throws RecognitionException {
		AffectContext _localctx = new AffectContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_affect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			((AffectContext)_localctx).x = adresse();
			setState(310);
			match(T__30);
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(311);
				if (!(prog.isBoolean(((AffectContext)_localctx).x.t))) throw new FailedPredicateException(this, "prog.isBoolean($x.t)");
				setState(312);
				cond();
				}
				break;
			case 2:
				{
				setState(313);
				expr();
				}
				break;
			}
			 prog.addPCode(new STO(((AffectContext)_localctx).x.t.size())); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfcondContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public IfcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIfcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIfcond(this);
		}
	}

	public final IfcondContext ifcond() throws RecognitionException {
		IfcondContext _localctx = new IfcondContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 BZE bze = new BZE(); BRN brn = new BRN();  
			setState(319);
			match(T__31);
			setState(320);
			cond();
			 prog.addPCode(bze); 
			setState(322);
			match(T__32);
			setState(323);
			inst();
			 prog.addPCode(brn); bze.setJump(prog.getNbrInstruction()); 
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(325);
				match(T__33);
				setState(326);
				inst();
				}
				break;
			}
			 brn.setJump(prog.getNbrInstruction()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstContext> inst() {
			return getRuleContexts(InstContext.class);
		}
		public InstContext inst(int i) {
			return getRuleContext(InstContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__34);
			 int debut = prog.getNbrInstruction(); 
			setState(333);
			expr();
			 int fin = prog.getNbrInstruction(); 
			setState(335);
			match(T__19);
			setState(336);
			expr();


			    BZE bze = new BZE();
			    prog.addPCode(Arrays.asList(new Instruction[]{new EQL(), bze}));

			setState(338);
			match(T__1);
			setState(339);
			inst();

			    BRN brn = new BRN();
			    prog.addPCode(brn);
			    bze.setJump(prog.getNbrInstruction());

			setState(341);
			match(T__3);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__38) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				 prog.copySetInstruction(debut,fin); 
				setState(343);
				expr();


				    BZE bze1 = new BZE();
				    prog.addPCode(Arrays.asList(new Instruction[]{new EQL(), bze1}));

				setState(345);
				match(T__1);
				setState(346);
				inst();

				    prog.addPCode(brn);
				    bze1.setJump(prog.getNbrInstruction());

				setState(348);
				match(T__3);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 brn.setJump(prog.getNbrInstruction()); 
			setState(356);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallFuncContext extends ParserRuleContext {
		public Token x;
		public ParamsContext y;
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCallFunc(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((CallFuncContext)_localctx).x = match(ID);
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(359);
				if (!( prog.hasNoParam((((CallFuncContext)_localctx).x!=null?((CallFuncContext)_localctx).x.getText():null)) )) throw new FailedPredicateException(this, " prog.hasNoParam($x.text) ");
				setState(360);
				match(T__7);
				}
				break;
			case 2:
				{
				{
				setState(361);
				match(T__5);
				setState(362);
				((CallFuncContext)_localctx).y = params((((CallFuncContext)_localctx).x!=null?((CallFuncContext)_localctx).x.getText():null));
				setState(363);
				match(T__6);

				        int count = prog.getNbrParam((((CallFuncContext)_localctx).x!=null?((CallFuncContext)_localctx).x.getText():null));
				        if(((CallFuncContext)_localctx).y.cpt != count){ prog.addError("user gives "+((CallFuncContext)_localctx).y.cpt+" parameters but the procedure needs "+count+" parameters."); }
				      
				}
				}
				break;
			}
			 prog.addPCode(new CAL(prog.getNbrInstruction(),prog.callProc((((CallFuncContext)_localctx).x!=null?((CallFuncContext)_localctx).x.getText():null)),prog.getNbrParam((((CallFuncContext)_localctx).x!=null?((CallFuncContext)_localctx).x.getText():null)))); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public String symbol;
		public int cpt;
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamsContext(ParserRuleContext parent, int invokingState, String symbol) {
			super(parent, invokingState);
			this.symbol = symbol;
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params(String symbol) throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState(), symbol);
		enterRule(_localctx, 50, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ParamsContext)_localctx).cpt =  0; 
			setState(371);
			param(_localctx.symbol,_localctx.cpt);
			 _localctx.cpt++; 
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(373);
				match(T__8);
				setState(374);
				param(_localctx.symbol,_localctx.cpt);
				 { _localctx.cpt ++; } 
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public String symbol;
		public int cpt;
		public AdresseContext x;
		public AdresseContext adresse() {
			return getRuleContext(AdresseContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParamContext(ParserRuleContext parent, int invokingState, String symbol, int cpt) {
			super(parent, invokingState);
			this.symbol = symbol;
			this.cpt = cpt;
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitParam(this);
		}
	}

	public final ParamContext param(String symbol,int cpt) throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState(), symbol, cpt);
		enterRule(_localctx, 52, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(382);
				if (!( prog.byValue(_localctx.symbol,_localctx.cpt) )) throw new FailedPredicateException(this, " prog.byValue($symbol,$cpt) ");
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(383);
					expr();
					}
					break;
				case 2:
					{
					setState(384);
					cond();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(387);
				((ParamContext)_localctx).x = adresse();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public AdresseContext x;
		public AdresseContext adresse() {
			return getRuleContext(AdresseContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__35);
			setState(391);
			match(T__5);
			setState(392);
			((ReadContext)_localctx).x = adresse();
			setState(393);
			match(T__6);
			 prog.addPCode(new INN()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__36);
			setState(397);
			match(T__5);
			setState(398);
			expr();
			setState(399);
			match(T__6);
			 prog.addPCode(new PRN()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public AddopContext x;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			term();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37 || _la==T__38) {
				{
				setState(403);
				((ExprContext)_localctx).x = addop();
				setState(404);
				term();
				 prog.addPCode(((ExprContext)_localctx).x.op); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddopContext extends ParserRuleContext {
		public Instruction op;
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_addop);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(T__37);
				 ((AddopContext)_localctx).op =  new ADD(); 
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(T__38);
				 ((AddopContext)_localctx).op =  new SUB(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public MulopContext x;
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			fact();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39 || _la==T__40) {
				{
				setState(416);
				((TermContext)_localctx).x = mulop();
				setState(417);
				fact();
				 prog.addPCode(((TermContext)_localctx).x.op); 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulopContext extends ParserRuleContext {
		public Instruction op;
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mulop);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__39);
				 ((MulopContext)_localctx).op =  new MUL(); 
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(T__40);
				 ((MulopContext)_localctx).op =  new DIV(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public AdresseContext adresse;
		public AdresseContext adresse() {
			return getRuleContext(AdresseContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fact);
		try {
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				((FactContext)_localctx).adresse = adresse();
				 prog.addPCode(new LDV(((FactContext)_localctx).adresse.t.size())); 
				}
				break;
			case T__38:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				integer();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(T__5);
				setState(433);
				expr();
				setState(434);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public Integer val;
		public Token i;
		public TerminalNode INT() { return getToken(PascalParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_integer);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(T__38);
				setState(439);
				((IntegerContext)_localctx).i = match(INT);
				 prog.addPCode(new LDI(- (((IntegerContext)_localctx).i!=null?Integer.valueOf(((IntegerContext)_localctx).i.getText()):0)));((IntegerContext)_localctx).val =  - (((IntegerContext)_localctx).i!=null?Integer.valueOf(((IntegerContext)_localctx).i.getText()):0); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				((IntegerContext)_localctx).i = match(INT);
				 prog.addPCode(new LDI((((IntegerContext)_localctx).i!=null?Integer.valueOf(((IntegerContext)_localctx).i.getText()):0)));((IntegerContext)_localctx).val =  (((IntegerContext)_localctx).i!=null?Integer.valueOf(((IntegerContext)_localctx).i.getText()):0); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileDoContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public WhileDoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterWhileDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitWhileDo(this);
		}
	}

	public final WhileDoContext whileDo() throws RecognitionException {
		WhileDoContext _localctx = new WhileDoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_whileDo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__41);
			 int debut = prog.getNbrInstruction(); 
			setState(447);
			cond();
			 BZE bze = new BZE(); prog.addPCode(bze); 
			setState(449);
			match(T__42);
			setState(450);
			insts();

			            prog.addPCode(new BRN(debut));
			            bze.setJump(prog.getNbrInstruction());
			          
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatUntilContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public RepeatUntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatUntil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRepeatUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRepeatUntil(this);
		}
	}

	public final RepeatUntilContext repeatUntil() throws RecognitionException {
		RepeatUntilContext _localctx = new RepeatUntilContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_repeatUntil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__43);
			int begin = prog.getNbrInstruction();
			setState(455);
			inst();
			setState(456);
			match(T__44);
			setState(457);
			cond();

			    BRN brn = new BRN();
			    prog.addPCode(Arrays.asList(new Instruction[]{new BZE(begin), brn}));
			    brn.setJump(prog.getNbrInstruction());

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDoContext extends ParserRuleContext {
		public AdresseContext adr;
		public ExprContext x;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstsContext insts() {
			return getRuleContext(InstsContext.class,0);
		}
		public AdresseContext adresse() {
			return getRuleContext(AdresseContext.class,0);
		}
		public ForDoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterForDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitForDo(this);
		}
	}

	public final ForDoContext forDo() throws RecognitionException {
		ForDoContext _localctx = new ForDoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forDo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__45);
			setState(461);
			((ForDoContext)_localctx).adr = adresse();
			setState(462);
			match(T__30);
			setState(463);
			expr();

			   prog.addPCode(new STO(1));
			   int debut = prog.getNbrInstruction();
			   Instruction comp;
			   Instruction op;

			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(465);
				match(T__46);
				 comp = new GTR(); op = new ADD(); 
				}
				break;
			case T__47:
				{
				setState(467);
				match(T__47);
				 comp = new LSS(); op = new SUB(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(471);
			((ForDoContext)_localctx).x = expr();

			   BZE bze = new BZE();
			   prog.addPCode(Arrays.asList(new Instruction[]{new LDA(((ForDoContext)_localctx).adr.ad),new LDV(1),comp,bze}));

			setState(473);
			match(T__42);
			setState(474);
			insts();

			    prog.addPCode(Arrays.asList(new Instruction[]{new LDA(((ForDoContext)_localctx).adr.ad),new LDA(((ForDoContext)_localctx).adr.ad),new LDV(1),new LDI(1),op,
			                                                  new STO(1),new BRN(debut)}));
			    bze.setJump(prog.getNbrInstruction());

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdresseContext extends ParserRuleContext {
		public int ad;
		public Type t;
		public Token x;
		public Token c;
		public List<TerminalNode> ID() { return getTokens(PascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PascalParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdresseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adresse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAdresse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAdresse(this);
		}
	}

	public final AdresseContext adresse() throws RecognitionException {
		AdresseContext _localctx = new AdresseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_adresse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			((AdresseContext)_localctx).x = match(ID);

			    Data elem = prog.getData((((AdresseContext)_localctx).x!=null?((AdresseContext)_localctx).x.getText():null),VARIABLE,PARAMETER);
			    ((AdresseContext)_localctx).ad =  elem.getAdr() + prog.shiftCurrentProc();

			    if(elem.getType() instanceof Parameter){
			        ((AdresseContext)_localctx).t =  ((Parameter)elem.getType()).getType();

			        ((AdresseContext)_localctx).ad =   prog.getPosParameter((((AdresseContext)_localctx).x!=null?((AdresseContext)_localctx).x.getText():null));
			        prog.addPCode(new LDL(_localctx.ad));

			        if(elem.getType() instanceof Parameter && ((Parameter)elem.getType()).isReference())
			                prog.addPCode(new LDV(1));

			     }else{
			        ((AdresseContext)_localctx).t =  elem.getType();
			         prog.addPCode(new LDA(_localctx.ad));
			     }

			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__16) {
				{
				setState(487);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(479);
					match(T__16);
					setState(480);
					expr();
					setState(481);
					match(T__18);

					    prog.addPCode(new LDI(prog.getBeginList((((AdresseContext)_localctx).x!=null?((AdresseContext)_localctx).x.getText():null),_localctx.t)));
					    ((AdresseContext)_localctx).t =  prog.getTypeElemList((((AdresseContext)_localctx).x!=null?((AdresseContext)_localctx).x.getText():null),_localctx.t);
					    prog.addPCode(Arrays.asList(new Instruction[]{new SUB(),new ADD()}));

					}
					break;
				case T__2:
					{
					setState(484);
					match(T__2);
					setState(485);
					((AdresseContext)_localctx).c = match(ID);

					    Data subElem = prog.getSubElementData((((AdresseContext)_localctx).x!=null?((AdresseContext)_localctx).x.getText():null),(((AdresseContext)_localctx).c!=null?((AdresseContext)_localctx).c.getText():null));
					    ((AdresseContext)_localctx).t =  subElem.getType();
					    prog.addPCode(Arrays.asList(new Instruction[]{new LDI(subElem.getAdr()),new ADD()}));

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return affect_sempred((AffectContext)_localctx, predIndex);
		case 24:
			return callFunc_sempred((CallFuncContext)_localctx, predIndex);
		case 26:
			return param_sempred((ParamContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean affect_sempred(AffectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return prog.isBoolean(((AffectContext)_localctx).x.t);
		}
		return true;
	}
	private boolean callFunc_sempred(CallFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  prog.hasNoParam((((CallFuncContext)_localctx).x!=null?((CallFuncContext)_localctx).x.getText():null)) ;
		}
		return true;
	}
	private boolean param_sempred(ParamContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  prog.byValue(_localctx.symbol,_localctx.cpt) ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f\4"+
		"\16\4g\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5q\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00a2"+
		"\n\t\r\t\16\t\u00a3\3\n\3\n\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00b4\n\13\f\13\16\13\u00b7\13\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00d5\n\f\r\f\16"+
		"\f\u00d6\3\f\3\f\3\f\3\f\3\f\5\f\u00de\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\6\16\u00ea\n\16\r\16\16\16\u00eb\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fa\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u010a"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0119\n\22\3\23\3\23\3\23\3\23\5\23\u011f\n\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\5\25\u0128\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0136\n\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u013d\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u014a\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0161\n\31\f\31\16"+
		"\31\u0164\13\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0171\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u017c"+
		"\n\33\f\33\16\33\u017f\13\33\3\34\3\34\3\34\5\34\u0184\n\34\3\34\5\34"+
		"\u0187\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u019a\n\37\3 \3 \3 \3 \5 \u01a0\n \3!\3"+
		"!\3!\3!\3!\5!\u01a7\n!\3\"\3\"\3\"\3\"\5\"\u01ad\n\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u01b7\n#\3$\3$\3$\3$\3$\5$\u01be\n$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d8\n"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u01ea\n(\f"+
		"(\16(\u01ed\13(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLN\2\2\2\u01fc\2P\3\2\2\2\4W\3\2\2\2\6^\3\2\2"+
		"\2\bh\3\2\2\2\nz\3\2\2\2\f\u0082\3\2\2\2\16\u0098\3\2\2\2\20\u00a1\3\2"+
		"\2\2\22\u00ab\3\2\2\2\24\u00ae\3\2\2\2\26\u00dd\3\2\2\2\30\u00df\3\2\2"+
		"\2\32\u00e5\3\2\2\2\34\u00f9\3\2\2\2\36\u0102\3\2\2\2 \u0104\3\2\2\2\""+
		"\u0118\3\2\2\2$\u011e\3\2\2\2&\u0120\3\2\2\2(\u0127\3\2\2\2*\u0135\3\2"+
		"\2\2,\u0137\3\2\2\2.\u0140\3\2\2\2\60\u014d\3\2\2\2\62\u0168\3\2\2\2\64"+
		"\u0174\3\2\2\2\66\u0186\3\2\2\28\u0188\3\2\2\2:\u018e\3\2\2\2<\u0194\3"+
		"\2\2\2>\u019f\3\2\2\2@\u01a1\3\2\2\2B\u01ac\3\2\2\2D\u01b6\3\2\2\2F\u01bd"+
		"\3\2\2\2H\u01bf\3\2\2\2J\u01c7\3\2\2\2L\u01ce\3\2\2\2N\u01df\3\2\2\2P"+
		"Q\7\3\2\2QR\7\65\2\2RS\7\4\2\2ST\5\4\3\2TU\7\5\2\2UV\b\2\1\2V\3\3\2\2"+
		"\2WX\5\16\b\2XY\5\22\n\2YZ\b\3\1\2Z[\5\6\4\2[\\\b\3\1\2\\]\5\32\16\2]"+
		"\5\3\2\2\2^e\b\4\1\2_`\5\b\5\2`a\b\4\1\2ab\7\6\2\2bd\3\2\2\2c_\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hi\7\7\2\2ij\7\65\2"+
		"\2jp\b\5\1\2kl\7\b\2\2lm\5\n\6\2mn\7\t\2\2nq\3\2\2\2oq\7\n\2\2pk\3\2\2"+
		"\2po\3\2\2\2qr\3\2\2\2rs\7\4\2\2st\5\16\b\2tu\5\22\n\2uv\b\5\1\2vw\5\6"+
		"\4\2wx\5\32\16\2xy\b\5\1\2y\t\3\2\2\2z\177\5\f\7\2{|\7\13\2\2|~\5\f\7"+
		"\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\13\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0082\u008e\b\7\1\2\u0083\u0084\7\f\2\2\u0084"+
		"\u0085\7\65\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5\26\f\2\u0087\u0088\b"+
		"\7\1\2\u0088\u008f\3\2\2\2\u0089\u008a\7\65\2\2\u008a\u008b\7\4\2\2\u008b"+
		"\u008c\5\26\f\2\u008c\u008d\b\7\1\2\u008d\u008f\3\2\2\2\u008e\u0083\3"+
		"\2\2\2\u008e\u0089\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\7\1\2\u0091"+
		"\r\3\2\2\2\u0092\u0093\7\r\2\2\u0093\u0094\5\20\t\2\u0094\u0095\7\16\2"+
		"\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\17\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009c\7\66\2\2\u009c\u009d\7\17\2\2\u009d\u009e\5\26\f\2\u009e\u009f"+
		"\b\t\1\2\u009f\u00a0\7\6\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2"+
		"\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7\6\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af"+
		"\7\65\2\2\u00af\u00b5\b\13\1\2\u00b0\u00b1\7\13\2\2\u00b1\u00b2\7\65\2"+
		"\2\u00b2\u00b4\b\13\1\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\b\13\1\2\u00bb"+
		"\25\3\2\2\2\u00bc\u00bd\7\20\2\2\u00bd\u00de\b\f\1\2\u00be\u00bf\7\21"+
		"\2\2\u00bf\u00de\b\f\1\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\b\f\1\2\u00c2"+
		"\u00c7\7\23\2\2\u00c3\u00c4\5F$\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\b\f"+
		"\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\5F$\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\26"+
		"\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce\b\f\1\2\u00ce\u00de\3\2\2\2\u00cf"+
		"\u00d0\7\27\2\2\u00d0\u00d4\b\f\1\2\u00d1\u00d2\5\30\r\2\u00d2\u00d3\b"+
		"\f\1\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\16"+
		"\2\2\u00d9\u00da\b\f\1\2\u00da\u00de\3\2\2\2\u00db\u00dc\7\66\2\2\u00dc"+
		"\u00de\b\f\1\2\u00dd\u00bc\3\2\2\2\u00dd\u00be\3\2\2\2\u00dd\u00c0\3\2"+
		"\2\2\u00dd\u00cf\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\27\3\2\2\2\u00df\u00e0"+
		"\7\65\2\2\u00e0\u00e1\7\4\2\2\u00e1\u00e2\5\26\f\2\u00e2\u00e3\7\6\2\2"+
		"\u00e3\u00e4\b\r\1\2\u00e4\31\3\2\2\2\u00e5\u00e9\7\30\2\2\u00e6\u00e7"+
		"\5\34\17\2\u00e7\u00e8\7\6\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\7\16\2\2\u00ee\33\3\2\2\2\u00ef\u00fa\5\32\16\2\u00f0"+
		"\u00fa\5,\27\2\u00f1\u00fa\5.\30\2\u00f2\u00fa\58\35\2\u00f3\u00fa\5:"+
		"\36\2\u00f4\u00fa\5L\'\2\u00f5\u00fa\5H%\2\u00f6\u00fa\5\60\31\2\u00f7"+
		"\u00fa\5J&\2\u00f8\u00fa\5\62\32\2\u00f9\u00ef\3\2\2\2\u00f9\u00f0\3\2"+
		"\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9"+
		"\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00f8\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u0103\5 \21\2\u00fc\u00fd"+
		"\5&\24\2\u00fd\u00fe\7\b\2\2\u00fe\u00ff\5 \21\2\u00ff\u0100\7\t\2\2\u0100"+
		"\u0101\b\20\1\2\u0101\u0103\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3"+
		"\2\2\2\u0103\37\3\2\2\2\u0104\u0109\5\"\22\2\u0105\u0106\5(\25\2\u0106"+
		"\u0107\5\"\22\2\u0107\u0108\b\21\1\2\u0108\u010a\3\2\2\2\u0109\u0105\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a!\3\2\2\2\u010b\u0119\5$\23\2\u010c\u010d"+
		"\5<\37\2\u010d\u010e\5*\26\2\u010e\u010f\5<\37\2\u010f\u0110\b\22\1\2"+
		"\u0110\u0119\3\2\2\2\u0111\u0112\5N(\2\u0112\u0113\b\22\1\2\u0113\u0119"+
		"\3\2\2\2\u0114\u0115\7\b\2\2\u0115\u0116\5\36\20\2\u0116\u0117\7\t\2\2"+
		"\u0117\u0119\3\2\2\2\u0118\u010b\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u0111"+
		"\3\2\2\2\u0118\u0114\3\2\2\2\u0119#\3\2\2\2\u011a\u011b\7\63\2\2\u011b"+
		"\u011f\b\23\1\2\u011c\u011d\7\64\2\2\u011d\u011f\b\23\1\2\u011e\u011a"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f%\3\2\2\2\u0120\u0121\7\31\2\2\u0121"+
		"\u0122\b\24\1\2\u0122\'\3\2\2\2\u0123\u0124\7\32\2\2\u0124\u0128\b\25"+
		"\1\2\u0125\u0126\7\33\2\2\u0126\u0128\b\25\1\2\u0127\u0123\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128)\3\2\2\2\u0129\u012a\7\17\2\2\u012a\u0136\b\26\1"+
		"\2\u012b\u012c\7\34\2\2\u012c\u0136\b\26\1\2\u012d\u012e\7\35\2\2\u012e"+
		"\u0136\b\26\1\2\u012f\u0130\7\36\2\2\u0130\u0136\b\26\1\2\u0131\u0132"+
		"\7\37\2\2\u0132\u0136\b\26\1\2\u0133\u0134\7 \2\2\u0134\u0136\b\26\1\2"+
		"\u0135\u0129\3\2\2\2\u0135\u012b\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u012f"+
		"\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0133\3\2\2\2\u0136+\3\2\2\2\u0137"+
		"\u0138\5N(\2\u0138\u013c\7!\2\2\u0139\u013a\6\27\2\3\u013a\u013d\5\36"+
		"\20\2\u013b\u013d\5<\37\2\u013c\u0139\3\2\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\b\27\1\2\u013f-\3\2\2\2\u0140\u0141\b\30\1"+
		"\2\u0141\u0142\7\"\2\2\u0142\u0143\5\36\20\2\u0143\u0144\b\30\1\2\u0144"+
		"\u0145\7#\2\2\u0145\u0146\5\34\17\2\u0146\u0149\b\30\1\2\u0147\u0148\7"+
		"$\2\2\u0148\u014a\5\34\17\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\b\30\1\2\u014c/\3\2\2\2\u014d\u014e\7%\2\2"+
		"\u014e\u014f\b\31\1\2\u014f\u0150\5<\37\2\u0150\u0151\b\31\1\2\u0151\u0152"+
		"\7\26\2\2\u0152\u0153\5<\37\2\u0153\u0154\b\31\1\2\u0154\u0155\7\4\2\2"+
		"\u0155\u0156\5\34\17\2\u0156\u0157\b\31\1\2\u0157\u0162\7\6\2\2\u0158"+
		"\u0159\b\31\1\2\u0159\u015a\5<\37\2\u015a\u015b\b\31\1\2\u015b\u015c\7"+
		"\4\2\2\u015c\u015d\5\34\17\2\u015d\u015e\b\31\1\2\u015e\u015f\7\6\2\2"+
		"\u015f\u0161\3\2\2\2\u0160\u0158\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\b\31\1\2\u0166\u0167\7\16\2\2\u0167\61\3\2\2\2\u0168\u0170\7\65"+
		"\2\2\u0169\u016a\6\32\3\3\u016a\u0171\7\n\2\2\u016b\u016c\7\b\2\2\u016c"+
		"\u016d\5\64\33\2\u016d\u016e\7\t\2\2\u016e\u016f\b\32\1\2\u016f\u0171"+
		"\3\2\2\2\u0170\u0169\3\2\2\2\u0170\u016b\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\b\32\1\2\u0173\63\3\2\2\2\u0174\u0175\b\33\1\2\u0175\u0176\5\66"+
		"\34\2\u0176\u017d\b\33\1\2\u0177\u0178\7\13\2\2\u0178\u0179\5\66\34\2"+
		"\u0179\u017a\b\33\1\2\u017a\u017c\3\2\2\2\u017b\u0177\3\2\2\2\u017c\u017f"+
		"\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\65\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0183\6\34\4\3\u0181\u0184\5<\37\2\u0182\u0184\5"+
		"\36\20\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0187\5N(\2\u0186\u0180\3\2\2\2\u0186\u0185\3\2\2\2\u0187\67\3\2\2\2"+
		"\u0188\u0189\7&\2\2\u0189\u018a\7\b\2\2\u018a\u018b\5N(\2\u018b\u018c"+
		"\7\t\2\2\u018c\u018d\b\35\1\2\u018d9\3\2\2\2\u018e\u018f\7\'\2\2\u018f"+
		"\u0190\7\b\2\2\u0190\u0191\5<\37\2\u0191\u0192\7\t\2\2\u0192\u0193\b\36"+
		"\1\2\u0193;\3\2\2\2\u0194\u0199\5@!\2\u0195\u0196\5> \2\u0196\u0197\5"+
		"@!\2\u0197\u0198\b\37\1\2\u0198\u019a\3\2\2\2\u0199\u0195\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a=\3\2\2\2\u019b\u019c\7(\2\2\u019c\u01a0\b \1\2\u019d"+
		"\u019e\7)\2\2\u019e\u01a0\b \1\2\u019f\u019b\3\2\2\2\u019f\u019d\3\2\2"+
		"\2\u01a0?\3\2\2\2\u01a1\u01a6\5D#\2\u01a2\u01a3\5B\"\2\u01a3\u01a4\5D"+
		"#\2\u01a4\u01a5\b!\1\2\u01a5\u01a7\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7A\3\2\2\2\u01a8\u01a9\7*\2\2\u01a9\u01ad\b\"\1\2\u01aa\u01ab"+
		"\7+\2\2\u01ab\u01ad\b\"\1\2\u01ac\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad"+
		"C\3\2\2\2\u01ae\u01af\5N(\2\u01af\u01b0\b#\1\2\u01b0\u01b7\3\2\2\2\u01b1"+
		"\u01b7\5F$\2\u01b2\u01b3\7\b\2\2\u01b3\u01b4\5<\37\2\u01b4\u01b5\7\t\2"+
		"\2\u01b5\u01b7\3\2\2\2\u01b6\u01ae\3\2\2\2\u01b6\u01b1\3\2\2\2\u01b6\u01b2"+
		"\3\2\2\2\u01b7E\3\2\2\2\u01b8\u01b9\7)\2\2\u01b9\u01ba\7\67\2\2\u01ba"+
		"\u01be\b$\1\2\u01bb\u01bc\7\67\2\2\u01bc\u01be\b$\1\2\u01bd\u01b8\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01beG\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c1"+
		"\b%\1\2\u01c1\u01c2\5\36\20\2\u01c2\u01c3\b%\1\2\u01c3\u01c4\7-\2\2\u01c4"+
		"\u01c5\5\32\16\2\u01c5\u01c6\b%\1\2\u01c6I\3\2\2\2\u01c7\u01c8\7.\2\2"+
		"\u01c8\u01c9\b&\1\2\u01c9\u01ca\5\34\17\2\u01ca\u01cb\7/\2\2\u01cb\u01cc"+
		"\5\36\20\2\u01cc\u01cd\b&\1\2\u01cdK\3\2\2\2\u01ce\u01cf\7\60\2\2\u01cf"+
		"\u01d0\5N(\2\u01d0\u01d1\7!\2\2\u01d1\u01d2\5<\37\2\u01d2\u01d7\b\'\1"+
		"\2\u01d3\u01d4\7\61\2\2\u01d4\u01d8\b\'\1\2\u01d5\u01d6\7\62\2\2\u01d6"+
		"\u01d8\b\'\1\2\u01d7\u01d3\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01da\5<\37\2\u01da\u01db\b\'\1\2\u01db\u01dc\7-\2\2\u01dc"+
		"\u01dd\5\32\16\2\u01dd\u01de\b\'\1\2\u01deM\3\2\2\2\u01df\u01e0\7\65\2"+
		"\2\u01e0\u01eb\b(\1\2\u01e1\u01e2\7\23\2\2\u01e2\u01e3\5<\37\2\u01e3\u01e4"+
		"\7\25\2\2\u01e4\u01e5\b(\1\2\u01e5\u01ea\3\2\2\2\u01e6\u01e7\7\5\2\2\u01e7"+
		"\u01e8\7\65\2\2\u01e8\u01ea\b(\1\2\u01e9\u01e1\3\2\2\2\u01e9\u01e6\3\2"+
		"\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"O\3\2\2\2\u01ed\u01eb\3\2\2\2%ep\177\u008e\u0098\u00a3\u00ab\u00b5\u00c7"+
		"\u00d6\u00dd\u00eb\u00f9\u0102\u0109\u0118\u011e\u0127\u0135\u013c\u0149"+
		"\u0162\u0170\u017d\u0183\u0186\u0199\u019f\u01a6\u01ac\u01b6\u01bd\u01d7"+
		"\u01e9\u01eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
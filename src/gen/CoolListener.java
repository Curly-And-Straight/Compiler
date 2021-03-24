package gen;// Generated from D:/8th term/Compiler/Proj/1st_project/grammar\Cool.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classdec}.
	 * @param ctx the parse tree
	 */
	void enterClassdec(CoolParser.ClassdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classdec}.
	 * @param ctx the parse tree
	 */
	void exitClassdec(CoolParser.ClassdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#entryClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEntryClassDeclaration(CoolParser.EntryClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#entryClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEntryClassDeclaration(CoolParser.EntryClassDeclarationContext ctx);
}
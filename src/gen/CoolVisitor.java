package gen;// Generated from D:/8th term/Compiler/Proj/1st_project/grammar\Cool.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CoolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#classdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdec(CoolParser.ClassdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CoolParser#entryClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryClassDeclaration(CoolParser.EntryClassDeclarationContext ctx);
}
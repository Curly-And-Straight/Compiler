package compiler;

import gen.CoolListener;
import gen.CoolParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ProgramPrinter implements CoolListener {

    @Override
    public void enterStart(CoolParser.StartContext ctx) {

    }

    @Override
    public void exitStart(CoolParser.StartContext ctx) {

    }

    @Override
    public void enterClassDef(CoolParser.ClassDefContext ctx) {

    }

    @Override
    public void exitClassDef(CoolParser.ClassDefContext ctx) {

    }

    @Override
    public void enterFunction(CoolParser.FunctionContext ctx) {

    }

    @Override
    public void exitFunction(CoolParser.FunctionContext ctx) {

    }

    @Override
    public void enterVarDef(CoolParser.VarDefContext ctx) {

    }

    @Override
    public void exitVarDef(CoolParser.VarDefContext ctx) {

    }

    @Override
    public void enterParam(CoolParser.ParamContext ctx) {

    }

    @Override
    public void exitParam(CoolParser.ParamContext ctx) {

    }

    @Override
    public void enterSub(CoolParser.SubContext ctx) {

    }

    @Override
    public void exitSub(CoolParser.SubContext ctx) {

    }

    @Override
    public void enterString(CoolParser.StringContext ctx) {

        System.out.println(ctx.getText());
    }

    @Override
    public void exitString(CoolParser.StringContext ctx) {

    }

    @Override
    public void enterMul(CoolParser.MulContext ctx) {

    }

    @Override
    public void exitMul(CoolParser.MulContext ctx) {

    }

    @Override
    public void enterLteq(CoolParser.LteqContext ctx) {

    }

    @Override
    public void exitLteq(CoolParser.LteqContext ctx) {

    }

    @Override
    public void enterNum(CoolParser.NumContext ctx) {

    }

    @Override
    public void exitNum(CoolParser.NumContext ctx) {

    }

    @Override
    public void enterStaticCall(CoolParser.StaticCallContext ctx) {

    }

    @Override
    public void exitStaticCall(CoolParser.StaticCallContext ctx) {

    }

    @Override
    public void enterLt(CoolParser.LtContext ctx) {

    }

    @Override
    public void exitLt(CoolParser.LtContext ctx) {

    }

    @Override
    public void enterWhile(CoolParser.WhileContext ctx) {

    }

    @Override
    public void exitWhile(CoolParser.WhileContext ctx) {

    }

    @Override
    public void enterSwitch(CoolParser.SwitchContext ctx) {

    }

    @Override
    public void exitSwitch(CoolParser.SwitchContext ctx) {

    }

    @Override
    public void enterDiv(CoolParser.DivContext ctx) {

    }

    @Override
    public void exitDiv(CoolParser.DivContext ctx) {

    }

    @Override
    public void enterNot(CoolParser.NotContext ctx) {

    }

    @Override
    public void exitNot(CoolParser.NotContext ctx) {

    }

    @Override
    public void enterNewObject(CoolParser.NewObjectContext ctx) {

    }

    @Override
    public void exitNewObject(CoolParser.NewObjectContext ctx) {

    }

    @Override
    public void enterBlock(CoolParser.BlockContext ctx) {

    }

    @Override
    public void exitBlock(CoolParser.BlockContext ctx) {

    }

    @Override
    public void enterLet(CoolParser.LetContext ctx) {

    }

    @Override
    public void exitLet(CoolParser.LetContext ctx) {

    }

    @Override
    public void enterId(CoolParser.IdContext ctx) {

    }

    @Override
    public void exitId(CoolParser.IdContext ctx) {

    }

    @Override
    public void enterIf(CoolParser.IfContext ctx) {

    }

    @Override
    public void exitIf(CoolParser.IfContext ctx) {

    }

    @Override
    public void enterAdd(CoolParser.AddContext ctx) {

    }

    @Override
    public void exitAdd(CoolParser.AddContext ctx) {

    }

    @Override
    public void enterVoid(CoolParser.VoidContext ctx) {

    }

    @Override
    public void exitVoid(CoolParser.VoidContext ctx) {

    }

    @Override
    public void enterInvert(CoolParser.InvertContext ctx) {

    }

    @Override
    public void exitInvert(CoolParser.InvertContext ctx) {

    }

    @Override
    public void enterFactExpr(CoolParser.FactExprContext ctx) {

    }

    @Override
    public void exitFactExpr(CoolParser.FactExprContext ctx) {

    }

    @Override
    public void enterFalse(CoolParser.FalseContext ctx) {

    }

    @Override
    public void exitFalse(CoolParser.FalseContext ctx) {

    }

    @Override
    public void enterEqual(CoolParser.EqualContext ctx) {

    }

    @Override
    public void exitEqual(CoolParser.EqualContext ctx) {

    }

    @Override
    public void enterObjectCall(CoolParser.ObjectCallContext ctx) {

    }

    @Override
    public void exitObjectCall(CoolParser.ObjectCallContext ctx) {

    }

    @Override
    public void enterTrue(CoolParser.TrueContext ctx) {

    }

    @Override
    public void exitTrue(CoolParser.TrueContext ctx) {

    }

    @Override
    public void enterAssign(CoolParser.AssignContext ctx) {

    }

    @Override
    public void exitAssign(CoolParser.AssignContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}

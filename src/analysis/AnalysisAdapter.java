/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAModule(AModule node)
    {
        defaultCase(node);
    }

    public void caseAModuledecl(AModuledecl node)
    {
        defaultCase(node);
    }

    public void caseAStdImport(AStdImport node)
    {
        defaultCase(node);
    }

    public void caseANoImport(ANoImport node)
    {
        defaultCase(node);
    }

    public void caseAPublicVisibility(APublicVisibility node)
    {
        defaultCase(node);
    }

    public void caseAPrivateVisibility(APrivateVisibility node)
    {
        defaultCase(node);
    }

    public void caseAProtectedVisibility(AProtectedVisibility node)
    {
        defaultCase(node);
    }

    public void caseAIntrudeVisibility(AIntrudeVisibility node)
    {
        defaultCase(node);
    }

    public void caseAStdClassdef(AStdClassdef node)
    {
        defaultCase(node);
    }

    public void caseATopClassdef(ATopClassdef node)
    {
        defaultCase(node);
    }

    public void caseAMainClassdef(AMainClassdef node)
    {
        defaultCase(node);
    }

    public void caseAConcreteClasskind(AConcreteClasskind node)
    {
        defaultCase(node);
    }

    public void caseAAbstractClasskind(AAbstractClasskind node)
    {
        defaultCase(node);
    }

    public void caseAInterfaceClasskind(AInterfaceClasskind node)
    {
        defaultCase(node);
    }

    public void caseAEnumClasskind(AEnumClasskind node)
    {
        defaultCase(node);
    }

    public void caseAFormaldef(AFormaldef node)
    {
        defaultCase(node);
    }

    public void caseASuperclass(ASuperclass node)
    {
        defaultCase(node);
    }

    public void caseAAttrPropdef(AAttrPropdef node)
    {
        defaultCase(node);
    }

    public void caseAMethPropdef(AMethPropdef node)
    {
        defaultCase(node);
    }

    public void caseADeferredMethPropdef(ADeferredMethPropdef node)
    {
        defaultCase(node);
    }

    public void caseAInternMethPropdef(AInternMethPropdef node)
    {
        defaultCase(node);
    }

    public void caseAExternMethPropdef(AExternMethPropdef node)
    {
        defaultCase(node);
    }

    public void caseAConcreteMethPropdef(AConcreteMethPropdef node)
    {
        defaultCase(node);
    }

    public void caseAConcreteInitPropdef(AConcreteInitPropdef node)
    {
        defaultCase(node);
    }

    public void caseAMainMethPropdef(AMainMethPropdef node)
    {
        defaultCase(node);
    }

    public void caseATypePropdef(ATypePropdef node)
    {
        defaultCase(node);
    }

    public void caseAReadAble(AReadAble node)
    {
        defaultCase(node);
    }

    public void caseAWriteAble(AWriteAble node)
    {
        defaultCase(node);
    }

    public void caseAIdMethid(AIdMethid node)
    {
        defaultCase(node);
    }

    public void caseAPlusMethid(APlusMethid node)
    {
        defaultCase(node);
    }

    public void caseAMinusMethid(AMinusMethid node)
    {
        defaultCase(node);
    }

    public void caseAStarMethid(AStarMethid node)
    {
        defaultCase(node);
    }

    public void caseASlashMethid(ASlashMethid node)
    {
        defaultCase(node);
    }

    public void caseAPercentMethid(APercentMethid node)
    {
        defaultCase(node);
    }

    public void caseAEqMethid(AEqMethid node)
    {
        defaultCase(node);
    }

    public void caseANeMethid(ANeMethid node)
    {
        defaultCase(node);
    }

    public void caseALeMethid(ALeMethid node)
    {
        defaultCase(node);
    }

    public void caseAGeMethid(AGeMethid node)
    {
        defaultCase(node);
    }

    public void caseALtMethid(ALtMethid node)
    {
        defaultCase(node);
    }

    public void caseAGtMethid(AGtMethid node)
    {
        defaultCase(node);
    }

    public void caseALlMethid(ALlMethid node)
    {
        defaultCase(node);
    }

    public void caseAGgMethid(AGgMethid node)
    {
        defaultCase(node);
    }

    public void caseABraMethid(ABraMethid node)
    {
        defaultCase(node);
    }

    public void caseAStarshipMethid(AStarshipMethid node)
    {
        defaultCase(node);
    }

    public void caseAAssignMethid(AAssignMethid node)
    {
        defaultCase(node);
    }

    public void caseABraassignMethid(ABraassignMethid node)
    {
        defaultCase(node);
    }

    public void caseASignature(ASignature node)
    {
        defaultCase(node);
    }

    public void caseAParam(AParam node)
    {
        defaultCase(node);
    }

    public void caseAClosureDecl(AClosureDecl node)
    {
        defaultCase(node);
    }

    public void caseAType(AType node)
    {
        defaultCase(node);
    }

    public void caseALabel(ALabel node)
    {
        defaultCase(node);
    }

    public void caseABlockExpr(ABlockExpr node)
    {
        defaultCase(node);
    }

    public void caseAVardeclExpr(AVardeclExpr node)
    {
        defaultCase(node);
    }

    public void caseAReturnExpr(AReturnExpr node)
    {
        defaultCase(node);
    }

    public void caseABreakExpr(ABreakExpr node)
    {
        defaultCase(node);
    }

    public void caseAAbortExpr(AAbortExpr node)
    {
        defaultCase(node);
    }

    public void caseAContinueExpr(AContinueExpr node)
    {
        defaultCase(node);
    }

    public void caseADoExpr(ADoExpr node)
    {
        defaultCase(node);
    }

    public void caseAIfExpr(AIfExpr node)
    {
        defaultCase(node);
    }

    public void caseAIfexprExpr(AIfexprExpr node)
    {
        defaultCase(node);
    }

    public void caseAWhileExpr(AWhileExpr node)
    {
        defaultCase(node);
    }

    public void caseALoopExpr(ALoopExpr node)
    {
        defaultCase(node);
    }

    public void caseAForExpr(AForExpr node)
    {
        defaultCase(node);
    }

    public void caseAAssertExpr(AAssertExpr node)
    {
        defaultCase(node);
    }

    public void caseAOnceExpr(AOnceExpr node)
    {
        defaultCase(node);
    }

    public void caseASendExpr(ASendExpr node)
    {
        defaultCase(node);
    }

    public void caseABinopExpr(ABinopExpr node)
    {
        defaultCase(node);
    }

    public void caseAOrExpr(AOrExpr node)
    {
        defaultCase(node);
    }

    public void caseAAndExpr(AAndExpr node)
    {
        defaultCase(node);
    }

    public void caseAOrElseExpr(AOrElseExpr node)
    {
        defaultCase(node);
    }

    public void caseANotExpr(ANotExpr node)
    {
        defaultCase(node);
    }

    public void caseAEqExpr(AEqExpr node)
    {
        defaultCase(node);
    }

    public void caseAEeExpr(AEeExpr node)
    {
        defaultCase(node);
    }

    public void caseANeExpr(ANeExpr node)
    {
        defaultCase(node);
    }

    public void caseALtExpr(ALtExpr node)
    {
        defaultCase(node);
    }

    public void caseALeExpr(ALeExpr node)
    {
        defaultCase(node);
    }

    public void caseALlExpr(ALlExpr node)
    {
        defaultCase(node);
    }

    public void caseAGtExpr(AGtExpr node)
    {
        defaultCase(node);
    }

    public void caseAGeExpr(AGeExpr node)
    {
        defaultCase(node);
    }

    public void caseAGgExpr(AGgExpr node)
    {
        defaultCase(node);
    }

    public void caseAIsaExpr(AIsaExpr node)
    {
        defaultCase(node);
    }

    public void caseAPlusExpr(APlusExpr node)
    {
        defaultCase(node);
    }

    public void caseAMinusExpr(AMinusExpr node)
    {
        defaultCase(node);
    }

    public void caseAStarshipExpr(AStarshipExpr node)
    {
        defaultCase(node);
    }

    public void caseAStarExpr(AStarExpr node)
    {
        defaultCase(node);
    }

    public void caseASlashExpr(ASlashExpr node)
    {
        defaultCase(node);
    }

    public void caseAPercentExpr(APercentExpr node)
    {
        defaultCase(node);
    }

    public void caseAUminusExpr(AUminusExpr node)
    {
        defaultCase(node);
    }

    public void caseANewExpr(ANewExpr node)
    {
        defaultCase(node);
    }

    public void caseAAttrExpr(AAttrExpr node)
    {
        defaultCase(node);
    }

    public void caseAAttrAssignExpr(AAttrAssignExpr node)
    {
        defaultCase(node);
    }

    public void caseAAttrReassignExpr(AAttrReassignExpr node)
    {
        defaultCase(node);
    }

    public void caseACallExpr(ACallExpr node)
    {
        defaultCase(node);
    }

    public void caseACallAssignExpr(ACallAssignExpr node)
    {
        defaultCase(node);
    }

    public void caseACallReassignExpr(ACallReassignExpr node)
    {
        defaultCase(node);
    }

    public void caseASuperExpr(ASuperExpr node)
    {
        defaultCase(node);
    }

    public void caseAInitExpr(AInitExpr node)
    {
        defaultCase(node);
    }

    public void caseABraExpr(ABraExpr node)
    {
        defaultCase(node);
    }

    public void caseABraAssignExpr(ABraAssignExpr node)
    {
        defaultCase(node);
    }

    public void caseABraReassignExpr(ABraReassignExpr node)
    {
        defaultCase(node);
    }

    public void caseAClosureCallExpr(AClosureCallExpr node)
    {
        defaultCase(node);
    }

    public void caseAVarExpr(AVarExpr node)
    {
        defaultCase(node);
    }

    public void caseAVarAssignExpr(AVarAssignExpr node)
    {
        defaultCase(node);
    }

    public void caseAVarReassignExpr(AVarReassignExpr node)
    {
        defaultCase(node);
    }

    public void caseARangeExpr(ARangeExpr node)
    {
        defaultCase(node);
    }

    public void caseACrangeExpr(ACrangeExpr node)
    {
        defaultCase(node);
    }

    public void caseAOrangeExpr(AOrangeExpr node)
    {
        defaultCase(node);
    }

    public void caseAArrayExpr(AArrayExpr node)
    {
        defaultCase(node);
    }

    public void caseASelfExpr(ASelfExpr node)
    {
        defaultCase(node);
    }

    public void caseAImplicitSelfExpr(AImplicitSelfExpr node)
    {
        defaultCase(node);
    }

    public void caseATrueExpr(ATrueExpr node)
    {
        defaultCase(node);
    }

    public void caseAFalseExpr(AFalseExpr node)
    {
        defaultCase(node);
    }

    public void caseANullExpr(ANullExpr node)
    {
        defaultCase(node);
    }

    public void caseAIntExpr(AIntExpr node)
    {
        defaultCase(node);
    }

    public void caseAFloatExpr(AFloatExpr node)
    {
        defaultCase(node);
    }

    public void caseACharExpr(ACharExpr node)
    {
        defaultCase(node);
    }

    public void caseAStringExpr(AStringExpr node)
    {
        defaultCase(node);
    }

    public void caseAStartStringExpr(AStartStringExpr node)
    {
        defaultCase(node);
    }

    public void caseAMidStringExpr(AMidStringExpr node)
    {
        defaultCase(node);
    }

    public void caseAEndStringExpr(AEndStringExpr node)
    {
        defaultCase(node);
    }

    public void caseASuperstringExpr(ASuperstringExpr node)
    {
        defaultCase(node);
    }

    public void caseAParExpr(AParExpr node)
    {
        defaultCase(node);
    }

    public void caseAAsCastExpr(AAsCastExpr node)
    {
        defaultCase(node);
    }

    public void caseAAsNotnullExpr(AAsNotnullExpr node)
    {
        defaultCase(node);
    }

    public void caseAIssetAttrExpr(AIssetAttrExpr node)
    {
        defaultCase(node);
    }

    public void caseAPlusAssignOp(APlusAssignOp node)
    {
        defaultCase(node);
    }

    public void caseAMinusAssignOp(AMinusAssignOp node)
    {
        defaultCase(node);
    }

    public void caseAClosureDef(AClosureDef node)
    {
        defaultCase(node);
    }

    public void caseASimpleClosureId(ASimpleClosureId node)
    {
        defaultCase(node);
    }

    public void caseABreakClosureId(ABreakClosureId node)
    {
        defaultCase(node);
    }

    public void caseAModuleName(AModuleName node)
    {
        defaultCase(node);
    }

    public void caseAQualified(AQualified node)
    {
        defaultCase(node);
    }

    public void caseADoc(ADoc node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    public void caseTKwmodule(TKwmodule node)
    {
        defaultCase(node);
    }

    public void caseTKwimport(TKwimport node)
    {
        defaultCase(node);
    }

    public void caseTKwclass(TKwclass node)
    {
        defaultCase(node);
    }

    public void caseTKwabstract(TKwabstract node)
    {
        defaultCase(node);
    }

    public void caseTKwinterface(TKwinterface node)
    {
        defaultCase(node);
    }

    public void caseTKwenum(TKwenum node)
    {
        defaultCase(node);
    }

    public void caseTKwspecial(TKwspecial node)
    {
        defaultCase(node);
    }

    public void caseTKwend(TKwend node)
    {
        defaultCase(node);
    }

    public void caseTKwmeth(TKwmeth node)
    {
        defaultCase(node);
    }

    public void caseTKwtype(TKwtype node)
    {
        defaultCase(node);
    }

    public void caseTKwinit(TKwinit node)
    {
        defaultCase(node);
    }

    public void caseTKwredef(TKwredef node)
    {
        defaultCase(node);
    }

    public void caseTKwis(TKwis node)
    {
        defaultCase(node);
    }

    public void caseTKwdo(TKwdo node)
    {
        defaultCase(node);
    }

    public void caseTKwreadable(TKwreadable node)
    {
        defaultCase(node);
    }

    public void caseTKwwritable(TKwwritable node)
    {
        defaultCase(node);
    }

    public void caseTKwvar(TKwvar node)
    {
        defaultCase(node);
    }

    public void caseTKwintern(TKwintern node)
    {
        defaultCase(node);
    }

    public void caseTKwextern(TKwextern node)
    {
        defaultCase(node);
    }

    public void caseTKwprotected(TKwprotected node)
    {
        defaultCase(node);
    }

    public void caseTKwprivate(TKwprivate node)
    {
        defaultCase(node);
    }

    public void caseTKwintrude(TKwintrude node)
    {
        defaultCase(node);
    }

    public void caseTKwif(TKwif node)
    {
        defaultCase(node);
    }

    public void caseTKwthen(TKwthen node)
    {
        defaultCase(node);
    }

    public void caseTKwelse(TKwelse node)
    {
        defaultCase(node);
    }

    public void caseTKwwhile(TKwwhile node)
    {
        defaultCase(node);
    }

    public void caseTKwloop(TKwloop node)
    {
        defaultCase(node);
    }

    public void caseTKwfor(TKwfor node)
    {
        defaultCase(node);
    }

    public void caseTKwin(TKwin node)
    {
        defaultCase(node);
    }

    public void caseTKwand(TKwand node)
    {
        defaultCase(node);
    }

    public void caseTKwor(TKwor node)
    {
        defaultCase(node);
    }

    public void caseTKwnot(TKwnot node)
    {
        defaultCase(node);
    }

    public void caseTKwreturn(TKwreturn node)
    {
        defaultCase(node);
    }

    public void caseTKwcontinue(TKwcontinue node)
    {
        defaultCase(node);
    }

    public void caseTKwbreak(TKwbreak node)
    {
        defaultCase(node);
    }

    public void caseTKwabort(TKwabort node)
    {
        defaultCase(node);
    }

    public void caseTKwassert(TKwassert node)
    {
        defaultCase(node);
    }

    public void caseTKwnew(TKwnew node)
    {
        defaultCase(node);
    }

    public void caseTKwisa(TKwisa node)
    {
        defaultCase(node);
    }

    public void caseTKwonce(TKwonce node)
    {
        defaultCase(node);
    }

    public void caseTKwsuper(TKwsuper node)
    {
        defaultCase(node);
    }

    public void caseTKwself(TKwself node)
    {
        defaultCase(node);
    }

    public void caseTKwtrue(TKwtrue node)
    {
        defaultCase(node);
    }

    public void caseTKwfalse(TKwfalse node)
    {
        defaultCase(node);
    }

    public void caseTKwnull(TKwnull node)
    {
        defaultCase(node);
    }

    public void caseTKwas(TKwas node)
    {
        defaultCase(node);
    }

    public void caseTKwnullable(TKwnullable node)
    {
        defaultCase(node);
    }

    public void caseTKwisset(TKwisset node)
    {
        defaultCase(node);
    }

    public void caseTKwlabel(TKwlabel node)
    {
        defaultCase(node);
    }

    public void caseTOpar(TOpar node)
    {
        defaultCase(node);
    }

    public void caseTCpar(TCpar node)
    {
        defaultCase(node);
    }

    public void caseTObra(TObra node)
    {
        defaultCase(node);
    }

    public void caseTCbra(TCbra node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTColumn(TColumn node)
    {
        defaultCase(node);
    }

    public void caseTQuad(TQuad node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTPluseq(TPluseq node)
    {
        defaultCase(node);
    }

    public void caseTMinuseq(TMinuseq node)
    {
        defaultCase(node);
    }

    public void caseTDotdotdot(TDotdotdot node)
    {
        defaultCase(node);
    }

    public void caseTDotdot(TDotdot node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    public void caseTPercent(TPercent node)
    {
        defaultCase(node);
    }

    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    public void caseTNe(TNe node)
    {
        defaultCase(node);
    }

    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    public void caseTLe(TLe node)
    {
        defaultCase(node);
    }

    public void caseTLl(TLl node)
    {
        defaultCase(node);
    }

    public void caseTGt(TGt node)
    {
        defaultCase(node);
    }

    public void caseTGe(TGe node)
    {
        defaultCase(node);
    }

    public void caseTGg(TGg node)
    {
        defaultCase(node);
    }

    public void caseTStarship(TStarship node)
    {
        defaultCase(node);
    }

    public void caseTBang(TBang node)
    {
        defaultCase(node);
    }

    public void caseTClassid(TClassid node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTAttrid(TAttrid node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTStartString(TStartString node)
    {
        defaultCase(node);
    }

    public void caseTMidString(TMidString node)
    {
        defaultCase(node);
    }

    public void caseTEndString(TEndString node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}

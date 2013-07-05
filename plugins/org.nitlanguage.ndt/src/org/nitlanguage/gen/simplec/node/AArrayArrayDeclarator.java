/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AArrayArrayDeclarator extends PArrayDeclarator
{
    private PArrayDeclarator _arrayDeclarator_;
    private TLBracket _lBracket_;
    private TIntegerConstant _integerConstant_;
    private TRBracket _rBracket_;

    public AArrayArrayDeclarator()
    {
    }

    public AArrayArrayDeclarator(
        PArrayDeclarator _arrayDeclarator_,
        TLBracket _lBracket_,
        TIntegerConstant _integerConstant_,
        TRBracket _rBracket_)
    {
        setArrayDeclarator(_arrayDeclarator_);

        setLBracket(_lBracket_);

        setIntegerConstant(_integerConstant_);

        setRBracket(_rBracket_);

    }
    public Object clone()
    {
        return new AArrayArrayDeclarator(
            (PArrayDeclarator) cloneNode(_arrayDeclarator_),
            (TLBracket) cloneNode(_lBracket_),
            (TIntegerConstant) cloneNode(_integerConstant_),
            (TRBracket) cloneNode(_rBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayArrayDeclarator(this);
    }

    public PArrayDeclarator getArrayDeclarator()
    {
        return _arrayDeclarator_;
    }

    public void setArrayDeclarator(PArrayDeclarator node)
    {
        if(_arrayDeclarator_ != null)
        {
            _arrayDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _arrayDeclarator_ = node;
    }

    public TLBracket getLBracket()
    {
        return _lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if(_lBracket_ != null)
        {
            _lBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBracket_ = node;
    }

    public TIntegerConstant getIntegerConstant()
    {
        return _integerConstant_;
    }

    public void setIntegerConstant(TIntegerConstant node)
    {
        if(_integerConstant_ != null)
        {
            _integerConstant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _integerConstant_ = node;
    }

    public TRBracket getRBracket()
    {
        return _rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if(_rBracket_ != null)
        {
            _rBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBracket_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_arrayDeclarator_)
            + toString(_lBracket_)
            + toString(_integerConstant_)
            + toString(_rBracket_);
    }

    void removeChild(Node child)
    {
        if(_arrayDeclarator_ == child)
        {
            _arrayDeclarator_ = null;
            return;
        }

        if(_lBracket_ == child)
        {
            _lBracket_ = null;
            return;
        }

        if(_integerConstant_ == child)
        {
            _integerConstant_ = null;
            return;
        }

        if(_rBracket_ == child)
        {
            _rBracket_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_arrayDeclarator_ == oldChild)
        {
            setArrayDeclarator((PArrayDeclarator) newChild);
            return;
        }

        if(_lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if(_integerConstant_ == oldChild)
        {
            setIntegerConstant((TIntegerConstant) newChild);
            return;
        }

        if(_rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

    }
}
/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;


import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class ABraReassignExpr extends PExpr
{
    private PExpr _expr_;
    private PExprs _args_;
    private PAssignOp _assignOp_;
    private PExpr _value_;

    public ABraReassignExpr()
    {
        // Constructor
    }

    public ABraReassignExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") PExprs _args_,
        @SuppressWarnings("hiding") PAssignOp _assignOp_,
        @SuppressWarnings("hiding") PExpr _value_)
    {
        // Constructor
        setExpr(_expr_);

        setArgs(_args_);

        setAssignOp(_assignOp_);

        setValue(_value_);

    }

    @Override
    public Object clone()
    {
        return new ABraReassignExpr(
            cloneNode(this._expr_),
            cloneNode(this._args_),
            cloneNode(this._assignOp_),
            cloneNode(this._value_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABraReassignExpr(this);
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public PExprs getArgs()
    {
        return this._args_;
    }

    public void setArgs(PExprs node)
    {
        if(this._args_ != null)
        {
            this._args_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._args_ = node;
    }

    public PAssignOp getAssignOp()
    {
        return this._assignOp_;
    }

    public void setAssignOp(PAssignOp node)
    {
        if(this._assignOp_ != null)
        {
            this._assignOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignOp_ = node;
    }

    public PExpr getValue()
    {
        return this._value_;
    }

    public void setValue(PExpr node)
    {
        if(this._value_ != null)
        {
            this._value_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._value_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._args_)
            + toString(this._assignOp_)
            + toString(this._value_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._args_ == child)
        {
            this._args_ = null;
            return;
        }

        if(this._assignOp_ == child)
        {
            this._assignOp_ = null;
            return;
        }

        if(this._value_ == child)
        {
            this._value_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._args_ == oldChild)
        {
            setArgs((PExprs) newChild);
            return;
        }

        if(this._assignOp_ == oldChild)
        {
            setAssignOp((PAssignOp) newChild);
            return;
        }

        if(this._value_ == oldChild)
        {
            setValue((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

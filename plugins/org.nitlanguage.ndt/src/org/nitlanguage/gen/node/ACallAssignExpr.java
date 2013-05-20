/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class ACallAssignExpr extends PExpr
{
    private PExpr _expr_;
    private TId _id_;
    private PExprs _args_;
    private TAssign _assign_;
    private PExpr _value_;

    public ACallAssignExpr()
    {
        // Constructor
    }

    public ACallAssignExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PExprs _args_,
        @SuppressWarnings("hiding") TAssign _assign_,
        @SuppressWarnings("hiding") PExpr _value_)
    {
        // Constructor
        setExpr(_expr_);

        setId(_id_);

        setArgs(_args_);

        setAssign(_assign_);

        setValue(_value_);

    }

    @Override
    public Object clone()
    {
        return new ACallAssignExpr(
            cloneNode(this._expr_),
            cloneNode(this._id_),
            cloneNode(this._args_),
            cloneNode(this._assign_),
            cloneNode(this._value_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACallAssignExpr(this);
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

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
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

    public TAssign getAssign()
    {
        return this._assign_;
    }

    public void setAssign(TAssign node)
    {
        if(this._assign_ != null)
        {
            this._assign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assign_ = node;
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
            + toString(this._id_)
            + toString(this._args_)
            + toString(this._assign_)
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

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._args_ == child)
        {
            this._args_ = null;
            return;
        }

        if(this._assign_ == child)
        {
            this._assign_ = null;
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

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._args_ == oldChild)
        {
            setArgs((PExprs) newChild);
            return;
        }

        if(this._assign_ == oldChild)
        {
            setAssign((TAssign) newChild);
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

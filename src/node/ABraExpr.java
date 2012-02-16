/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class ABraExpr extends PExpr
{
    private PExpr _expr_;
    private final LinkedList<PExpr> _args_ = new LinkedList<PExpr>();
    private final LinkedList<PClosureDef> _closureDefs_ = new LinkedList<PClosureDef>();

    public ABraExpr()
    {
        // Constructor
    }

    public ABraExpr(
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") List<PExpr> _args_,
        @SuppressWarnings("hiding") List<PClosureDef> _closureDefs_)
    {
        // Constructor
        setExpr(_expr_);

        setArgs(_args_);

        setClosureDefs(_closureDefs_);

    }

    @Override
    public Object clone()
    {
        return new ABraExpr(
            cloneNode(this._expr_),
            cloneList(this._args_),
            cloneList(this._closureDefs_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABraExpr(this);
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

    public LinkedList<PExpr> getArgs()
    {
        return this._args_;
    }

    public void setArgs(List<PExpr> list)
    {
        this._args_.clear();
        this._args_.addAll(list);
        for(PExpr e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PClosureDef> getClosureDefs()
    {
        return this._closureDefs_;
    }

    public void setClosureDefs(List<PClosureDef> list)
    {
        this._closureDefs_.clear();
        this._closureDefs_.addAll(list);
        for(PClosureDef e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_)
            + toString(this._args_)
            + toString(this._closureDefs_);
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

        if(this._args_.remove(child))
        {
            return;
        }

        if(this._closureDefs_.remove(child))
        {
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

        for(ListIterator<PExpr> i = this._args_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExpr) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PClosureDef> i = this._closureDefs_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PClosureDef) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
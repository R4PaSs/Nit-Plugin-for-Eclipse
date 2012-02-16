/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALabel extends PLabel
{
    private TKwlabel _kwlabel_;
    private TId _id_;

    public ALabel()
    {
        // Constructor
    }

    public ALabel(
        @SuppressWarnings("hiding") TKwlabel _kwlabel_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setKwlabel(_kwlabel_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new ALabel(
            cloneNode(this._kwlabel_),
            cloneNode(this._id_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALabel(this);
    }

    public TKwlabel getKwlabel()
    {
        return this._kwlabel_;
    }

    public void setKwlabel(TKwlabel node)
    {
        if(this._kwlabel_ != null)
        {
            this._kwlabel_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwlabel_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwlabel_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwlabel_ == child)
        {
            this._kwlabel_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwlabel_ == oldChild)
        {
            setKwlabel((TKwlabel) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALlMethid extends PMethid
{
    private TLl _ll_;

    public ALlMethid()
    {
        // Constructor
    }

    public ALlMethid(
        @SuppressWarnings("hiding") TLl _ll_)
    {
        // Constructor
        setLl(_ll_);

    }

    @Override
    public Object clone()
    {
        return new ALlMethid(
            cloneNode(this._ll_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALlMethid(this);
    }

    public TLl getLl()
    {
        return this._ll_;
    }

    public void setLl(TLl node)
    {
        if(this._ll_ != null)
        {
            this._ll_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ll_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ll_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ll_ == child)
        {
            this._ll_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ll_ == oldChild)
        {
            setLl((TLl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

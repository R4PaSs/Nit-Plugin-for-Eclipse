/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class APercentMethid extends PMethid
{
    private TPercent _percent_;

    public APercentMethid()
    {
        // Constructor
    }

    public APercentMethid(
        @SuppressWarnings("hiding") TPercent _percent_)
    {
        // Constructor
        setPercent(_percent_);

    }

    @Override
    public Object clone()
    {
        return new APercentMethid(
            cloneNode(this._percent_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPercentMethid(this);
    }

    public TPercent getPercent()
    {
        return this._percent_;
    }

    public void setPercent(TPercent node)
    {
        if(this._percent_ != null)
        {
            this._percent_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._percent_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._percent_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._percent_ == child)
        {
            this._percent_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._percent_ == oldChild)
        {
            setPercent((TPercent) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

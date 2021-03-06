/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class AExternCodeBlock extends PExternCodeBlock
{
    private PInLanguage _inLanguage_;
    private TExternCodeSegment _externCodeSegment_;

    public AExternCodeBlock()
    {
        // Constructor
    }

    public AExternCodeBlock(
        @SuppressWarnings("hiding") PInLanguage _inLanguage_,
        @SuppressWarnings("hiding") TExternCodeSegment _externCodeSegment_)
    {
        // Constructor
        setInLanguage(_inLanguage_);

        setExternCodeSegment(_externCodeSegment_);

    }

    @Override
    public Object clone()
    {
        return new AExternCodeBlock(
            cloneNode(this._inLanguage_),
            cloneNode(this._externCodeSegment_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExternCodeBlock(this);
    }

    public PInLanguage getInLanguage()
    {
        return this._inLanguage_;
    }

    public void setInLanguage(PInLanguage node)
    {
        if(this._inLanguage_ != null)
        {
            this._inLanguage_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inLanguage_ = node;
    }

    public TExternCodeSegment getExternCodeSegment()
    {
        return this._externCodeSegment_;
    }

    public void setExternCodeSegment(TExternCodeSegment node)
    {
        if(this._externCodeSegment_ != null)
        {
            this._externCodeSegment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._externCodeSegment_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inLanguage_)
            + toString(this._externCodeSegment_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inLanguage_ == child)
        {
            this._inLanguage_ = null;
            return;
        }

        if(this._externCodeSegment_ == child)
        {
            this._externCodeSegment_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inLanguage_ == oldChild)
        {
            setInLanguage((PInLanguage) newChild);
            return;
        }

        if(this._externCodeSegment_ == oldChild)
        {
            setExternCodeSegment((TExternCodeSegment) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}

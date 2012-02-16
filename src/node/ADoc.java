/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class ADoc extends PDoc
{
    private final LinkedList<TComment> _comment_ = new LinkedList<TComment>();

    public ADoc()
    {
        // Constructor
    }

    public ADoc(
        @SuppressWarnings("hiding") List<TComment> _comment_)
    {
        // Constructor
        setComment(_comment_);

    }

    @Override
    public Object clone()
    {
        return new ADoc(
            cloneList(this._comment_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADoc(this);
    }

    public LinkedList<TComment> getComment()
    {
        return this._comment_;
    }

    public void setComment(List<TComment> list)
    {
        this._comment_.clear();
        this._comment_.addAll(list);
        for(TComment e : list)
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
            + toString(this._comment_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comment_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<TComment> i = this._comment_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TComment) newChild);
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

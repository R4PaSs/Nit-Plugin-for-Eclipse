/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class TPlusEqual extends Token
{
    public TPlusEqual()
    {
        super.setText("+=");
    }

    public TPlusEqual(int line, int pos)
    {
        super.setText("+=");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TPlusEqual(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPlusEqual(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPlusEqual text.");
    }
}

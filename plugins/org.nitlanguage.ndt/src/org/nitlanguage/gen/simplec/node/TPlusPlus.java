/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class TPlusPlus extends Token
{
    public TPlusPlus()
    {
        super.setText("++");
    }

    public TPlusPlus(int line, int pos)
    {
        super.setText("++");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TPlusPlus(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPlusPlus(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPlusPlus text.");
    }
}

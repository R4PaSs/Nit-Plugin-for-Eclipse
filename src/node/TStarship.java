/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TStarship extends Token
{
    public TStarship()
    {
        super.setText("<=>");
    }

    public TStarship(int line, int pos)
    {
        super.setText("<=>");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TStarship(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTStarship(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TStarship text.");
    }
}

/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TKwthen extends Token
{
    public TKwthen()
    {
        super.setText("then");
    }

    public TKwthen(int line, int pos)
    {
        super.setText("then");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwthen(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwthen(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwthen text.");
    }
}
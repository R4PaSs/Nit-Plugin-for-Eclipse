/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TObra extends Token
{
    public TObra()
    {
        super.setText("[");
    }

    public TObra(int line, int pos)
    {
        super.setText("[");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TObra(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTObra(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TObra text.");
    }
}

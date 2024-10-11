package ro.webdata.parser.xml.lido.core;

import ro.webdata.parser.xml.lido.core.wrap.lidoWrap.LidoWrap;

public interface ParserDAO {
    LidoWrap parseLidoFile(String filePath);
}

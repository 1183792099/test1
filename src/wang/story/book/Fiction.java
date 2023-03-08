package wang.story.book;

import com.sun.media.jfxmedia.control.VideoFormat;

public class Fiction extends Book {
    FormatType format = FormatType.eight;
    int size = format.toInt();
    double sizes = size*page*0.01;
}

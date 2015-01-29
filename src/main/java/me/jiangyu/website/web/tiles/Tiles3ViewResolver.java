package me.jiangyu.website.web.tiles;

import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * Created by jiangyukun on 2015/1/29.
 */
public class Tiles3ViewResolver extends UrlBasedViewResolver {

    public Tiles3ViewResolver() {
        super.setViewClass(Tiles3View.class);
    }
}

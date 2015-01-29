package me.jiangyu.website.web.tiles;

import org.apache.tiles.Attribute;
import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.Request;
import org.apache.tiles.request.servlet.ServletRequest;
import org.apache.tiles.request.servlet.ServletUtil;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by jiangyukun on 2015/1/29.
 */
public class Tiles3View extends AbstractUrlBasedView {
    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest req, HttpServletResponse res) throws Exception {
        ApplicationContext applicationContext = ServletUtil.getApplicationContext(getServletContext());
        Request request = new ServletRequest(applicationContext, req, res);
        TilesContainer container = TilesAccess.getContainer(applicationContext);
        container.getAttributeContext(request).putAttribute("body", new Attribute(this.getUrl()));
        container.render("tiles3", request);
    }
}

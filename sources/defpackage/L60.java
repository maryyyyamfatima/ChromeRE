package defpackage;

import J.N;
import android.text.TextUtils;
import android.webkit.URLUtil;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class L60 {
    public static boolean a() {
        C7928nE c7928nE = UN.a;
        return N.M09VlOh_("ContextMenuPopupStyle") || N.Mudil8Bg("TouchDragAndContextMenu");
    }

    public static String c(ContextMenuParams contextMenuParams) {
        if (!TextUtils.isEmpty(contextMenuParams.e)) {
            return contextMenuParams.e;
        }
        String str = contextMenuParams.d;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        boolean z = contextMenuParams.j;
        GURL gurl = contextMenuParams.g;
        return (z || contextMenuParams.k || gurl.h().equals("file")) ? URLUtil.guessFileName(gurl.i(), null, null) : "";
    }

    public static String b(ContextMenuParams contextMenuParams) {
        return contextMenuParams.k ? "Video" : contextMenuParams.j ? contextMenuParams.i ? "ImageLink" : "Image" : contextMenuParams.p ? "SharedHighlightingInteraction" : "Link";
    }
}

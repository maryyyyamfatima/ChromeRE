package defpackage;

import J.N;
import org.chromium.base.ThreadUtils;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class IG3 {
    public static TemplateUrlService a;

    public static TemplateUrlService a() {
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = (TemplateUrlService) N.MSnR7M2J();
        }
        return a;
    }
}

package defpackage;

import org.chromium.chrome.browser.toolbar.top.c;
import org.chromium.chrome.browser.toolbar.top.e;
import org.chromium.components.search_engines.TemplateUrl;
import org.chromium.components.search_engines.TemplateUrlService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dQ3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4555dQ3 implements HG3 {
    public TemplateUrl a;
    public final /* synthetic */ TemplateUrlService g;
    public final /* synthetic */ C9707sQ3 h;

    public C4555dQ3(C9707sQ3 c9707sQ3, TemplateUrlService templateUrlService) {
        this.h = c9707sQ3;
        this.g = templateUrlService;
        this.a = templateUrlService.c();
    }

    @Override // defpackage.HG3
    public final void x() {
        TemplateUrl c = this.g.c();
        TemplateUrl templateUrl = this.a;
        if (templateUrl == null && c == null) {
            return;
        }
        if (templateUrl == null || !templateUrl.equals(c)) {
            this.a = c;
            e eVar = this.h.k;
            eVar.a.s();
            c cVar = eVar.c;
            if (cVar != null) {
                cVar.a();
            }
        }
    }
}

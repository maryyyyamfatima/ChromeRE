package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchContext;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G70 extends AbstractC4290cf2 {
    public final /* synthetic */ ContextualSearchManager a;

    @Override // defpackage.AbstractC4290cf2
    public final void a() {
        ContextualSearchManager contextualSearchManager = this.a;
        contextualSearchManager.E = true;
        C4803e80 c4803e80 = contextualSearchManager.L;
        S70 s70 = contextualSearchManager.t;
        C5491g80 c5491g80 = contextualSearchManager.r;
        if (c4803e80 == null) {
            C5491g80 c5491g802 = s70.b;
            if ((c5491g802.e != null && (c5491g802.f == 2 || !S70.c())) && !TextUtils.isEmpty(c5491g80.e)) {
                contextualSearchManager.L = new C4803e80(c5491g80.e, false);
                contextualSearchManager.B = false;
            }
        }
        C4803e80 c4803e802 = contextualSearchManager.L;
        if (c4803e802 != null && (!contextualSearchManager.B || contextualSearchManager.f11521J)) {
            c4803e802.d = false;
            contextualSearchManager.l();
            if (!contextualSearchManager.C) {
                s70.getClass();
                if (S70.d() && !TextUtils.isEmpty(c5491g80.e)) {
                    contextualSearchManager.C = true;
                    String str = c5491g80.e;
                    ContextualSearchContext contextualSearchContext = contextualSearchManager.I;
                    int length = str.length();
                    contextualSearchContext.c = str;
                    contextualSearchContext.d = 0;
                    contextualSearchContext.e = length;
                    N.MTuOy32N(contextualSearchContext.a, contextualSearchContext, str, 0, length);
                    ContextualSearchManager.a(contextualSearchManager);
                    ContextualSearchManager.b(contextualSearchManager);
                }
            }
        }
        contextualSearchManager.f11521J = true;
        s70.getClass();
        if (S70.e()) {
            if (C0591Eo0.c == null) {
                C0591Eo0.c = new C0591Eo0(s70.a);
            }
            C0591Eo0 c0591Eo0 = C0591Eo0.c;
            int i = c0591Eo0.b;
            if (i >= 0) {
                int i2 = (-1) - i;
                c0591Eo0.b = i2;
                c0591Eo0.a.q(i2, "contextual_search_tap_triggered_promo_count");
            }
        }
    }

    public G70(ContextualSearchManager contextualSearchManager) {
        this.a = contextualSearchManager;
    }
}

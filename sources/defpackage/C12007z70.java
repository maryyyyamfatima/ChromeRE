package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchContext;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z70 */
/* loaded from: classes.dex */
public final class C12007z70 extends ContextualSearchContext {
    public final /* synthetic */ C70 l;

    public C12007z70(C70 c70) {
        this.l = c70;
    }

    @Override // org.chromium.chrome.browser.contextualsearch.ContextualSearchContext
    public final void a() {
        ContextualSearchManager contextualSearchManager = this.l.a;
        ContextualSearchContext contextualSearchContext = contextualSearchManager.I;
        String str = contextualSearchContext.c;
        FW0 fw0 = new FW0(contextualSearchContext.d, contextualSearchContext.i, contextualSearchContext.e, str);
        contextualSearchManager.t.getClass();
        if (!S70.c()) {
            fw0 = null;
        }
        Iterator it = contextualSearchManager.a.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            }
            D70 d70 = (D70) c11814ya2.next();
            if (fw0 == null) {
                d70.getClass();
            } else {
                d70.a.onResult(fw0);
            }
        }
    }
}

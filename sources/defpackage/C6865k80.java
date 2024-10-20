package defpackage;

import org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k80 */
/* loaded from: classes.dex */
public final class C6865k80 implements HG3 {
    public final /* synthetic */ ContextualSearchTabHelper a;

    public C6865k80(ContextualSearchTabHelper contextualSearchTabHelper) {
        this.a = contextualSearchTabHelper;
    }

    @Override // defpackage.HG3
    public final void x() {
        boolean e = IG3.a().e();
        ContextualSearchTabHelper contextualSearchTabHelper = this.a;
        Boolean bool = contextualSearchTabHelper.n;
        if (bool == null || e != bool.booleanValue()) {
            contextualSearchTabHelper.n = Boolean.valueOf(e);
            contextualSearchTabHelper.Z0(contextualSearchTabHelper.i);
        }
    }
}

package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content.browser.input.ImeAdapterImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yj2 */
/* loaded from: classes.dex */
public final class C11868yj2 extends BA0 {
    public final Runnable a;
    public C11525xj2 g;
    public Tab h;

    public C11868yj2(RunnableC2179Qu runnableC2179Qu) {
        this.a = runnableC2179Qu;
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        if (this.g == null) {
            this.g = new C11525xj2(tabImpl.getContext(), tabImpl.j, this.a);
        }
        if (this.h != tabImpl) {
            ImeAdapterImpl b = ImeAdapterImpl.b(tabImpl.b());
            C11525xj2 c11525xj2 = this.g;
            b.g = c11525xj2;
            C11138wc0 c11138wc0 = b.m;
            if (c11138wc0 != null) {
                c11138wc0.r = c11525xj2;
            }
            this.h = tabImpl;
        }
    }

    @Override // defpackage.BA0
    public final void T0(Tab tab, boolean z, boolean z2) {
        ImeAdapterImpl b = ImeAdapterImpl.b(tab.b());
        C11525xj2 c11525xj2 = this.g;
        b.g = c11525xj2;
        C11138wc0 c11138wc0 = b.m;
        if (c11138wc0 != null) {
            c11138wc0.r = c11525xj2;
        }
    }
}

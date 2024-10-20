package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bC */
/* loaded from: classes2.dex */
public final class C3794bC implements InterfaceC7064kj3 {
    public int a;
    public final /* synthetic */ C4137cC g;

    public C3794bC(C4137cC c4137cC, InterfaceC7408lj3 interfaceC7408lj3) {
        this.g = c4137cC;
    }

    @Override // defpackage.InterfaceC7064kj3
    public final void b(int i, boolean z) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        C4137cC c4137cC = this.g;
        c4137cC.l((Tab) c4137cC.r.g, Integer.valueOf(i));
        if (i == 1) {
            c4137cC.q.b();
        }
    }
}

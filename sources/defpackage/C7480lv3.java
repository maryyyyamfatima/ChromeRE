package defpackage;

import java.util.List;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7480lv3 implements K60 {
    public final K60 a;
    public final TabImpl b;

    public C7480lv3(K60 k60, Tab tab) {
        this.a = k60;
        this.b = (TabImpl) tab;
    }

    @Override // defpackage.K60
    public final List a() {
        List a = this.a.a();
        TabImpl tabImpl = this.b;
        C11814ya2 P = tabImpl.P();
        while (P.hasNext()) {
            ((BA0) P.next()).o0(tabImpl);
        }
        return a;
    }

    @Override // defpackage.K60
    public final boolean b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.K60
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.K60
    public final boolean isIncognito() {
        return this.a.isIncognito();
    }

    @Override // defpackage.K60
    public final String d() {
        return this.a.d();
    }

    @Override // defpackage.K60
    public final NK c() {
        return this.a.c();
    }
}

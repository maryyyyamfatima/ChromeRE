package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.NavigationHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jG2 */
/* loaded from: classes.dex */
public final class C6565jG2 extends AbstractC2338Rz3 {
    public final /* synthetic */ C6909kG2 a;

    public C6565jG2(C6909kG2 c6909kG2) {
        this.a = c6909kG2;
    }

    @Override // defpackage.AbstractC2338Rz3
    public final void W0(Tab tab) {
        C6909kG2.a(this.a, tab.z());
    }

    @Override // defpackage.BA0
    public final void t0(final TabImpl tabImpl, NavigationHandle navigationHandle) {
        if (navigationHandle.g && navigationHandle.a && !navigationHandle.c) {
            C6909kG2 c6909kG2 = this.a;
            if (!c6909kG2.h) {
                String D = c6909kG2.f.D();
                c6909kG2.h = true;
                c6909kG2.b.h(D).g(new Callback() { // from class: iG2
                    @Override // org.chromium.base.Callback
                    public final ZE e0(Object obj) {
                        return new ZE(this, obj);
                    }

                    @Override // org.chromium.base.Callback
                    public final void onResult(Object obj) {
                        C6565jG2 c6565jG2 = C6565jG2.this;
                        c6565jG2.getClass();
                        if (((Boolean) obj).booleanValue()) {
                            return;
                        }
                        C6909kG2 c6909kG22 = c6565jG2.a;
                        C6909kG2.b(c6909kG22, tabImpl, 3, c6909kG22.f.D(), 0);
                    }
                });
            }
            GURL z = tabImpl.z();
            if (C6909kG2.a(c6909kG2, z)) {
                int i = navigationHandle.m;
                if (i == 404) {
                    C6909kG2.b(c6909kG2, tabImpl, 0, z.i(), navigationHandle.m);
                    return;
                }
                if (i >= 500 && i <= 599) {
                    C6909kG2.b(c6909kG2, tabImpl, 1, z.i(), navigationHandle.m);
                } else if (navigationHandle.l == -106) {
                    C6909kG2.b(c6909kG2, tabImpl, 2, z.i(), navigationHandle.m);
                }
            }
        }
    }
}

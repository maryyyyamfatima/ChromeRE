package defpackage;

import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o32 */
/* loaded from: classes.dex */
public final class C8213o32 extends BA0 {
    public final /* synthetic */ C10613v32 a;

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        C10613v32 c10613v32 = this.a;
        if (c10613v32.D) {
            c10613v32.y();
        }
    }

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        NewTabPageLayout newTabPageLayout = this.a.v;
        if (!T34.k(tab.getUrl())) {
            newTabPageLayout.getClass();
            return;
        }
        C9656sG2 c9656sG2 = newTabPageLayout.k;
        if (c9656sG2 != null) {
            c9656sG2.b();
        }
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        C10613v32 c10613v32 = this.a;
        if (c10613v32.D) {
            C10613v32.i(c10613v32);
        }
        C4941eZ1 c4941eZ1 = c10613v32.v.n;
        if (c4941eZ1 != null) {
            ZL3 zl3 = c4941eZ1.h.s;
            if ((zl3 == null) || zl3.i == null) {
                return;
            }
            zl3.c();
        }
    }

    public C8213o32(C10613v32 c10613v32) {
        this.a = c10613v32;
    }

    @Override // defpackage.BA0
    public final void C0(Tab tab, boolean z) {
        C10613v32 c10613v32 = this.a;
        if (z) {
            c10613v32.j.a(3);
        } else {
            c10613v32.j.b(3);
        }
    }
}

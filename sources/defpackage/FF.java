package defpackage;

import java.util.Iterator;
import org.chromium.chrome.browser.image_editor.OverlayFragment;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class FF implements Runnable {
    public C8066ne3 a;
    public final /* synthetic */ GF g;

    public FF(GF gf) {
        this.g = gf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GF gf = this.g;
        Iterator it = gf.b.iterator();
        while (it.hasNext()) {
            C7383lf2 c7383lf2 = (C7383lf2) it.next();
            C8066ne3 c8066ne3 = this.a;
            OverlayFragment overlayFragment = c7383lf2.a;
            if (overlayFragment.h0) {
                C11996z51 c11996z51 = overlayFragment.e0.a;
                c11996z51.getClass();
                c11996z51.j = c8066ne3.b;
                c11996z51.a.o(B51.b, c8066ne3);
            }
        }
        gf.c.a.add(this);
    }
}

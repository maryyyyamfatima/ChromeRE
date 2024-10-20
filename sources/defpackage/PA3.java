package defpackage;

import J.N;
import java.nio.ByteBuffer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PA3 {
    public static IA3 a(Tab tab) {
        ByteBuffer byteBuffer;
        Gl4 gl4;
        if (!tab.isInitialized()) {
            return null;
        }
        IA3 ia3 = new IA3();
        int i = 0;
        if (C1695Nb0.m(tab).t == null) {
            LoadUrlParams r = tab.r();
            if (r == null) {
                byteBuffer = (ByteBuffer) N.MNwGha8e(tab.b());
            } else {
                C3498aL2 c3498aL2 = r.e;
                byteBuffer = (ByteBuffer) N.M_N0bb_o(r.a, c3498aL2 != null ? c3498aL2.a : null, c3498aL2 != null ? c3498aL2.b : 0, r.b, tab.isIncognito());
            }
            if (byteBuffer == null) {
                gl4 = null;
            } else {
                Gl4 gl42 = new Gl4(byteBuffer);
                gl42.b = 2;
                gl4 = gl42;
            }
        } else {
            gl4 = C1695Nb0.m(tab).t;
        }
        ia3.a = gl4;
        C1663Mu3 c1663Mu3 = (C1663Mu3) tab.F().b(C1663Mu3.class);
        ia3.e = c1663Mu3 != null ? c1663Mu3.g : null;
        ia3.b = C1695Nb0.m(tab).q;
        ia3.d = C1695Nb0.m(tab).s;
        ia3.g = C1695Nb0.m(tab).x;
        if (tab.H() && !tab.isNativePage()) {
            i = tab.k();
        }
        ia3.f = i;
        ia3.c = C1695Nb0.m(tab).r;
        ia3.i = C1695Nb0.m(tab).z;
        return ia3;
    }
}

package defpackage;

import android.app.Activity;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yb2 */
/* loaded from: classes.dex */
public final class C11820yb2 implements InterfaceC11179wj {
    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        C0268Cb2 c0268Cb2;
        if (i == 6 && (c0268Cb2 = (C0268Cb2) C0268Cb2.m.remove(activity)) != null) {
            c0268Cb2.i.a();
            HashMap hashMap = c0268Cb2.j;
            if (!hashMap.isEmpty()) {
                Iterator it = hashMap.keySet().iterator();
                while (it.hasNext()) {
                    Tab m = ((AbstractC11276wz3) c0268Cb2.h).m(((Integer) it.next()).intValue());
                    if (m != null) {
                        m.w(c0268Cb2);
                    }
                }
                hashMap.clear();
            }
            if (c0268Cb2.k) {
                NetworkChangeNotifier.g(c0268Cb2);
                c0268Cb2.k = false;
            }
        }
    }
}

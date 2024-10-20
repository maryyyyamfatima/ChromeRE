package defpackage;

import java.util.Iterator;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rE3 */
/* loaded from: classes.dex */
public final class C9304rE3 implements InterfaceC6389il3 {
    public final /* synthetic */ C10333uE3 a;

    @Override // defpackage.InterfaceC6389il3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC6389il3
    public final /* synthetic */ void d(int i) {
    }

    @Override // defpackage.InterfaceC6389il3
    public final void b(int i) {
        C10333uE3 c10333uE3 = this.a;
        c10333uE3.e1 = i;
        int dimensionPixelSize = c10333uE3.h.getResources().getDimensionPixelSize(c10333uE3.Z0);
        int i2 = c10333uE3.e1;
        int i3 = dimensionPixelSize + i2;
        CC cc = c10333uE3.T;
        boolean z = true;
        cc.q = true;
        if (cc.m != i3 || cc.n != i2) {
            TraceEvent i4 = TraceEvent.i("BrowserControlsManager.setTopControlsHeight", null);
            try {
                int i5 = cc.m;
                int i6 = cc.n;
                cc.m = i3;
                cc.n = i2;
                Tab tab = cc.A;
                if (tab == null || !tab.isUserInteractable() || tab.isNativePage()) {
                    z = false;
                }
                if (!z) {
                    if (cc.q) {
                        cc.i(i5, i6);
                    } else {
                        cc.p(false);
                    }
                }
                Iterator it = cc.y.iterator();
                while (true) {
                    C11814ya2 c11814ya2 = (C11814ya2) it;
                    if (!c11814ya2.hasNext()) {
                        break;
                    } else {
                        ((GC) c11814ya2.next()).r();
                    }
                }
                if (i4 != null) {
                    i4.close();
                }
            } catch (Throwable th) {
                if (i4 != null) {
                    try {
                        i4.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        cc.q = false;
    }

    public C9304rE3(C10333uE3 c10333uE3) {
        this.a = c10333uE3;
    }
}

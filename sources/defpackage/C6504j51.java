package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.contextualsearch.ContextualSearchManager;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: j51, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6504j51 extends JW0 {
    @Override // defpackage.JW0
    public final Bundle a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("ssb_service:ssb_context", HW0.a(context, null, null, null).toByteArray());
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    @Override // defpackage.JW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6504j51.d():void");
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [M60] */
    @Override // defpackage.JW0
    public final P60 b(C6166i6 c6166i6, C0649Ez3 c0649Ez3, C4874eM c4874eM) {
        if (C10477ug1.n == null || C10477ug1.n.j == null) {
            return null;
        }
        final P60 p60 = new P60(c6166i6, c0649Ez3, c4874eM, C10477ug1.n.j);
        p60.c((Tab) c6166i6.g, false, null);
        InterfaceC10590uz3 interfaceC10590uz3 = (InterfaceC10590uz3) c0649Ez3.g;
        if (p60.d == null) {
            p60.d = new N60(p60, interfaceC10590uz3);
        }
        if (p60.e == null) {
            p60.e = new O60(p60, interfaceC10590uz3);
        }
        if (c4874eM != null) {
            ?? r4 = new Callback() { // from class: M60
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    P60 p602 = P60.this;
                    p602.c((Tab) p602.a.get(), false, (FW0) obj);
                }
            };
            ContextualSearchManager contextualSearchManager = (ContextualSearchManager) c4874eM.a.u0.g;
            contextualSearchManager.getClass();
            D70 d70 = new D70(r4);
            contextualSearchManager.T = d70;
            contextualSearchManager.a.a(d70);
        }
        return p60;
    }

    @Override // defpackage.JW0
    public final String c(byte[] bArr) {
        try {
            C11520xi3 c11520xi3 = C11520xi3.l;
            int length = bArr.length;
            XF0 c = XF0.c();
            C11520xi3 c11520xi32 = new C11520xi3();
            try {
                try {
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(c11520xi32.getClass());
                        b.f(c11520xi32, bArr, 0, length + 0, new C2254Rj(c));
                        b.b(c11520xi32);
                        if (c11520xi32.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(c11520xi32);
                        return c11520xi32.k;
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof C1127Ir1) {
                        throw ((C1127Ir1) e2.getCause());
                    }
                    throw new C1127Ir1(e2);
                }
            } catch (C6827k14 e3) {
                throw e3.a();
            }
        } catch (C1127Ir1 e4) {
            AbstractC4851eH1.f("GsaHelperInternal", "Error while parsing ssb context proto %s", e4.getMessage());
            return null;
        }
    }
}

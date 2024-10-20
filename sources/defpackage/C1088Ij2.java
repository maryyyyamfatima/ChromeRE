package defpackage;

import J.N;
import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ij2 */
/* loaded from: classes.dex */
public final class C1088Ij2 {
    public static final HashSet j = new HashSet();
    public C0308Cj2 a;
    public final Context c;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final Object d = new Object();
    public long b = N.MQQiT1PE(this);

    public C1088Ij2(Context context, final PartnerBrowserCustomizations partnerBrowserCustomizations) {
        this.c = context;
        if (!partnerBrowserCustomizations.d) {
            partnerBrowserCustomizations.c(context);
        }
        partnerBrowserCustomizations.g(new Runnable() { // from class: Ej2
            @Override // java.lang.Runnable
            public final void run() {
                C1088Ij2 c1088Ij2 = C1088Ij2.this;
                PartnerBrowserCustomizations partnerBrowserCustomizations2 = partnerBrowserCustomizations;
                c1088Ij2.getClass();
                if (partnerBrowserCustomizations2.c) {
                    N.McEggOd3();
                }
                c1088Ij2.i = true;
                if (c1088Ij2.h) {
                    N.MZy4XMIu(c1088Ij2.b, c1088Ij2);
                }
            }
        });
    }

    public final void a() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            C0308Cj2 c0308Cj2 = this.a;
            if (c0308Cj2 != null) {
                c0308Cj2.a();
            }
            if (this.g) {
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    C8252oA c8252oA = (C8252oA) ((InterfaceC0828Gj2) it.next());
                    if (c8252oA.s) {
                        C5158fA c5158fA = c8252oA.x;
                        if (c5158fA.k != null) {
                            c5158fA.t();
                        }
                        c8252oA.s = false;
                    }
                }
            }
            N.Mp38r97L(this.b, this);
            this.b = 0L;
            this.f = true;
        }
    }
}

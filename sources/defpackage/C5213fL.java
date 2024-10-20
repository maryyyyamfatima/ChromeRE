package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fL */
/* loaded from: classes.dex */
public final class C5213fL extends YK {
    public final /* synthetic */ C5557gL d;

    public C5213fL(C5557gL c5557gL) {
        this.d = c5557gL;
    }

    @Override // defpackage.YK
    public final void a(long j) {
        C5557gL c5557gL = this.d;
        c5557gL.e = false;
        if (c5557gL.d) {
            if (c5557gL.f != j) {
                C4294cg0 c4294cg0 = c5557gL.c;
                synchronized (c4294cg0) {
                    if (c4294cg0.e) {
                        c4294cg0.a();
                    }
                    ArrayList arrayList = c4294cg0.c;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        M74 m74 = (M74) arrayList.get(i);
                        float b = m74.b(j);
                        if (j == m74.d) {
                            throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
                        }
                        m74.d = j;
                        m74.c = b;
                    }
                    c4294cg0.c();
                }
                c5557gL.f = j;
            }
            if (!c5557gL.d || c5557gL.e) {
                return;
            }
            ((C3839bL) c5557gL.a).b(c5557gL.b);
            c5557gL.e = true;
        }
    }
}

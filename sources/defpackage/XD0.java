package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XD0 {
    public final C8881q02 a;
    public C3304Zl b;

    public XD0() {
        RV.b(8, "expectedKeys");
        RV.b(2, "expectedValuesPerKey");
        this.a = new C8881q02(new OY(8), new C8538p02(2));
    }

    public final synchronized void a(Cdo cdo, InterfaceC9040qU1 interfaceC9040qU1) {
        if (this.b == null) {
            Log.e("XD0", "Cannot dispatch event without executor.");
        } else {
            b(cdo, interfaceC9040qU1);
        }
    }

    public final synchronized void b(final Cdo cdo, final InterfaceC9040qU1 interfaceC9040qU1) {
        C8881q02 c8881q02 = this.a;
        Collection collection = (Collection) c8881q02.h.get(cdo);
        if (collection == null) {
            collection = c8881q02.c();
        }
        for (final AbstractC3219Yu abstractC3219Yu : (Set) c8881q02.g(cdo, collection)) {
            C3304Zl c3304Zl = this.b;
            Runnable runnable = new Runnable() { // from class: WD0
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3219Yu.this.a(cdo, interfaceC9040qU1);
                }
            };
            int i = AbstractC4575dU3.a;
            c3304Zl.a.i.b.execute(new XT3(AbstractC6294iU3.g(), runnable));
        }
    }
}

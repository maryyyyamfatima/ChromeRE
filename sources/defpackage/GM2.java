package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class GM2 extends BasePendingResult {
    public EM2 o;
    public final boolean p;
    public final /* synthetic */ KM2 q;

    public abstract void n();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GM2(KM2 km2, boolean z) {
        super((AbstractC10600v11) null);
        this.q = km2;
        this.p = z;
    }

    public final InterfaceC3857bO2 o() {
        if (this.o == null) {
            this.o = new EM2(this);
        }
        return this.o;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final QP2 e(Status status) {
        return new FM2(status);
    }

    public final void m() {
        if (!this.p) {
            Iterator it = this.q.h.iterator();
            if (it.hasNext()) {
                X5.a(it.next());
                throw null;
            }
            Iterator it2 = this.q.i.iterator();
            while (it2.hasNext()) {
                ((AbstractC12087zM2) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.q.a) {
                n();
            }
        } catch (C5569gN1 unused) {
            a(new FM2(new Status(2100, null, 0)));
        }
    }
}

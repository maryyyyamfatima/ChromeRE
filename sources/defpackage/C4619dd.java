package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dd */
/* loaded from: classes.dex */
public final class C4619dd extends AbstractC5994hd {
    public final AbstractC8508ov b;

    @Override // defpackage.AbstractC5994hd
    public final void e(V30 v30, boolean z) {
        Map map = v30.a;
        Boolean valueOf = Boolean.valueOf(z);
        AbstractC8508ov abstractC8508ov = this.b;
        map.put(abstractC8508ov, valueOf);
        T30 t30 = new T30(v30, abstractC8508ov);
        synchronized (abstractC8508ov.a) {
            if (abstractC8508ov.h()) {
                t30.a(abstractC8508ov.i);
            } else {
                abstractC8508ov.e.add(t30);
            }
        }
    }

    public C4619dd(int i, AbstractC8508ov abstractC8508ov) {
        super(i);
        this.b = abstractC8508ov;
    }

    @Override // defpackage.AbstractC5994hd
    public final void d(C4425d21 c4425d21) {
        try {
            AbstractC8508ov abstractC8508ov = this.b;
            InterfaceC3129Yc interfaceC3129Yc = c4425d21.g;
            abstractC8508ov.getClass();
            try {
                abstractC8508ov.m(interfaceC3129Yc);
            } catch (DeadObjectException e) {
                abstractC8508ov.n(new Status(8, e.getLocalizedMessage(), 0));
                throw e;
            } catch (RemoteException e2) {
                abstractC8508ov.n(new Status(8, e2.getLocalizedMessage(), 0));
            }
        } catch (RuntimeException e3) {
            c(e3);
        }
    }

    @Override // defpackage.AbstractC5994hd
    public final void b(Status status) {
        try {
            this.b.n(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.AbstractC5994hd
    public final void c(RuntimeException runtimeException) {
        try {
            this.b.n(new Status(10, AbstractC8192o0.a(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), 0));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }
}

package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fd */
/* loaded from: classes.dex */
public final class C5306fd extends AbstractC3932bd {
    public final AbstractC5875hF3 b;
    public final C6905kF3 c;
    public final InterfaceC3984bl3 d;

    @Override // defpackage.AbstractC5994hd
    public final void e(V30 v30, boolean z) {
        Map map = v30.b;
        Boolean valueOf = Boolean.valueOf(z);
        C6905kF3 c6905kF3 = this.c;
        map.put(c6905kF3, valueOf);
        c6905kF3.a.a(new U30(v30, c6905kF3));
    }

    @Override // defpackage.AbstractC3932bd
    public final Feature[] f(C4425d21 c4425d21) {
        return this.b.a;
    }

    @Override // defpackage.AbstractC3932bd
    public final boolean g(C4425d21 c4425d21) {
        return this.b.b;
    }

    public C5306fd(int i, AbstractC5875hF3 abstractC5875hF3, C6905kF3 c6905kF3, InterfaceC3984bl3 interfaceC3984bl3) {
        super(i);
        this.c = c6905kF3;
        this.b = abstractC5875hF3;
        this.d = interfaceC3984bl3;
        if (i == 2 && abstractC5875hF3.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.AbstractC5994hd
    public final void d(C4425d21 c4425d21) {
        try {
            this.b.b(c4425d21.g, this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            b(AbstractC5994hd.a(e2));
        } catch (RuntimeException e3) {
            c(e3);
        }
    }

    @Override // defpackage.AbstractC5994hd
    public final void b(Status status) {
        this.c.c(this.d.a(status));
    }

    @Override // defpackage.AbstractC5994hd
    public final void c(RuntimeException runtimeException) {
        this.c.c(runtimeException);
    }
}

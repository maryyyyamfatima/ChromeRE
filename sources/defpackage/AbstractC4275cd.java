package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cd */
/* loaded from: classes.dex */
public abstract class AbstractC4275cd extends AbstractC3932bd {
    public final C6905kF3 b;

    @Override // defpackage.AbstractC5994hd
    public final void e(V30 v30, boolean z) {
    }

    public abstract void h(C4425d21 c4425d21);

    public AbstractC4275cd(int i, C6905kF3 c6905kF3) {
        super(i);
        this.b = c6905kF3;
    }

    @Override // defpackage.AbstractC5994hd
    public final void b(Status status) {
        this.b.c(new C10114td(status));
    }

    @Override // defpackage.AbstractC5994hd
    public final void c(RuntimeException runtimeException) {
        this.b.c(runtimeException);
    }

    @Override // defpackage.AbstractC5994hd
    public final void d(C4425d21 c4425d21) {
        try {
            h(c4425d21);
        } catch (DeadObjectException e) {
            b(AbstractC5994hd.a(e));
            throw e;
        } catch (RemoteException e2) {
            b(AbstractC5994hd.a(e2));
        } catch (RuntimeException e3) {
            c(e3);
        }
    }
}

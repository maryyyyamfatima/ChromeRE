package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D51 extends AbstractC10018tK1 implements InterfaceC5355fl0 {
    private volatile D51 _immediate;
    public final Handler h;
    public final String i;
    public final boolean j;
    public final D51 k;

    public D51(Handler handler, String str, boolean z) {
        this.h = handler;
        this.i = str;
        this.j = z;
        this._immediate = z ? this : null;
        D51 d51 = this._immediate;
        if (d51 == null) {
            d51 = new D51(handler, str, true);
            this._immediate = d51;
        }
        this.k = d51;
    }

    @Override // defpackage.L90
    public final String toString() {
        D51 d51;
        String str;
        C8443ok0 c8443ok0 = AbstractC1246Jp0.a;
        AbstractC10018tK1 abstractC10018tK1 = AbstractC10361uK1.a;
        if (this == abstractC10018tK1) {
            str = "Dispatchers.Main";
        } else {
            try {
                d51 = ((D51) abstractC10018tK1).k;
            } catch (UnsupportedOperationException unused) {
                d51 = null;
            }
            str = this == d51 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.i;
        if (str2 == null) {
            str2 = this.h.toString();
        }
        return this.j ? AbstractC0087Ar1.g(".immediate", str2) : str2;
    }

    public D51(Handler handler) {
        this(handler, null, false);
    }

    @Override // defpackage.L90
    public final boolean C() {
        return (this.j && AbstractC0087Ar1.a(Looper.myLooper(), this.h.getLooper())) ? false : true;
    }

    @Override // defpackage.L90
    public final void y(E90 e90, Runnable runnable) {
        if (this.h.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC10555ut1 interfaceC10555ut1 = (InterfaceC10555ut1) e90.b(C10212tt1.a);
        if (interfaceC10555ut1 != null) {
            interfaceC10555ut1.u(cancellationException);
        }
        AbstractC1246Jp0.b.y(e90, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof D51) && ((D51) obj).h == this.h;
    }

    public final int hashCode() {
        return System.identityHashCode(this.h);
    }
}

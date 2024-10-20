package defpackage;

import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ct1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357Ct1 implements InterfaceC1871Ok1 {
    private volatile /* synthetic */ Object _rootCause;
    public final E52 a;
    private volatile /* synthetic */ int _isCompleting = 0;
    private volatile /* synthetic */ Object _exceptionsHolder = null;

    @Override // defpackage.InterfaceC1871Ok1
    public final E52 d() {
        return this.a;
    }

    public C0357Ct1(E52 e52, Throwable th) {
        this.a = e52;
        this._rootCause = th;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean f() {
        return this._isCompleting;
    }

    public final void i() {
        this._isCompleting = 1;
    }

    public final void a(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
            return;
        }
        if (th == th2) {
            return;
        }
        Object obj = this._exceptionsHolder;
        if (obj == null) {
            this._exceptionsHolder = th;
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(AbstractC0087Ar1.g(obj, "State is ").toString());
            }
            ((ArrayList) obj).add(th);
        } else {
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            this._exceptionsHolder = arrayList;
        }
    }

    public final Throwable b() {
        return (Throwable) this._rootCause;
    }

    @Override // defpackage.InterfaceC1871Ok1
    public final boolean c() {
        return ((Throwable) this._rootCause) == null;
    }

    public final boolean e() {
        return ((Throwable) this._rootCause) != null;
    }

    public final boolean g() {
        return this._exceptionsHolder == AbstractC0747Ft1.e;
    }

    public final ArrayList h(Throwable th) {
        ArrayList arrayList;
        Object obj = this._exceptionsHolder;
        if (obj != null) {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(AbstractC0087Ar1.g(obj, "State is ").toString());
                }
                arrayList = (ArrayList) obj;
            } else {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            }
        } else {
            arrayList = new ArrayList(4);
        }
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 != null) {
            arrayList.add(0, th2);
        }
        if (th != null && !AbstractC0087Ar1.a(th, th2)) {
            arrayList.add(th);
        }
        this._exceptionsHolder = AbstractC0747Ft1.e;
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + ((boolean) this._isCompleting) + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.a + ']';
    }
}

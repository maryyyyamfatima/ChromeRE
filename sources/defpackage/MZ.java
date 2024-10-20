package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MZ {
    public final Object a;
    public final IF b;
    public final InterfaceC7670mV0 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static MZ a(MZ mz, IF r9, CancellationException cancellationException, int i) {
        Object obj = (i & 1) != 0 ? mz.a : null;
        if ((i & 2) != 0) {
            r9 = mz.b;
        }
        IF r4 = r9;
        InterfaceC7670mV0 interfaceC7670mV0 = (i & 4) != 0 ? mz.c : null;
        Object obj2 = (i & 8) != 0 ? mz.d : null;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = mz.e;
        }
        mz.getClass();
        return new MZ(obj, r4, interfaceC7670mV0, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MZ)) {
            return false;
        }
        MZ mz = (MZ) obj;
        return AbstractC0087Ar1.a(this.a, mz.a) && AbstractC0087Ar1.a(this.b, mz.b) && AbstractC0087Ar1.a(this.c, mz.c) && AbstractC0087Ar1.a(this.d, mz.d) && AbstractC0087Ar1.a(this.e, mz.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        IF r2 = this.b;
        int hashCode2 = (hashCode + (r2 == null ? 0 : r2.hashCode())) * 31;
        InterfaceC7670mV0 interfaceC7670mV0 = this.c;
        int hashCode3 = (hashCode2 + (interfaceC7670mV0 == null ? 0 : interfaceC7670mV0.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public MZ(Object obj, IF r2, InterfaceC7670mV0 interfaceC7670mV0, Object obj2, Throwable th) {
        this.a = obj;
        this.b = r2;
        this.c = interfaceC7670mV0;
        this.d = obj2;
        this.e = th;
    }

    public /* synthetic */ MZ(Object obj, IF r10, InterfaceC7670mV0 interfaceC7670mV0, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : r10, (i & 4) != 0 ? null : interfaceC7670mV0, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}

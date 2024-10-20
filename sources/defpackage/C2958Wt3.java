package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wt3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2958Wt3 implements Serializable {
    public InterfaceC6982kV0 a;
    public volatile Object g = MZ3.a;
    public final Object h = this;

    public C2958Wt3(C7672mV2 c7672mV2) {
        this.a = c7672mV2;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.g;
        MZ3 mz3 = MZ3.a;
        if (obj2 != mz3) {
            return obj2;
        }
        synchronized (this.h) {
            obj = this.g;
            if (obj == mz3) {
                InterfaceC6982kV0 interfaceC6982kV0 = this.a;
                AbstractC0087Ar1.b(interfaceC6982kV0);
                obj = interfaceC6982kV0.d();
                this.g = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.g != MZ3.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

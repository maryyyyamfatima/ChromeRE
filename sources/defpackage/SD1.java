package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SD1 implements InterfaceC4582dW0 {
    public final /* synthetic */ InterfaceC4939eZ a;

    public SD1(C5283fZ c5283fZ) {
        this.a = c5283fZ;
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void a(Object obj) {
        Object a;
        try {
            a = Boolean.valueOf(((C5283fZ) this.a).C(obj));
        } catch (Throwable th) {
            a = SP2.a(th);
        }
        Throwable a2 = PP2.a(a);
        if (a2 != null) {
            O90.a(C7221lA0.a, a2);
        }
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void b(Throwable th) {
        Object a;
        AbstractC0087Ar1.e(th, "t");
        try {
            C5283fZ c5283fZ = (C5283fZ) this.a;
            c5283fZ.getClass();
            a = Boolean.valueOf(c5283fZ.C(new OZ(false, th)));
        } catch (Throwable th2) {
            a = SP2.a(th2);
        }
        Throwable a2 = PP2.a(a);
        if (a2 != null) {
            O90.a(C7221lA0.a, a2);
        }
    }
}

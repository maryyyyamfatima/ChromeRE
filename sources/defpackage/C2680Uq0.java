package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uq0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2680Uq0 implements InterfaceC9989tE2, InterfaceC3241Yy1 {
    public static final Object c = new Object();
    public volatile InterfaceC9989tE2 a;
    public volatile Object b = c;

    public C2680Uq0(InterfaceC9989tE2 interfaceC9989tE2) {
        this.a = interfaceC9989tE2;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.a.get();
                    Object obj3 = this.b;
                    if ((obj3 != obj2) && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
        }
        return obj;
    }

    public static InterfaceC9989tE2 b(InterfaceC9989tE2 interfaceC9989tE2) {
        return interfaceC9989tE2 instanceof C2680Uq0 ? interfaceC9989tE2 : new C2680Uq0(interfaceC9989tE2);
    }

    public static InterfaceC3241Yy1 a(InterfaceC9989tE2 interfaceC9989tE2) {
        if (!(interfaceC9989tE2 instanceof InterfaceC3241Yy1)) {
            interfaceC9989tE2.getClass();
            return new C2680Uq0(interfaceC9989tE2);
        }
        return (InterfaceC3241Yy1) interfaceC9989tE2;
    }
}

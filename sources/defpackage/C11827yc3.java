package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yc3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11827yc3 implements InterfaceC9989tE2 {
    public static final Object c = new Object();
    public volatile InterfaceC9989tE2 a;
    public volatile Object b = c;

    public C11827yc3(InterfaceC9989tE2 interfaceC9989tE2) {
        this.a = interfaceC9989tE2;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        InterfaceC9989tE2 interfaceC9989tE2 = this.a;
        if (interfaceC9989tE2 == null) {
            return this.b;
        }
        Object obj2 = interfaceC9989tE2.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }

    public static InterfaceC9989tE2 a(InterfaceC9989tE2 interfaceC9989tE2) {
        return ((interfaceC9989tE2 instanceof C11827yc3) || (interfaceC9989tE2 instanceof C2680Uq0)) ? interfaceC9989tE2 : new C11827yc3(interfaceC9989tE2);
    }
}

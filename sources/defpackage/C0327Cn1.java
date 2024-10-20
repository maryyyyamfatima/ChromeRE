package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327Cn1 implements InterfaceC9989tE2, InterfaceC3241Yy1 {
    public static final C0327Cn1 b = new C0327Cn1(null);
    public final Object a;

    public static C0327Cn1 a(Object obj) {
        if (obj != null) {
            return new C0327Cn1(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public C0327Cn1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        return this.a;
    }
}

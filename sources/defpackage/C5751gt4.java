package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gt4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5751gt4 implements InterfaceC6793jv4 {
    public final InterfaceC6793jv4 a;

    public C5751gt4(InterfaceC6793jv4 interfaceC6793jv4) {
        this.a = interfaceC6793jv4;
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        Tv4 tv4 = (Tv4) this.a.a();
        if (tv4 != null) {
            return tv4;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

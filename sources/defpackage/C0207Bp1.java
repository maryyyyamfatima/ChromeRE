package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0207Bp1 implements A51 {
    public final InterfaceC11102wV1 a;

    public C0207Bp1(InterfaceC11102wV1 interfaceC11102wV1) {
        this.a = interfaceC11102wV1;
    }

    @Override // defpackage.A51
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC11102wV1 n0() {
        return this.a.g1();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}

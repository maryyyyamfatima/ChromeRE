package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ok0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8443ok0 extends AW2 {
    public static final C8443ok0 i = new C8443ok0();

    @Override // defpackage.L90
    public final String toString() {
        return "Dispatchers.Default";
    }

    public C8443ok0() {
        super(VF3.b, VF3.c, VF3.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
}

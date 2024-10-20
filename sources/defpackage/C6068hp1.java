package defpackage;

import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6068hp1 implements Closeable, D30 {
    public final InterfaceC7559m90 a;
    public final EV1 g;
    public int h;

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
    }

    public C6068hp1(InterfaceC7559m90 interfaceC7559m90, EV1 ev1) {
        this.a = interfaceC7559m90;
        this.g = ev1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }
}

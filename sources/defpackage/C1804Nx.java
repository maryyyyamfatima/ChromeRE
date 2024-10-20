package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1804Nx implements AutoCloseable {
    public final InterfaceC9615s83 a;
    public final ByteBuffer g;

    public C1804Nx(InterfaceC9615s83 interfaceC9615s83, ByteBuffer byteBuffer) {
        this.a = interfaceC9615s83;
        this.g = byteBuffer;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC9615s83 interfaceC9615s83 = this.a;
        if (interfaceC9615s83 != null) {
            interfaceC9615s83.K(this.g);
        }
    }
}

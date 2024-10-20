package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OD implements InterfaceC8075ng0 {
    public final ByteBuffer a;

    @Override // defpackage.InterfaceC8075ng0
    public final void b() {
    }

    public OD(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // defpackage.InterfaceC8075ng0
    public final Object a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }
}

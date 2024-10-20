package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iF0 */
/* loaded from: classes.dex */
public final class C6216iF0 implements InterfaceC9641sD2 {
    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 386544496;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        interfaceC8177nx0.j((C5872hF0) obj);
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        C5872hF0 c5872hF0 = new C5872hF0();
        c5872hF0.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        return c5872hF0;
    }
}

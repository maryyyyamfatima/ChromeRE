package defpackage;

import com.google.android.libraries.elements.converters.intersectionobserver.DwellIntersectionObserver;
import com.google.android.libraries.elements.converters.intersectionobserver.IntersectionObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ev0 */
/* loaded from: classes.dex */
public final class C5071ev0 implements InterfaceC10543ur1 {
    public final InterfaceC9738sX a;
    public final RP0 b;

    @Override // defpackage.InterfaceC10543ur1
    public final int b() {
        return 336816453;
    }

    @Override // defpackage.InterfaceC10543ur1
    public final IntersectionObserver d(AbstractC11362xE3 abstractC11362xE3, C2924Wn c2924Wn) {
        return new DwellIntersectionObserver((C4727dv0) abstractC11362xE3, this.a, c2924Wn, this.b);
    }

    public C5071ev0(InterfaceC9738sX interfaceC9738sX, RP0 rp0) {
        this.a = interfaceC9738sX;
        this.b = rp0;
    }

    @Override // defpackage.InterfaceC10543ur1
    public final AbstractC11362xE3 c(TF0 tf0) {
        ByteBuffer f = tf0.f(6);
        C4727dv0 c4727dv0 = new C4727dv0();
        c4727dv0.c(f.position() + TW1.a(f, ByteOrder.LITTLE_ENDIAN), f);
        return c4727dv0;
    }
}

package defpackage;

import com.google.android.libraries.elements.converters.intersectionobserver.IntersectionObserver;
import com.google.android.libraries.elements.converters.intersectionobserver.ProminenceIntersectionObserver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FC2 implements InterfaceC10543ur1 {
    public final InterfaceC9738sX a;
    public final RP0 b;

    @Override // defpackage.InterfaceC10543ur1
    public final int b() {
        return 408993103;
    }

    @Override // defpackage.InterfaceC10543ur1
    public final IntersectionObserver d(AbstractC11362xE3 abstractC11362xE3, C2924Wn c2924Wn) {
        return new ProminenceIntersectionObserver((EC2) abstractC11362xE3, this.a, c2924Wn, this.b);
    }

    public FC2(InterfaceC9738sX interfaceC9738sX, RP0 rp0) {
        this.a = interfaceC9738sX;
        this.b = rp0;
    }

    @Override // defpackage.InterfaceC10543ur1
    public final AbstractC11362xE3 c(TF0 tf0) {
        ByteBuffer f = tf0.f(6);
        EC2 ec2 = new EC2();
        ec2.c(f.position() + TW1.a(f, ByteOrder.LITTLE_ENDIAN), f);
        return ec2;
    }
}

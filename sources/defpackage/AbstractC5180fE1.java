package defpackage;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fE1 */
/* loaded from: classes.dex */
public abstract class AbstractC5180fE1 {
    public static MessageLite a(ByteBuffer byteBuffer, InterfaceC7751mj2 interfaceC7751mj2, XF0 xf0) {
        DV h = DV.h(byteBuffer, false);
        QX0 c = ((KX0) interfaceC7751mj2).c(h, xf0);
        KX0.a(c);
        try {
            h.a(0);
            return c;
        } catch (C1127Ir1 e) {
            e.a = c;
            throw e;
        }
    }
}

package defpackage;

import com.google.protobuf.MessageLite;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1507Lp1 {
    public static final Charset a;
    public static final byte[] b;

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        DV.f(bArr, 0, 0, false);
    }

    public static MessageLite b(Object obj, Object obj2) {
        JX0 d = ((MessageLite) obj).d();
        MessageLite messageLite = (MessageLite) obj2;
        d.getClass();
        if (!d.a.getClass().isInstance(messageLite)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        d.m((QX0) ((AbstractC4754e0) messageLite));
        return d.b1();
    }
}

package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OX0 extends VF0 {
    public final MessageLite a;
    public final Object b;
    public final MessageLite c;
    public final NX0 d;

    public final Object a(Object obj) {
        NX0 nx0 = this.d;
        if (nx0.g.a != EnumC10883vq4.n) {
            return obj;
        }
        ((Integer) obj).intValue();
        nx0.getClass();
        throw null;
    }

    public OX0(MessageLite messageLite, Object obj, MessageLite messageLite2, NX0 nx0, Class cls) {
        if (messageLite == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (nx0.g == EnumC10540uq4.k && messageLite2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = messageLite;
        this.b = obj;
        this.c = messageLite2;
        this.d = nx0;
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n74, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7895n74 {
    public static AbstractC7895n74 a;

    public abstract String a(ByteBuffer byteBuffer, int i, int i2);

    public abstract void b(String str, ByteBuffer byteBuffer);

    public abstract int c(String str);

    public static AbstractC7895n74 d() {
        if (a == null) {
            a = new C8925q74();
        }
        return a;
    }
}

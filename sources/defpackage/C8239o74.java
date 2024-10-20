package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o74, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8239o74 extends AbstractC7895n74 {
    public static final Charset c = StandardCharsets.UTF_8;
    public static final C8925q74 d = new C8925q74();
    public final AbstractC9896sy0 b;

    public C8239o74(AbstractC9896sy0 abstractC9896sy0) {
        this.b = abstractC9896sy0;
    }

    @Override // defpackage.AbstractC7895n74
    public final int c(String str) {
        try {
            return d.c(str);
        } catch (IllegalArgumentException e) {
            this.b.b(EnumC11438xU.u, "Failed to encode UTF-8 string length", e);
            return 0;
        }
    }

    @Override // defpackage.AbstractC7895n74
    public final String a(ByteBuffer byteBuffer, int i, int i2) {
        try {
            if (byteBuffer.hasArray()) {
                return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2, c);
            }
            return d.a(byteBuffer, i, i2);
        } catch (IllegalArgumentException e) {
            this.b.b(EnumC11438xU.u, "Failed to decode UTF-8 string", e);
            return "";
        }
    }

    @Override // defpackage.AbstractC7895n74
    public final void b(String str, ByteBuffer byteBuffer) {
        try {
            d.b(str, byteBuffer);
        } catch (IllegalArgumentException e) {
            this.b.b(EnumC11438xU.u, "Failed to encode UTF-8 string", e);
        }
    }
}

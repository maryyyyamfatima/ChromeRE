package defpackage;

import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lo3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7438lo3 {
    public int a;
    public ByteBuffer b;

    public final void a(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
        } else {
            this.a = 0;
        }
    }
}

package com.youtube.android.libraries.elements.templates;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import defpackage.AbstractC0901Gy0;
import defpackage.C4765e14;
import defpackage.C5427fx0;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class UnifiedTemplateResolver {
    public static final byte[] c;
    public static final AtomicBoolean d;
    public final boolean a;
    public final int b;

    public final native void jni_init(boolean z, DebuggerClient debuggerClient, String str);

    public final native Status jni_resolveFlat(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, String str, boolean z, int i3, byte[][] bArr4, long[] jArr);

    public final native void jni_setBlocksContainer(Container container);

    public final native Status jni_setTemplateConfig(String str, byte[] bArr);

    static {
        AbstractC0901Gy0.a();
        c = new byte[0];
        d = new AtomicBoolean(false);
    }

    public UnifiedTemplateResolver(Container container, boolean z, String str, DebuggerClient debuggerClient, boolean z2, int i) {
        this.a = z2;
        this.b = i;
        if (d.compareAndSet(false, true)) {
            jni_init(z, debuggerClient, str == null ? "localhost:5001" : str);
            if (container != null) {
                jni_setBlocksContainer(container);
            }
        }
    }

    public final Status a(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, String str, C5427fx0 c5427fx0, C4765e14 c4765e14, StringBuilder sb) {
        byte[] bArr4;
        int i3;
        int i4;
        if (bArr == null) {
            throw new IllegalArgumentException("Attempt to resolve a null TemplateConfig");
        }
        byte[][] bArr5 = {null, null, null};
        long[] jArr = c4765e14 != null ? new long[1] : null;
        byte[] bArr6 = c;
        if (bArr2 == null) {
            bArr4 = bArr6;
            i3 = 0;
            i4 = 0;
        } else {
            bArr4 = bArr2;
            i3 = i;
            i4 = i2;
        }
        Status jni_resolveFlat = jni_resolveFlat(bArr, bArr4, i3, i4, bArr3 == null ? bArr6 : bArr3, str, this.a, this.b, bArr5, jArr);
        if (jni_resolveFlat.b()) {
            C5427fx0.j(ByteBuffer.wrap(bArr5[0]), c5427fx0);
            byte[] bArr7 = bArr5[2];
            if (bArr7 != null) {
                String str2 = new String(bArr7);
                sb.append(str2);
                if (c4765e14 != null) {
                    c4765e14.b = str2;
                }
            }
            if (c4765e14 != null && jArr != null) {
                long j = jArr[0];
                if (j > 0) {
                    c4765e14.a = j;
                }
            }
        }
        return jni_resolveFlat;
    }
}

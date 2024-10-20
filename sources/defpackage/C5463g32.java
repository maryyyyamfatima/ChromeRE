package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: g32, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5463g32 {
    public static final C5463g32 b;
    public final int a;

    static {
        new C5463g32("undefined");
        b = new C5463g32("undefined");
        new C5463g32("test");
    }

    public C5463g32(String str) {
        long j = 0;
        for (int i = 0; i < str.getBytes(StandardCharsets.UTF_8).length; i++) {
            j = ((j * 31) + r8[i]) % 138003713;
        }
        this.a = (int) j;
    }
}

package defpackage;

import java.security.SecureRandom;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: To1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2541To1 {
    public static final Object e = new Object();
    public static C2541To1 f;
    public final SecureRandom a = new SecureRandom();
    public C2411So1 b;
    public byte[] c;
    public String d;

    public static C2541To1 a() {
        synchronized (e) {
            if (f == null) {
                f = new C2541To1();
            }
        }
        return f;
    }
}

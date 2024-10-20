package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class D2 {
    public static MC2 a;

    public static C2 a() {
        Object obj = ThreadUtils.a;
        MC2 b = b();
        if (!b.d()) {
            throw new RuntimeException("The AccountInfoService is not yet initialized!");
        }
        return (C2) b.b;
    }

    public static MC2 b() {
        Object obj = ThreadUtils.a;
        if (a == null) {
            a = new MC2();
        }
        return a;
    }
}

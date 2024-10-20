package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class TL0 {
    public static TL0 a;

    public static TL0 a() {
        ThreadUtils.a();
        if (a == null) {
            a = new TL0();
        }
        return a;
    }
}

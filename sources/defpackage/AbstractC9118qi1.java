package defpackage;

import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qi1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9118qi1 {
    public static void a() {
        if (!ThreadUtils.h()) {
            throw new AssertionError("Should be on UI thread.");
        }
    }
}

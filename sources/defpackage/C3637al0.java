package defpackage;

import java.util.LinkedList;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: al0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3637al0 {
    public static C3637al0 b;
    public final LinkedList a = new LinkedList();

    public static C3637al0 b() {
        Object obj = ThreadUtils.a;
        if (b == null) {
            b = new C3637al0();
        }
        return b;
    }

    public final void a(Runnable runnable) {
        Object obj = ThreadUtils.a;
        this.a.add(runnable);
    }
}

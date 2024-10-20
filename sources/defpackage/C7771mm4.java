package defpackage;

import J.N;
import org.chromium.base.Callback;
import org.chromium.components.prefs.PrefService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mm4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7771mm4 {
    public final int a;
    public final int b;
    public final PrefService c;
    public C7427lm4 d;

    public C7771mm4(PrefService prefService) {
        this.c = prefService;
        C7928nE c7928nE = UN.a;
        this.a = N.M37SqSAy("WebFeed", "intro-num-visit-min", 3);
        this.b = N.M37SqSAy("WebFeed", "intro-daily-visit-min", 3);
    }

    public final void b(C7427lm4 c7427lm4, C8115nm4 c8115nm4) {
        if (this.d == c7427lm4) {
            Callback callback = c7427lm4.c;
            if (!a(c7427lm4)) {
                c8115nm4 = null;
            }
            callback.onResult(c8115nm4);
        }
    }

    public final boolean a(C7427lm4 c7427lm4) {
        return this.d == c7427lm4 && c7427lm4.a.getUrl().equals(c7427lm4.b);
    }
}

package defpackage;

import java.util.HashSet;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7928nE {
    public static final HashSet c = new HashSet();
    public final String a;
    public final boolean b;

    public C7928nE(String str, boolean z) {
        this.a = str;
        c.add(str);
        this.b = z;
    }

    public final boolean a() {
        return CachedFeatureFlags.isEnabled(this.a, this.b);
    }
}

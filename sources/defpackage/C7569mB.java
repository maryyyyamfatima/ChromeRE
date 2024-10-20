package defpackage;

import J.N;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7569mB extends AbstractC7584mE {
    public final boolean c;

    public C7569mB(String str, String str2, boolean z) {
        super(str, str2);
        this.c = z;
    }

    public final boolean c() {
        return CachedFeatureFlags.b(b(), this.c);
    }

    @Override // defpackage.AbstractC7584mE
    public final void a() {
        C7928nE c7928nE = UN.a;
        O83.a.p(b(), N.M6bsIDpc(this.a, this.b, this.c));
    }
}

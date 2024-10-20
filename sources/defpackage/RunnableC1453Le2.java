package defpackage;

import org.chromium.chrome.browser.browserservices.verification.OriginVerifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Le2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1453Le2 implements Runnable {
    public final C1193Je2 a;
    public final boolean g;
    public final Boolean h;
    public final /* synthetic */ OriginVerifier i;

    @Override // java.lang.Runnable
    public final void run() {
        this.i.a(this.a, this.g, this.h);
    }

    public RunnableC1453Le2(OriginVerifier originVerifier, C1193Je2 c1193Je2, boolean z, Boolean bool) {
        this.i = originVerifier;
        this.a = c1193Je2;
        this.g = z;
        this.h = bool;
    }
}

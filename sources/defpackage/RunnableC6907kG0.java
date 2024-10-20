package defpackage;

import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kG0 */
/* loaded from: classes2.dex */
public final class RunnableC6907kG0 implements Runnable {
    public final /* synthetic */ LoadUrlParams a;
    public final /* synthetic */ C12055zG0 g;

    @Override // java.lang.Runnable
    public final void run() {
        C5877hG0 c5877hG0 = (C5877hG0) this.g.a;
        if (c5877hG0.i()) {
            c5877hG0.a.d(this.a);
        }
    }

    public RunnableC6907kG0(C12055zG0 c12055zG0, LoadUrlParams loadUrlParams) {
        this.g = c12055zG0;
        this.a = loadUrlParams;
    }
}

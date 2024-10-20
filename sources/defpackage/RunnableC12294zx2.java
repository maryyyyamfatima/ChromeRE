package defpackage;

import org.chromium.content_public.browser.MessagePort;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zx2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC12294zx2 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C0118Ax2 g;

    @Override // java.lang.Runnable
    public final void run() {
        C0118Ax2 c0118Ax2 = this.g;
        MessagePort[] messagePortArr = c0118Ax2.d;
        if (messagePortArr == null || messagePortArr[0].isClosed()) {
            return;
        }
        c0118Ax2.d[0].a(new C9045qV1(this.a));
    }

    public RunnableC12294zx2(C0118Ax2 c0118Ax2, String str) {
        this.g = c0118Ax2;
        this.a = str;
    }
}

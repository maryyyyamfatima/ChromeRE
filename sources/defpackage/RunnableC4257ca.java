package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.androidoverlay.AndroidOverlayProviderImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4257ca implements Runnable {
    public final /* synthetic */ AndroidOverlayProviderImpl a;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getClass();
        Object obj = ThreadUtils.a;
        r0.a--;
    }

    public RunnableC4257ca(AndroidOverlayProviderImpl androidOverlayProviderImpl) {
        this.a = androidOverlayProviderImpl;
    }
}

package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.download.DownloadManagerBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gs0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5741gs0 extends AbstractC0185Bl {
    public final long h;
    public final Callback i;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.i.onResult((C5397fs0) obj);
    }

    public C5741gs0(Callback callback, long j) {
        this.h = j;
        this.i = callback;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return DownloadManagerBridge.b(this.h);
    }
}

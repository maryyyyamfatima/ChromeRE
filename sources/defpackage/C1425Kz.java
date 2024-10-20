package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kz */
/* loaded from: classes.dex */
public final class C1425Kz extends AbstractC1684Mz {
    public final /* synthetic */ long a;
    public final /* synthetic */ Runnable g;
    public final /* synthetic */ BookmarkBridge h;

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
    }

    public C1425Kz(BookmarkBridge bookmarkBridge, long j, Runnable runnable) {
        this.h = bookmarkBridge;
        this.a = j;
        this.g = runnable;
    }

    @Override // defpackage.AbstractC1684Mz
    public final void d() {
        this.h.o(this);
        EI2.n(SystemClock.elapsedRealtime() - this.a, "PartnerBookmark.LoadingTime");
        this.g.run();
    }
}

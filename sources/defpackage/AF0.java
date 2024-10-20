package defpackage;

import android.os.SystemClock;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.chrome.features.start_surface.StartSurfaceConfiguration;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class AF0 extends UI0 {
    public final /* synthetic */ BF0 f;

    @Override // defpackage.UI0, defpackage.QI0
    public final void b() {
        BF0 bf0 = this.f;
        if (bf0.e == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bf0.e = elapsedRealtime;
            if (bf0.f) {
                long j = bf0.g;
                if (j != 0 && elapsedRealtime != 0) {
                    StartSurfaceConfiguration.b(elapsedRealtime - j, "FeedContentFirstLoadedTime", bf0.d);
                }
                bf0.f = false;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AF0(BF0 bf0, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, BookmarkBridge bookmarkBridge, C4270cc0 c4270cc0) {
        super(bf0.a, viewOnClickListenerC1069If3, bf0.c, bookmarkBridge, c4270cc0);
        this.f = bf0;
    }

    @Override // defpackage.UI0, defpackage.QI0
    public final void a() {
        this.f.h = SystemClock.elapsedRealtime();
    }
}

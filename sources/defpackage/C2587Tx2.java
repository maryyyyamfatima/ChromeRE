package defpackage;

import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tx2 */
/* loaded from: classes.dex */
public final class C2587Tx2 extends AbstractC1684Mz {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ BookmarkBridge g;

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
    }

    public C2587Tx2(RunnableC1807Nx2 runnableC1807Nx2, BookmarkBridge bookmarkBridge) {
        this.a = runnableC1807Nx2;
        this.g = bookmarkBridge;
    }

    @Override // defpackage.AbstractC1684Mz
    public final void d() {
        this.a.run();
        this.g.o(this);
    }
}

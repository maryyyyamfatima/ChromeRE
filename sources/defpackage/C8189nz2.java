package defpackage;

import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nz2 */
/* loaded from: classes.dex */
public final class C8189nz2 extends AbstractC1684Mz {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ BookmarkBridge g;

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
    }

    public C8189nz2(RunnableC7845mz2 runnableC7845mz2, BookmarkBridge bookmarkBridge) {
        this.a = runnableC7845mz2;
        this.g = bookmarkBridge;
    }

    @Override // defpackage.AbstractC1684Mz
    public final void d() {
        this.a.run();
        this.g.o(this);
    }
}

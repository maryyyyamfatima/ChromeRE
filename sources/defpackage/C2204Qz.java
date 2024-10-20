package defpackage;

import org.chromium.chrome.browser.app.bookmarks.BookmarkEditActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qz */
/* loaded from: classes.dex */
public final class C2204Qz extends AbstractC1684Mz {
    public final /* synthetic */ BookmarkEditActivity a;

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        BookmarkEditActivity bookmarkEditActivity = this.a;
        if (bookmarkEditActivity.B.d(bookmarkEditActivity.C)) {
            bookmarkEditActivity.u0(true);
        } else {
            if (bookmarkEditActivity.G) {
                return;
            }
            bookmarkEditActivity.finish();
        }
    }

    public C2204Qz(BookmarkEditActivity bookmarkEditActivity) {
        this.a = bookmarkEditActivity;
    }
}

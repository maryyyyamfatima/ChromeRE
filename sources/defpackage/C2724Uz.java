package defpackage;

import org.chromium.chrome.browser.app.bookmarks.BookmarkFolderSelectActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uz */
/* loaded from: classes.dex */
public final class C2724Uz extends AbstractC1684Mz {
    public final /* synthetic */ BookmarkFolderSelectActivity a;

    @Override // defpackage.AbstractC1684Mz
    public final void i(BookmarkBridge.BookmarkItem bookmarkItem, BookmarkBridge.BookmarkItem bookmarkItem2, boolean z) {
        BookmarkFolderSelectActivity bookmarkFolderSelectActivity = this.a;
        if (!bookmarkFolderSelectActivity.D.contains(bookmarkItem2.c)) {
            if (bookmarkItem2.d) {
                bookmarkFolderSelectActivity.x0();
            }
        } else {
            bookmarkFolderSelectActivity.D.remove(bookmarkItem2.c);
            if (bookmarkFolderSelectActivity.D.isEmpty()) {
                bookmarkFolderSelectActivity.v0(bookmarkFolderSelectActivity.D);
            }
        }
    }

    public C2724Uz(BookmarkFolderSelectActivity bookmarkFolderSelectActivity) {
        this.a = bookmarkFolderSelectActivity;
    }

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        int i = BookmarkFolderSelectActivity.I;
        this.a.x0();
    }
}

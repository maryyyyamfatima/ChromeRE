package defpackage;

import J.N;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.app.bookmarks.BookmarkAddEditFolderActivity;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iz */
/* loaded from: classes.dex */
public final class C1165Iz extends AbstractC1684Mz {
    public final /* synthetic */ BookmarkAddEditFolderActivity a;

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        BookmarkAddEditFolderActivity bookmarkAddEditFolderActivity = this.a;
        if (bookmarkAddEditFolderActivity.B) {
            if (bookmarkAddEditFolderActivity.D.d(bookmarkAddEditFolderActivity.C)) {
                bookmarkAddEditFolderActivity.v0(bookmarkAddEditFolderActivity.C);
                return;
            } else {
                bookmarkAddEditFolderActivity.v0(bookmarkAddEditFolderActivity.D.i());
                return;
            }
        }
        if (bookmarkAddEditFolderActivity.D.d(bookmarkAddEditFolderActivity.I)) {
            bookmarkAddEditFolderActivity.v0(bookmarkAddEditFolderActivity.D.f(bookmarkAddEditFolderActivity.I).e);
        } else {
            bookmarkAddEditFolderActivity.finish();
        }
    }

    public C1165Iz(BookmarkAddEditFolderActivity bookmarkAddEditFolderActivity) {
        this.a = bookmarkAddEditFolderActivity;
    }

    @Override // defpackage.AbstractC1684Mz
    public final void h(BookmarkBridge.BookmarkItem bookmarkItem, BookmarkBridge.BookmarkItem bookmarkItem2, int i) {
        if (bookmarkItem.c.equals(bookmarkItem2.c)) {
            return;
        }
        BookmarkAddEditFolderActivity bookmarkAddEditFolderActivity = this.a;
        C8938qA c8938qA = bookmarkAddEditFolderActivity.D;
        c8938qA.getClass();
        Object obj = ThreadUtils.a;
        long j = c8938qA.c;
        BookmarkId bookmarkId = bookmarkItem2.c;
        if (((BookmarkId) N.MvzSBRAY(j, c8938qA, bookmarkId.getId(), bookmarkId.getType(), i)).equals(bookmarkAddEditFolderActivity.I)) {
            bookmarkAddEditFolderActivity.v0(bookmarkId);
        }
    }

    @Override // defpackage.AbstractC1684Mz
    public final void i(BookmarkBridge.BookmarkItem bookmarkItem, BookmarkBridge.BookmarkItem bookmarkItem2, boolean z) {
        BookmarkId bookmarkId = bookmarkItem2.c;
        BookmarkAddEditFolderActivity bookmarkAddEditFolderActivity = this.a;
        if (bookmarkId.equals(bookmarkAddEditFolderActivity.I)) {
            bookmarkAddEditFolderActivity.finish();
        }
    }
}

package defpackage;

import android.view.View;
import org.chromium.chrome.browser.app.bookmarks.BookmarkEditActivity;
import org.chromium.chrome.browser.app.bookmarks.BookmarkFolderSelectActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rz */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2334Rz implements View.OnClickListener {
    public final /* synthetic */ BookmarkEditActivity a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BookmarkEditActivity bookmarkEditActivity = this.a;
        bookmarkEditActivity.G = true;
        bookmarkEditActivity.startActivityForResult(BookmarkFolderSelectActivity.u0(bookmarkEditActivity, false, bookmarkEditActivity.C), 15);
    }

    public ViewOnClickListenerC2334Rz(BookmarkEditActivity bookmarkEditActivity) {
        this.a = bookmarkEditActivity;
    }
}

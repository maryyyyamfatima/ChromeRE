package defpackage;

import android.graphics.Bitmap;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XA {
    public String a;
    public GURL b;
    public BookmarkId c;
    public BookmarkId d;
    public boolean e;
    public Bitmap f;

    public static XA a(BookmarkBridge.BookmarkItem bookmarkItem) {
        if (bookmarkItem == null) {
            return null;
        }
        XA xa = new XA();
        xa.a = bookmarkItem.a;
        xa.b = bookmarkItem.b;
        xa.c = bookmarkItem.c;
        xa.d = bookmarkItem.e;
        xa.e = bookmarkItem.d;
        return xa;
    }
}

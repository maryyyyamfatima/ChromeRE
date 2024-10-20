package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QA {
    public int a;
    public String b;
    public BookmarkId c;

    public static QA a(C8938qA c8938qA, BookmarkId bookmarkId) {
        BookmarkId bookmarkId2 = BookmarkId.c;
        if (bookmarkId2.equals(bookmarkId)) {
            QA qa = new QA();
            qa.a = 2;
            qa.b = "chrome-native://bookmarks/folder//shopping";
            qa.c = bookmarkId2;
            return qa;
        }
        Uri.Builder buildUpon = Uri.parse("chrome-native://bookmarks/folder/").buildUpon();
        buildUpon.appendPath(bookmarkId.toString());
        return b(buildUpon.build(), c8938qA);
    }

    public static QA b(Uri uri, C8938qA c8938qA) {
        QA qa = new QA();
        qa.a = 0;
        String uri2 = uri.toString();
        qa.b = uri2;
        if (uri2.equals("chrome-native://bookmarks/")) {
            return a(c8938qA, c8938qA.t());
        }
        if (qa.b.startsWith("chrome-native://bookmarks/folder/")) {
            String lastPathSegment = uri.getLastPathSegment();
            if (!lastPathSegment.isEmpty()) {
                qa.c = BookmarkId.a(lastPathSegment);
                qa.a = 2;
            }
        }
        return !qa.c(c8938qA) ? a(c8938qA, c8938qA.t()) : qa;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof QA)) {
            return false;
        }
        QA qa = (QA) obj;
        return this.a == qa.a && TextUtils.equals(this.b, qa.b);
    }

    public final boolean c(C8938qA c8938qA) {
        String str = this.b;
        if (str == null || this.a == 0) {
            return false;
        }
        if (str.equals("chrome-native://bookmarks/folder//shopping") || this.a != 2) {
            return true;
        }
        BookmarkId bookmarkId = this.c;
        return bookmarkId != null && c8938qA.d(bookmarkId);
    }
}

package org.chromium.components.bookmarks;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BookmarkId {
    public static final BookmarkId c = new BookmarkId(0, -3);
    public final long a;
    public final int b;

    public BookmarkId(int i, long j) {
        this.a = j;
        this.b = i;
    }

    public static BookmarkId a(String str) {
        long j = -1;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return new BookmarkId(0, -1L);
        }
        char charAt = str.charAt(0);
        if (charAt == 'p' || charAt == 'r') {
            if (charAt == 'p') {
                i = 1;
            } else if (charAt == 'r') {
                i = 2;
            }
            str = str.substring(1);
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
            Log.e("BookmarkId", "Error parsing url to extract the bookmark folder id.", e);
        }
        return new BookmarkId(i, j);
    }

    public long getId() {
        return this.a;
    }

    public int getType() {
        return this.b;
    }

    public static BookmarkId createBookmarkId(long j, int i) {
        return new BookmarkId(i, j);
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        if (i == 1) {
            valueOf = String.valueOf('p');
        } else {
            valueOf = i != 2 ? "" : String.valueOf('r');
        }
        sb.append(valueOf);
        sb.append(this.a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BookmarkId)) {
            return false;
        }
        BookmarkId bookmarkId = (BookmarkId) obj;
        return bookmarkId.a == this.a && bookmarkId.b == this.b;
    }

    public final int hashCode() {
        return toString().hashCode();
    }
}

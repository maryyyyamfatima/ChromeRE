package defpackage;

import android.database.Cursor;
import android.net.Uri;
import java.util.NoSuchElementException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dj2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438Dj2 implements InterfaceC0048Aj2 {
    public static final Uri g = new Uri.Builder().scheme("content").authority("com.android.partnerbookmarks").build().buildUpon().appendPath("bookmarks").build();
    public static final String[] h = {"_id", "url", "title", "type", "parent", "favicon", "touchicon"};
    public final Cursor a;

    public C0438Dj2(Cursor cursor) {
        this.a = cursor;
    }

    @Override // defpackage.InterfaceC0048Aj2
    public final void close() {
        Cursor cursor = this.a;
        if (cursor == null) {
            throw new IllegalStateException();
        }
        cursor.close();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Cursor cursor = this.a;
        if (cursor != null) {
            return (cursor.getCount() <= 0 || cursor.isLast() || cursor.isAfterLast()) ? false : true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Cursor cursor = this.a;
        if (cursor == null) {
            throw new IllegalStateException();
        }
        if (!cursor.moveToNext()) {
            throw new NoSuchElementException();
        }
        C0178Bj2 c0178Bj2 = new C0178Bj2();
        try {
            long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            c0178Bj2.a = j;
            if (j == 0) {
                AbstractC4851eH1.d("PartnerBookmarks", "Dropping the bookmark: reserved _id was used", new Object[0]);
            } else {
                long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("parent"));
                c0178Bj2.b = j2;
                if (j2 == 0) {
                    c0178Bj2.b = 0L;
                }
                c0178Bj2.c = cursor.getInt(cursor.getColumnIndexOrThrow("type")) == 2;
                c0178Bj2.d = cursor.getString(cursor.getColumnIndexOrThrow("url"));
                c0178Bj2.e = cursor.getString(cursor.getColumnIndexOrThrow("title"));
                c0178Bj2.f = cursor.getBlob(cursor.getColumnIndexOrThrow("favicon"));
                c0178Bj2.g = cursor.getBlob(cursor.getColumnIndexOrThrow("touchicon"));
                if ((c0178Bj2.c || c0178Bj2.d != null) && c0178Bj2.e != null) {
                    return c0178Bj2;
                }
                AbstractC4851eH1.d("PartnerBookmarks", "Dropping the bookmark: no title, or no url on a non-foler", new Object[0]);
            }
        } catch (IllegalArgumentException e) {
            AbstractC4851eH1.d("PartnerBookmarks", "Dropping the bookmark: " + e.getMessage(), new Object[0]);
        }
        return null;
    }
}

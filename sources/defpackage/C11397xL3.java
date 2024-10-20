package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xL3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11397xL3 implements JL3 {
    public static final String[] b = {"_data"};
    public final ContentResolver a;

    public C11397xL3(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.JL3
    public final Cursor a(Uri uri) {
        return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}

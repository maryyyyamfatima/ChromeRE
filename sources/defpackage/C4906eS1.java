package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.util.Log;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eS1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4906eS1 {
    public final Uri a;
    public final ContentValues b;

    public C4906eS1(Uri uri, String str, String str2) {
        Objects.requireNonNull(uri);
        this.a = uri;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        this.b = contentValues;
        Objects.requireNonNull(str);
        contentValues.put("_display_name", str);
        Objects.requireNonNull(str2);
        contentValues.put("mime_type", str2);
        contentValues.put("date_added", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        try {
            contentValues.put("is_pending", (Integer) 1);
        } catch (Exception e) {
            Log.e("MediaStoreUtils", "Unable to set pending content values.", e);
        }
    }
}

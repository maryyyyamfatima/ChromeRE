package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.MatrixCursor;
import android.net.Uri;
import java.io.PrintWriter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10828vh3 {
    public AbstractC11171wh3 a;

    public abstract int a(Uri uri);

    public void b(PrintWriter printWriter) {
    }

    public abstract String d(Uri uri);

    public abstract Uri e(Uri uri, ContentValues contentValues);

    public abstract MatrixCursor f(Uri uri, String[] strArr);

    public abstract int h(Uri uri, ContentValues contentValues);

    public void g(AbstractC11171wh3 abstractC11171wh3) {
        this.a = abstractC11171wh3;
    }

    public final Context c() {
        return this.a.getContext();
    }
}

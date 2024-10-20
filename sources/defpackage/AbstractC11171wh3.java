package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11171wh3 extends ContentProvider {
    public final Object a = new Object();
    public AbstractC10828vh3 g;
    public final String h;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    public AbstractC11171wh3(String str) {
        this.h = str;
    }

    public final AbstractC10828vh3 a() {
        AbstractC10828vh3 abstractC10828vh3;
        synchronized (this.a) {
            if (this.g == null) {
                AbstractC10828vh3 abstractC10828vh32 = (AbstractC10828vh3) BundleUtils.e(AbstractApplicationC9799sh3.b(getContext()), this.h);
                this.g = abstractC10828vh32;
                abstractC10828vh32.g(this);
            }
            abstractC10828vh3 = this.g;
        }
        return abstractC10828vh3;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return a().f(uri, strArr2);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return a().e(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return a().a(uri);
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return a().h(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return a().d(uri);
    }

    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        a().b(printWriter);
    }
}

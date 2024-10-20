package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8999qM0 extends AbstractC7935nF1 {
    @Override // defpackage.AbstractC7935nF1
    public final void d(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public C8999qM0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.AbstractC7935nF1
    public final Object f(ContentResolver contentResolver, Uri uri) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
        }
        return openAssetFileDescriptor.getParcelFileDescriptor();
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return ParcelFileDescriptor.class;
    }
}

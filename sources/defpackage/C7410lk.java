package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7410lk extends AbstractC7935nF1 {
    @Override // defpackage.AbstractC7935nF1
    public final void d(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    public C7410lk(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.AbstractC7935nF1
    public final Object f(ContentResolver contentResolver, Uri uri) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: ".concat(String.valueOf(uri)));
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return AssetFileDescriptor.class;
    }
}

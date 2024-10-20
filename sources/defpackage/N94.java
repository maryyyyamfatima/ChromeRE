package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class N94 implements M94 {
    @Override // defpackage.M94
    public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}

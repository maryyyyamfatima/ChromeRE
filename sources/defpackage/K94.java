package defpackage;

import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class K94 implements M94 {
    @Override // defpackage.M94
    public final void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new J94((ByteBuffer) obj));
    }
}

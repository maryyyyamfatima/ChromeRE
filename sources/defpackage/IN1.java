package defpackage;

import android.media.MediaDrm;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IN1 implements MediaDrm.OnExpirationUpdateListener {
    public final /* synthetic */ MediaDrmBridge a;

    public IN1(MediaDrmBridge mediaDrmBridge) {
        this.a = mediaDrmBridge;
    }

    @Override // android.media.MediaDrm.OnExpirationUpdateListener
    public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
        MediaDrmBridge mediaDrmBridge = this.a;
        PN1 a = MediaDrmBridge.a(mediaDrmBridge, bArr);
        MediaDrmBridge.b(mediaDrmBridge, a, new HN1(this, a, j));
    }
}

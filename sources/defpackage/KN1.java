package defpackage;

import android.media.MediaDrm;
import java.util.List;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KN1 implements MediaDrm.OnKeyStatusChangeListener {
    public final /* synthetic */ MediaDrmBridge a;

    public KN1(MediaDrmBridge mediaDrmBridge) {
        this.a = mediaDrmBridge;
    }

    @Override // android.media.MediaDrm.OnKeyStatusChangeListener
    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        MediaDrmBridge mediaDrmBridge = this.a;
        PN1 a = MediaDrmBridge.a(mediaDrmBridge, bArr);
        MediaDrmBridge.b(mediaDrmBridge, a, new JN1(this, a, z, list, mediaDrmBridge.g.a(a).c == 3));
    }
}

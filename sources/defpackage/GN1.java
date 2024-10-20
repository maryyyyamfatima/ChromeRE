package defpackage;

import android.media.MediaDrm;
import android.media.NotProvisionedException;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class GN1 implements MediaDrm.OnEventListener {
    public final /* synthetic */ MediaDrmBridge a;

    public GN1(MediaDrmBridge mediaDrmBridge) {
        this.a = mediaDrmBridge;
    }

    @Override // android.media.MediaDrm.OnEventListener
    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        if (bArr == null) {
            AbstractC4851eH1.a("media", "EventListener: No session for event %d.", Integer.valueOf(i));
            return;
        }
        MediaDrmBridge mediaDrmBridge = this.a;
        PN1 a = MediaDrmBridge.a(mediaDrmBridge, bArr);
        if (a == null) {
            AbstractC4851eH1.a("media", "EventListener: Invalid session %s", PN1.a(bArr));
            return;
        }
        QN1 a2 = mediaDrmBridge.g.a(a);
        if (i != 2) {
            if (i == 3 || i == 4) {
                return;
            }
            AbstractC4851eH1.a("media", AbstractC9076qb1.a("Invalid DRM event ", i), new Object[0]);
            return;
        }
        try {
            MediaDrm.KeyRequest e = this.a.e(a, bArr2, a2.b, a2.c, null);
            if (e != null) {
                mediaDrmBridge.l(a, e);
            } else {
                AbstractC4851eH1.a("media", "EventListener: getKeyRequest failed.", new Object[0]);
            }
        } catch (NotProvisionedException e2) {
            AbstractC4851eH1.a("media", "Device not provisioned", e2);
        }
    }
}

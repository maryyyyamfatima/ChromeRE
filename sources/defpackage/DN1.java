package defpackage;

import java.util.UUID;
import org.chromium.base.Callback;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class DN1 implements Callback {
    public final /* synthetic */ long a;
    public final /* synthetic */ MediaDrmBridge g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public DN1(MediaDrmBridge mediaDrmBridge, long j) {
        this.g = mediaDrmBridge;
        this.a = j;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            AbstractC4851eH1.f("media", "Failed to clear persistent storage for non-exist license", new Object[0]);
        }
        UUID uuid = MediaDrmBridge.l;
        MediaDrmBridge mediaDrmBridge = this.g;
        mediaDrmBridge.getClass();
        byte[] bArr = new byte[0];
        mediaDrmBridge.j(this.a, new PN1(bArr, bArr, null));
    }
}

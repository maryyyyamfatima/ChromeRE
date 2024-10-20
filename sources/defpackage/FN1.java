package defpackage;

import java.util.UUID;
import org.chromium.base.Callback;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FN1 implements Callback {
    public final /* synthetic */ MediaDrmBridge a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public FN1(MediaDrmBridge mediaDrmBridge) {
        this.a = mediaDrmBridge;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        MediaDrmBridge mediaDrmBridge = this.a;
        if (!booleanValue) {
            AbstractC4851eH1.a("media", "Failed to initialize storage for origin", new Object[0]);
            UUID uuid = MediaDrmBridge.l;
            mediaDrmBridge.o();
        } else {
            UUID uuid2 = MediaDrmBridge.l;
            mediaDrmBridge.d();
        }
    }
}

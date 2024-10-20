package defpackage;

import J.N;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import java.util.UUID;
import org.chromium.base.Callback;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class EN1 implements Callback {
    public final /* synthetic */ long a;
    public final /* synthetic */ PN1 g;
    public final /* synthetic */ QN1 h;
    public final /* synthetic */ MediaDrmBridge i;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public EN1(MediaDrmBridge mediaDrmBridge, long j, PN1 pn1, QN1 qn1) {
        this.i = mediaDrmBridge;
        this.a = j;
        this.g = pn1;
        this.h = qn1;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long j = this.a;
        MediaDrmBridge mediaDrmBridge = this.i;
        if (!booleanValue) {
            UUID uuid = MediaDrmBridge.l;
            mediaDrmBridge.i(j, "Fail to update persistent storage");
            return;
        }
        PN1 pn1 = this.g;
        String str = this.h.b;
        UUID uuid2 = MediaDrmBridge.l;
        mediaDrmBridge.getClass();
        try {
            MediaDrm.KeyRequest e = mediaDrmBridge.e(pn1, null, str, 3, null);
            if (e == null) {
                mediaDrmBridge.i(j, "Fail to generate key release request");
                return;
            }
            if (mediaDrmBridge.h()) {
                N.MOzXytse(mediaDrmBridge.c, mediaDrmBridge, j);
            }
            mediaDrmBridge.l(pn1, e);
        } catch (NotProvisionedException unused) {
            AbstractC4851eH1.a("media", "removeSession called on unprovisioned device", new Object[0]);
            mediaDrmBridge.i(j, "Unknown failure");
        }
    }
}

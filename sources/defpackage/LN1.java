package defpackage;

import J.N;
import java.util.UUID;
import org.chromium.base.Callback;
import org.chromium.media.MediaDrmBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LN1 implements Callback {
    public final PN1 a;
    public final long g;
    public final /* synthetic */ MediaDrmBridge h;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public LN1(MediaDrmBridge mediaDrmBridge, PN1 pn1, long j, boolean z) {
        this.h = mediaDrmBridge;
        this.a = pn1;
        this.g = j;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onResult(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        long j = this.g;
        MediaDrmBridge mediaDrmBridge = this.h;
        if (!booleanValue) {
            UUID uuid = MediaDrmBridge.l;
            mediaDrmBridge.i(j, "failed to update key after response accepted");
            return;
        }
        this.a.b();
        UUID uuid2 = MediaDrmBridge.l;
        if (mediaDrmBridge.h()) {
            N.MOzXytse(mediaDrmBridge.c, mediaDrmBridge, j);
        }
    }
}

package defpackage;

import java.nio.ByteBuffer;
import org.chromium.base.Callback;
import org.chromium.media.MediaDrmStorageBridge$PersistentInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class ON1 implements Callback {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ RN1 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public ON1(RN1 rn1, CN1 cn1) {
        this.g = rn1;
        this.a = cn1;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        MediaDrmStorageBridge$PersistentInfo mediaDrmStorageBridge$PersistentInfo = (MediaDrmStorageBridge$PersistentInfo) obj;
        Callback callback = this.a;
        if (mediaDrmStorageBridge$PersistentInfo != null) {
            PN1 pn1 = new PN1(mediaDrmStorageBridge$PersistentInfo.emeId(), null, mediaDrmStorageBridge$PersistentInfo.keySetId());
            String mimeType = mediaDrmStorageBridge$PersistentInfo.mimeType();
            int keyType = mediaDrmStorageBridge$PersistentInfo.keyType();
            if (keyType != 2 && keyType != 3) {
                keyType = 2;
            }
            this.g.a.put(ByteBuffer.wrap(mediaDrmStorageBridge$PersistentInfo.emeId()), new QN1(pn1, mimeType, keyType));
            callback.onResult(pn1);
            return;
        }
        callback.onResult(null);
    }
}

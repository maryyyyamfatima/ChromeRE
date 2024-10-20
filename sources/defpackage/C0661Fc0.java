package defpackage;

import com.google.protobuf.BaseGeneratedExtensionRegistryLite$Loader;
import com.google.protobuf.MessageLite;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661Fc0 extends XF0 {
    public final HashMap e;

    public C0661Fc0() {
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        hashMap.put(BaseGeneratedExtensionRegistryLite$Loader.class, new BaseGeneratedExtensionRegistryLite$Loader().a());
    }

    @Override // defpackage.XF0
    public final OX0 b(MessageLite messageLite, int i) {
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            OX0 b = ((XF0) it.next()).b(messageLite, i);
            if (b != null) {
                return b;
            }
        }
        return null;
    }
}

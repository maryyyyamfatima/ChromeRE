package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Eo4 implements Callback {
    public final /* synthetic */ Ko4 a;
    public final /* synthetic */ Fo4 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public Eo4(Fo4 fo4, Ko4 ko4) {
        this.g = fo4;
        this.a = ko4;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.g.a.d(str, null).j = (C4498dF1) entry.getValue();
            }
        }
        this.a.a();
    }
}

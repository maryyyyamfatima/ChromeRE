package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Lo4 implements Callback {
    public final /* synthetic */ Ko4 a;
    public final /* synthetic */ Mo4 g;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public Lo4(Mo4 mo4, Ko4 ko4) {
        this.g = mo4;
        this.a = ko4;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Iterator it = ((ArrayList) obj).iterator();
        while (it.hasNext()) {
            C7426lm3 c7426lm3 = (C7426lm3) it.next();
            String str = c7426lm3.a;
            if (str != null) {
                this.g.a.d(str, null).k.add(c7426lm3);
            }
        }
        this.a.a();
    }
}

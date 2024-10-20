package defpackage;

import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gA3 */
/* loaded from: classes.dex */
public final class C5506gA3 implements Callback {
    public final /* synthetic */ C9284rA3 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C5506gA3(C9284rA3 c9284rA3) {
        this.a = c9284rA3;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            this.a.d((String) list.get(i), true);
        }
    }
}

package defpackage;

import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8971qG2 implements Callback {
    public final /* synthetic */ C9656sG2 a;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C9656sG2.a(this.a, (List) obj);
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}

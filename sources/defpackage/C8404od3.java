package defpackage;

import android.graphics.drawable.Drawable;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: od3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8404od3 implements Callback {
    public final /* synthetic */ C10461ud3 a;

    public /* synthetic */ C8404od3(C10461ud3 c10461ud3) {
        this.a = c10461ud3;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        PD2 pd2 = AbstractC10804vd3.b;
        this.a.h.o(pd2, (Drawable) obj);
    }
}

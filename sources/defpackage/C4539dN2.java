package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dN2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4539dN2 implements Callback {
    public final /* synthetic */ C5226fN2 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Integer num = (Integer) obj;
        C5226fN2 c5226fN2 = this.a;
        c5226fN2.getClass();
        c5226fN2.e = num.intValue();
        if (num.intValue() == 0) {
            c5226fN2.a(0, 1);
        } else {
            c5226fN2.a(c5226fN2.g == 4 ? 6 : 3, 1);
        }
        EI2.h(num.intValue(), 5, "Android.Download.Rename.Result");
    }
}

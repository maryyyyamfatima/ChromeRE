package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ch1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0297Ch1 implements Callback {
    public final /* synthetic */ Callback a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        byte[] bArr = (byte[]) obj;
        Callback callback = this.a;
        if (bArr == null || bArr.length == 0) {
            callback.onResult(null);
        } else {
            callback.onResult(new C5070ev(bArr));
        }
    }
}

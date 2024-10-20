package defpackage;

import android.graphics.Bitmap;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4044bv3 implements Callback {
    public final /* synthetic */ Callback a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.a.onResult(bitmap);
        }
    }
}

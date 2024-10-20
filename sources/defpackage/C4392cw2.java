package defpackage;

import android.graphics.Bitmap;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cw2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4392cw2 implements Callback {
    public final int a;
    public final int g;
    public int h;
    public final /* synthetic */ C4735dw2 i;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C4392cw2[][] c4392cw2Arr;
        boolean[][] zArr;
        Bitmap bitmap = (Bitmap) obj;
        TraceEvent.b("BitmapRequestHandler.onResult", null);
        int i = this.a;
        int i2 = this.g;
        C4735dw2 c4735dw2 = this.i;
        if (bitmap == null) {
            C4735dw2.b(c4735dw2, i, i2);
            C4392cw2[][] c4392cw2Arr2 = c4735dw2.e;
            if (c4392cw2Arr2 != null) {
                c4392cw2Arr2[i][i2] = null;
            }
            TraceEvent.c("BitmapRequestHandler.onResult");
            return;
        }
        Bitmap[][] bitmapArr = c4735dw2.d;
        if (bitmapArr != null && (c4392cw2Arr = c4735dw2.e) != null && (zArr = c4735dw2.f) != null && c4392cw2Arr[i][i2] != null && zArr[i][i2]) {
            bitmapArr[i][i2] = bitmap;
            C4735dw2.a(c4735dw2);
            C4735dw2.b(c4735dw2, i, i2);
            c4735dw2.e[i][i2] = null;
            TraceEvent.c("BitmapRequestHandler.onResult");
            return;
        }
        bitmap.recycle();
        C4735dw2.a(c4735dw2);
        C4735dw2.b(c4735dw2, i, i2);
        C4392cw2[][] c4392cw2Arr3 = c4735dw2.e;
        if (c4392cw2Arr3 != null) {
            c4392cw2Arr3[i][i2] = null;
        }
        TraceEvent.c("BitmapRequestHandler.onResult");
    }

    public C4392cw2(C4735dw2 c4735dw2, int i, int i2) {
        this.i = c4735dw2;
        this.a = i;
        this.g = i2;
    }
}

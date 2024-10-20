package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yn4 */
/* loaded from: classes2.dex */
public final class C11894yn4 extends AbstractC0185Bl {
    public final /* synthetic */ Xn4 h;
    public final /* synthetic */ C12237zn4 i;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        String string = this.i.b.getString("splash_icon", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        byte[] decode = Base64.decode(string, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public C11894yn4(C12237zn4 c12237zn4, Xn4 xn4) {
        this.i = c12237zn4;
        this.h = xn4;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Xn4 xn4 = this.h;
        xn4.getClass();
        int i = xn4.b;
        xn4.c.d(xn4.a, i, (Bitmap) obj, false);
    }
}

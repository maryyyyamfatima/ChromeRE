package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2766Vh1 implements InterfaceC3026Xh1 {
    public final C0972Hm1 a;
    public final C3492aK1 b;
    public final List c;

    @Override // defpackage.InterfaceC3026Xh1
    public final int a() {
        SI2 si2 = this.a.a;
        si2.reset();
        return AbstractC1207Jh1.a(this.b, si2, this.c);
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final Bitmap b(BitmapFactory.Options options) {
        SI2 si2 = this.a.a;
        si2.reset();
        return BitmapFactory.decodeStream(si2, null, options);
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final ImageHeaderParser$ImageType d() {
        SI2 si2 = this.a.a;
        si2.reset();
        return AbstractC1207Jh1.b(this.b, si2, this.c);
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final void c() {
        SI2 si2 = this.a.a;
        synchronized (si2) {
            si2.h = si2.a.length;
        }
    }

    public C2766Vh1(C3492aK1 c3492aK1, C4533dM1 c4533dM1, List list) {
        AbstractC6464iy2.b(c3492aK1);
        this.b = c3492aK1;
        AbstractC6464iy2.b(list);
        this.c = list;
        this.a = new C0972Hm1(c4533dM1, c3492aK1);
    }
}

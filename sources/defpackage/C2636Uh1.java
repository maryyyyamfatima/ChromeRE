package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Uh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2636Uh1 implements InterfaceC3026Xh1 {
    public final ByteBuffer a;
    public final List b;
    public final C3492aK1 c;

    @Override // defpackage.InterfaceC3026Xh1
    public final void c() {
    }

    public C2636Uh1(C3492aK1 c3492aK1, ByteBuffer byteBuffer, List list) {
        this.a = byteBuffer;
        this.b = list;
        this.c = c3492aK1;
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final ImageHeaderParser$ImageType d() {
        return AbstractC1207Jh1.c(RD.c(this.a), this.b);
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final int a() {
        ByteBuffer c = RD.c(this.a);
        C3492aK1 c3492aK1 = this.c;
        if (c == null) {
            return -1;
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int b = ((InterfaceC0947Hh1) list.get(i)).b(c, c3492aK1);
                if (b != -1) {
                    return b;
                }
            } finally {
                RD.c(c);
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC3026Xh1
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(new PD(RD.c(this.a)), null, options);
    }
}

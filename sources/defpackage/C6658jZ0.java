package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jZ0 */
/* loaded from: classes.dex */
public final class C6658jZ0 implements InterfaceC9389rV3 {
    public final InterfaceC9389rV3 b;

    public C6658jZ0(InterfaceC9389rV3 interfaceC9389rV3) {
        AbstractC6464iy2.b(interfaceC9389rV3);
        this.b = interfaceC9389rV3;
    }

    @Override // defpackage.InterfaceC9389rV3
    public final JO2 b(BZ0 bz0, JO2 jo2, int i, int i2) {
        C5284fZ0 c5284fZ0 = (C5284fZ0) jo2.get();
        JO2 c12296zy = new C12296zy(c5284fZ0.a.a.l, a.b(bz0).a);
        InterfaceC9389rV3 interfaceC9389rV3 = this.b;
        JO2 b = interfaceC9389rV3.b(bz0, c12296zy, i, i2);
        if (!c12296zy.equals(b)) {
            c12296zy.b();
        }
        c5284fZ0.a.a.c(interfaceC9389rV3, (Bitmap) b.get());
        return jo2;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (obj instanceof C6658jZ0) {
            return this.b.equals(((C6658jZ0) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.InterfaceC6098hu1
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tt0 */
/* loaded from: classes.dex */
public final class C2565Tt0 implements InterfaceC9389rV3 {
    public final InterfaceC9389rV3 b;
    public final boolean c;

    public C2565Tt0(InterfaceC9389rV3 interfaceC9389rV3, boolean z) {
        this.b = interfaceC9389rV3;
        this.c = z;
    }

    @Override // defpackage.InterfaceC9389rV3
    public final JO2 b(BZ0 bz0, JO2 jo2, int i, int i2) {
        InterfaceC11610xy interfaceC11610xy = a.b(bz0).a;
        Drawable drawable = (Drawable) jo2.get();
        C12296zy a = AbstractC2435St0.a(interfaceC11610xy, drawable, i, i2);
        if (a == null) {
            if (this.c) {
                throw new IllegalArgumentException(AbstractC4199cO1.a("Unable to convert ", String.valueOf(drawable), " to a Bitmap"));
            }
            return jo2;
        }
        JO2 b = this.b.b(bz0, a, i, i2);
        if (!b.equals(a)) {
            return new C3371Zy1(bz0.getResources(), b);
        }
        b.b();
        return jo2;
    }

    @Override // defpackage.InterfaceC6098hu1
    public final boolean equals(Object obj) {
        if (obj instanceof C2565Tt0) {
            return this.b.equals(((C2565Tt0) obj).b);
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

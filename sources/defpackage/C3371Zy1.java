package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3371Zy1 implements JO2, InterfaceC2656Ul1 {
    public final Resources a;
    public final JO2 g;

    public C3371Zy1(Resources resources, JO2 jo2) {
        AbstractC6464iy2.b(resources);
        this.a = resources;
        AbstractC6464iy2.b(jo2);
        this.g = jo2;
    }

    @Override // defpackage.JO2
    public final Class e() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.JO2
    public final Object get() {
        return new BitmapDrawable(this.a, (Bitmap) this.g.get());
    }

    @Override // defpackage.JO2
    public final int d() {
        return this.g.d();
    }

    @Override // defpackage.JO2
    public final void b() {
        this.g.b();
    }

    @Override // defpackage.InterfaceC2656Ul1
    public final void a() {
        JO2 jo2 = this.g;
        if (jo2 instanceof InterfaceC2656Ul1) {
            ((InterfaceC2656Ul1) jo2).a();
        }
    }
}

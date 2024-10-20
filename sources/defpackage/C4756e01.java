package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.bumptech.glide.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e01 */
/* loaded from: classes.dex */
public final class C4756e01 extends ComponentCallbacks2C5575gO2 {
    public C4756e01(a aVar, InterfaceC12026zA1 interfaceC12026zA1, InterfaceC7637mO2 interfaceC7637mO2, Context context) {
        super(aVar, interfaceC12026zA1, interfaceC7637mO2, context);
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 f(Class cls) {
        return new C4413d01(this.a, this, cls, this.g);
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 g() {
        return (C4413d01) super.g();
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 j() {
        return (C4413d01) super.j();
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 q(BitmapDrawable bitmapDrawable) {
        return (C4413d01) super.q(bitmapDrawable);
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 r(Uri uri) {
        return (C4413d01) super.r(uri);
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 s(Integer num) {
        return (C4413d01) super.s(num);
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 t(byte[] bArr) {
        return (C4413d01) super.t(bArr);
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 p() {
        return (C4413d01) super.p();
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final IN2 o() {
        return (C4413d01) super.o();
    }

    @Override // defpackage.ComponentCallbacks2C5575gO2
    public final void w(C7981nO2 c7981nO2) {
        if (c7981nO2 instanceof C4069c01) {
            super.w(c7981nO2);
        } else {
            super.w(new C4069c01().a(c7981nO2));
        }
    }
}

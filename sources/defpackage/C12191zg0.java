package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12191zg0 implements InterfaceC3145Yf0 {
    public final String a;
    public final C0031Ag0 g;
    public ByteArrayInputStream h;

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public C12191zg0(String str, C0031Ag0 c0031Ag0) {
        this.a = str;
        this.g = c0031Ag0;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        try {
            C0031Ag0 c0031Ag0 = this.g;
            String str = this.a;
            c0031Ag0.getClass();
            ByteArrayInputStream a = C0031Ag0.a(str);
            this.h = a;
            interfaceC3015Xf0.f(a);
        } catch (IllegalArgumentException e) {
            interfaceC3015Xf0.d(e);
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        try {
            C0031Ag0 c0031Ag0 = this.g;
            ByteArrayInputStream byteArrayInputStream = this.h;
            c0031Ag0.getClass();
            byteArrayInputStream.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        this.g.getClass();
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}

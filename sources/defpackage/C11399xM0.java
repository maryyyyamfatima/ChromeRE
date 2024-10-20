package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11399xM0 implements InterfaceC3145Yf0 {
    public final File a;
    public final InterfaceC11742yM0 g;
    public Object h;

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public C11399xM0(File file, InterfaceC11742yM0 interfaceC11742yM0) {
        this.a = file;
        this.g = interfaceC11742yM0;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        try {
            Object b = this.g.b(this.a);
            this.h = b;
            interfaceC3015Xf0.f(b);
        } catch (FileNotFoundException e) {
            interfaceC3015Xf0.d(e);
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        Object obj = this.h;
        if (obj != null) {
            try {
                this.g.c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return this.g.a();
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}

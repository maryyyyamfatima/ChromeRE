package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HD implements InterfaceC3145Yf0 {
    public final File a;

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public HD(File file) {
        this.a = file;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        try {
            interfaceC3015Xf0.f(RD.a(this.a));
        } catch (IOException e) {
            interfaceC3015Xf0.d(e);
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}

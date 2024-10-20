package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7754mk implements InterfaceC3145Yf0 {
    public final String a;
    public final AssetManager g;
    public Object h;

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public abstract void d(Object obj);

    public abstract Object f(AssetManager assetManager, String str);

    public AbstractC7754mk(AssetManager assetManager, String str) {
        this.g = assetManager;
        this.a = str;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        try {
            Object f = f(this.g, this.a);
            this.h = f;
            interfaceC3015Xf0.f(f);
        } catch (IOException e) {
            interfaceC3015Xf0.d(e);
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        Object obj = this.h;
        if (obj == null) {
            return;
        }
        try {
            d(obj);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}

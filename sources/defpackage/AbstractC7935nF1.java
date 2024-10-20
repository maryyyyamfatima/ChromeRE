package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7935nF1 implements InterfaceC3145Yf0 {
    public final Uri a;
    public final ContentResolver g;
    public Object h;

    @Override // defpackage.InterfaceC3145Yf0
    public final void cancel() {
    }

    public abstract void d(Object obj);

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    public AbstractC7935nF1(ContentResolver contentResolver, Uri uri) {
        this.g = contentResolver;
        this.a = uri;
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void c(EnumC7567mA2 enumC7567mA2, InterfaceC3015Xf0 interfaceC3015Xf0) {
        try {
            Object f = f(this.g, this.a);
            this.h = f;
            interfaceC3015Xf0.f(f);
        } catch (FileNotFoundException e) {
            interfaceC3015Xf0.d(e);
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final void b() {
        Object obj = this.h;
        if (obj != null) {
            try {
                d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.InterfaceC3145Yf0
    public final EnumC9447rg0 e() {
        return EnumC9447rg0.LOCAL;
    }
}

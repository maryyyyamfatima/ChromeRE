package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: c73 */
/* loaded from: classes2.dex */
public final class RunnableC4113c73 implements Runnable {
    public FileOutputStream a;
    public File g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i = true;
    public final /* synthetic */ String j;
    public final /* synthetic */ InterfaceC5144f73 k;
    public final /* synthetic */ Callback l;
    public final /* synthetic */ Callback m;

    public RunnableC4113c73(String str, String str2, InterfaceC5144f73 interfaceC5144f73, U63 u63, T63 t63) {
        this.h = str;
        this.j = str2;
        this.k = interfaceC5144f73;
        this.l = u63;
        this.m = t63;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Callback callback = this.m;
        try {
            File c = AbstractC5832h73.c(this.h, this.j, this.i);
            this.g = c;
            if (c != null && c.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(this.g);
                this.a = fileOutputStream;
                this.k.a(fileOutputStream, new C3770b73(this, this.l, callback));
            } else {
                AbstractC4851eH1.f("share", "Share failed -- Unable to create or write to destination file.", new Object[0]);
                AbstractC2663Um3.a(this.a);
                callback.onResult(null);
            }
        } catch (IOException unused) {
            AbstractC2663Um3.a(this.a);
            callback.onResult(null);
        }
    }
}

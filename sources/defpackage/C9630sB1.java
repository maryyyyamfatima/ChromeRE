package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.content_creation.reactions.LightweightReactionsProgressDialog;
import org.chromium.chrome.browser.content_creation.reactions.scene.ReactionLayout;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sB1 */
/* loaded from: classes.dex */
public final class C9630sB1 implements Callback {
    public final /* synthetic */ LightweightReactionsProgressDialog a;
    public final /* synthetic */ ZV2 g;
    public final /* synthetic */ C11817yb h;
    public final /* synthetic */ FileOutputStream i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ float l;
    public final /* synthetic */ C6539jB1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Callback r;
    public final /* synthetic */ C10316uB1 s;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    public C9630sB1(C10316uB1 c10316uB1, LightweightReactionsProgressDialog lightweightReactionsProgressDialog, ZV2 zv2, C11817yb c11817yb, FileOutputStream fileOutputStream, int i, int i2, float f, C6539jB1 c6539jB1, int i3, int i4, int i5, int i6, C3770b73 c3770b73) {
        this.s = c10316uB1;
        this.a = lightweightReactionsProgressDialog;
        this.g = zv2;
        this.h = c11817yb;
        this.i = fileOutputStream;
        this.j = i;
        this.k = i2;
        this.l = f;
        this.m = c6539jB1;
        this.n = i3;
        this.o = i4;
        this.p = i5;
        this.q = i6;
        this.r = c3770b73;
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        C10316uB1 c10316uB1 = this.s;
        boolean z = c10316uB1.c;
        LightweightReactionsProgressDialog lightweightReactionsProgressDialog = this.a;
        C11817yb c11817yb = this.h;
        if (z) {
            if (lightweightReactionsProgressDialog.m0.isShowing()) {
                lightweightReactionsProgressDialog.m0.dismiss();
                Iterator it = this.g.c.iterator();
                while (it.hasNext()) {
                    C9661sH2 c9661sH2 = ((ReactionLayout) it.next()).k;
                    if (c9661sH2.g0) {
                        c9661sH2.g0 = false;
                    }
                    c9661sH2.start();
                }
            }
            c11817yb.b();
            AbstractC2663Um3.a(this.i);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.j, this.k, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = this.l;
        canvas.scale(f, f);
        C6539jB1 c6539jB1 = this.m;
        c6539jB1.a.o.h.draw(canvas);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, this.n, 0, this.o, this.p);
        if (createBitmap2 != null) {
            if (c11817yb.f) {
                try {
                    int width = createBitmap2.getWidth();
                    int height = createBitmap2.getHeight();
                    c11817yb.a = width;
                    c11817yb.b = height;
                    c11817yb.h = createBitmap2;
                    c11817yb.c();
                    c11817yb.a();
                    if (c11817yb.o) {
                        c11817yb.g(c11817yb.a);
                        c11817yb.g(c11817yb.b);
                        c11817yb.g.write(c11817yb.n | 240);
                        c11817yb.g.write(0);
                        c11817yb.g.write(0);
                        OutputStream outputStream = c11817yb.g;
                        byte[] bArr = c11817yb.l;
                        outputStream.write(bArr, 0, bArr.length);
                        int length = 768 - c11817yb.l.length;
                        for (int i = 0; i < length; i++) {
                            c11817yb.g.write(0);
                        }
                        if (c11817yb.d >= 0) {
                            c11817yb.e();
                        }
                    }
                    c11817yb.d();
                    c11817yb.g.write(44);
                    c11817yb.g(0);
                    c11817yb.g(0);
                    c11817yb.g(c11817yb.a);
                    c11817yb.g(c11817yb.b);
                    if (c11817yb.o) {
                        c11817yb.g.write(0);
                    } else {
                        c11817yb.g.write(c11817yb.n | 128);
                    }
                    if (!c11817yb.o) {
                        OutputStream outputStream2 = c11817yb.g;
                        byte[] bArr2 = c11817yb.l;
                        outputStream2.write(bArr2, 0, bArr2.length);
                        int length2 = 768 - c11817yb.l.length;
                        for (int i2 = 0; i2 < length2; i2++) {
                            c11817yb.g.write(0);
                        }
                    }
                    c11817yb.f();
                    c11817yb.o = false;
                } catch (IOException unused) {
                }
            }
        } else {
            c11817yb.getClass();
        }
        int i3 = c10316uB1.d + 1;
        c10316uB1.d = i3;
        double d = i3 * 100.0d;
        int i4 = this.q;
        int i5 = (int) (d / i4);
        if (lightweightReactionsProgressDialog.m0 != null) {
            PostTask.d(AbstractC5103f04.a, new RunnableC11002wB1(lightweightReactionsProgressDialog, i5));
        }
        if (c10316uB1.d >= i4) {
            this.r.onResult(Boolean.valueOf(c11817yb.b()));
        } else {
            c6539jB1.a(this);
        }
    }
}

package defpackage;

import J.N;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.android.chrome.R;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ze1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12180ze1 {
    public static final RunnableC12082zL2 s = new RunnableC12082zL2();
    public final Resources a;
    public final String b;
    public String c;
    public String d;
    public final int f;
    public final int g;
    public View h;
    public Runnable i;
    public Runnable j;
    public Runnable k;
    public Rect l;
    public ViewTreeObserverOnGlobalLayoutListenerC8754pe4 n;
    public Yc4 o;
    public Rect p;
    public boolean q;
    public boolean e = true;
    public long m = 0;
    public int r = 0;

    public C12180ze1(Resources resources, String str, int i, int i2) {
        this.a = resources;
        this.b = str;
        this.f = i;
        this.g = i2;
    }

    public final C11837ye1 a() {
        TraceEvent traceEvent;
        TraceEvent traceEvent2;
        C7928nE c7928nE = UN.a;
        if (!N.M09VlOh_("EnableIPH")) {
            return null;
        }
        boolean M09VlOh_ = N.M09VlOh_("AndroidScrollOptimizations");
        RunnableC12082zL2 runnableC12082zL2 = s;
        if (M09VlOh_) {
            TraceEvent i = TraceEvent.i("IPHCommandBuilder::buildLazy", null);
            try {
                if (this.k == null) {
                    this.k = runnableC12082zL2;
                }
                if (this.i == null) {
                    this.i = runnableC12082zL2;
                }
                if (this.j == null) {
                    this.j = runnableC12082zL2;
                }
                traceEvent2 = i;
            } catch (Throwable th) {
                th = th;
                traceEvent2 = i;
            }
            try {
                C11837ye1 c11837ye1 = new C11837ye1(this.a, this.b, this.f, this.g, this.e, this.h, this.k, this.i, this.j, this.m, this.n, this.o, this.p, this.q, this.r);
                if (traceEvent2 != null) {
                    traceEvent2.close();
                }
                return c11837ye1;
            } catch (Throwable th2) {
                th = th2;
                if (traceEvent2 != null) {
                    try {
                        traceEvent2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        TraceEvent i2 = TraceEvent.i("IPHCommandBuilder::build", null);
        try {
            if (this.k == null) {
                this.k = runnableC12082zL2;
            }
            if (this.i == null) {
                this.i = runnableC12082zL2;
            }
            if (this.j == null) {
                this.j = runnableC12082zL2;
            }
            String str = this.c;
            Resources resources = this.a;
            if (str == null) {
                this.c = resources.getString(this.f);
            }
            if (this.d == null) {
                this.d = resources.getString(this.g);
            }
            if (this.l == null && this.p == null) {
                this.l = new Rect(0, 0, 0, resources.getDimensionPixelOffset(R.dimen.f34380_resource_name_obfuscated_res_0x7f08038e));
            }
            traceEvent = i2;
        } catch (Throwable th3) {
            th = th3;
            traceEvent = i2;
        }
        try {
            C11837ye1 c11837ye12 = new C11837ye1(this.b, this.c, this.d, this.e, this.h, this.k, this.i, this.j, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
            if (traceEvent != null) {
                traceEvent.close();
            }
            return c11837ye12;
        } catch (Throwable th4) {
            th = th4;
            if (traceEvent != null) {
                try {
                    traceEvent.close();
                } catch (Throwable unused2) {
                }
            }
            throw th;
        }
    }
}

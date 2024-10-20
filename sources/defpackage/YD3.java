package defpackage;

import J.N;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import java.io.File;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.EventForwarder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YD3 implements J44 {
    public Tab a;
    public C1413Kw2 j;
    public C3799bD k;
    public Runnable l;
    public Callback m;
    public boolean n;
    public boolean o;
    public int p = -1;
    public final XD3 h = new XD3(this);
    public final PaintPreviewTabService i = (PaintPreviewTabService) N.M$ZOxizP();
    public final VD3 g = new VD3(this);

    public static YD3 b(Tab tab) {
        if (tab.F().b(YD3.class) == null) {
            tab.F().d(YD3.class, new YD3(tab));
        }
        return (YD3) tab.F().b(YD3.class);
    }

    public YD3(Tab tab) {
        this.a = tab;
    }

    public final boolean d(InterfaceC1283Jw2 interfaceC1283Jw2) {
        boolean MYa8QxsY;
        if (this.n) {
            return true;
        }
        TraceEvent.b("TabbedPaintPreview.maybeShow", null);
        int id = this.a.getId();
        PaintPreviewTabService paintPreviewTabService = this.i;
        long j = paintPreviewTabService.c;
        if (j == 0) {
            MYa8QxsY = false;
        } else {
            if (!(j == 0 ? false : N.MWP3QaBv(j))) {
                long j2 = paintPreviewTabService.c;
                String MPozT7P0 = j2 == 0 ? "" : N.MPozT7P0(j2);
                C7432ln3 c = C7432ln3.c();
                try {
                    MYa8QxsY = new File(MPozT7P0, id + ".zip").exists();
                    c.close();
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } else {
                MYa8QxsY = N.MYa8QxsY(paintPreviewTabService.c, id);
            }
        }
        if (!MYa8QxsY) {
            TraceEvent.c("TabbedPaintPreview.maybeShow");
            return false;
        }
        this.a.v(this.g);
        N.MJ3oAy5s();
        this.j = new C1413Kw2(this.a.getUrl(), this.a.getContext(), this.i, String.valueOf(this.a.getId()), interfaceC1283Jw2, AbstractC11746yN.b(this.a.getContext(), false));
        TraceEvent.b("TabbedPaintPreview.maybeShow addTabViewProvider", null);
        this.a.q().a(this.h);
        TraceEvent.c("TabbedPaintPreview.maybeShow addTabViewProvider");
        this.n = true;
        TraceEvent.c("TabbedPaintPreview.maybeShow");
        return true;
    }

    public final boolean c() {
        Tab tab = this.a;
        if (tab == null) {
            return false;
        }
        return tab.q().b(this.h);
    }

    public static void a(YD3 yd3, boolean z) {
        Callback callback = yd3.m;
        if (callback == null) {
            return;
        }
        callback.onResult(Boolean.valueOf(z));
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.w(this.g);
        this.a = null;
    }

    public final void e(boolean z) {
        final Point point;
        N.M9gwtxem();
        if (this.a == null || this.j == null || this.o) {
            return;
        }
        TraceEvent.b("TabbedPaintPreview.remove", null);
        this.o = true;
        C7141kw2 c7141kw2 = this.j.d;
        if (c7141kw2 != null) {
            c7141kw2.b();
        }
        this.a.w(this.g);
        C1413Kw2 c1413Kw2 = this.j;
        C7141kw2 c7141kw22 = c1413Kw2.d;
        if (c7141kw22 == null) {
            point = null;
        } else {
            Rect a = c7141kw22.a.i.a();
            Point point2 = new Point(a.left, a.top);
            long j = c1413Kw2.b.b;
            if (j == 0) {
                point = new Point();
            } else {
                int[] MMWNsnld = N.MMWNsnld(j);
                point = new Point(MMWNsnld[0], MMWNsnld[1]);
            }
            point.offset(point2.x, point2.y);
        }
        C7141kw2 c7141kw23 = this.j.d;
        float b = c7141kw23 == null ? 0.0f : c7141kw23.a.i.b();
        C1413Kw2 c1413Kw22 = this.j;
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = c1413Kw22.k;
        boolean z2 = webContentsAccessibilityImpl != null;
        if (webContentsAccessibilityImpl != null) {
            c1413Kw22.d.d.m = null;
            webContentsAccessibilityImpl.destroy();
            c1413Kw22.k = null;
        }
        PlayerCompositorDelegateImpl playerCompositorDelegateImpl = c1413Kw22.b;
        if (playerCompositorDelegateImpl != null) {
            long j2 = playerCompositorDelegateImpl.b;
            if (j2 != 0) {
                N.MIRVkfIx(j2);
                playerCompositorDelegateImpl.b = 0L;
            }
            c1413Kw22.b = null;
        }
        C7141kw2 c7141kw24 = c1413Kw22.d;
        if (c7141kw24 != null) {
            c7141kw24.a();
            c1413Kw22.d = null;
        }
        WebContents b2 = this.a.b();
        if (b2 != null && b != 0.0f && point != null) {
            final EventForwarder r0 = b2.r0();
            float f = b / ((WebContentsImpl) b2).m.g;
            long uptimeMillis = SystemClock.uptimeMillis();
            r0.e(uptimeMillis, 12, 0.0f);
            r0.e(uptimeMillis, 13, f);
            r0.e(uptimeMillis, 14, 0.0f);
            new Handler().postDelayed(new Runnable() { // from class: UD3
                @Override // java.lang.Runnable
                public final void run() {
                    Point point3 = point;
                    float f2 = point3.x;
                    float f3 = point3.y;
                    EventForwarder eventForwarder = EventForwarder.this;
                    long j3 = eventForwarder.b;
                    if (j3 == 0) {
                        return;
                    }
                    N.M6lTZ5w8(j3, eventForwarder, f2, f3);
                }
            }, 10L);
        }
        this.h.a().animate().alpha(0.0f).setDuration(z ? 500L : 0L).setListener(new WD3(this, z2));
        Runnable runnable = this.l;
        if (runnable != null) {
            runnable.run();
        }
        TraceEvent.c("TabbedPaintPreview.remove");
    }
}

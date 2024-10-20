package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import j$.util.function.Consumer;
import java.util.function.Consumer;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dY2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScrollCaptureCallbackC4594dY2 implements ScrollCaptureCallback {
    public final C3563aY2 a;

    public final /* synthetic */ void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        onScrollCaptureImageRequest(scrollCaptureSession, cancellationSignal, rect, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void onScrollCaptureSearch(CancellationSignal cancellationSignal, java.util.function.Consumer consumer) {
        onScrollCaptureSearch(cancellationSignal, Consumer.VivifiedWrapper.convert(consumer));
    }

    public ScrollCaptureCallbackC4594dY2(ZX2 zx2) {
        this.a = new C3563aY2(zx2);
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, j$.util.function.Consumer consumer) {
        Rect rect;
        C3563aY2 c3563aY2 = this.a;
        WebContents b = c3563aY2.b.b();
        if (c3563aY2.b.a() == null || b == null || c3563aY2.b.l()) {
            rect = new Rect();
        } else {
            C6600jN2 c6600jN2 = ((WebContentsImpl) b).m;
            rect = new Rect(0, 0, (int) Math.ceil(c6600jN2.a(c6600jN2.e)), c6600jN2.b());
            c3563aY2.f = c6600jN2.h;
        }
        consumer.accept(rect);
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        C3563aY2 c3563aY2 = this.a;
        c3563aY2.getClass();
        c3563aY2.g = SystemClock.elapsedRealtime();
        Tab tab = c3563aY2.b;
        c3563aY2.a.getClass();
        C6201iC0 c6201iC0 = new C6201iC0(tab.getContext(), tab, true);
        c3563aY2.c = c6201iC0;
        c6201iC0.a(new YX2(c3563aY2, cancellationSignal, runnable));
        N.MJ3oAy5s();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [cY2] */
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, final Rect rect, final j$.util.function.Consumer consumer) {
        final Surface surface;
        final C3563aY2 c3563aY2 = this.a;
        surface = scrollCaptureSession.getSurface();
        final ?? r3 = new Callback() { // from class: cY2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                j$.util.function.Consumer.this.accept((Rect) obj);
            }
        };
        rect.offset(0, c3563aY2.e);
        if (!rect.intersect(c3563aY2.d) || rect.height() < 20) {
            r3.onResult(new Rect());
            return;
        }
        C6201iC0 c6201iC0 = c3563aY2.c;
        final QI1 qi1 = new QI1(c6201iC0.c, rect, new C2327Rx2());
        c6201iC0.c(qi1, true);
        qi1.e = new PI1() { // from class: XX2
            @Override // defpackage.PI1
            public final void a(int i) {
                C3563aY2 c3563aY22 = C3563aY2.this;
                c3563aY22.getClass();
                if (i == 6) {
                    return;
                }
                Bitmap bitmap = qi1.d;
                Callback callback = r3;
                if (i != 3 || bitmap == null) {
                    callback.onResult(new Rect());
                    return;
                }
                Rect rect2 = rect;
                Rect rect3 = new Rect(0, 0, rect2.width(), rect2.height());
                Surface surface2 = surface;
                Canvas lockCanvas = surface2.lockCanvas(rect3);
                lockCanvas.drawColor(-1);
                lockCanvas.drawBitmap(bitmap, (Rect) null, rect3, (Paint) null);
                surface2.unlockCanvasAndPost(lockCanvas);
                rect2.offset(0, -c3563aY22.e);
                callback.onResult(rect2);
            }
        };
        int i = qi1.c;
        if (i != 0) {
            qi1.b(i);
        }
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        C3563aY2 c3563aY2 = this.a;
        c3563aY2.getClass();
        N.M9gwtxem();
        C6201iC0 c6201iC0 = c3563aY2.c;
        if (c6201iC0 != null) {
            c6201iC0.b();
            c3563aY2.c = null;
        }
        if (c3563aY2.g != 0) {
            EI2.n(SystemClock.elapsedRealtime() - c3563aY2.g, "Sharing.ScrollCapture.SuccessfulCaptureDuration");
        }
        c3563aY2.g = 0L;
        c3563aY2.d = null;
        c3563aY2.e = 0;
        c3563aY2.f = 1.0f;
        runnable.run();
    }
}

package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zx0 */
/* loaded from: classes.dex */
public final class GestureDetectorOnDoubleTapListenerC12292zx0 implements GestureDetector.OnDoubleTapListener {
    public final C11949yx0 a;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnDoubleTapListenerC12292zx0(C11949yx0 c11949yx0) {
        this.a = c11949yx0;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        List<KX> list;
        C11949yx0 c11949yx0 = this.a;
        c11949yx0.getClass();
        if (motionEvent.getActionMasked() != 1 || (list = c11949yx0.f) == null) {
            return false;
        }
        for (KX kx : list) {
            View view = (View) c11949yx0.a.get();
            C1629Mo c1629Mo = new C1629Mo(motionEvent.getX(), motionEvent.getY());
            SX sx = kx.e;
            InterfaceC9738sX interfaceC9738sX = sx.a;
            CommandOuterClass$Command a = kx.a.a();
            InterfaceC8177nx0 interfaceC8177nx0 = kx.b;
            InterfaceC8710pX interfaceC8710pX = kx.c;
            U80 u80 = kx.d;
            SX.f(sx, ((C10081tX) interfaceC9738sX).a(a, SX.h(view, c1629Mo, interfaceC8177nx0, interfaceC8710pX, u80), 2).c(), u80);
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C11949yx0 c11949yx0 = this.a;
        List list = c11949yx0.e;
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC7145kx0) it.next()).a((View) c11949yx0.a.get(), new C1629Mo(motionEvent.getX(), motionEvent.getY()));
        }
        return false;
    }
}

package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pR1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8682pR1 {
    public boolean c;
    public HandlerC7995nR1 e;
    public final Object a = new Object();
    public final C8339oR1 b = new C8339oR1(this);
    public WeakReference d = new WeakReference(null);

    public void b() {
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g(long j) {
    }

    public void h() {
    }

    public void i() {
    }

    public final void j(InterfaceC9025qR1 interfaceC9025qR1, Handler handler) {
        synchronized (this.a) {
            this.d = new WeakReference(interfaceC9025qR1);
            HandlerC7995nR1 handlerC7995nR1 = this.e;
            HandlerC7995nR1 handlerC7995nR12 = null;
            if (handlerC7995nR1 != null) {
                handlerC7995nR1.removeCallbacksAndMessages(null);
            }
            if (interfaceC9025qR1 != null && handler != null) {
                handlerC7995nR12 = new HandlerC7995nR1(this, handler.getLooper());
            }
            this.e = handlerC7995nR12;
        }
    }

    public boolean c(Intent intent) {
        InterfaceC9025qR1 interfaceC9025qR1;
        HandlerC7995nR1 handlerC7995nR1;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.a) {
            interfaceC9025qR1 = (InterfaceC9025qR1) this.d.get();
            handlerC7995nR1 = this.e;
        }
        if (interfaceC9025qR1 == null || handlerC7995nR1 == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        JR1 g = interfaceC9025qR1.g();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 85) {
            if (keyEvent.getRepeatCount() == 0) {
                if (this.c) {
                    handlerC7995nR1.removeMessages(1);
                    this.c = false;
                    PlaybackStateCompat d = interfaceC9025qR1.d();
                    if (((d == null ? 0L : d.j) & 32) != 0) {
                        h();
                    }
                } else {
                    this.c = true;
                    handlerC7995nR1.sendMessageDelayed(handlerC7995nR1.obtainMessage(1, g), ViewConfiguration.getDoubleTapTimeout());
                }
            } else {
                a(interfaceC9025qR1, handlerC7995nR1);
            }
            return true;
        }
        a(interfaceC9025qR1, handlerC7995nR1);
        return false;
    }

    public final void a(InterfaceC9025qR1 interfaceC9025qR1, HandlerC7995nR1 handlerC7995nR1) {
        if (this.c) {
            this.c = false;
            handlerC7995nR1.removeMessages(1);
            PlaybackStateCompat d = interfaceC9025qR1.d();
            long j = d == null ? 0L : d.j;
            boolean z = d != null && d.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                d();
            } else {
                if (z || !z2) {
                    return;
                }
                e();
            }
        }
    }
}

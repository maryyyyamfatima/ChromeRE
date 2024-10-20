package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jf3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199Jf3 {
    public static C1199Jf3 e;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new C0549Ef3(this));
    public C0939Hf3 c;
    public C0939Hf3 d;

    public static C1199Jf3 b() {
        if (e == null) {
            e = new C1199Jf3();
        }
        return e;
    }

    public final void e() {
        C0939Hf3 c0939Hf3 = this.d;
        if (c0939Hf3 != null) {
            this.c = c0939Hf3;
            this.d = null;
            C1929Ow c1929Ow = (C1929Ow) c0939Hf3.a.get();
            if (c1929Ow == null) {
                this.c = null;
            } else {
                Handler handler = AbstractC2969Ww.n;
                handler.sendMessage(handler.obtainMessage(0, c1929Ow.a));
            }
        }
    }

    public final boolean a(C0939Hf3 c0939Hf3, int i) {
        C1929Ow c1929Ow = (C1929Ow) c0939Hf3.a.get();
        if (c1929Ow == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(c0939Hf3);
        Handler handler = AbstractC2969Ww.n;
        handler.sendMessage(handler.obtainMessage(1, i, 0, c1929Ow.a));
        return true;
    }

    public final boolean c(C1929Ow c1929Ow) {
        C0939Hf3 c0939Hf3 = this.c;
        if (c0939Hf3 != null) {
            return c1929Ow != null && c0939Hf3.a.get() == c1929Ow;
        }
        return false;
    }

    public final void d(C0939Hf3 c0939Hf3) {
        int i = c0939Hf3.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = this.b;
        handler.removeCallbacksAndMessages(c0939Hf3);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0939Hf3), i);
    }
}

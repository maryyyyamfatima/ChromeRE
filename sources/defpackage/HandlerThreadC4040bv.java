package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC4040bv extends HandlerThread implements Handler.Callback {
    public HandlerThreadC4040bv() {
        super("GifDecoder");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        RunnableC4383cv runnableC4383cv = (RunnableC4383cv) message.obj;
        if (runnableC4383cv != null && runnableC4383cv.m != null) {
            int i = message.what;
            if (i != 10) {
                if (i != 12) {
                    return false;
                }
                runnableC4383cv.h = runnableC4383cv.a.d;
                runnableC4383cv.L = false;
                runnableC4383cv.N = 0;
                runnableC4383cv.E = 0;
                return true;
            }
            do {
                try {
                    RunnableC4383cv.b(runnableC4383cv);
                } catch (ArrayIndexOutOfBoundsException unused) {
                    runnableC4383cv.W = true;
                }
                if (runnableC4383cv.W) {
                    int i2 = runnableC4383cv.N;
                    if (i2 == 0) {
                        runnableC4383cv.q = true;
                    } else if (i2 > 1) {
                        int i3 = runnableC4383cv.X;
                        if (i3 != 0) {
                            int i4 = runnableC4383cv.Y + 1;
                            runnableC4383cv.Y = i4;
                            if (i4 >= i3) {
                                runnableC4383cv.r = true;
                            }
                        }
                        runnableC4383cv.h = runnableC4383cv.a.d;
                        runnableC4383cv.L = false;
                        runnableC4383cv.N = 0;
                        runnableC4383cv.E = 0;
                    } else {
                        runnableC4383cv.r = true;
                    }
                }
                if (!runnableC4383cv.W || runnableC4383cv.q) {
                    break;
                }
            } while (!runnableC4383cv.r);
            Handler handler = runnableC4383cv.U;
            handler.sendMessage(handler.obtainMessage(11, runnableC4383cv.R, 0));
        }
        return true;
    }
}

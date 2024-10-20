package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uU0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ChoreographerFrameCallbackC10410uU0 implements Handler.Callback, Choreographer.FrameCallback {
    public final Choreographer.FrameCallback a;
    public Handler h;
    public boolean j;
    public Choreographer i = null;
    public final HandlerThread g = new HandlerThread("FrameMonitor");

    public ChoreographerFrameCallbackC10410uU0(Choreographer.FrameCallback frameCallback) {
        this.a = frameCallback;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.doFrame(j);
        this.i.postFrameCallback(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            if (this.i == null) {
                this.i = Choreographer.getInstance();
            }
            return true;
        }
        if (i == 1) {
            this.i.postFrameCallback(this);
            return true;
        }
        if (i != 2) {
            return false;
        }
        this.i.removeFrameCallback(this);
        return true;
    }
}

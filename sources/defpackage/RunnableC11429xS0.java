package defpackage;

import android.view.ViewParent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11429xS0 implements Runnable {
    public final /* synthetic */ AbstractViewOnTouchListenerC12115zS0 a;

    public RunnableC11429xS0(AbstractViewOnTouchListenerC12115zS0 abstractViewOnTouchListenerC12115zS0) {
        this.a = abstractViewOnTouchListenerC12115zS0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent = this.a.i.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}

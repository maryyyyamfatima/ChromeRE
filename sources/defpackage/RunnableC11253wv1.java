package defpackage;

import android.os.Handler;
import android.os.StrictMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC11253wv1 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ AtomicInteger g;
    public final /* synthetic */ Handler h;

    public RunnableC11253wv1(View view, AtomicInteger atomicInteger, Handler handler) {
        this.a = view;
        this.g = atomicInteger;
        this.h = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                inputMethodManager.showSoftInput(view, 0);
            } catch (IllegalArgumentException e) {
                if (this.g.incrementAndGet() <= 10) {
                    this.h.postDelayed(this, 100L);
                } else {
                    AbstractC4851eH1.a("KeyboardVisibility", "Unable to open keyboard.  Giving up.", e);
                }
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }
}

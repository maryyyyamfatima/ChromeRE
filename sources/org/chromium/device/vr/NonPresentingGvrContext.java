package org.chromium.device.vr;

import android.content.Context;
import android.view.Display;
import com.google.vr.ndk.base.GvrApi;
import defpackage.C7432ln3;
import defpackage.ChoreographerFrameCallbackC10410uU0;
import defpackage.H52;
import defpackage.V60;
import org.chromium.ui.display.DisplayAndroidManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class NonPresentingGvrContext {
    public final GvrApi a;
    public final H52 b;
    public boolean c;

    public NonPresentingGvrContext() {
        Context context = V60.a;
        Display a = DisplayAndroidManager.a(context);
        C7432ln3 c = C7432ln3.c();
        try {
            H52 h52 = new H52(this, context, a);
            this.b = h52;
            c.close();
            C7432ln3 e = C7432ln3.e();
            try {
                this.a = new GvrApi(context, h52);
                e.close();
                resume();
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c.close();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    public static NonPresentingGvrContext create(long j) {
        try {
            return new NonPresentingGvrContext();
        } catch (IllegalStateException | UnsatisfiedLinkError unused) {
            return null;
        }
    }

    public final long getNativeGvrContext() {
        return this.a.getNativeGvrContext();
    }

    public final void pause() {
        if (this.c) {
            this.c = false;
            ChoreographerFrameCallbackC10410uU0 choreographerFrameCallbackC10410uU0 = this.b.g;
            if (choreographerFrameCallbackC10410uU0.j) {
                choreographerFrameCallbackC10410uU0.j = false;
                choreographerFrameCallbackC10410uU0.h.sendEmptyMessage(2);
            }
        }
    }

    public final void resume() {
        if (this.c) {
            return;
        }
        this.c = true;
        H52 h52 = this.b;
        h52.b();
        ChoreographerFrameCallbackC10410uU0 choreographerFrameCallbackC10410uU0 = h52.g;
        if (choreographerFrameCallbackC10410uU0.j) {
            return;
        }
        choreographerFrameCallbackC10410uU0.j = true;
        choreographerFrameCallbackC10410uU0.h.sendEmptyMessage(1);
    }

    public final void shutdown() {
        this.b.e();
        this.a.shutdown();
    }
}

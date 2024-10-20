package org.chromium.content.browser;

import J.N;
import android.os.SystemClock;
import android.view.KeyEvent;
import defpackage.C6600jN2;
import defpackage.J44;
import defpackage.Pc4;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ContentUiEventHandler implements J44 {
    public final WebContentsImpl a;
    public Pc4 g;
    public final long h;

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public ContentUiEventHandler(WebContentsImpl webContentsImpl) {
        this.a = webContentsImpl;
        this.h = N.MXL6itCa(this, webContentsImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.ContentUiEventHandler.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.g.c(i, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.content.browser.ContentUiEventHandler.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final void scrollBy(float f, float f2) {
        if (f == 0.0f && f2 == 0.0f) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (GestureListenerManagerImpl.d(this.a).m) {
            N.MW$k83qi(this.h, this, uptimeMillis);
        }
        N.M_1sgTVt(this.h, this, uptimeMillis, f, f2);
    }

    public final void scrollTo(float f, float f2) {
        WebContentsImpl webContentsImpl = this.a;
        C6600jN2 c6600jN2 = webContentsImpl.m;
        float a = c6600jN2.a(c6600jN2.a);
        C6600jN2 c6600jN22 = webContentsImpl.m;
        scrollBy(f - a, f2 - c6600jN22.a(c6600jN22.b));
    }
}

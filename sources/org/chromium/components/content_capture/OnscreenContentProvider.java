package org.chromium.components.content_capture;

import J.N;
import android.content.Context;
import android.os.Build;
import android.view.View;
import defpackage.AX;
import defpackage.AbstractC4851eH1;
import defpackage.C10753vU0;
import defpackage.C3466aF0;
import defpackage.C5417fv2;
import defpackage.C7823mv2;
import defpackage.InterfaceC3411a50;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class OnscreenContentProvider {
    public static Boolean d;
    public long a;
    public final ArrayList b;
    public WeakReference c;

    public OnscreenContentProvider(Context context, View view, WebContents webContents) {
        WebContents webContents2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = new WeakReference(webContents);
        if (d == null) {
            d = Boolean.valueOf(AX.e().g("dump-captured-content-to-logcat-for-testing"));
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (C7823mv2.d == null) {
                C7823mv2.d = new C7823mv2(context.getApplicationContext());
            }
            C5417fv2 c5417fv2 = !C7823mv2.d.a ? null : new C5417fv2(view);
            if (c5417fv2 != null) {
                arrayList.add(c5417fv2);
            }
        }
        if (N.MxGt0EOk()) {
            arrayList.add(new C3466aF0());
        }
        if (arrayList.isEmpty() || (webContents2 = (WebContents) this.c.get()) == null) {
            return;
        }
        this.a = N.M87a3iHr(this, webContents2);
    }

    public final int getOffsetY(WebContents webContents) {
        return (int) Math.floor(((WebContentsImpl) webContents).m.k);
    }

    public final void didCaptureContent(Object[] objArr, ContentCaptureFrame contentCaptureFrame) {
        C10753vU0 b = b(objArr);
        String[] a = a(b, contentCaptureFrame);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC3411a50 interfaceC3411a50 = (InterfaceC3411a50) it.next();
            if (interfaceC3411a50.f(a)) {
                interfaceC3411a50.a(b, contentCaptureFrame);
            }
        }
        if (d.booleanValue()) {
            AbstractC4851eH1.d("ContentCapture", "Captured Content: %s", contentCaptureFrame);
        }
    }

    public final void didUpdateContent(Object[] objArr, ContentCaptureFrame contentCaptureFrame) {
        C10753vU0 b = b(objArr);
        String[] a = a(b, contentCaptureFrame);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC3411a50 interfaceC3411a50 = (InterfaceC3411a50) it.next();
            if (interfaceC3411a50.f(a)) {
                interfaceC3411a50.b(b, contentCaptureFrame);
            }
        }
        if (d.booleanValue()) {
            AbstractC4851eH1.d("ContentCapture", "Updated Content: %s", contentCaptureFrame);
        }
    }

    public final void didRemoveContent(Object[] objArr, long[] jArr) {
        C10753vU0 b = b(objArr);
        String[] a = a(b, null);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC3411a50 interfaceC3411a50 = (InterfaceC3411a50) it.next();
            if (interfaceC3411a50.f(a)) {
                interfaceC3411a50.g(b, jArr);
            }
        }
        if (d.booleanValue()) {
            AbstractC4851eH1.d("ContentCapture", "Removed Content: %s", b.get(0) + " " + Arrays.toString(jArr));
        }
    }

    public final void didRemoveSession(Object[] objArr) {
        C10753vU0 b = b(objArr);
        String[] a = a(b, null);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC3411a50 interfaceC3411a50 = (InterfaceC3411a50) it.next();
            if (interfaceC3411a50.f(a)) {
                interfaceC3411a50.e(b);
            }
        }
        if (d.booleanValue()) {
            AbstractC4851eH1.d("ContentCapture", "Removed Session: %s", b.get(0));
        }
    }

    public final void didUpdateTitle(ContentCaptureFrame contentCaptureFrame) {
        String[] a = a(null, contentCaptureFrame);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC3411a50 interfaceC3411a50 = (InterfaceC3411a50) it.next();
            if (interfaceC3411a50.f(a)) {
                interfaceC3411a50.d(contentCaptureFrame);
            }
        }
        if (d.booleanValue()) {
            AbstractC4851eH1.d("ContentCapture", "Updated Title: %s", contentCaptureFrame.e);
        }
    }

    public final void didUpdateFavicon(ContentCaptureFrame contentCaptureFrame) {
        String[] a = a(null, contentCaptureFrame);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC3411a50 interfaceC3411a50 = (InterfaceC3411a50) it.next();
            if (interfaceC3411a50.f(a)) {
                interfaceC3411a50.c(contentCaptureFrame);
            }
        }
        if (d.booleanValue()) {
            AbstractC4851eH1.d("ContentCapture", "Updated Favicon: %s", contentCaptureFrame.f);
        }
    }

    public final boolean shouldCapture(String str) {
        String[] strArr = {str};
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC3411a50) it.next()).f(strArr)) {
                return true;
            }
        }
        return false;
    }

    public static C10753vU0 b(Object[] objArr) {
        C10753vU0 c10753vU0 = new C10753vU0(objArr.length);
        for (Object obj : objArr) {
            c10753vU0.add((ContentCaptureFrame) obj);
        }
        return c10753vU0;
    }

    public static String[] a(C10753vU0 c10753vU0, ContentCaptureFrame contentCaptureFrame) {
        ArrayList arrayList = new ArrayList();
        if (c10753vU0 != null) {
            Iterator<E> it = c10753vU0.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContentCaptureFrame) it.next()).d);
            }
        }
        if (contentCaptureFrame != null) {
            arrayList.add(contentCaptureFrame.d);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }
}

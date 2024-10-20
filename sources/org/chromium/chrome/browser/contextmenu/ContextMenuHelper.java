package org.chromium.chrome.browser.contextmenu;

import J.N;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import defpackage.A60;
import defpackage.AbstractC5103f04;
import defpackage.B60;
import defpackage.C12001z60;
import defpackage.C8229o60;
import defpackage.K60;
import defpackage.NK;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.contextmenu.ContextMenuHelper;
import org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ContextMenuHelper {
    public final WebContents a;
    public long b;
    public ContextMenuNativeDelegateImpl c;
    public K60 d;
    public ContextMenuPopulatorFactory e;
    public ContextMenuParams f;
    public C8229o60 g;
    public WindowAndroid h;
    public C12001z60 i;
    public A60 j;
    public B60 k;
    public long l;
    public boolean m;
    public NK n;

    public ContextMenuHelper(long j, WebContents webContents) {
        this.b = j;
        this.a = webContents;
    }

    public static ContextMenuHelper create(long j, WebContents webContents) {
        return new ContextMenuHelper(j, webContents);
    }

    public final void destroy() {
        dismissContextMenu();
        ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl = this.c;
        if (contextMenuNativeDelegateImpl != null) {
            contextMenuNativeDelegateImpl.b = 0L;
        }
        ContextMenuPopulatorFactory contextMenuPopulatorFactory = this.e;
        if (contextMenuPopulatorFactory != null) {
            contextMenuPopulatorFactory.onDestroy();
        }
        this.b = 0L;
    }

    public final void setPopulatorFactory(ContextMenuPopulatorFactory contextMenuPopulatorFactory) {
        dismissContextMenu();
        ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl = this.c;
        if (contextMenuNativeDelegateImpl != null) {
            contextMenuNativeDelegateImpl.b = 0L;
        }
        this.d = null;
        ContextMenuPopulatorFactory contextMenuPopulatorFactory2 = this.e;
        if (contextMenuPopulatorFactory2 != null) {
            contextMenuPopulatorFactory2.onDestroy();
        }
        this.e = contextMenuPopulatorFactory;
    }

    public final void dismissContextMenu() {
        C8229o60 c8229o60 = this.g;
        if (c8229o60 != null) {
            c8229o60.a();
            this.g = null;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [B60] */
    /* JADX WARN: Type inference failed for: r11v4, types: [z60] */
    /* JADX WARN: Type inference failed for: r11v5, types: [A60] */
    public final void showContextMenu(final ContextMenuParams contextMenuParams, RenderFrameHost renderFrameHost, View view, float f) {
        if (contextMenuParams.g.h().equals("file")) {
            return;
        }
        WebContents webContents = this.a;
        WindowAndroid Q0 = webContents.Q0();
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || Q0 == null || Q0.k().get() == null || this.e == null || this.g != null) {
            return;
        }
        this.c = new ContextMenuNativeDelegateImpl(webContents, renderFrameHost, contextMenuParams);
        K60 a = this.e.a((Context) Q0.k().get(), contextMenuParams, this.c);
        this.d = a;
        a.isIncognito();
        this.d.d();
        this.f = contextMenuParams;
        this.h = Q0;
        this.i = new Callback() { // from class: z60
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Integer num = (Integer) obj;
                ContextMenuHelper contextMenuHelper = ContextMenuHelper.this;
                K60 k60 = contextMenuHelper.d;
                if (k60 == null) {
                    return;
                }
                contextMenuHelper.m = true;
                k60.b(num.intValue());
            }
        };
        this.j = new Runnable() { // from class: A60
            @Override // java.lang.Runnable
            public final void run() {
                ContextMenuHelper contextMenuHelper = ContextMenuHelper.this;
                contextMenuHelper.m = false;
                contextMenuHelper.l = SystemClock.uptimeMillis();
                WebContents webContents2 = contextMenuHelper.a;
                EI2.b("ContextMenu.Shown", webContents2 != null);
                EI2.b(String.format("ContextMenu.Shown.%s", L60.b(contextMenuParams)), webContents2 != null);
            }
        };
        this.k = new Runnable() { // from class: B60
            @Override // java.lang.Runnable
            public final void run() {
                ContextMenuHelper contextMenuHelper = ContextMenuHelper.this;
                String concat = "ContextMenu.TimeToTakeAction.".concat(contextMenuHelper.m ? "SelectedItem" : "Abandoned");
                long uptimeMillis = SystemClock.uptimeMillis() - contextMenuHelper.l;
                EI2.n(uptimeMillis, concat);
                ContextMenuParams contextMenuParams2 = contextMenuHelper.f;
                if (contextMenuParams2.i) {
                    if (N.MO0TyD6h(contextMenuHelper.a, contextMenuParams2.c) == 2) {
                        EI2.n(uptimeMillis, concat + ".PerformanceClassFast");
                    }
                }
                contextMenuHelper.g = null;
                ContextMenuNativeDelegateImpl contextMenuNativeDelegateImpl = contextMenuHelper.c;
                if (contextMenuNativeDelegateImpl != null) {
                    contextMenuNativeDelegateImpl.b = 0L;
                    contextMenuHelper.c = null;
                }
                K60 k60 = contextMenuHelper.d;
                if (k60 != null) {
                    k60.e();
                    contextMenuHelper.d = null;
                }
                if (contextMenuHelper.n != null) {
                    C0127Az1.f.a.getClass();
                    C2206Qz1 g = C2206Qz1.g();
                    int i = g.l;
                    boolean z = true;
                    if (i != 5 && i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        long j = g.i;
                        if (j != 0) {
                            EI2.k((SystemClock.elapsedRealtimeNanos() - j) / 1000000, "Lens.ImageClassification.ClassificationTime".concat(".EarlyTerminatedMs"));
                        }
                        g.a = 8;
                        g.a();
                    }
                }
                long j2 = contextMenuHelper.b;
                if (j2 == 0) {
                    return;
                }
                N.McrcWTzG(j2, contextMenuHelper);
            }
        };
        List a2 = this.d.a();
        if (a2.isEmpty()) {
            PostTask.c(AbstractC5103f04.a, this.k);
            return;
        }
        C8229o60 c8229o60 = new C8229o60(f, this.c);
        this.g = c8229o60;
        NK c = this.d.c();
        this.n = c;
        if (c == null) {
            c8229o60.b(this.h, this.a, this.f, a2, this.i, this.j, this.k, null);
        } else {
            c8229o60.b(this.h, this.a, this.f, a2, this.i, this.j, this.k, c);
        }
    }
}

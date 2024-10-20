package defpackage;

import J.N;
import android.os.Handler;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ek3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5008ek3 implements InterfaceC0948Hh2 {
    public final /* synthetic */ C3038Xj3 a;

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void a(WebContents webContents, long j, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void b(WebContents webContents, long j, int i, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void c(WebContents webContents, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void d(WebContents webContents, long j, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void e(WebContents webContents, long j, long j2) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void f(WebContents webContents, long j, boolean z) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void h(WebContents webContents, long j, float f, float f2) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void i(WebContents webContents, long j, long j2, long j3, long j4) {
    }

    public C5008ek3(C3038Xj3 c3038Xj3) {
        this.a = c3038Xj3;
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final void g(WebContents webContents) {
        final C3038Xj3 c3038Xj3 = this.a;
        Tab tab = c3038Xj3.a;
        if (tab == null || tab.b() != webContents) {
            return;
        }
        c3038Xj3.h = true;
        EI2.b("Browser.PaintPreview.TabbedPlayer.FirstPaintBeforeTabLoad", c3038Xj3.b.b);
        if (c3038Xj3.g != 1) {
            return;
        }
        C7928nE c7928nE = UN.a;
        new Handler().postDelayed(new Runnable() { // from class: Uj3
            @Override // java.lang.Runnable
            public final void run() {
                C3038Xj3.this.j(3);
            }
        }, N.M37SqSAy("PaintPreviewShowOnStartup", "initial_remove_delay_ms", 0));
    }
}

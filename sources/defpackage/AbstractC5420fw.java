package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import org.chromium.chrome.browser.share.screenshot.EditorScreenshotTask;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fw */
/* loaded from: classes.dex */
public abstract class AbstractC5420fw implements InterfaceC4481dC {
    public final Activity a;
    public final String g;
    public final QO h;
    public final QB i;
    public final InterfaceC2060Pw0 j;
    public Bitmap k;

    @Override // defpackage.InterfaceC4481dC
    public final void a(float f) {
    }

    @Override // defpackage.InterfaceC4481dC
    public final void b(PB pb) {
    }

    @Override // defpackage.InterfaceC4481dC
    public final void d(int i) {
    }

    public abstract void e();

    @Override // defpackage.InterfaceC4481dC
    public final void j() {
    }

    public AbstractC5420fw(Activity activity, String str, QO qo, QB qb) {
        EditorScreenshotTask editorScreenshotTask = new EditorScreenshotTask(activity, qb);
        this.a = activity;
        this.g = str;
        this.h = qo;
        this.i = qb;
        this.j = editorScreenshotTask;
    }

    public void c() {
        this.j.c(new Runnable() { // from class: ew
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC5420fw abstractC5420fw = AbstractC5420fw.this;
                abstractC5420fw.k = abstractC5420fw.j.b();
                abstractC5420fw.e();
            }
        });
    }

    @Override // defpackage.InterfaceC4481dC
    public final void h(int i, int i2) {
        if (i == 0) {
            ((m) this.i).o(this);
            c();
        }
    }
}

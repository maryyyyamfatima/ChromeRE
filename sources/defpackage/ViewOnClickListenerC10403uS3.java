package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uS3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC10403uS3 implements View.OnClickListener, InterfaceC11179wj, GC {
    public C12188zf3 h;
    public C10746vS3 i;
    public CC j;
    public final RunnableC10060tS3 g = new RunnableC10060tS3(this);
    public final Handler a = new Handler();

    @Override // defpackage.GC
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void k(int i) {
    }

    @Override // defpackage.GC
    public final /* synthetic */ void r() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a(true);
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        if (i == 4 || i == 5) {
            a(false);
        }
    }

    @Override // defpackage.GC
    public final void b(boolean z, int i, int i2, int i3) {
        a(false);
    }

    public final void a(boolean z) {
        C12188zf3 c12188zf3 = this.h;
        if (c12188zf3 == null) {
            return;
        }
        if (z) {
            c12188zf3.a.b(null);
        } else {
            c12188zf3.a.a(null);
        }
        ApplicationStatus.h(this);
        CC cc = this.j;
        if (cc != null) {
            cc.g(this);
            this.j = null;
        }
        this.a.removeCallbacks(this.g);
        C10746vS3 c10746vS3 = this.i;
        if (c10746vS3 != null) {
            c10746vS3.b();
            this.i = null;
        }
        this.h = null;
    }
}

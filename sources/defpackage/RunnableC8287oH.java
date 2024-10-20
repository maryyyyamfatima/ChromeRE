package defpackage;

import com.google.android.gms.cast.internal.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8287oH implements Runnable {
    public final /* synthetic */ C9315rH a;
    public final /* synthetic */ ApplicationStatus g;

    public RunnableC8287oH(C9315rH c9315rH, ApplicationStatus applicationStatus) {
        this.a = c9315rH;
        this.g = applicationStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C4856eI1 c4856eI1 = C9315rH.Z;
        C9315rH c9315rH = this.a;
        c9315rH.getClass();
        String str = this.g.a;
        if (WH.a(str, c9315rH.M)) {
            z = false;
        } else {
            c9315rH.M = str;
            z = true;
        }
        C9315rH.Z.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c9315rH.O));
        YG yg = c9315rH.H;
        if (yg != null && (z || c9315rH.O)) {
            yg.d();
        }
        c9315rH.O = false;
    }
}

package defpackage;

import J.N;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ic0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6333ic0 {
    public final Activity a;
    public final InterfaceC0950Hi b;
    public final C4270cc0 c;
    public final C10452uc0 d;
    public final Q44 e;
    public final View f;
    public final int g;
    public final int h;
    public final int i;

    public C6333ic0(a aVar, C1340Ki c1340Ki, C4270cc0 c4270cc0, C6166i6 c6166i6, ImageButton imageButton) {
        this.a = aVar;
        this.b = c1340Ki;
        this.c = c4270cc0;
        this.f = imageButton;
        this.e = new Q44(aVar, new Handler());
        C7928nE c7928nE = UN.a;
        this.g = N.M37SqSAy("ShareCrowButton", "min-days-visited", 3);
        this.h = N.M37SqSAy("ShareCrowButton", "min-total-visits", 3);
        this.i = N.M37SqSAy("ShareCrowButton", "num-history-lookback-days", 5);
        this.d = new C10452uc0(c6166i6, new C5989hc0(this), null);
    }
}

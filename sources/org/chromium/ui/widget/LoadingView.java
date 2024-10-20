package org.chromium.ui.widget;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import defpackage.InterfaceC3467aF1;
import defpackage.XE1;
import defpackage.ZE1;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class LoadingView extends ProgressBar {
    public static final /* synthetic */ int k = 0;
    public long a;
    public final ArrayList g;
    public final XE1 h;
    public boolean i;
    public final ZE1 j;

    public LoadingView(Context context) {
        super(context);
        this.a = -1L;
        this.g = new ArrayList();
        this.h = new XE1(this);
        this.j = new ZE1(this);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1L;
        this.g = new ArrayList();
        this.h = new XE1(this);
        this.j = new ZE1(this);
    }

    public final void e() {
        XE1 xe1 = this.h;
        removeCallbacks(xe1);
        removeCallbacks(this.j);
        this.i = true;
        setVisibility(8);
        postDelayed(xe1, 500L);
    }

    public final void c() {
        removeCallbacks(this.h);
        ZE1 ze1 = this.j;
        removeCallbacks(ze1);
        this.i = false;
        if (getVisibility() == 0) {
            postDelayed(ze1, Math.max(0L, (this.a + 500) - SystemClock.elapsedRealtime()));
        } else {
            d();
        }
    }

    public final void b() {
        removeCallbacks(this.h);
        removeCallbacks(this.j);
        this.g.clear();
    }

    public final void a(InterfaceC3467aF1 interfaceC3467aF1) {
        this.g.add(interfaceC3467aF1);
    }

    public final void d() {
        setVisibility(8);
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((InterfaceC3467aF1) it.next()).n();
        }
    }
}

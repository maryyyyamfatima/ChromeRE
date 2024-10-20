package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oT2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC8350oT2 implements View.OnClickListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Runnable g;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a) {
            EI2.h(1, 3, "Tabs.SadTab.Feedback.Event");
        } else {
            EI2.h(1, 3, "Tabs.SadTab.Reload.Event");
        }
        this.g.run();
    }

    public ViewOnClickListenerC8350oT2(boolean z, RunnableC11700yD3 runnableC11700yD3) {
        this.a = z;
        this.g = runnableC11700yD3;
    }
}
